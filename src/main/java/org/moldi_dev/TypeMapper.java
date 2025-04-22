package org.moldi_dev;

public class TypeMapper {
    public TypeMapper() {}

    public VariableType toVariableType(String token) {
        if (token.contains("array<struct>")) {
            token = "<STRUCT_ARRAY>";
        }

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
            case "enum", "bae" -> VariableType.ENUMERATION;
            case "struct", "strucey" -> VariableType.STRUCTURE;
            case "void", "ghost" -> VariableType.VOID;
            case "<STRUCT_ARRAY>" -> VariableType.STRUCTURE_ARRAY;
            default -> VariableType.UNKNOWN;
        };
    }
}

