package org.moldi_dev;

import java.util.List;

public class TypeChecker {
    public TypeChecker() {}

    public VariableType inferTypeFromValue(Object value) {
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

    public VariableType inferTypeFromArrayType(VariableType arrayType) {
        return switch (arrayType) {
            case INTEGER_ARRAY -> VariableType.INTEGER;
            case DOUBLE_ARRAY -> VariableType.DOUBLE;
            case STRING_ARRAY -> VariableType.STRING_ARRAY;
            case BOOLEAN_ARRAY -> VariableType.BOOLEAN_ARRAY;
            default -> VariableType.ANY;
        };
    }
}
