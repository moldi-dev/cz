package org.moldi_dev;

import org.antlr.v4.runtime.ParserRuleContext;
import org.moldi_dev.antlr_4_gen.CZParser;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Utility {
    private final TypeChecker typeChecker;

    public Utility() {
        typeChecker = new TypeChecker();
    }

    public boolean parametersMatch(List<Variable> a, List<Variable> b) {
        if (a.size() != b.size()) return false;

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).getType().equals(b.get(i).getType())) {
                return false;
            }

            if (a.get(i).getType() == VariableType.STRUCTURE && !b.get(i).getStructName().equals(a.get(i).getStructName())) {
                return false;
            }

            if (a.get(i).getType() == VariableType.ENUMERATION && !b.get(i).getEnumName().equals(a.get(i).getEnumName())) {
                return false;
            }

            if (a.get(i).getType() == VariableType.STRUCTURE_ARRAY && !b.get(i).getStructName().equals(a.get(i).getStructName())) {
                return false;
            }

            if (!a.get(i).getName().equals(b.get(i).getName())) {
                return false;
            }
        }

        return true;
    }

    public String findEnclosingFunctionName(ParserRuleContext ctx) {
        ParserRuleContext current = ctx;

        while (current != null) {
            if (current instanceof CZParser.Function_declarationContext funcCtx) {
                return funcCtx.IDENTIFIER().getText();
            }

            else if (current instanceof CZParser.FunctionContext funcCtx) {
                return funcCtx.IDENTIFIER().getText();
            }

            current = current.getParent();
        }

        return "_NOT_FOUND";
    }

    public Object parseConstantValue(String value) {
        value = value.trim();

        if (value.equals("true") || value.equals("false")) {
            return Boolean.parseBoolean(value);
        }

        try {
            return Integer.parseInt(value);
        }

        catch (NumberFormatException ignored) {}

        try {
            return Double.parseDouble(value);
        }

        catch (NumberFormatException ignored) {}

        if ((value.startsWith("\"") && value.endsWith("\"")) || (value.startsWith("'") && value.endsWith("'"))) {
            return value.substring(1, value.length() - 1);
        }

        return value;
    }

    public String resolveEnumValue(String enumName, Integer enumValue, Map<String, Map<String, Integer>> enums) {
        Map<String, Integer> members = enums.get(enumName);

        if (members == null) {
            throw new RuntimeException("Enum \"" + enumName + "\" not defined.");
        }

        for (Map.Entry<String, Integer> entry : members.entrySet()) {
            if (entry.getValue().equals(enumValue)) {
                return enumName + "." + entry.getKey();
            }
        }

        throw new RuntimeException("Value \"" + enumValue + "\" not found in enum \"" + enumName + "\".");
    }

    public String formatValueForPrinting(Object value, Map<String, Map<String, Integer>> enums) {
        if (value instanceof Variable variable) {
            if (variable.getType().equals(VariableType.ENUMERATION)) {
                return resolveEnumValue(variable.getEnumName(), (Integer) variable.getValue(), enums);
            }

            else if (variable.getType().equals(VariableType.STRUCTURE)) {
                Object structValue = variable.getValue();

                if (structValue == null) {
                    return "null";
                }

                if (structValue instanceof Struct struct) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(struct.getStructName()).append(" = [");

                    List<Variable> fields = struct.getFields();

                    for (int i = 0; i < fields.size(); i++) {
                        Variable field = fields.get(i);
                        sb.append(field.getName())
                                .append(" = ")
                                .append(formatValueForPrinting(field, enums));

                        if (i < fields.size() - 1) {
                            sb.append(", ");
                        }
                    }

                    sb.append("]");
                    return sb.toString();
                }

                return "invalid struct";
            }

            else if (variable.getType().equals(VariableType.STRUCTURE_ARRAY)) {
                Object structArrayValue = variable.getValue();

                if (!(structArrayValue instanceof List<?> structList)) {
                    return "[]";
                }

                StringBuilder sb = new StringBuilder();
                sb.append("[");

                for (int i = 0; i < structList.size(); i++) {
                    Struct struct = (Struct) structList.get(i);

                    if (struct != null) {
                        sb.append(struct.getStructName()).append(" = [");

                        List<Variable> fields = struct.getFields();

                        for (int j = 0; j < fields.size(); j++) {
                            Variable field = fields.get(j);
                            sb.append(field.getName())
                                    .append(" = ")
                                    .append(formatValueForPrinting(field, enums));

                            if (j < fields.size() - 1) {
                                sb.append(", ");
                            }
                        }

                        sb.append("]");
                    }

                    else {
                        sb.append("invalid struct");
                    }

                    if (i < structList.size() - 1) {
                        sb.append(", ");
                    }
                }

                sb.append("]");
                return sb.toString();
            }

            else {
                value = variable.getValue();
            }
        }

        if (value instanceof List<?> arrayValue) {
            StringBuilder sb = new StringBuilder("[");

            for (int i = 0; i < arrayValue.size(); i++) {
                Object element = arrayValue.get(i);

                sb.append(formatValueForPrinting(element, enums));

                if (i < arrayValue.size() - 1) {
                    sb.append(", ");
                }
            }

            sb.append("]");
            return sb.toString();
        }

        if (value instanceof String strVal) {
            return strVal.replace("\\n", "\n")
                    .replace("\\t", "\t")
                    .replace("\\\"", "\"")
                    .replace("\\\\", "\\");
        }

        return String.valueOf(value);
    }

    public VariableType resolveType(CZParser.Type_Context ctx) {
        if (ctx.INT() != null) return VariableType.INTEGER;
        if (ctx.DOUBLE() != null) return VariableType.DOUBLE;
        if (ctx.BOOLEAN() != null) return VariableType.BOOLEAN;
        if (ctx.CHAR() != null) return VariableType.CHARACTER;
        if (ctx.STRING() != null) return VariableType.STRING;
        if (ctx.VOID() != null) return VariableType.VOID;

        if (ctx.ARRAY_INT() != null) return VariableType.INTEGER_ARRAY;
        if (ctx.ARRAY_DOUBLE() != null) return VariableType.DOUBLE_ARRAY;
        if (ctx.ARRAY_STRING() != null) return VariableType.STRING_ARRAY;
        if (ctx.ARRAY_BOOLEAN() != null) return VariableType.BOOLEAN_ARRAY;

        if (ctx.ENUM() != null) return VariableType.ENUMERATION;
        if (ctx.STRUCT() != null) return VariableType.STRUCTURE;
        if (ctx.struct_array_type() != null) return VariableType.STRUCTURE_ARRAY;

        return VariableType.UNKNOWN;
    }

    public Object getDefaultValueForVariableType(VariableType type) {
        switch (type) {
            case INTEGER: return 0;
            case DOUBLE: return 0.0;
            case BOOLEAN: return Boolean.FALSE;
            case CHARACTER: return '\0';
            case STRING: return "\0";
            case VOID: return null;
            case BOOLEAN_ARRAY: return new ArrayList<Boolean>();
            case STRING_ARRAY: return new ArrayList<String>();
            case INTEGER_ARRAY: return new ArrayList<Integer>();
            case DOUBLE_ARRAY: return new ArrayList<Double>();
            default: throw new RuntimeException("Unknown variable type: " + type);
        }
    }

    public  Integer coerceToInteger(Object value) {
        if (value instanceof Integer i) {
            return i;
        }

        if (value instanceof Variable v && v.getType() == VariableType.INTEGER) {
            return (Integer) v.getValue();
        }

        if (value instanceof Variable v && v.getType() == VariableType.ENUMERATION) {
            return (Integer) v.getValue();
        }

        throw typeError(value, VariableType.INTEGER);
    }

    public Double coerceToDouble(Object value) {
        if (value instanceof Double d) {
            return d;
        }

        if (value instanceof Variable v && v.getType() == VariableType.DOUBLE) {
            return (Double) v.getValue();
        }

        throw typeError(value, VariableType.DOUBLE);
    }

    public Boolean coerceToBoolean(Object value) {
        if (value instanceof Boolean b) {
            return b;
        }

        if (value instanceof Variable v && v.getType() == VariableType.BOOLEAN) {
            return (Boolean) v.getValue();
        }

        throw typeError(value, VariableType.BOOLEAN);
    }

    public Character coerceToCharacter(Object value) {
        if (value instanceof Character c) {
            return c;
        }

        if (value instanceof Variable v && v.getType() == VariableType.CHARACTER) {
            return (Character) v.getValue();
        }

        throw typeError(value, VariableType.CHARACTER);
    }

    public String coerceToString(Object value) {
        if (value instanceof String s) {
            return s;
        }

        if (value instanceof Variable v && v.getType() == VariableType.STRING) {
            return (String) v.getValue();
        }

        throw typeError(value, VariableType.STRING);
    }

    public Integer coerceToEnum(Object value, String enumName, Map<String, Map<String, Integer>> enums) {
        if (value instanceof Variable v && v.getType() == VariableType.ENUMERATION) {
            if (!v.getEnumName().equals(enumName)) {
                throw new RuntimeException("Enum type mismatch: expected " + enumName + " but got " + v.getEnumName());
            }

            return (Integer) v.getValue();
        }

        if (value instanceof Variable v && v.getType() == VariableType.INTEGER) {
            return (Integer) v.getValue();
        }

        if (value instanceof Integer i) {
            Map<String, Integer> enumMap = enums.get(enumName);

            if (enumMap == null) {
                throw new RuntimeException("Enum type \"" + enumName + "\" not found.");
            }

            if (!enumMap.containsValue(i)) {
                throw new RuntimeException("Value " + i + " is not valid for enum \"" + enumName + "\".");
            }

            return i;
        }

        throw new RuntimeException("Invalid enum assignment: expected enum value or integer for enum \"" + enumName + "\".");
    }

    public Struct coerceToStruct(Object value, String structName, Map<String, Struct> structs) {
        if (value == null) {
            return null;
        }

        if (value instanceof Variable var) {
            if (var.getType() != VariableType.STRUCTURE) {
                throw new RuntimeException("Expected struct type, but got: " + var.getType());
            }

            if (!Objects.equals(var.getStructName(), structName)) {
                throw new RuntimeException("Struct name mismatch: expected \"" + structName + "\", but got \"" + var.getStructName() + "\".");
            }

            if (var.getValue() == null) {
                return null;
            }

            if (!(var.getValue() instanceof Struct structInstance)) {
                throw new RuntimeException("Invalid struct variable: value is not a struct instance.");
            }

            if (!structs.containsKey(structName)) {
                throw new RuntimeException("Struct \"" + structName + "\" is not defined in the struct map.");
            }

            return structInstance;
        }

        if (value instanceof Struct structInstance) {
            String actualName = structInstance.getStructName();

            if (!Objects.equals(actualName, structName)) {
                throw new RuntimeException("Struct name mismatch: expected \"" + structName + "\", but got \"" + actualName + "\".");
            }

            if (!structs.containsKey(structName)) {
                throw new RuntimeException("Struct \"" + structName + "\" is not defined in the struct map.");
            }

            return structInstance;
        }

        throw new RuntimeException("Type mismatch: cannot coerce value to struct \"" + structName + "\".");
    }

    public <T> List<T> coerceToTypedList(Object value, Class<T> elementType, VariableType innerType) {
        if (value instanceof Variable v && v.getType().name().endsWith("_ARRAY") && v.getValue() instanceof List<?>) {
            value = v.getValue();
        }

        if (!(value instanceof List<?> list)) {
            throw new RuntimeException("Expected a list but got: " + value.getClass().getSimpleName());
        }

        if (list.isEmpty()) {
            return new ArrayList<>();
        }

        List<T> coerced = new ArrayList<>();

        for (Object item : list) {
            if (elementType.isInstance(item)) {
                coerced.add(elementType.cast(item));
            }

            else if (item instanceof Variable var && var.getType() == innerType && elementType.isInstance(var.getValue())) {
                coerced.add(elementType.cast(var.getValue()));
            }

            else if (item instanceof Variable var && var.getType() == innerType && innerType == VariableType.STRUCTURE) {
                coerced.add(elementType.cast(var.getValue()));
            }

            else if (item == null) {
                if (elementType == Struct.class) {
                    coerced.add(null);
                }

                else {
                    throw new RuntimeException("Only structs can be null.");
                }
            }
        }

        return coerced;
    }

    private RuntimeException typeError(Object value, VariableType expected) {
        VariableType actual = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
        return new RuntimeException("Type mismatch: expected " + expected + " but got " + actual + ".");
    }

    public Struct copyStruct(Struct original) {
        if (original == null) {
            return null;
        }

        List<Variable> copiedFields = new ArrayList<>();

        for (Variable field : original.getFields()) {
            Variable fieldVar = new Variable();

            fieldVar.setName(field.getName());
            fieldVar.setType(field.getType());
            fieldVar.setEnumName(field.getEnumName());
            fieldVar.setStructName(field.getStructName());
            fieldVar.setValue(field.getValue());

            copiedFields.add(fieldVar);
        }

        return new Struct(original.getStructName(), copiedFields);
    }
}
