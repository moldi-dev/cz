package org.moldi_dev;

import org.antlr.v4.runtime.ParserRuleContext;
import org.moldi_dev.antlr_4_gen.CZParser;

import java.util.List;
import java.util.Map;

public class Utility {
    public Utility() {}

    public boolean parametersMatch(List<Variable> a, List<Variable> b) {
        if (a.size() != b.size()) return true;

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).getType().equals(b.get(i).getType())) {
                return true;
            }

            if (!a.get(i).getName().equals(b.get(i).getName())) {
                return true;
            }
        }

        return false;
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

    public String resolveEnumValue(String enumName, Integer enumValue) {
        Map<String, Integer> members = CZInterpreter.enums.get(enumName);

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

    public String formatValueForPrinting(Object value) {
        if (value instanceof Variable variable) {
            if (variable.getType().equals(VariableType.ENUMERATION)) {
                return resolveEnumValue(variable.getEnumName(), (Integer) variable.getValue());
            }

            else {
                value = variable.getValue();
            }
        }

        if (value instanceof List<?> arrayValue) {
            StringBuilder sb = new StringBuilder("[");

            for (int i = 0; i < arrayValue.size(); i++) {
                Object element = arrayValue.get(i);

                sb.append(formatValueForPrinting(element));

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
}
