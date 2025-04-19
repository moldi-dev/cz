package org.moldi_dev;

public class TypeMapper {
    public TypeMapper() {}

    public VariableType toVariableType(String token) {
        return switch (token) {
            case "int", "rizz" -> VariableType.INTEGER;
            case "double", "g" -> VariableType.DOUBLE;
            case "char", "fam" -> VariableType.CHARACTER;
            case "string", "squad" -> VariableType.STRING;
            case "bool", "cappin" -> VariableType.BOOLEAN;
            case "array<int>", "squad<rizz>" -> VariableType.INTEGER_ARRAY;
            case "array<double>", "squad<g>" -> VariableType.DOUBLE_ARRAY;
            case "array<string>", "squad<fam>" -> VariableType.STRING_ARRAY;
            case "array<bool>", "squad<cappin>" -> VariableType.BOOLEAN_ARRAY;
            default -> VariableType.ANY;
        };
    }

    public String toString(VariableType type) {
        return switch (type) {
            case INTEGER -> "int";
            case DOUBLE -> "double";
            case CHARACTER -> "char";
            case STRING -> "string";
            case BOOLEAN -> "bool";
            case INTEGER_ARRAY -> "array<int>";
            case DOUBLE_ARRAY -> "array<double>";
            case STRING_ARRAY -> "array<string>";
            case BOOLEAN_ARRAY -> "array<bool>";
            case ANY -> "";
        };
    }
}

