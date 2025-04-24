package org.moldi_dev;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;
import org.moldi_dev.antlr_4_gen.CZBaseVisitor;
import org.moldi_dev.antlr_4_gen.CZParser;

import java.util.*;

public class CZInterpreter extends CZBaseVisitor<Object> {
    public static Map<String, Function> functions;
    public static Map<String, String> constants;
    public static Map<String, Variable> variables;
    public static Map<String, Map<String, Integer>> enums;
    public static Map<String, Struct> structs;

    private boolean shouldBreak = false;
    private boolean shouldContinue = false;

    private final ExpressionEvaluator expressionEvaluator;
    private final TypeChecker typeChecker;
    private final TypeMapper typeMapper;
    private final Utility utility;
    private final StandardFunctionHandler standardFunctionHandler;

    public CZInterpreter() {
        variables = new LinkedHashMap<>();
        functions = new LinkedHashMap<>();
        constants = new LinkedHashMap<>();
        enums = new LinkedHashMap<>();
        structs = new LinkedHashMap<>();

        standardFunctionHandler = new StandardFunctionHandler();
        utility = new Utility();
        typeChecker = new TypeChecker();
        typeMapper = new TypeMapper();
        expressionEvaluator = new ExpressionEvaluator();

        // Built-in constants (can be overriden if needed)
        constants.put("E", String.valueOf(Math.E));
        constants.put("PI", String.valueOf(Math.PI));

        // Built-in functions (my standard library hehehe)

        // ---------------------------------------- MATH -----------------------------------------------
        functions.put("<MDA>sine",
                new Function("<MDA>sine",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>vibe_sway",
                new Function("<MDA>vibe_sway",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));

        functions.put("<MDA>cosine",
                new Function("<MDA>cosine",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>side_chill",
                new Function("<MDA>side_chill",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));

        functions.put("<MDA>hyperbolic_sine",
                new Function("<MDA>hyperbolic_sine",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>vibe_overload",
                new Function("<MDA>vibe_overload",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));

        functions.put("<MDA>hyperbolic_cosine",
                new Function("<MDA>hyperbolic_cosine",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>side_overload",
                new Function("<MDA>side_overload",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));

        functions.put("<MDA>degrees_to_radians",
                new Function("<MDA>degrees_to_radians",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>degz2radz",
                new Function("<MDA>degz2radz",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));

        functions.put("<MDA>radians_to_degrees",
                new Function("<MDA>radians_to_degrees",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>radz2degz",
                new Function("<MDA>radz2degz",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));

        functions.put("<MDA>exponential",
                new Function("<MDA>exponential",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>brr_brr_patapim",
                new Function("<MDA>brr_brr_patapim",
                        List.of(new Variable("x", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));

        functions.put("<MDA>logarithm",
                new Function("<MDA>logarithm",
                        List.of(new Variable("x", VariableType.DOUBLE, null),
                                new Variable("y", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>vibe_log",
                new Function("<MDA>vibe_log",
                        List.of(new Variable("x", VariableType.DOUBLE, null),
                                new Variable("y", VariableType.DOUBLE, null)),
                        null, false, VariableType.DOUBLE));

        // ---------------------------------------- ARRAYS -----------------------------------------------

        functions.put("<MDA>array_length",
                new Function("<MDA>array_length",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null)),
                        null, false, VariableType.INTEGER));
        functions.put("<MDA>squad_countdown",
                new Function("<MDA>squad_countdown",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null)),
                        null, false, VariableType.INTEGER));

        functions.put("<MDA>array_get_at",
                new Function("<MDA>array_get_at",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("index", VariableType.INTEGER, null)),
                        null, false, VariableType.UNKNOWN));
        functions.put("<MDA>squad_peep",
                new Function("<MDA>squad_peep",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("index", VariableType.INTEGER, null)),
                        null, false, VariableType.UNKNOWN));

        functions.put("<MDA>array_set_at",
                new Function("<MDA>array_set_at",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("index", VariableType.INTEGER, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));
        functions.put("<MDA>squad_seep",
                new Function("<MDA>squad_seep",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("index", VariableType.INTEGER, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));

        functions.put("<MDA>array_copy",
                new Function("<MDA>array_copy",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));
        functions.put("<MDA>squad_join",
                new Function("<MDA>squad_join",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));

        functions.put("<MDA>array_contains",
                new Function("<MDA>array_contains",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.BOOLEAN));
        functions.put("<MDA>squad_vibeswith",
                new Function("<MDA>squad_vibeswith",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.BOOLEAN));

        functions.put("<MDA>array_index_of",
                new Function("<MDA>array_index_of",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.INTEGER));
        functions.put("<MDA>squad_whereat",
                new Function("<MDA>squad_whereat",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.INTEGER));

        functions.put("<MDA>array_count",
                new Function("<MDA>array_count",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.INTEGER));
        functions.put("<MDA>squad_howmany",
                new Function("<MDA>squad_howmany",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.INTEGER));

        functions.put("<MDA>array_insert_first",
                new Function("<MDA>array_insert_first",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));
        functions.put("<MDA>squad_pushup",
                new Function("<MDA>squad_pushup",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));

        functions.put("<MDA>array_insert_at",
                new Function("<MDA>array_insert_at",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("index", VariableType.INTEGER, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));
        functions.put("<MDA>squad_dropin",
                new Function("<MDA>squad_dropin",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("index", VariableType.INTEGER, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));

        functions.put("<MDA>array_insert_last",
                new Function("<MDA>array_insert_last",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));
        functions.put("<MDA>squad_slidein",
                new Function("<MDA>squad_slidein",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("value", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));

        functions.put("<MDA>array_delete_first",
                new Function("<MDA>array_delete_first",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));
        functions.put("<MDA>squad_chopfirst",
                new Function("<MDA>squad_chopfirst",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));

        functions.put("<MDA>array_delete_at",
                new Function("<MDA>array_delete_at",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("index", VariableType.INTEGER, null)),
                        null, false, VariableType.UNKNOWN));
        functions.put("<MDA>squad_chopspot",
                new Function("<MDA>squad_chopspot",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null),
                                new Variable("index", VariableType.INTEGER, null)),
                        null, false, VariableType.UNKNOWN));

        functions.put("<MDA>array_delete_last",
                new Function("<MDA>array_delete_last",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));
        functions.put("<MDA>squad_choplast",
                new Function("<MDA>squad_choplast",
                        List.of(new Variable("arr", VariableType.UNKNOWN, null)),
                        null, false, VariableType.UNKNOWN));

        // ---------------------------------------- STRINGS -----------------------------------------------

        functions.put("<MDA>string_slice",
                new Function("<MDA>string_slice",
                        List.of(new Variable("string", VariableType.STRING, null),
                                new Variable("start", VariableType.INTEGER, null),
                                new Variable("end", VariableType.INTEGER, null)),
                        null, false, VariableType.STRING));
        functions.put("<MDA>squad_cut",
                new Function("<MDA>squad_cut",
                        List.of(new Variable("string", VariableType.STRING, null),
                                new Variable("start", VariableType.INTEGER, null),
                                new Variable("end", VariableType.INTEGER, null)),
                        null, false, VariableType.STRING));

        functions.put("<MDA>string_split",
                new Function("<MDA>string_split",
                        List.of(new Variable("string", VariableType.STRING, null),
                                new Variable("character", VariableType.CHARACTER, null)),
                        null, false, VariableType.STRING_ARRAY));
        functions.put("<MDA>squad_slay",
                new Function("<MDA>squad_slay",
                        List.of(new Variable("string", VariableType.STRING, null),
                                new Variable("character", VariableType.CHARACTER, null)),
                        null, false, VariableType.STRING_ARRAY));

        functions.put("<MDA>string_substring",
                new Function("<MDA>string_substring",
                        List.of(new Variable("string", VariableType.STRING, null),
                                new Variable("substring", VariableType.STRING, null)),
                        null, false, VariableType.BOOLEAN));
        functions.put("<MDA>squad_subquad",
                new Function("<MDA>squad_subquad",
                        List.of(new Variable("string", VariableType.STRING, null),
                                new Variable("substring", VariableType.STRING, null)),
                        null, false, VariableType.BOOLEAN));

        // ---------------------------------------- DATA TYPES CONVERSIONS -----------------------------------------------

        functions.put("<MDA>int_to_double",
                new Function("<MDA>int_to_double",
                        List.of(new Variable("value", VariableType.INTEGER, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>rizz2g",
                new Function("<MDA>rizz2g",
                        List.of(new Variable("value", VariableType.INTEGER, null)),
                        null, false, VariableType.DOUBLE));

        functions.put("<MDA>double_to_int",
                new Function("<MDA>double_to_int",
                        List.of(new Variable("value", VariableType.DOUBLE, null)),
                        null, false, VariableType.INTEGER));
        functions.put("<MDA>g2rizz",
                new Function("<MDA>g2rizz",
                        List.of(new Variable("value", VariableType.DOUBLE, null)),
                        null, false, VariableType.INTEGER));

        functions.put("<MDA>boolean_to_int",
                new Function("<MDA>boolean_to_int",
                        List.of(new Variable("value", VariableType.BOOLEAN, null)),
                        null, false, VariableType.INTEGER));
        functions.put("<MDA>cappin2rizz",
                new Function("<MDA>cappin2rizz",
                        List.of(new Variable("value", VariableType.BOOLEAN, null)),
                        null, false, VariableType.INTEGER));

        functions.put("<MDA>string_to_int",
                new Function("<MDA>string_to_int",
                        List.of(new Variable("value", VariableType.STRING, null)),
                        null, false, VariableType.INTEGER));
        functions.put("<MDA>squad2rizz",
                new Function("<MDA>squad2rizz",
                        List.of(new Variable("value", VariableType.STRING, null)),
                        null, false, VariableType.INTEGER));

        functions.put("<MDA>string_to_double",
                new Function("<MDA>string_to_double",
                        List.of(new Variable("value", VariableType.STRING, null)),
                        null, false, VariableType.DOUBLE));
        functions.put("<MDA>squad2g",
                new Function("<MDA>squad2g",
                        List.of(new Variable("value", VariableType.STRING, null)),
                        null, false, VariableType.DOUBLE));

        functions.put("<MDA>int_to_string",
                new Function("<MDA>int_to_string",
                        List.of(new Variable("value", VariableType.INTEGER, null)),
                        null, false, VariableType.STRING));
        functions.put("<MDA>rizz2squad",
                new Function("<MDA>rizz2squad",
                        List.of(new Variable("value", VariableType.INTEGER, null)),
                        null, false, VariableType.STRING));

        functions.put("<MDA>double_to_string",
                new Function("<MDA>double_to_string",
                        List.of(new Variable("value", VariableType.DOUBLE, null)),
                        null, false, VariableType.STRING));
        functions.put("<MDA>g2squad",
                new Function("<MDA>g2squad",
                        List.of(new Variable("value", VariableType.DOUBLE, null)),
                        null, false, VariableType.STRING));
    }

    @Override
    public Object visitProgram(CZParser.ProgramContext ctx) {
        for (CZParser.Constant_define_directiveContext defineCtx : ctx.constant_define_directive()) {
            String constantName = defineCtx.IDENTIFIER().getText();
            String constantValue;

            if (defineCtx.INTEGER_NUMBER() != null) {
                constantValue = defineCtx.INTEGER_NUMBER().getText();
                constants.put(constantName, constantValue);
            }

            else if (defineCtx.DOUBLE_NUMBER() != null) {
                constantValue = defineCtx.DOUBLE_NUMBER().getText();
                constants.put(constantName, constantValue);
            }

            else if (defineCtx.STRING_LITERAL() != null) {
                constantValue = defineCtx.STRING_LITERAL().getText();
                constants.put(constantName, constantValue);
            }

            else if (defineCtx.CHARACTER() != null) {
                constantValue = defineCtx.CHARACTER().getText();
                constants.put(constantName, constantValue);
            }

            else if (defineCtx.boolean_literal() != null) {
                constantValue = defineCtx.boolean_literal().getText();
                constants.put(constantName, constantValue);
            }
        }

        for (CZParser.Enum_declarationContext enumCtx : ctx.enum_declaration()) {
            visit(enumCtx);
        }

        for (CZParser.Struct_declarationContext structCtx : ctx.struct_declaration()) {
            visit(structCtx);
        }

        for (CZParser.Function_declarationContext declCtx : ctx.function_declaration()) {
            visit(declCtx);
        }

        for (CZParser.FunctionContext functionCtx : ctx.function()) {
            visit(functionCtx);
        }

        Object result = visit(ctx.main_function());

        for (Function function : functions.values()) {
            if (function.getIsDeclaredOnly()) {
                throw new RuntimeException("Function \"" + function.getFunctionName() + "\" declared but not defined.");
            }
        }

        return result;
    }

    @Override
    public Object visitConstant_define_directive(CZParser.Constant_define_directiveContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String value = ctx.getChild(2).getText();
        constants.put(name, value);
        return null;
    }

    @Override
    public Object visitEnum_declaration(CZParser.Enum_declarationContext ctx) {
        String enumType = ctx.IDENTIFIER().getText();

        if (enums.containsKey(enumType)) {
            throw new RuntimeException("Enum \"" + enumType + "\" already defined.");
        }

        Map<String, Integer> enumMap = new LinkedHashMap<>();
        int nextValue = 0;

        for (CZParser.Enum_memberContext memberCtx : ctx.enum_member()) {
            String enumMember = memberCtx.IDENTIFIER().getText();

            if (memberCtx.enum_member_value() != null) {
                int explicitValue = Integer.parseInt(memberCtx.enum_member_value().INTEGER_NUMBER().getText());
                enumMap.put(enumMember, explicitValue);
                nextValue = explicitValue + 1;
            }

            else {
                enumMap.put(enumMember, nextValue);
                nextValue++;
            }
        }

        enums.put(enumType, enumMap);

        return null;
    }

    @Override
    public Object visitStruct_declaration(CZParser.Struct_declarationContext ctx) {
        String structName = ctx.IDENTIFIER().getText();

        if (structs.containsKey(structName)) {
            throw new RuntimeException("Struct \"" + structName + "\" already defined.");
        }

        Struct placeholderStruct = new Struct(structName, new ArrayList<>());
        structs.put(structName, placeholderStruct);

        List<Variable> fields = new ArrayList<>();

        for (CZParser.Struct_memberContext memberCtx : ctx.struct_member()) {
            String fieldName = memberCtx.IDENTIFIER().getText();
            CZParser.Type_Context typeCtx = memberCtx.type_();

            VariableType varType = utility.resolveType(typeCtx);
            String enumName = null;
            String nestedStructName = null;

            if (typeCtx.VOID() != null) {
                throw new RuntimeException("Struct \"" + structName + "\" can't have a void field.");
            }

            if (typeCtx.ENUM() != null) {
                enumName = typeCtx.IDENTIFIER().getText();
            }

            else if (typeCtx.STRUCT() != null) {
                nestedStructName = typeCtx.IDENTIFIER().getText();
            }

            else if (typeCtx.struct_array_type() != null) {
                nestedStructName = typeCtx.struct_array_type().IDENTIFIER().getText();
            }

            Variable variable;

            if (varType == VariableType.ENUMERATION) {
                Map<String, Integer> enumMap = enums.get(enumName);

                if (enumMap == null) {
                    throw new RuntimeException("Enum \"" + enumName + "\" not defined.");
                }

                variable = new Variable(fieldName, enumName, varType, enumMap.entrySet().iterator().next().getValue());
            }

            else if (varType == VariableType.STRUCTURE) {
                if (!structs.containsKey(nestedStructName)) {
                    throw new RuntimeException("Struct \"" + nestedStructName + "\" not defined.");
                }

                variable = new Variable(fieldName, nestedStructName, null, varType);
            }

            else if (varType == VariableType.STRUCTURE_ARRAY) {
                if (!structs.containsKey(nestedStructName)) {
                    throw new RuntimeException("Struct \"" + nestedStructName + "\" not defined.");
                }

                variable = new Variable(fieldName, nestedStructName, new ArrayList<Struct>(), varType);
            }

            else {
                variable = new Variable(fieldName, varType, utility.getDefaultValueForVariableType(varType));
            }

            fields.add(variable);
        }

        placeholderStruct.setFields(fields);

        return null;
    }

    @Override
    public Object visitMain_function(CZParser.Main_functionContext ctx) {
        try {
            return visit(ctx.function_block());
        }

        catch (ReturnValue rv) {
            return rv.getValue();
        }
    }

    @Override
    public Object visitFunction_declaration(CZParser.Function_declarationContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<Variable> parameters = new ArrayList<>();

        String enumName = null;
        String structName = null;

        String ctxType = ctx.type_().getText();

        if (ctx.type_().ENUM() != null) {
            ctxType = "enum";
            enumName = ctx.type_().IDENTIFIER().getText();
        }

        else if (ctx.type_().STRUCT() != null) {
            ctxType = "struct";
            structName = ctx.type_().IDENTIFIER().getText();
        }

        else if (ctx.type_().struct_array_type() != null) {
            ctxType = "array<struct>";
            structName = ctx.type_().struct_array_type().IDENTIFIER().getText();
        }

        if (ctx.parameters() != null) {
            for (CZParser.ParameterContext paramCtx : ctx.parameters().parameter()) {
                String paramCtxName = paramCtx.type_().getText();

                if (paramCtx.type_().ENUM() != null) {
                    paramCtxName = "enum";
                }

                else if (paramCtx.type_().STRUCT() != null) {
                    paramCtxName = "struct";
                }

                else if (paramCtx.type_().struct_array_type() != null) {
                    paramCtxName = "array<struct>";
                }

                VariableType type = typeMapper.toVariableType(paramCtxName);
                String name = paramCtx.IDENTIFIER().getText();

                if (paramCtx.type_().ENUM() != null) {
                    parameters.add(new Variable(name, paramCtx.type_().IDENTIFIER().getText(), type, 0));
                }

                else if (paramCtx.type_().STRUCT() != null) {
                    parameters.add(new Variable(name, paramCtx.type_().IDENTIFIER().getText(), null, type));
                }

                else if (paramCtx.type_().struct_array_type() != null) {
                    parameters.add(new Variable(name, paramCtx.type_().struct_array_type().IDENTIFIER().getText(), null, type));
                }

                else {
                    parameters.add(new Variable(name, type, null));
                }
            }
        }

        VariableType returnType = typeMapper.toVariableType(ctxType);

        Function existing = functions.get(functionName);

        if (existing == null) {
            Function prototype = new Function(functionName, parameters, null, true, returnType);

            if (enumName != null) {
                prototype.setEnumName(enumName);
            }

            else if (structName != null) {
                prototype.setStructName(structName);
            }

            functions.put(functionName, prototype);
        }

        else if (existing.getIsDeclaredOnly()) {
            if (!existing.getReturnType().equals(returnType)) {
                throw new RuntimeException("Return type mismatch in function declaration of \"" + functionName + "\".");
            }

            if (utility.parametersMatch(existing.getParameters(), parameters)) {
                throw new RuntimeException("Parameter mismatch in function declaration of \"" + functionName + "\".");
            }
        }

        else {
            throw new RuntimeException("Function \"" + functionName + "\" is already defined.");
        }

        return null;
    }

    @Override
    public Object visitFunction(CZParser.FunctionContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<Variable> parameters = new ArrayList<>();

        String ctxType = ctx.type_().getText();

        String enumName = null;
        String structName = null;

        if (ctx.type_().ENUM() != null) {
            ctxType = "enum";
            enumName = ctx.type_().IDENTIFIER().getText();
        }

        else if (ctx.type_().STRUCT() != null) {
            ctxType = "struct";
            structName = ctx.type_().IDENTIFIER().getText();
        }

        else if (ctx.type_().struct_array_type() != null) {
            ctxType = "array<struct>";
            structName = ctx.type_().struct_array_type().IDENTIFIER().getText();
        }

        if (ctx.parameters() != null) {
            for (CZParser.ParameterContext paramCtx : ctx.parameters().parameter()) {
                String typeName = paramCtx.type_().getText();

                if (paramCtx.type_().ENUM() != null) {
                    typeName = "enum";
                }

                else if (paramCtx.type_().STRUCT() != null) {
                    typeName = "struct";
                }

                else if (paramCtx.type_().struct_array_type() != null) {
                    typeName = "array<struct>";
                }

                VariableType type = typeMapper.toVariableType(typeName);
                String name = paramCtx.IDENTIFIER().getText();

                if (paramCtx.type_().ENUM() != null) {
                    parameters.add(new Variable(name, paramCtx.type_().IDENTIFIER().getText(), type, 0));
                }

                else if (paramCtx.type_().STRUCT() != null) {
                    parameters.add(new Variable(name, paramCtx.type_().IDENTIFIER().getText(), null, type));
                }

                else if (paramCtx.type_().struct_array_type() != null) {
                    parameters.add(new Variable(name, paramCtx.type_().struct_array_type().IDENTIFIER().getText(), null, type));
                }

                else {
                    parameters.add(new Variable(name, type, null));
                }
            }
        }

        VariableType returnType = typeMapper.toVariableType(ctxType);
        Function existing = functions.get(functionName);

        if (existing == null) {
            Function function = new Function(functionName, parameters, ctx.function_block(), false, returnType);

            if (enumName != null) {
                function.setEnumName(enumName);
            }

            else if (structName != null) {
                function.setStructName(structName);
            }

            functions.put(functionName, function);
        }

        else if (existing.getIsDeclaredOnly()) {
            if (!existing.getReturnType().equals(returnType)) {
                throw new RuntimeException("Return type mismatch in function definition of \"" + functionName + "\".");
            }

            if (utility.parametersMatch(existing.getParameters(), parameters)) {
                throw new RuntimeException("Parameter mismatch in function definition of \"" + functionName + "\".");
            }

            existing.setBody(ctx.function_block());
            existing.setIsDeclaredOnly(false);
        }

        else {
            throw new RuntimeException("Function \"" + functionName + "\" is already defined.");
        }

        return null;
    }

    @Override
    public Object visitBlock(CZParser.BlockContext ctx) {
        for (CZParser.StatementContext statementCtx : ctx.statement()) {
            Object result = visit(statementCtx);

            if (shouldBreak || shouldContinue) {
                break;
            }

            if (result != null) {
                return result;
            }
        }

        return null;
    }

    @Override
    public Object visitDeclaration(CZParser.DeclarationContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        String typeToken = ctx.type_().getText();

        if (ctx.type_().ENUM() != null) {
            typeToken = "enum";
        }

        else if (ctx.type_().STRUCT() != null) {
            typeToken = "struct";
        }

        else if (ctx.type_().struct_array_type() != null) {
            typeToken = "array<struct>";
        }

        VariableType type = typeMapper.toVariableType(typeToken);

        switch (type) {
            case INTEGER_ARRAY -> variables.put(varName, new Variable(varName, type, new ArrayList<Integer>()));
            case DOUBLE_ARRAY -> variables.put(varName, new Variable(varName, type, new ArrayList<Double>()));
            case STRING_ARRAY -> variables.put(varName, new Variable(varName, type, new ArrayList<String>()));
            case BOOLEAN_ARRAY -> variables.put(varName, new Variable(varName, type, new ArrayList<Boolean>()));
            case INTEGER -> variables.put(varName, new Variable(varName, type, 0));
            case DOUBLE -> variables.put(varName, new Variable(varName, type, 0.0));
            case BOOLEAN -> variables.put(varName, new Variable(varName, type, false));
            case CHARACTER -> variables.put(varName, new Variable(varName, type, '\0'));
            case STRING -> variables.put(varName, new Variable(varName, type, "\0"));
            case ENUMERATION -> {
                String enumName = ctx.type_().IDENTIFIER().getText();

                if (!enums.containsKey(enumName)) {
                    throw new RuntimeException("Enum type \"" + enumName + "\" is not defined.");
                }

                else {
                    Map<String, Integer> enumMap = enums.get(enumName);
                    variables.put(varName, new Variable(varName, enumName, type, enumMap.entrySet().iterator().next().getValue()));
                }
            }
            case STRUCTURE -> {
                String structName = ctx.type_().IDENTIFIER().getText();

                if (!structs.containsKey(structName)) {
                    throw new RuntimeException("Struct type \"" + structName + "\" is not defined.");
                }

                else {
                    Struct copy = utility.copyStruct(structs.get(structName));
                    variables.put(varName, new Variable(varName, structName, copy, type));
                }
            }
            case STRUCTURE_ARRAY -> {
                String structName = ctx.type_().struct_array_type().IDENTIFIER().getText();

                if (!structs.containsKey(structName)) {
                    throw new RuntimeException("Struct type \"" + structName + "\" is not defined.");
                }

                else {
                    variables.put(varName, new Variable(varName, structName, new ArrayList<Struct>(), type));
                }
            }
            default -> throw new RuntimeException("Unknown variable type given inside a declaration.");
        }

        if (ctx.expression() != null) {
            CZParser.AssignmentContext fakeAssignment = new CZParser.AssignmentContext((ParserRuleContext) ctx.parent, ctx.invokingState);

            fakeAssignment.addChild(ctx.IDENTIFIER());
            fakeAssignment.addChild(ctx.expression());

            return visitAssignment(fakeAssignment);
        }

        return null;
    }

    private Object visitMemberAssignment(CZParser.Member_accessContext ctx, CZParser.ExpressionContext valueCtx) {
        String structVarName = ctx.IDENTIFIER(0).getText();
        String fieldName = ctx.IDENTIFIER(1).getText();

        if (!variables.containsKey(structVarName)) {
            throw new RuntimeException("Variable \"" + structVarName + "\" is not defined.");
        }

        Variable structVar = variables.get(structVarName);

        if (structVar.getType() != VariableType.STRUCTURE || structVar.getValue() == null) {
            throw new RuntimeException("Variable \"" + structVarName + "\" is not a valid struct.");
        }

        Struct structInstance = (Struct) structVar.getValue();

        Variable targetField = null;

        for (Variable field : structInstance.getFields()) {
            if (field.getName().equals(fieldName)) {
                targetField = field;
                break;
            }
        }

        if (targetField == null) {
            throw new RuntimeException("Field \"" + fieldName + "\" not found in struct \"" + structVarName + "\".");
        }

        Object value = visit(valueCtx);
        VariableType fieldType = targetField.getType();
        Object coercedValue;

        switch (fieldType) {
            case INTEGER -> coercedValue = utility.coerceToInteger(value);
            case DOUBLE -> coercedValue = utility.coerceToDouble(value);
            case BOOLEAN -> coercedValue = utility.coerceToBoolean(value);
            case CHARACTER -> coercedValue = utility.coerceToCharacter(value);
            case STRING -> coercedValue = utility.coerceToString(value);
            case ENUMERATION -> coercedValue = utility.coerceToEnum(value, targetField.getEnumName(), enums);
            case INTEGER_ARRAY -> coercedValue = utility.coerceToTypedList(value, Integer.class, VariableType.INTEGER);
            case DOUBLE_ARRAY -> coercedValue = utility.coerceToTypedList(value, Double.class, VariableType.DOUBLE);
            case BOOLEAN_ARRAY -> coercedValue = utility.coerceToTypedList(value, Boolean.class, VariableType.BOOLEAN);
            case STRING_ARRAY -> coercedValue = utility.coerceToTypedList(value, String.class, VariableType.STRING);
            case STRUCTURE -> coercedValue = utility.coerceToStruct(value, targetField.getStructName(), structs);
            case STRUCTURE_ARRAY -> coercedValue = utility.coerceToTypedList(value, Struct.class, VariableType.STRUCTURE);
            default -> throw new RuntimeException("Unsupported field type: \"" + fieldType + "\" for assignment.");
        }

        targetField.setValue(coercedValue);
        variables.put(structVarName, structVar);

        return null;
    }

    @Override
    public Object visitAssignment(CZParser.AssignmentContext ctx) {
        ParseTree lhs = ctx.getChild(0);

        if (lhs instanceof CZParser.Member_accessContext) {
            return visitMemberAssignment((CZParser.Member_accessContext) lhs, ctx.expression());
        }

        String varName = ctx.IDENTIFIER().getText();
        Object value = visit(ctx.expression());
        Variable var = variables.get(varName);

        if (value instanceof Variable v) {
            value = v.getValue();
        }

        if (value == null && var.getType() != VariableType.STRUCTURE) {
            throw new RuntimeException("Type mismatch for variable \"" + varName + "\". Only structs can be assigned to null.");
        }

        switch (var.getType()) {
            case INTEGER -> {
                Integer coerced = utility.coerceToInteger(value);
                variables.put(varName, new Variable(varName, VariableType.INTEGER, coerced));
            }

            case DOUBLE -> {
                Double coerced = utility.coerceToDouble(value);
                variables.put(varName, new Variable(varName, VariableType.DOUBLE, coerced));
            }

            case CHARACTER -> {
                Character coerced = utility.coerceToCharacter(value);
                variables.put(varName, new Variable(varName, VariableType.CHARACTER, coerced));
            }

            case STRING -> {
                String coerced = utility.coerceToString(value);
                variables.put(varName, new Variable(varName, VariableType.STRING, coerced));
            }

            case BOOLEAN -> {
                Boolean coerced = utility.coerceToBoolean(value);
                variables.put(varName, new Variable(varName, VariableType.BOOLEAN, coerced));
            }

            case ENUMERATION -> {
                String enumName = var.getEnumName();
                Integer coerced = utility.coerceToEnum(value, enumName, enums);
                variables.put(varName, new Variable(varName, enumName, VariableType.ENUMERATION, coerced));
            }

            case STRUCTURE -> {
                if (value == null) {
                    variables.put(varName, new Variable(varName, var.getStructName(), null, VariableType.STRUCTURE));
                }

                else if (value instanceof Struct s) {
                    variables.put(varName, new Variable(varName, var.getStructName(), s, VariableType.STRUCTURE));
                }

                else {
                    throw new RuntimeException("Type mismatch for variable \"" + varName + "\" for assignment.");
                }
            }

            case STRUCTURE_ARRAY -> {
                List<Struct> list = utility.coerceToTypedList(value, Struct.class, VariableType.STRUCTURE);
                variables.put(varName, new Variable(varName, var.getStructName(), list, VariableType.STRUCTURE_ARRAY));
            }

            case INTEGER_ARRAY -> {
                List<Integer> list = utility.coerceToTypedList(value, Integer.class, VariableType.INTEGER);
                variables.put(varName, new Variable(varName, VariableType.INTEGER_ARRAY, list));
            }

            case DOUBLE_ARRAY -> {
                List<Double> list = utility.coerceToTypedList(value, Double.class, VariableType.DOUBLE);
                variables.put(varName, new Variable(varName, VariableType.DOUBLE_ARRAY, list));
            }

            case STRING_ARRAY -> {
                List<String> list = utility.coerceToTypedList(value, String.class, VariableType.STRING);
                variables.put(varName, new Variable(varName, VariableType.STRING_ARRAY, list));
            }

            case BOOLEAN_ARRAY -> {
                List<Boolean> list = utility.coerceToTypedList(value, Boolean.class, VariableType.BOOLEAN);
                variables.put(varName, new Variable(varName, VariableType.BOOLEAN_ARRAY, list));
            }

            default -> throw new RuntimeException("Unsupported variable type: \"" + var.getType() + "\" for direct assignment.");
        }

        return null;
    }

    @Override
    public Object visitPrint_statement(CZParser.Print_statementContext ctx) {
        StringBuilder output = new StringBuilder();

        if (ctx.arguments() != null) {
            for (CZParser.ExpressionContext exprCtx : ctx.arguments().expression()) {
                Object value = visit(exprCtx);
                output.append(utility.formatValueForPrinting(value, enums));
            }
        }

        System.out.print(output);
        return null;
    }

    @Override
    public Object visitRead_statement(CZParser.Read_statementContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Scanner scanner = new Scanner(System.in);
        Variable var = variables.get(varName);

        switch (var.getType()) {
            case INTEGER: {
                int value = scanner.nextInt();
                scanner.nextLine();
                variables.put(varName, new Variable(varName, var.getType(), value));
                break;
            }

            case DOUBLE: {
                double value = scanner.nextDouble();
                variables.put(varName, new Variable(varName, var.getType(), value));
                break;
            }

            case CHARACTER: {
                char value = scanner.nextLine().charAt(0);
                variables.put(varName, new Variable(varName, var.getType(), value));
                break;
            }

            case STRING: {
                String value = scanner.nextLine();
                variables.put(varName, new Variable(varName, var.getType(), value));
                break;
            }

            case BOOLEAN: {
                boolean value = scanner.nextBoolean();
                variables.put(varName, new Variable(varName, var.getType(), value));
                break;
            }

            default: {
                throw new RuntimeException("Unsupported variable type: \"" + var.getType() + "\".");
            }
        }

        return null;
    }

    @Override
    public Object visitIf_statement(CZParser.If_statementContext ctx) {
        if ((boolean) visit(ctx.expression(0))) {
            return visit(ctx.block(0));
        }

        int elseIfCount = ctx.expression().size() - 1;

        for (int i = 0; i < elseIfCount; i++) {
            if ((boolean) visit(ctx.expression(i + 1))) {
                return visit(ctx.block(i + 1));
            }
        }

        if (ctx.block().size() > ctx.expression().size()) {
            return visit(ctx.block(ctx.block().size() - 1));
        }

        return null;
    }

    @Override
    public Object visitWhile_statement(CZParser.While_statementContext ctx) {
        while ((boolean) visit(ctx.expression())) {
            shouldBreak = false;
            shouldContinue = false;

            for (CZParser.StatementContext stmt : ctx.block().statement()) {
                Object result = visit(stmt);

                if (shouldBreak) {
                    shouldBreak = false;
                    return null;
                }

                if (shouldContinue) {
                    shouldContinue = false;
                    break;
                }

                if (result != null) {
                    return result;
                }
            }
        }

        return null;
    }

    @Override
    public Object visitDo_while_statement(CZParser.Do_while_statementContext ctx) {
        do {
            shouldBreak = false;
            shouldContinue = false;

            for (CZParser.StatementContext stmt : ctx.block().statement()) {
                Object result = visit(stmt);

                if (shouldBreak) {
                    shouldBreak = false;
                    return null;
                }

                if (shouldContinue) {
                    shouldContinue = false;
                    break;
                }

                if (result != null) {
                    return result;
                }
            }
        } while ((boolean) visit(ctx.expression()));

        return null;
    }

    @Override
    public Object visitFor_statement(CZParser.For_statementContext ctx) {
        boolean outerBreak = shouldBreak;
        boolean outerContinue = shouldContinue;

        if (ctx.for_init() != null) {
            visit(ctx.for_init());
        }

        while (true) {
            if (ctx.expression() != null) {
                Object condition = visit(ctx.expression());

                if (condition instanceof Boolean && !(Boolean) condition) {
                    break;
                }
            }

            shouldBreak = false;
            shouldContinue = false;

            Object result = visit(ctx.block());

            if (shouldBreak) {
                shouldBreak = false;
                break;
            }

            if (shouldContinue) {
                shouldContinue = false;

                if (ctx.assignment() != null) {
                    visit(ctx.assignment());
                }

                continue;
            }

            if (result != null) {
                shouldBreak = outerBreak;
                shouldContinue = outerContinue;
                return result;
            }

            if (ctx.assignment() != null) {
                visit(ctx.assignment());
            }
        }

        shouldBreak = outerBreak;
        shouldContinue = outerContinue;

        return null;
    }

    @Override
    public Object visitReturn_statement(CZParser.Return_statementContext ctx) {
        if (ctx.expression() != null) {
            Object value = visit(ctx.expression());

            String functionName = utility.findEnclosingFunctionName(ctx);
            Function function = functions.get(functionName);

            if (function != null) {
                VariableType declaredReturnType = function.getReturnType();
                VariableType valueType = typeChecker.inferTypeFromValue(value);

                if (!declaredReturnType.equals(valueType)) {
                    throw new RuntimeException("Return type mismatch for function \"" + functionName + "\": expected return type " + declaredReturnType + " but got " + valueType + ".");
                }

                else if (value instanceof Variable var && var.getType() == VariableType.ENUMERATION && !var.getEnumName().equals(function.getEnumName())) {
                    throw new RuntimeException("Return type mismatch for function \"" + functionName + "\": expected return type ENUMERATION " + function.getEnumName() + " but got ENUMERATION " + var.getEnumName() + ".");
                }

                else if (value instanceof Variable var && var.getType() == VariableType.STRUCTURE && !var.getStructName().equals(function.getStructName())) {
                    throw new RuntimeException("Return type mismatch for function \"" + functionName + "\": expected return type STRUCTURE " + function.getStructName() + " but got STRUCTURE " + var.getStructName() + ".");
                }

                else if (value instanceof Variable var && var.getType() == VariableType.STRUCTURE_ARRAY && !var.getStructName().equals(function.getStructName())) {
                    throw new RuntimeException("Return type mismatch for function \"" + functionName + "\": expected return type STRUCTURE_ARRAY " + function.getStructName() + " but got STRUCTURE_ARRAY " + var.getStructName() + ".");
                }
            }

            throw new ReturnValue(value);
        }

        else {
            String functionName = utility.findEnclosingFunctionName(ctx);
            Function function = functions.get(functionName);

            if (function != null) {
                VariableType declaredReturnType = function.getReturnType();

                if (!declaredReturnType.equals(VariableType.VOID)) {
                    throw new RuntimeException("Function \"" + functionName + "\" must return a value of type " + declaredReturnType + ".");
                }
            }

            throw new ReturnValue(null);
        }
    }

    @Override
    public Object visitParenExpression(CZParser.ParenExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitUnaryExpression(CZParser.UnaryExpressionContext ctx) {
        Object value = visit(ctx.expression());
        return expressionEvaluator.evaluateUnaryExpression(value, ctx.op.getType());
    }

    @Override
    public Object visitPowerExpression(CZParser.PowerExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        return expressionEvaluator.evaluatePowerExpression(left, right);
    }

    @Override
    public Object visitMultiplicativeExpression(CZParser.MultiplicativeExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        return expressionEvaluator.evaluateMultiplicativeExpression(left, right, ctx.op.getType());
    }

    @Override
    public Object visitAdditiveExpression(CZParser.AdditiveExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        return expressionEvaluator.evaluateAdditiveExpression(left, right, ctx.op.getType());
    }

    @Override
    public Object visitShiftExpression(CZParser.ShiftExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        return expressionEvaluator.evaluateShiftExpression(left, right, ctx.op.getType());
    }

    @Override
    public Object visitRelationalExpression(CZParser.RelationalExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        return expressionEvaluator.evaluateRelationalExpression(left, right, ctx.op.getType());
    }

    @Override
    public Object visitEqualityExpression(CZParser.EqualityExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        return expressionEvaluator.evaluateEqualityExpression(left, right, ctx.op.getType());
    }

    @Override
    public Object visitBitwiseExpression(CZParser.BitwiseExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);
        return expressionEvaluator.evaluateBitwiseExpression(left, right, ctx.op.getType());
    }

    @Override
    public Object visitLogicalExpression(CZParser.LogicalExpressionContext ctx) {
        Object left = visit(ctx.left);
        return expressionEvaluator.evaluateLogicalExpression(left, () -> visit(ctx.right), ctx.op.getType());
    }

    @Override
    public Object visitNullExpression(CZParser.NullExpressionContext ctx) {
        return null;
    }

    @Override
    public Object visitTernaryExpression(CZParser.TernaryExpressionContext ctx) {
        boolean condition = (boolean) visit(ctx.condition);

        if (condition) {
            return visit(ctx.trueExpr);
        }

        else {
            return visit(ctx.falseExpr);
        }
    }

    @Override
    public Object visitFunctionCallExpression(CZParser.FunctionCallExpressionContext ctx) {
        String functionName = ctx.function_call().IDENTIFIER() != null ? ctx.function_call().IDENTIFIER().getText() : ctx.function_call().standard_function().getText();

        Function f = functions.get(functionName);

        if (f == null || f.getIsDeclaredOnly()) {
            throw new RuntimeException("Function \"" + functionName + "\" not defined or missing implementation.");
        }

        List<Object> argumentValues = new ArrayList<>();

        if (ctx.function_call().arguments() != null) {
            for (CZParser.ExpressionContext exprCtx : ctx.function_call().arguments().expression()) {
                argumentValues.add(visit(exprCtx));
            }
        }

        List<Variable> parameters = f.getParameters();

        if (argumentValues.size() != parameters.size()) {
            throw new RuntimeException("Argument count mismatch for function \"" + functionName + "\".");
        }

        switch (functionName) {
            case "<MDA>sine":
            case "<MDA>vibe_sway": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleSineFunction(value);
            }

            case "<MDA>cosine":
            case "<MDA>side_chill": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleCosineFunction(value);
            }

            case "<MDA>hyperbolic_sine":
            case "<MDA>vibe_overload": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleHyperbolicSineFunction(value);
            }

            case "<MDA>hyperbolic_cosine":
            case "<MDA>side_overload": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleHyperbolicCosineFunction(value);
            }

            case "<MDA>degrees_to_radians":
            case "<MDA>degz2radz": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleDegreesToRadiansFunction(value);
            }

            case "<MDA>radians_to_degrees":
            case "<MDA>radz2degz": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleRadiansToDegreesFunction(value);
            }

            case "<MDA>exponential":
            case "<MDA>brr_brr_patapim": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleExponentialFunction(value);
            }

            case "<MDA>logarithm":
            case "<MDA>vibe_log": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                Object base = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleLogarithmFunction(base, value);
            }

            case "<MDA>array_length":
            case "<MDA>squad_countdown": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleArrayLengthFunction(array);
            }

            case "<MDA>array_get_at":
            case "<MDA>squad_peep": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object index = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleArrayGetAtFunction(array, index);
            }

            case "<MDA>array_set_at":
            case "<MDA>squad_seep": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object index = visit(ctx.function_call().arguments().expression(1));
                Object value = visit(ctx.function_call().arguments().expression(2));
                return standardFunctionHandler.handleArraySetAtFunction(array, index, value);
            }

            case "<MDA>array_copy":
            case "<MDA>squad_join": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleArrayCopyFunction(array);
            }

            case "<MDA>array_contains":
            case "<MDA>squad_vibeswith": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleArrayContainsFunction(array, value);
            }

            case "<MDA>array_index_of":
            case "<MDA>squad_whereat": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleArrayIndexOfFunction(array, value);
            }

            case "<MDA>array_count":
            case "<MDA>squad_howmany": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleArrayCountFunction(array, value);
            }

            case "<MDA>array_insert_first":
            case "<MDA>squad_pushup": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleArrayInsertFirstFunction(array, value);
            }

            case "<MDA>array_insert_at":
            case "<MDA>squad_dropin": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object index = visit(ctx.function_call().arguments().expression(1));
                Object value = visit(ctx.function_call().arguments().expression(2));
                return standardFunctionHandler.handleArrayInsertAtFunction(array, index, value);
            }

            case "<MDA>array_insert_last":
            case "<MDA>squad_slidein": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleArrayInsertLastFunction(array, value);
            }

            case "<MDA>array_delete_first":
            case "<MDA>squad_chopfirst": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleArrayDeleteFirstFunction(array);
            }

            case "<MDA>array_delete_at":
            case "<MDA>squad_chopspot": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object index = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleArrayDeleteAtFunction(array, index);
            }

            case "<MDA>array_delete_last":
            case "<MDA>squad_choplast": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleArrayDeleteLastFunction(array);
            }

            case "<MDA>string_slice":
            case "<MDA>squad_cut": {
                Object string = visit(ctx.function_call().arguments().expression(0));
                Object startIndex = visit(ctx.function_call().arguments().expression(1));
                Object endIndex = visit(ctx.function_call().arguments().expression(2));
                return standardFunctionHandler.handleStringSliceFunction(string, startIndex, endIndex);
            }

            case "<MDA>string_split":
            case "<MDA>squad_slay": {
                Object string = visit(ctx.function_call().arguments().expression(0));
                Object character = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleStringSplitFunction(string, character);
            }

            case "<MDA>string_substring":
            case "<MDA>squad_subquad": {
                Object string = visit(ctx.function_call().arguments().expression(0));
                Object substring = visit(ctx.function_call().arguments().expression(1));
                return standardFunctionHandler.handleStringSubstringFunction(string, substring);
            }

            case "<MDA>int_to_double":
            case "<MDA>rizz2g": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleIntegerToDoubleFunction(value);
            }

            case "<MDA>double_to_int":
            case "<MDA>g2rizz": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleDoubleToIntegerFunction(value);
            }

            case "<MDA>boolean_to_int":
            case "<MDA>cappin2rizz": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleBooleanToIntegerFunction(value);
            }

            case "<MDA>string_to_int":
            case "<MDA>squad2rizz": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleStringToIntegerFunction(value);
            }

            case "<MDA>string_to_double":
            case "<MDA>squad2g": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleStringToDoubleFunction(value);
            }

            case "<MDA>int_to_string":
            case "<MDA>rizz2squad": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleIntegerToStringFunction(value);
            }

            case "<MDA>double_to_string":
            case "<MDA>g2squad": {
                Object value = visit(ctx.function_call().arguments().expression(0));
                return standardFunctionHandler.handleDoubleToStringFunction(value);
            }

            default: {
                Map<String, Variable> functionVariables = new LinkedHashMap<>();

                for (int i = 0; i < parameters.size(); i++) {
                    Variable param = parameters.get(i);
                    Object argValue = argumentValues.get(i);

                    if (argValue instanceof Variable variableArg) {
                        VariableType argType = variableArg.getType();

                        if (!param.getType().equals(argType)) {
                            throw new RuntimeException("Type mismatch for parameter \"" + param.getName()
                                    + "\" in function \"" + functionName + "\": expected " + param.getType() + " but got " + argType + ".");
                        }

                        if (param.getType() == VariableType.STRUCTURE) {
                            Struct copied = utility.copyStruct((Struct) variableArg.getValue());
                            functionVariables.put(param.getName(), new Variable(param.getName(), param.getStructName(), copied, VariableType.STRUCTURE));
                        }

                        else if (param.getType().equals(VariableType.ENUMERATION)) {
                            functionVariables.put(param.getName(), new Variable(param.getName(), param.getEnumName(), param.getType(), (Integer)variableArg.getValue()));
                        }

                        else {
                            functionVariables.put(param.getName(), new Variable(param.getName(), param.getType(), variableArg.getValue()));
                        }
                    }

                    else {
                        VariableType argType = typeChecker.inferTypeFromValue(argValue);

                        if (!param.getType().equals(argType)) {
                            throw new RuntimeException("Type mismatch for parameter \"" + param.getName()
                                    + "\" in function \"" + functionName + "\": expected " + param.getType() + " but got " + argType + ".");
                        }

                        if (param.getType() == VariableType.STRUCTURE) {
                            Struct copied = utility.copyStruct((Struct) argValue);
                            functionVariables.put(param.getName(), new Variable(param.getName(), param.getStructName(), copied, VariableType.STRUCTURE));
                        }

                        else if (param.getType().equals(VariableType.ENUMERATION)) {
                            functionVariables.put(param.getName(), new Variable(param.getName(), param.getEnumName(), argType, (Integer)argValue));
                        }

                        else {
                            functionVariables.put(param.getName(), new Variable(param.getName(), param.getType(), argValue));
                        }
                    }
                }

                Map<String, Variable> previousVariables = new LinkedHashMap<>(variables);
                variables.clear();
                variables.putAll(functionVariables);

                Object result;

                try {
                    result = visit(f.getBody());
                }

                catch (ReturnValue rv) {
                    result = rv.getValue();
                }

                variables = previousVariables;
                return result;
            }
        }
    }

    @Override
    public Object visitIdentifierExpression(CZParser.IdentifierExpressionContext ctx) {
        String varName = ctx.IDENTIFIER().getText();

        if (constants.containsKey(varName)) {
            String value = constants.get(varName);
            return utility.parseConstantValue(value);
        }

        Variable var = variables.get(varName);

        if (var != null) {
            return var;
        }

        else {
            throw new RuntimeException("Variable \"" + varName + "\" not defined" + ".");
        }
    }

    @Override
    public Object visitMemberAccessExpression(CZParser.MemberAccessExpressionContext ctx) {
        String containerName = ctx.member_access().IDENTIFIER(0).getText();
        String memberName = ctx.member_access().IDENTIFIER(1).getText();

        if (enums.containsKey(containerName)) {
            Map<String, Integer> enumMembers = enums.get(containerName);

            if (!enumMembers.containsKey(memberName)) {
                throw new RuntimeException("Enum member \"" + memberName + "\" not found in enum \"" + containerName + "\".");
            }

            return enumMembers.get(memberName);
        }

        else if (structs.containsKey(containerName)) {
            Struct struct = structs.get(containerName);
            Variable found = null;

            for (Variable var : struct.getFields()) {
                if (var.getName().equals(memberName)) {
                    found = var;
                    break;
                }
            }

            if (found == null) {
                throw new RuntimeException("Struct member \"" + memberName + "\" not found in struct \"" + containerName + "\".");
            }

            return found;
        }

        else if (variables.containsKey(containerName)) {
            Variable var = variables.get(containerName);

            if (var.getType() != VariableType.STRUCTURE || var.getValue() == null) {
                throw new RuntimeException("Variable \"" + containerName + "\" is not a valid struct instance.");
            }

            Struct structInstance = (Struct) var.getValue();

            for (Variable field : structInstance.getFields()) {
                if (field.getName().equals(memberName)) {
                    return field;
                }
            }

            throw new RuntimeException("Member \"" + memberName + "\" not found in struct instance \"" + containerName + "\".");
        }

        throw new RuntimeException("Member \"" + memberName + "\" not found" + ".");
    }

    @Override
    public Object visitLiteralExpression(CZParser.LiteralExpressionContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public Object visitLiteral(CZParser.LiteralContext ctx) {
        if (ctx.INTEGER_NUMBER() != null) {
            return Integer.parseInt(ctx.INTEGER_NUMBER().getText());
        }

        else if (ctx.DOUBLE_NUMBER() != null) {
            return Double.parseDouble(ctx.DOUBLE_NUMBER().getText());
        }

        else if (ctx.CHARACTER() != null) {
            return ctx.CHARACTER().getText().charAt(1);
        }

        else if (ctx.STRING_LITERAL() != null) {
            return ctx.STRING_LITERAL().getText().substring(1, ctx.STRING_LITERAL().getText().length() - 1);
        }

        else if (ctx.boolean_literal() != null) {
            return ctx.boolean_literal().TRUE() != null;
        }

        else if (ctx.array_literal() != null) {
            return visit(ctx.array_literal());
        }

        return null;
    }

    @Override
    public Object visitArray_literal(CZParser.Array_literalContext ctx) {
        List<Object> elements = new ArrayList<>();

        for (CZParser.ExpressionContext expr : ctx.expression()) {
            elements.add(visit(expr));
        }

        return elements;
    }

    @Override
    public Object visitBreak_statement(CZParser.Break_statementContext ctx) {
        shouldBreak = true;
        return null;
    }

    @Override
    public Object visitContinue_statement(CZParser.Continue_statementContext ctx) {
        shouldContinue = true;
        return null;
    }

    @Override
    public Object visitSwitch_statement(CZParser.Switch_statementContext ctx) {
        Object switchValue = visit(ctx.expression());

        if (switchValue instanceof Variable) {
            switchValue = ((Variable)switchValue).getValue();
        }

        boolean matched = false;

        for (CZParser.Switch_blockContext block : ctx.switch_block()) {
            Object caseValue = visit(block.expression());

            if (!matched && Objects.equals(switchValue, caseValue)) {
                matched = true;

                for (CZParser.StatementContext stmt : block.statement()) {
                    visit(stmt);

                    if (shouldBreak) {
                        shouldBreak = false;
                        return null;
                    }

                    if (shouldContinue) {
                        shouldContinue = false;
                    }
                }
            }
        }

        if (!matched && ctx.default_block() != null) {
            for (CZParser.StatementContext stmt : ctx.default_block().statement()) {
                visit(stmt);

                if (shouldBreak) {
                    shouldBreak = false;
                    return null;
                }

                if (shouldContinue) {
                    shouldContinue = false;
                }
            }
        }

        return null;
    }
}