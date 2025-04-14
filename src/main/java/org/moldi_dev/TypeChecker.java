package org.moldi_dev;

import java.util.List;

public class TypeChecker {
    public static VariableType inferTypeFromValue(Object value) {
        if (value instanceof Variable) {
            return ((Variable) value).getType();
        }

        if (value instanceof Integer) return VariableType.INTEGER;
        if (value instanceof Double) return VariableType.DOUBLE;
        if (value instanceof Boolean) return VariableType.BOOLEAN;
        if (value instanceof Character) return VariableType.CHARACTER;
        if (value instanceof String) return VariableType.STRING;
        if (value instanceof List<?>) {
            if (((List<?>) value).isEmpty()) return VariableType.ANY;

            Object first = ((List<?>) value).getFirst();
            VariableType elementType = inferTypeFromValue(first);

            return switch (elementType) {
                case INTEGER -> VariableType.INTEGER_ARRAY;
                case DOUBLE -> VariableType.DOUBLE_ARRAY;
                case STRING -> VariableType.STRING_ARRAY;
                case BOOLEAN -> VariableType.BOOLEAN_ARRAY;
                default -> VariableType.ANY;
            };
        }

        return VariableType.ANY;
    }

    public static boolean isListOfType(Object value, Class<?> clazz) {
        if (!(value instanceof List<?> list)) return false;
        return !list.isEmpty() && list.stream().allMatch(clazz::isInstance);
    }
}
