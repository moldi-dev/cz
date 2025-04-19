package org.moldi_dev;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class StandardFunctionHandler {
    private final TypeChecker typeChecker;

    public StandardFunctionHandler() {
        typeChecker = new TypeChecker();
    }

    private Object throwParameterMismatchRuntimeException(String functionName, String parameter) {
        throw new RuntimeException("Type mismatch for the " + parameter + " argument in the standard \"" + functionName + "\" function call.");
    }

    private Object throwIndexOutOfBoundsRuntimeException(String functionName, int accessedIndex, int size) {
        throw new RuntimeException("Index out of bounds in the standard \"" + functionName + "\" function call. Tried to access index " + accessedIndex + " in an array of size " + size + ".");
    }

    private Object throwCannotDeleteFromEmptyArrayException(String functionName) {
        throw new RuntimeException("Cannot delete from the empty array in the standard \"" + functionName + "\" function call.");
    }

    private Object throwStringSliceInvalidRangeException(int startIndex, int endIndex, int size) {
        throw new RuntimeException("Invalid range in the standard \"<MDA>string_slice\" function call. Tried to access index " + startIndex + " to " + endIndex + " in an array of size " + size + ".");
    }

    private Object throwFailedToConvertStringToIntegerException() {
        throw new RuntimeException("Failed to convert INTEGER to STRING in the standard \"<MDA>string_to_int\" function call.");
    }

    private Object throwFailedToConvertStringToDoubleException() {
        throw new RuntimeException("Failed to convert DOUBLE to STRING in the standard \"<MDA>string_to_double\" function call.");
    }

    public Object handleSineFunction(Object value) {
        if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
            return Math.sin((Double) v.getValue());
        }

        else if (value instanceof Double v) {
            return Math.sin(v);
        }

        return throwParameterMismatchRuntimeException("<MDA>sine", "first");
    }

    public Object handleCosineFunction(Object value) {
        if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
            return Math.cos((Double) v.getValue());
        }

        else if (value instanceof Double v) {
            return Math.cos(v);
        }

        return throwParameterMismatchRuntimeException("<MDA>cosine", "first");
    }

    public Object handleHyperbolicSineFunction(Object value) {
        if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
            return Math.sinh((Double) v.getValue());
        }

        else if (value instanceof Double v) {
            return Math.sinh(v);
        }

        return throwParameterMismatchRuntimeException("<MDA>hyperbolic_sine", "first");
    }

    public Object handleHyperbolicCosineFunction(Object value) {
        if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
            return Math.cosh((Double) v.getValue());
        }

        else if (value instanceof Double v) {
            return Math.cosh(v);
        }

        return throwParameterMismatchRuntimeException("<MDA>hyperbolic_cosine", "first");
    }

    public Object handleDegreesToRadiansFunction(Object value) {
        if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
            return Math.toRadians((Double) v.getValue());
        }

        else if (value instanceof Double v) {
            return Math.toRadians(v);
        }

        return throwParameterMismatchRuntimeException("<MDA>degrees_to_radians", "first");
    }

    public Object handleRadiansToDegreesFunction(Object value) {
        if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
            return Math.toDegrees((Double) v.getValue());
        }

        else if (value instanceof Double v) {
            return Math.toDegrees(v);
        }

        return throwParameterMismatchRuntimeException("<MDA>radians_to_degrees", "first");
    }

    public Object handleExponentialFunction(Object value) {
        if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
            return Math.exp((Double) v.getValue());
        }

        else if (value instanceof Double v) {
            return Math.exp(v);
        }

        return throwParameterMismatchRuntimeException("<MDA>exponential", "first");
    }

    public Object handleLogarithmFunction(Object value, Object base) {
        Double val;
        Double b;

        if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
            val = (Double) v.getValue();
        }

        else if (value instanceof Double v) {
            val = v;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>logarithm", "first");
        }

        if (base instanceof Variable var && var.getType().equals(VariableType.DOUBLE)) {
            b = (Double) var.getValue();
        }

        else if (base instanceof Double i) {
            b = i;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>sine", "second");
        }

        return Math.log(val) / Math.log(b);
    }

    public Object handleArrayLengthFunction(Object array) {
        if (array instanceof Variable var && var.getValue() instanceof List<?>) {
            return ((List<?>) var.getValue()).size();
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>array_length", "first");
        }
    }

    public Object handleArrayGetAtFunction(Object array, Object index) {
        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_get_at", "first");
        }

        int idx;

        if (index instanceof Integer) {
            idx = (Integer) index;
        }

        else if (index instanceof Variable var2 && var2.getType() == VariableType.INTEGER && var2.getValue() instanceof Integer i) {
            idx = i;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>array_get_at", "second");
        }

        if (idx < 0 || idx >= list.size()) {
            return throwIndexOutOfBoundsRuntimeException("<MDA>array_get_at", idx, list.size());
        }

        return list.get(idx);
    }

    public Object handleArraySetAtFunction(Object array, Object index, Object value) {
        Variable variable;

        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_set_at", "first");
        }

        else {
            variable = var;
        }

        int idx;

        if (index instanceof Integer) {
            idx = (Integer) index;
        }

        else if (index instanceof Variable var2 && var2.getType() == VariableType.INTEGER && var2.getValue() instanceof Integer i) {
            idx = i;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>array_set_at", "second");
        }

        if (idx < 0 || idx >= list.size()) {
            return throwIndexOutOfBoundsRuntimeException("<MDA>array_set_at", idx, list.size());
        }

        VariableType expectedType = typeChecker.inferTypeFromArrayType(variable.getType());

        VariableType valueType = value instanceof Variable vValue ? vValue.getType() : typeChecker.inferTypeFromValue(value);

        if (!valueType.equals(expectedType)) {
            return throwParameterMismatchRuntimeException("<MDA>array_set_at", "third");
        }

        List<Object> typedList = (List<Object>) list;
        typedList.set(idx, value);

        return typedList;
    }

    public Object handleArrayCopyFunction(Object array) {
        if (array instanceof Variable var && var.getValue() instanceof List<?> list) {
            return new ArrayList<>(list);
        }

        return throwParameterMismatchRuntimeException("<MDA>array_copy", "first");
    }

    public Object handleArrayContainsFunction(Object array, Object value) {
        Variable variable;

        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_contains", "first");
        }

        else {
            variable = var;
        }

        VariableType expectedType = typeChecker.inferTypeFromArrayType(variable.getType());

        VariableType valueType = value instanceof Variable vValue ? vValue.getType() : typeChecker.inferTypeFromValue(value);

        if (!valueType.equals(expectedType)) {
            return throwParameterMismatchRuntimeException("<MDA>array_contains", "second");
        }

        List<Object> typedList = (List<Object>) list;

        if (value instanceof Variable vValue) {
            value = vValue.getValue();
        }

        return typedList.contains(value);
    }

    public Object handleArrayIndexOfFunction(Object array, Object value) {
        Variable variable;

        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_index_of", "first");
        }

        else {
            variable = var;
        }

        VariableType expectedType = typeChecker.inferTypeFromArrayType(variable.getType());

        VariableType valueType = value instanceof Variable vValue ? vValue.getType() : typeChecker.inferTypeFromValue(value);

        if (!valueType.equals(expectedType)) {
            return throwParameterMismatchRuntimeException("<MDA>array_index_of", "second");
        }

        List<Object> typedList = (List<Object>) list;

        if (value instanceof Variable vValue) {
            value = vValue.getValue();
        }

        return typedList.indexOf(value);
    }

    public Object handleArrayCountFunction(Object array, Object value) {
        Variable variable;

        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_count", "first");
        }

        else {
            variable = var;
        }

        VariableType expectedType = typeChecker.inferTypeFromArrayType(variable.getType());

        VariableType valueType = value instanceof Variable vValue ? vValue.getType() : typeChecker.inferTypeFromValue(value);

        if (!valueType.equals(expectedType)) {
            return throwParameterMismatchRuntimeException("<MDA>array_count", "second");
        }

        List<Object> typedList = (List<Object>) list;

        int count = 0;

        if (value instanceof Variable vValue) {
            value = vValue.getValue();
        }

        for (Object item : typedList) {
            if (item.equals(value)) {
                count++;
            }
        }

        return count;
    }

    public Object handleArrayInsertFirstFunction(Object array, Object value) {
        Variable variable;

        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            throw new RuntimeException("The standard 'array_insert_first' function requires the first argument to be an array variable");
        }

        else {
            variable = var;
        }

        VariableType expectedType = typeChecker.inferTypeFromArrayType(variable.getType());
        VariableType valueType = value instanceof Variable vValue ? vValue.getType() : typeChecker.inferTypeFromValue(value);

        if (!valueType.equals(expectedType)) {
            return throwParameterMismatchRuntimeException("<MDA>array_insert_first", "second");
        }

        List<Object> typedList = (List<Object>) list;

        if (value instanceof Variable vValue) {
            value = vValue.getValue();
        }

        typedList.addFirst(value);

        return typedList;
    }

    public Object handleArrayInsertAtFunction(Object array, Object index, Object value) {
        Variable variable;

        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_insert_at", "first");
        }

        else {
            variable = var;
        }

        int idx;

        if (index instanceof Integer) {
            idx = (Integer) index;
        }

        else if (index instanceof Variable var2 && var2.getType() == VariableType.INTEGER && var2.getValue() instanceof Integer i) {
            idx = i;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>array_insert_at", "second");
        }

        if (idx < 0 || idx > list.size()) {
            return throwIndexOutOfBoundsRuntimeException("<MDA>array_insert_at", idx, list.size());
        }

        VariableType expectedType = typeChecker.inferTypeFromArrayType(variable.getType());
        VariableType actualType = (value instanceof Variable vValue) ? vValue.getType() : typeChecker.inferTypeFromValue(value);

        if (!actualType.equals(expectedType)) {
            return throwParameterMismatchRuntimeException("<MDA>array_insert_at", "third");
        }

        List<Object> typedList = (List<Object>) list;

        if (value instanceof Variable vValue) {
            value = vValue.getValue();
        }

        typedList.add(idx, value);

        return typedList;
    }

    public Object handleArrayInsertLastFunction(Object array, Object value) {
        Variable variable;

        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_insert_last", "first");
        }

        else {
            variable = var;
        }

        VariableType expectedType = typeChecker.inferTypeFromArrayType(variable.getType());
        VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);

        if (!valueType.equals(expectedType)) {
            return throwParameterMismatchRuntimeException("<MDA>array_insert_last", "second");
        }

        List<Object> typedList = (List<Object>) list;

        if (value instanceof Variable vValue) {
            value = vValue.getValue();
        }

        typedList.add(value);

        return typedList;
    }

    public Object handleArrayDeleteFirstFunction(Object array) {
        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_delete_first", "first");
        }

        List<Object> typedList = (List<Object>) list;

        if (typedList.isEmpty()) {
            return throwCannotDeleteFromEmptyArrayException("<MDA>array_delete_first");
        }

        typedList.removeFirst();

        return typedList;
    }

    public Object handleArrayDeleteAtFunction(Object array, Object index) {
        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_delete_at", "first");
        }

        int idx;

        if (index instanceof Integer) {
            idx = (Integer) index;
        }

        else if (index instanceof Variable var2 && var2.getType() == VariableType.INTEGER && var2.getValue() instanceof Integer i) {
            idx = i;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>array_delete_at", "second");
        }

        List<Object> typedList = (List<Object>) list;

        if (idx < 0 || idx >= typedList.size()) {
            return throwIndexOutOfBoundsRuntimeException("<MDA>array_delete_at", idx, list.size());
        }

        typedList.remove(idx);

        return typedList;
    }

    public Object handleArrayDeleteLastFunction(Object array) {
        if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
            return throwParameterMismatchRuntimeException("<MDA>array_delete_last", "first");
        }

        List<Object> typedList = (List<Object>) list;

        if (typedList.isEmpty()) {
            return throwCannotDeleteFromEmptyArrayException("<MDA>array_delete_last");
        }

        typedList.removeLast();

        return typedList;
    }

    public Object handleStringSliceFunction(Object string, Object startIndex, Object endIndex) {
        String str;

        if (string instanceof Variable v && v.getType() == VariableType.STRING) {
            str = (String) v.getValue();
        }

        else if (string instanceof String s) {
            str = s;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>string_slice", "first");
        }

        int start;

        if (startIndex instanceof Variable v && v.getType() == VariableType.INTEGER) {
            start = (Integer) v.getValue();
        }

        else if (startIndex instanceof Integer) {
            start = (Integer) startIndex;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>string_slice", "second");
        }

        int end;

        if (endIndex instanceof Variable v && v.getType() == VariableType.INTEGER) {
            end = (Integer) v.getValue();
        }

        else if (endIndex instanceof Integer) {
            end = (Integer) endIndex;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>string_slice", "third");
        }

        if (start < 0 || end > str.length() || start > end) {
            return throwStringSliceInvalidRangeException(start, end, str.length());
        }

        return str.substring(start, end);
    }

    public Object handleStringSplitFunction(Object string, Object character) {
        String str;

        if (string instanceof Variable v && v.getType() == VariableType.STRING) {
            str = (String) v.getValue();
        }

        else if (string instanceof String s) {
            str = s;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>string_split", "first");
        }

        char delimiter;

        if (character instanceof Variable v && v.getType() == VariableType.CHARACTER) {
            delimiter = (Character) v.getValue();
        }

        else if (character instanceof Character c) {
            delimiter = c;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>string_split", "second");
        }

        String[] parts = str.split(Pattern.quote(String.valueOf(delimiter)));
        List<String> nonEmptyParts = new ArrayList<>();

        for (String part : parts) {
            if (!part.isEmpty()) {
                nonEmptyParts.add(part);
            }
        }

        return nonEmptyParts;
    }

    public Object handleStringSubstringFunction(Object string, Object substring) {
        String str;

        if (string instanceof Variable v && v.getType() == VariableType.STRING) {
            str = (String) v.getValue();
        }

        else if (string instanceof String s) {
            str = s;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>string_substring", "first");
        }

        String substr;

        if (substring instanceof Variable v && v.getType() == VariableType.STRING) {
            substr = (String) v.getValue();
        }

        else if (substring instanceof String s) {
            substr = s;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>string_substring", "second");
        }

        return str.contains(substr);
    }

    public Object handleIntegerToDoubleFunction(Object value) {
        if (value instanceof Variable v && v.getType() == VariableType.INTEGER) {
            return ((Integer) v.getValue()).doubleValue();
        }

        else if (value instanceof Integer i) {
            return i.doubleValue();
        }

        return throwParameterMismatchRuntimeException("<MDA>integer_to_double", "first");
    }

    public Object handleDoubleToIntegerFunction(Object value) {
        if (value instanceof Variable v && v.getType() == VariableType.DOUBLE) {
            return ((Double) v.getValue()).intValue();
        }

        else if (value instanceof Double d) {
            return d.intValue();
        }

        return throwParameterMismatchRuntimeException("<MDA>double_to_integer", "second");
    }

    public Object handleBooleanToIntegerFunction(Object value) {
        if (value instanceof Variable v && v.getType() == VariableType.BOOLEAN) {
            return ((Boolean) v.getValue()) ? 1 : 0;
        }

        else if (value instanceof Boolean b) {
            return b ? 1 : 0;
        }

        return throwParameterMismatchRuntimeException("<MDA>boolean_to_integer", "first");
    }

    public Object handleStringToIntegerFunction(Object value) {
        String str;

        if (value instanceof Variable v && v.getType() == VariableType.STRING) {
            str = (String) v.getValue();
        }

        else if (value instanceof String s) {
            str = s;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>string_to_integer", "first");
        }

        try {
            return Integer.parseInt(str);
        }

        catch (NumberFormatException e) {
            return throwFailedToConvertStringToIntegerException();
        }
    }

    public Object handleStringToDoubleFunction(Object value) {
        String str;

        if (value instanceof Variable v && v.getType() == VariableType.STRING) {
            str = (String) v.getValue();
        }

        else if (value instanceof String s) {
            str = s;
        }

        else {
            return throwParameterMismatchRuntimeException("<MDA>string_to_double", "first");
        }

        try {
            return Double.parseDouble(str);
        }

        catch (NumberFormatException e) {
            return throwFailedToConvertStringToDoubleException();
        }
    }

    public Object handleIntegerToStringFunction(Object value) {
        if (value instanceof Variable v && v.getType() == VariableType.INTEGER) {
            return String.valueOf(v.getValue());
        }

        else if (value instanceof Integer i) {
            return String.valueOf(i);
        }

        return throwParameterMismatchRuntimeException("<MDA>integer_to_string", "first");
    }

    public Object handleDoubleToStringFunction(Object value) {
        if (value instanceof Variable v && v.getType() == VariableType.DOUBLE) {
            return String.valueOf(v.getValue());
        }

        else if (value instanceof Double d) {
            return String.valueOf(d);
        }

        return throwParameterMismatchRuntimeException("<MDA>double_to_string", "first");
    }
}
