package org.moldi_dev;

import org.antlr.v4.runtime.ParserRuleContext;
import org.moldi_dev.antlr_4_gen.CZBaseVisitor;
import org.moldi_dev.antlr_4_gen.CZParser;

import java.util.*;

public class CZInterpreter extends CZBaseVisitor<Object> {
    private final Map<String, Function> functions;
    private final Map<String, String> constants;
    private Map<String, Variable> variables;
    private final Map<String, Map<String, Integer>> enums;

    private boolean shouldBreak = false;
    private boolean shouldContinue = false;

    private final ExpressionEvaluator expressionEvaluator;
    private final TypeChecker typeChecker;
    private final TypeMapper typeMapper;
    private final Utility utility;
    private final StandardFunctionHandler standardFunctionHandler;

    public CZInterpreter() {
        variables = new HashMap<>();
        functions = new HashMap<>();
        constants = new HashMap<>();
        enums = new HashMap<>();

        standardFunctionHandler = new StandardFunctionHandler();
        utility = new Utility();
        typeChecker = new TypeChecker();
        typeMapper = new TypeMapper();
        expressionEvaluator = new ExpressionEvaluator();

        // Built-in constants (can be overriden if needed)
        constants.put("E", String.valueOf(Math.E));
        constants.put("PI", String.valueOf(Math.PI));

        // Built-in functions (my standard library hehehe)
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

        functions.put("<MDA>array_length",
                new Function("<MDA>array_length",
                        List.of(new Variable("arr", VariableType.ANY, null)),
                        null, false, VariableType.INTEGER));
        functions.put("<MDA>squad_countdown",
                new Function("<MDA>squad_countdown",
                        List.of(new Variable("arr", VariableType.ANY, null)),
                        null, false, VariableType.INTEGER));

        functions.put("<MDA>array_get_at",
                new Function("<MDA>array_get_at",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("index", VariableType.INTEGER, null)),
                        null, false, VariableType.ANY));
        functions.put("<MDA>squad_peep",
                new Function("<MDA>squad_peep",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("index", VariableType.INTEGER, null)),
                        null, false, VariableType.ANY));

        functions.put("<MDA>array_set_at",
                new Function("<MDA>array_set_at",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("index", VariableType.INTEGER, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.ANY));
        functions.put("<MDA>squad_seep",
                new Function("<MDA>squad_seep",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("index", VariableType.INTEGER, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.ANY));

        functions.put("<MDA>array_copy",
                new Function("<MDA>array_copy",
                        List.of(new Variable("arr", VariableType.ANY, null)),
                        null, false, VariableType.ANY));
        functions.put("<MDA>squad_join",
                new Function("<MDA>squad_join",
                        List.of(new Variable("arr", VariableType.ANY, null)),
                        null, false, VariableType.ANY));

        functions.put("<MDA>array_contains",
                new Function("<MDA>array_contains",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.BOOLEAN));
        functions.put("<MDA>squad_vibeswith",
                new Function("<MDA>squad_vibeswith",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.BOOLEAN));

        functions.put("<MDA>array_index_of",
                new Function("<MDA>array_index_of",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.INTEGER));
        functions.put("<MDA>squad_whereat",
                new Function("<MDA>squad_whereat",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.INTEGER));

        functions.put("<MDA>array_count",
                new Function("<MDA>array_count",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.INTEGER));
        functions.put("<MDA>squad_howmany",
                new Function("<MDA>squad_howmany",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.INTEGER));

        functions.put("<MDA>array_insert_first",
                new Function("<MDA>array_insert_first",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.ANY));
        functions.put("<MDA>squad_pushup",
                new Function("<MDA>squad_pushup",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.ANY));

        functions.put("<MDA>array_insert_at",
                new Function("<MDA>array_insert_at",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("index", VariableType.INTEGER, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.ANY));
        functions.put("<MDA>squad_dropin",
                new Function("<MDA>squad_dropin",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("index", VariableType.INTEGER, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.ANY));

        functions.put("<MDA>array_insert_last",
                new Function("<MDA>array_insert_last",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.ANY));
        functions.put("<MDA>squad_slidein",
                new Function("<MDA>squad_slidein",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("value", VariableType.ANY, null)),
                        null, false, VariableType.ANY));

        functions.put("<MDA>array_delete_first",
                new Function("<MDA>array_delete_first",
                        List.of(new Variable("arr", VariableType.ANY, null)),
                        null, false, VariableType.ANY));
        functions.put("<MDA>squad_chopfirst",
                new Function("<MDA>squad_chopfirst",
                        List.of(new Variable("arr", VariableType.ANY, null)),
                        null, false, VariableType.ANY));

        functions.put("<MDA>array_delete_at",
                new Function("<MDA>array_delete_at",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("index", VariableType.INTEGER, null)),
                        null, false, VariableType.ANY));
        functions.put("<MDA>squad_chopspot",
                new Function("<MDA>squad_chopspot",
                        List.of(new Variable("arr", VariableType.ANY, null),
                                new Variable("index", VariableType.INTEGER, null)),
                        null, false, VariableType.ANY));

        functions.put("<MDA>array_delete_last",
                new Function("<MDA>array_delete_last",
                        List.of(new Variable("arr", VariableType.ANY, null)),
                        null, false, VariableType.ANY));
        functions.put("<MDA>squad_choplast",
                new Function("<MDA>squad_choplast",
                        List.of(new Variable("arr", VariableType.ANY, null)),
                        null, false, VariableType.ANY));

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

        List<String> enumMembers = new ArrayList<>();

        for (CZParser.Enum_memberContext memberCtx : ctx.enum_member()) {
            String enumMember = memberCtx.IDENTIFIER().getText();
            enumMembers.add(enumMember);
        }

        Map<String, Integer> enumMap = new HashMap<>();

        for (int i = 0; i < enumMembers.size(); i++) {
            enumMap.put(enumMembers.get(i), i);
        }

        enums.put(enumType, enumMap);

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

        if (ctx.parameters() != null) {
            for (CZParser.ParameterContext paramCtx : ctx.parameters().parameter()) {
                VariableType type = typeMapper.toVariableType(paramCtx.type_().getText());
                String name = paramCtx.IDENTIFIER().getText();
                parameters.add(new Variable(name, type, null));
            }
        }

        VariableType returnType = typeMapper.toVariableType(ctx.type_().getText());

        Function existing = functions.get(functionName);

        if (existing == null) {
            Function prototype = new Function(functionName, parameters, null, true, returnType);
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

        if (ctx.parameters() != null) {
            for (CZParser.ParameterContext paramCtx : ctx.parameters().parameter()) {
                VariableType type = typeMapper.toVariableType(paramCtx.type_().getText());
                String name = paramCtx.IDENTIFIER().getText();
                parameters.add(new Variable(name, type, null));
            }
        }

        VariableType returnType = typeMapper.toVariableType(ctx.type_().getText());
        Function existing = functions.get(functionName);

        if (existing == null) {
            Function function = new Function(functionName, parameters, ctx.function_block(), false, returnType);
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

        if (variables.containsKey(varName)) {
            throw new RuntimeException("Variable \"" + varName + "\" already defined.");
        }

        if (typeToken.contains("enum")) {
            typeToken = "enum";
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
            case ENUM -> {
                String enumName = ctx.type_().IDENTIFIER().getText();

                if (!enums.containsKey(enumName)) {
                    throw new RuntimeException("Enum type \"" + enumName + "\" is not defined.");
                }

                else {
                    Integer defaultEnumValue = 0;
                    variables.put(varName, new Variable(varName, enumName, type, defaultEnumValue));
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

    @Override
    public Object visitAssignment(CZParser.AssignmentContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Object value = visit(ctx.expression());
        Variable var = variables.get(varName);

        switch (var.getType()) {
            case INTEGER: {
                if (value instanceof Integer) {
                    variables.put(varName, new Variable(varName, var.getType(), value));
                }

                else if (value instanceof Variable v && v.getType() == VariableType.INTEGER) {
                    variables.put(varName, new Variable(varName, var.getType(), v.getValue()));
                }

                else {
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable \"" + varName + "\": expected " + VariableType.INTEGER + " but got " + valueType + ".");
                }

                break;
            }

            case DOUBLE: {
                if (value instanceof Double) {
                    variables.put(varName, new Variable(varName, var.getType(), value));
                }

                else if (value instanceof Variable v && v.getType() == VariableType.DOUBLE) {
                    variables.put(varName, new Variable(varName, var.getType(), v.getValue()));
                }

                else {
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable \"" + varName + "\": expected " + VariableType.DOUBLE + " but got " + valueType + ".");
                }

                break;
            }

            case CHARACTER: {
                if (value instanceof Character) {
                    variables.put(varName, new Variable(varName, var.getType(), value));
                }

                else if (value instanceof Variable v && v.getType() == VariableType.CHARACTER) {
                    variables.put(varName, new Variable(varName, var.getType(), v.getValue()));
                }

                else {
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable \"" + varName + "\": expected " + VariableType.CHARACTER + " but got " + valueType + ".");
                }

                break;
            }

            case STRING: {
                if (value instanceof String) {
                    variables.put(varName, new Variable(varName, var.getType(), value));
                }

                else if (value instanceof Variable v && v.getType() == VariableType.STRING) {
                    variables.put(varName, new Variable(varName, var.getType(), v.getValue()));
                }

                else {
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable \"" + varName + "\": expected " + VariableType.STRING + " but got " + valueType + ".");
                }

                break;
            }

            case BOOLEAN: {
                if (value instanceof Boolean) {
                    variables.put(varName, new Variable(varName, var.getType(), value));
                }

                else if (value instanceof Variable v && v.getType() == VariableType.BOOLEAN) {
                    variables.put(varName, new Variable(varName, var.getType(), v.getValue()));
                }

                else {
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable \"" + varName + "\": expected " + VariableType.BOOLEAN + " but got " + valueType + ".");
                }

                break;
            }

            case ENUM: {
                if (value instanceof Variable v && v.getType() == VariableType.ENUM) {
                    variables.put(varName, new Variable(varName, v.getEnumName(), VariableType.ENUM, v.getEnumValue()));
                }

                else if (value instanceof Integer intVal) {
                    String enumName = var.getEnumName();

                    if (enumName == null) {
                        throw new RuntimeException("Cannot assign integer to enum without knowing the enum type.");
                    }

                    Map<String, Integer> memberMap = enums.get(enumName);

                    if (memberMap == null || !memberMap.containsValue(intVal)) {
                        throw new RuntimeException("Enum value " + intVal + " not valid for enum \"" + enumName + "\".");
                    }

                    variables.put(varName, new Variable(varName, enumName, VariableType.ENUM, intVal));
                }

                else {
                    throw new RuntimeException("Invalid enum assignment for variable \"" + varName + "\".");
                }

                break;
            }

            case INTEGER_ARRAY: {
                if (value instanceof Variable v && v.getType().equals(var.getType()) && v.getValue() instanceof List<?>) {
                    value = v.getValue();
                }

                if (value instanceof List<?> rawList) {
                    if (rawList.isEmpty()) {
                        variables.put(varName, new Variable(varName, var.getType(), new ArrayList<>()));
                    }

                    if (rawList.stream().allMatch(item ->
                            item instanceof Integer ||
                                    (item instanceof Variable v && v.getType().equals(VariableType.INTEGER) && v.getValue() instanceof Integer))) {

                        List<Integer> extracted = new ArrayList<>();

                        for (Object item : rawList) {
                            if (item instanceof Integer i) {
                                extracted.add(i);
                            }

                            else {
                                Variable v = (Variable) item;
                                extracted.add((Integer) v.getValue());
                            }
                        }

                        variables.put(varName, new Variable(varName, var.getType(), extracted));
                    }

                    else {
                        VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
                        throw new RuntimeException("Type mismatch for array \"" + varName + "\": expected " + VariableType.INTEGER_ARRAY + " but got " + valueType + ".");
                    }
                }

                else {
                    throw new RuntimeException("Invalid value: expected a list of elements for array \"" + varName + "\".");
                }

                break;
            }

            case DOUBLE_ARRAY: {
                if (value instanceof Variable v && v.getType().equals(var.getType()) && v.getValue() instanceof List<?>) {
                    value = v.getValue();
                }

                if (value instanceof List<?> rawList) {
                    if (rawList.isEmpty()) {
                        variables.put(varName, new Variable(varName, var.getType(), new ArrayList<>()));
                    }

                    if (rawList.stream().allMatch(item ->
                            item instanceof Double ||
                                    (item instanceof Variable v && v.getType().equals(VariableType.DOUBLE) && v.getValue() instanceof Double))) {

                        List<Double> extracted = new ArrayList<>();

                        for (Object item : rawList) {
                            if (item instanceof Double d) {
                                extracted.add(d);
                            }

                            else {
                                Variable v = (Variable) item;
                                extracted.add((Double) v.getValue());
                            }
                        }

                        variables.put(varName, new Variable(varName, var.getType(), extracted));
                    }

                    else {
                        VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
                        throw new RuntimeException("Type mismatch for variable \"" + varName + "\": expected " + VariableType.DOUBLE_ARRAY + " but got " + valueType + ".");
                    }
                }

                else {
                    throw new RuntimeException("Invalid value: expected a list of elements for array \"" + varName + "\".");
                }

                break;
            }

            case STRING_ARRAY: {
                if (value instanceof Variable v && v.getType().equals(var.getType()) && v.getValue() instanceof List<?>) {
                    value = v.getValue();
                }

                if (value instanceof List<?> rawList) {
                    if (rawList.isEmpty()) {
                        variables.put(varName, new Variable(varName, var.getType(), new ArrayList<>()));
                    }

                    if (rawList.stream().allMatch(item ->
                            item instanceof String ||
                                    (item instanceof Variable v && v.getType().equals(VariableType.STRING) && v.getValue() instanceof String))) {

                        List<String> extracted = new ArrayList<>();

                        for (Object item : rawList) {
                            if (item instanceof String s) {
                                extracted.add(s);
                            }

                            else {
                                Variable v = (Variable) item;
                                extracted.add((String) v.getValue());
                            }
                        }

                        variables.put(varName, new Variable(varName, var.getType(), extracted));
                    }

                    else {
                        VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
                        throw new RuntimeException("Type mismatch for array \"" + varName + "\": expected " + VariableType.STRING_ARRAY + " but got " + valueType + ".");
                    }
                }

                else {
                    throw new RuntimeException("Invalid value: expected a list for array \"" + varName + "\".");
                }

                break;
            }

            case BOOLEAN_ARRAY: {
                if (value instanceof Variable v && v.getType().equals(var.getType()) && v.getValue() instanceof List<?>) {
                    value = v.getValue();
                }

                if (value instanceof List<?> rawList) {
                    if (rawList.isEmpty()) {
                        variables.put(varName, new Variable(varName, var.getType(), new ArrayList<>()));
                    }

                    if (rawList.stream().allMatch(item ->
                            item instanceof Boolean ||
                                    (item instanceof Variable v && v.getType().equals(VariableType.BOOLEAN) && v.getValue() instanceof Boolean))) {

                        List<Boolean> extracted = new ArrayList<>();

                        for (Object item : rawList) {
                            if (item instanceof Boolean b) {
                                extracted.add(b);
                            }

                            else {
                                Variable v = (Variable) item;
                                extracted.add((Boolean) v.getValue());
                            }
                        }

                        variables.put(varName, new Variable(varName, var.getType(), extracted));
                    }

                    else {
                        VariableType valueType = (value instanceof Variable v) ? v.getType() : typeChecker.inferTypeFromValue(value);
                        throw new RuntimeException("Type mismatch for variable \"" + varName + "\": expected " + VariableType.BOOLEAN_ARRAY + " but got " + valueType + ".");
                    }
                }

                else {
                    throw new RuntimeException("Invalid value: expected a list for array \"" + varName + "\".");
                }

                break;
            }

            default:
                throw new RuntimeException("Unsupported variable type: \"" + var.getType() + "\".");
        }

        return null;
    }

    private String resolveEnumValue(String enumName, Integer enumValue) {
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

    @Override
    public Object visitPrint_statement(CZParser.Print_statementContext ctx) {
        StringBuilder output = new StringBuilder();

        if (ctx.arguments() != null) {
            for (CZParser.ExpressionContext exprCtx : ctx.arguments().expression()) {
                Object value = visit(exprCtx);

                if (value instanceof Variable variable && !variable.getType().equals(VariableType.ENUM)) {
                    value = variable.getValue();
                }

                if (value instanceof Variable variable && variable.getType().equals(VariableType.ENUM)) {
                    output.append(resolveEnumValue(variable.getEnumName(), variable.getEnumValue()));
                }

                else if (value instanceof List<?> arrayValue) {
                    output.append("[");

                    for (int i = 0; i < arrayValue.size(); i++) {
                        if (arrayValue.get(i) instanceof Variable variable) {
                            output.append(variable.getValue());
                        }

                        else {
                            output.append(arrayValue.get(i));
                        }

                        if (i < arrayValue.size() - 1) {
                            output.append(", ");
                        }
                    }

                    output.append("]");
                }

                else if (value instanceof String strVal) {
                    output.append(strVal.replace("\\n", "\n")
                            .replace("\\t", "\t")
                            .replace("\\\"", "\"")
                            .replace("\\\\", "\\"));
                }

                else {
                    output.append(value);
                }
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

        System.out.print("\uD83D\uDCBB Enter a(n) " + typeMapper.toString(var.getType()) + " value for variable " + varName + ": ");

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
        Object value = visit(ctx.expression());

        String functionName = utility.findEnclosingFunctionName(ctx);
        Function function = functions.get(functionName);

        if (function != null) {
            VariableType declaredReturnType = function.getReturnType();
            VariableType valueType = typeChecker.inferTypeFromValue(value);

            if (!declaredReturnType.equals(valueType)) {
                throw new RuntimeException("Return type mismatch for function \"" + functionName + "\": expected return type " + declaredReturnType + " but got " + valueType + ".");
            }
        }

        throw new ReturnValue(value);
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
                Map<String, Variable> functionVariables = new HashMap<>();

                for (int i = 0; i < parameters.size(); i++) {
                    Variable param = parameters.get(i);
                    Object argValue = argumentValues.get(i);

                    if (argValue instanceof Variable variableArg) {
                        VariableType argType = variableArg.getType();

                        if (!param.getType().equals(argType)) {
                            throw new RuntimeException("Type mismatch for parameter \"" + param.getName()
                                    + "\" in function \"" + functionName + "\": expected " + param.getType() + " but got " + argType + ".");
                        }

                        functionVariables.put(param.getName(), new Variable(param.getName(), param.getType(), variableArg.getValue()));
                    }

                    else {
                        VariableType argType = typeChecker.inferTypeFromValue(argValue);

                        if (!param.getType().equals(argType)) {
                            throw new RuntimeException("Type mismatch for parameter \"" + param.getName()
                                    + "\" in function \"" + functionName + "\": expected " + param.getType() + " but got " + argType + ".");
                        }

                        functionVariables.put(param.getName(), new Variable(param.getName(), param.getType(), argValue));
                    }
                }

                Map<String, Variable> previousVariables = new HashMap<>(variables);
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
    public Object visitEnumAccessExpression(CZParser.EnumAccessExpressionContext ctx) {
        String enumName = ctx.enum_access().IDENTIFIER(0).getText();
        String memberName = ctx.enum_access().IDENTIFIER(1).getText();

        if (!enums.containsKey(enumName)) {
            throw new RuntimeException("Enum type \"" + enumName + "\" is not defined.");
        }

        Map<String, Integer> enumMembers = enums.get(enumName);

        if (!enumMembers.containsKey(memberName)) {
            throw new RuntimeException("Enum member \"" + memberName + "\" not found in enum \"" + enumName + "\".");
        }

        return enumMembers.get(memberName);
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

        if (switchValue instanceof Variable variable) {
            if (variable.getType().equals(VariableType.ENUM)) {
                switchValue = variable.getEnumValue();
            }

            else {
                switchValue = variable.getValue();
            }
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