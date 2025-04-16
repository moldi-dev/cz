package org.moldi_dev;

import org.antlr.v4.runtime.ParserRuleContext;
import org.moldi_dev.antlr_4_gen.CZBaseVisitor;
import org.moldi_dev.antlr_4_gen.CZParser;

import java.util.*;

public class CZInterpreter extends CZBaseVisitor<Object> {
    private Map<String, Variable> variables;
    private final Map<String, Function> functions;
    private final Map<String, String> macros;
    private boolean shouldBreak = false;
    private boolean shouldContinue = false;

    public CZInterpreter() {
        variables = new HashMap<>();
        functions = new HashMap<>();
        macros = new HashMap<>();

        // Built-in functions (my standard library hehehe)
        functions.put("<MDA>sine", new Function("<MDA>sine",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));
        functions.put("<MDA>vibe_sway", new Function("<MDA>vibe_sway",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));

        functions.put("<MDA>cosine", new Function("<MDA>cosine",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));
        functions.put("<MDA>side_chill", new Function("<MDA>side_chill",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));

        functions.put("<MDA>tangent", new Function("<MDA>tangent",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));
        functions.put("<MDA>angle_tea", new Function("<MDA>angle_tea",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false,VariableType.DOUBLE));

        functions.put("<MDA>cotangent", new Function("<MDA>cotangent",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));
        functions.put("<MDA>cotan_drip", new Function("<MDA>cotan_drip",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));

        functions.put("<MDA>arcsine", new Function("<MDA>arcsine",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));
        functions.put("<MDA>vibe_rewind", new Function("<MDA>vibe_rewind",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));

        functions.put("<MDA>arccosine", new Function("<MDA>arccosine",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));
        functions.put("<MDA>side_throwback", new Function("<MDA>side_throwback",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));

        functions.put("<MDA>arctangent", new Function("<MDA>arctangent",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));
        functions.put("<MDA>angle_flash", new Function("<MDA>angle_flash",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));

        functions.put("<MDA>arccotangent", new Function("<MDA>arccotangent",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));
        functions.put("<MDA>cotan_flashback", new Function("<MDA>cotan_flashback",
                List.of(new Variable("x", VariableType.DOUBLE, null)),
                null, false, VariableType.DOUBLE));

        functions.put("<MDA>array_length", new Function("<MDA>array_length",
                List.of(new Variable("arr", VariableType.ANY, null)),
                null, false, VariableType.INTEGER));
        functions.put("<MDA>squad_countdown", new Function("<MDA>squad_countdown",
                List.of(new Variable("arr", VariableType.ANY, null)),
                null, false, VariableType.INTEGER));

        functions.put("<MDA>array_get_at", new Function("<MDA>array_get_at",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("index", VariableType.INTEGER, null)),
                null, false, VariableType.ANY));
        functions.put("<MDA>squad_peep", new Function("<MDA>squad_peep",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("index", VariableType.INTEGER, null)),
                null, false, VariableType.ANY));

        functions.put("<MDA>array_set_at", new Function("<MDA>array_set_at",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("index", VariableType.INTEGER, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.ANY));
        functions.put("<MDA>squad_seep", new Function("<MDA>squad_seep",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("index", VariableType.INTEGER, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.ANY));

        functions.put("<MDA>array_copy", new Function("<MDA>array_copy",
                List.of(new Variable("arr", VariableType.ANY, null)),
                null, false, VariableType.ANY));
        functions.put("<MDA>squad_join", new Function("<MDA>squad_join",
                List.of(new Variable("arr", VariableType.ANY, null)),
                null, false, VariableType.ANY));

        functions.put("<MDA>array_contains", new Function("<MDA>array_contains",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.BOOLEAN));
        functions.put("<MDA>squad_vibeswith", new Function("<MDA>squad_vibeswith",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.BOOLEAN));

        functions.put("<MDA>array_index_of", new Function("<MDA>array_index_of",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.INTEGER));
        functions.put("<MDA>squad_whereat", new Function("<MDA>squad_whereat",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.INTEGER));

        functions.put("<MDA>array_count", new Function("<MDA>array_count",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.INTEGER));
        functions.put("<MDA>squad_howmany", new Function("<MDA>squad_howmany",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.INTEGER));

        functions.put("<MDA>array_insert_first", new Function("<MDA>array_insert_first",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.ANY));
        functions.put("<MDA>squad_pushup", new Function("<MDA>squad_pushup",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.ANY));

        functions.put("<MDA>array_insert_at", new Function("<MDA>array_insert_at",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("index", VariableType.INTEGER, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.ANY));
        functions.put("<MDA>squad_dropin", new Function("<MDA>squad_dropin",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("index", VariableType.INTEGER, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.ANY));

        functions.put("<MDA>array_insert_last", new Function("<MDA>array_insert_last",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.ANY));
        functions.put("<MDA>squad_slidein", new Function("<MDA>squad_slidein",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("value", VariableType.ANY, null)),
                null, false, VariableType.ANY));

        functions.put("<MDA>array_delete_first", new Function("<MDA>array_delete_first",
                List.of(new Variable("arr", VariableType.ANY, null)),
                null, false, VariableType.ANY));
        functions.put("<MDA>squad_chopfirst", new Function("<MDA>squad_chopfirst",
                List.of(new Variable("arr", VariableType.ANY, null)),
                null, false, VariableType.ANY));

        functions.put("<MDA>array_delete_at", new Function("<MDA>array_delete_at",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("index", VariableType.INTEGER, null)),
                null, false, VariableType.ANY));
        functions.put("<MDA>squad_chopspot", new Function("<MDA>squad_chopspot",
                List.of(new Variable("arr", VariableType.ANY, null), new Variable("index", VariableType.INTEGER, null)),
                null, false, VariableType.ANY));

        functions.put("<MDA>array_delete_last", new Function("<MDA>array_delete_last",
                List.of(new Variable("arr", VariableType.ANY, null)),
                null, false, VariableType.ANY));
        functions.put("<MDA>squad_choplast", new Function("<MDA>squad_choplast",
                List.of(new Variable("arr", VariableType.ANY, null)),
                null, false, VariableType.ANY));
    }

    private Object parseMacroValue(String value) {
        value = value.trim();

        if (value.equals("true") || value.equals("false")) {
            return Boolean.parseBoolean(value);
        }

        try {
            return Integer.parseInt(value);
        } catch (NumberFormatException ignored) {
        }

        try {
            return Double.parseDouble(value);
        } catch (NumberFormatException ignored) {
        }

        if ((value.startsWith("\"") && value.endsWith("\"")) ||
                (value.startsWith("'") && value.endsWith("'"))) {
            return value.substring(1, value.length() - 1);
        }

        return value;
    }

    @Override
    public Object visitProgram(CZParser.ProgramContext ctx) {
        for (CZParser.Define_directiveContext defineCtx : ctx.define_directive()) {
            String macroName = defineCtx.IDENTIFIER().getText();
            String macroValue;

            if (defineCtx.INTEGER_NUMBER() != null) {
                macroValue = defineCtx.INTEGER_NUMBER().getText();
                macros.put(macroName, macroValue);
            } else if (defineCtx.DOUBLE_NUMBER() != null) {
                macroValue = defineCtx.DOUBLE_NUMBER().getText();
                macros.put(macroName, macroValue);
            } else if (defineCtx.STRING_LITERAL() != null) {
                macroValue = defineCtx.STRING_LITERAL().getText();
                macros.put(macroName, macroValue);
            } else if (defineCtx.CHARACTER() != null) {
                macroValue = defineCtx.CHARACTER().getText();
                macros.put(macroName, macroValue);
            } else if (defineCtx.boolean_literal() != null) {
                macroValue = defineCtx.boolean_literal().getText();
                macros.put(macroName, macroValue);
            }
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
                throw new RuntimeException("Function '" + function.getFunctionName() + "' declared but not defined.");
            }
        }

        return result;
    }

    @Override
    public Object visitDefine_directive(CZParser.Define_directiveContext ctx) {
        String name = ctx.IDENTIFIER().getText();
        String value = ctx.getChild(2).getText();
        macros.put(name, value);
        return null;
    }

    @Override
    public Object visitMain_function(CZParser.Main_functionContext ctx) {
        try {
            return visit(ctx.function_block());
        } catch (ReturnValue rv) {
            return rv.getValue();
        }
    }

    private boolean parametersMatch(List<Variable> a, List<Variable> b) {
        if (a.size() != b.size()) return false;

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).getType().equals(b.get(i).getType())) {
                return false;
            }

            if (!a.get(i).getName().equals(b.get(i).getName())) {
                return false;
            }
        }

        return true;
    }

    @Override
    public Object visitFunction_declaration(CZParser.Function_declarationContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<Variable> parameters = new ArrayList<>();

        if (ctx.parameters() != null) {
            for (CZParser.ParameterContext paramCtx : ctx.parameters().parameter()) {
                VariableType type = TypeMapper.toVariableType(paramCtx.type_().getText());
                String name = paramCtx.IDENTIFIER().getText();
                parameters.add(new Variable(name, type, null));
            }
        }

        VariableType returnType = TypeMapper.toVariableType(ctx.type_().getText());

        Function existing = functions.get(functionName);

        if (existing == null) {
            Function prototype = new Function(functionName, parameters, null, true, returnType);
            functions.put(functionName, prototype);
        }

        else if (existing.getIsDeclaredOnly()) {
            if (!existing.getReturnType().equals(returnType)) {
                throw new RuntimeException("Return type mismatch in function declaration of: " + functionName);
            }

            if (!parametersMatch(existing.getParameters(), parameters)) {
                throw new RuntimeException("Parameter mismatch in function declaration of: " + functionName);
            }

        }

        else {
            throw new RuntimeException("Function " + functionName + " is already defined.");
        }

        return null;
    }

    @Override
    public Object visitFunction(CZParser.FunctionContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<Variable> parameters = new ArrayList<>();

        if (ctx.parameters() != null) {
            for (CZParser.ParameterContext paramCtx : ctx.parameters().parameter()) {
                VariableType type = TypeMapper.toVariableType(paramCtx.type_().getText());
                String name = paramCtx.IDENTIFIER().getText();
                parameters.add(new Variable(name, type, null));
            }
        }

        VariableType returnType = TypeMapper.toVariableType(ctx.type_().getText());
        Function existing = functions.get(functionName);

        if (existing == null) {
            Function function = new Function(functionName, parameters, ctx.function_block(), false, returnType);
            functions.put(functionName, function);
        }

        else if (existing.getIsDeclaredOnly()) {
            if (!existing.getReturnType().equals(returnType)) {
                throw new RuntimeException("Return type mismatch in function definition of: " + functionName);
            }

            if (!parametersMatch(existing.getParameters(), parameters)) {
                throw new RuntimeException("Parameter mismatch in function definition of: " + functionName);
            }

            existing.setBody(ctx.function_block());
            existing.setIsDeclaredOnly(false);
        }

        else {
            throw new RuntimeException("Function " + functionName + " is already defined.");
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
        VariableType type = TypeMapper.toVariableType(typeToken);

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
            default -> throw new RuntimeException("Unknown variable type given inside a declaration");
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
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable " + varName + ": expected " + VariableType.INTEGER + " but got " + valueType);
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
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable " + varName + ": expected " + VariableType.DOUBLE + " but got " + valueType);
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
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable " + varName + ": expected " + VariableType.CHARACTER + " but got " + valueType);
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
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable " + varName + ": expected " + VariableType.STRING + " but got " + valueType);
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
                    VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);
                    throw new RuntimeException("Type mismatch for variable " + varName + ": expected " + VariableType.BOOLEAN + " but got " + valueType);
                }

                break;
            }

            case INTEGER_ARRAY: {
                if (value instanceof Variable v && v.getType().equals(var.getType()) && v.getValue() instanceof List<?>) {
                    value = v.getValue();
                }

                if (value instanceof List<?> rawList) {
                    if (rawList.isEmpty()) {
                        throw new RuntimeException("Empty list: expected an array of elements for array " + varName);
                    }

                    if (rawList.stream().allMatch(item ->
                            item instanceof Integer ||
                                    (item instanceof Variable v && v.getType().equals(VariableType.INTEGER) && v.getValue() instanceof Integer))) {

                        List<Integer> extracted = new ArrayList<>();

                        for (Object item : rawList) {
                            if (item instanceof Integer i) {
                                extracted.add(i);
                            } else {
                                Variable v = (Variable) item;
                                extracted.add((Integer) v.getValue());
                            }
                        }

                        variables.put(varName, new Variable(varName, var.getType(), extracted));
                    }

                    else {
                        VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);
                        throw new RuntimeException("Type mismatch for variable " + varName + ": expected " + VariableType.INTEGER_ARRAY + " but got " + valueType);
                    }
                }

                else {
                    throw new RuntimeException("Invalid value: expected a list for array " + varName);
                }

                break;
            }

            case DOUBLE_ARRAY: {
                if (value instanceof Variable v && v.getType().equals(var.getType()) && v.getValue() instanceof List<?>) {
                    value = v.getValue();
                }

                if (value instanceof List<?> rawList) {
                    if (rawList.isEmpty()) {
                        throw new RuntimeException("Empty list: expected an array of elements for array " + varName);
                    }

                    if (rawList.stream().allMatch(item ->
                            item instanceof Double ||
                                    (item instanceof Variable v && v.getType().equals(VariableType.DOUBLE) && v.getValue() instanceof Double))) {

                        List<Double> extracted = new ArrayList<>();

                        for (Object item : rawList) {
                            if (item instanceof Double d) {
                                extracted.add(d);
                            } else {
                                Variable v = (Variable) item;
                                extracted.add((Double) v.getValue());
                            }
                        }

                        variables.put(varName, new Variable(varName, var.getType(), extracted));
                    }

                    else {
                        VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);
                        throw new RuntimeException("Type mismatch for variable " + varName + ": expected " + VariableType.DOUBLE_ARRAY + " but got " + valueType);
                    }
                } else {
                    throw new RuntimeException("Invalid value: expected a list for array " + varName);
                }

                break;
            }

            case STRING_ARRAY: {
                if (value instanceof Variable v && v.getType().equals(var.getType()) && v.getValue() instanceof List<?>) {
                    value = v.getValue();
                }

                if (value instanceof List<?> rawList) {
                    if (rawList.isEmpty()) {
                        throw new RuntimeException("Empty list: expected an array of elements for array " + varName);
                    }

                    if (rawList.stream().allMatch(item ->
                            item instanceof String ||
                                    (item instanceof Variable v && v.getType().equals(VariableType.STRING) && v.getValue() instanceof String))) {

                        List<String> extracted = new ArrayList<>();

                        for (Object item : rawList) {
                            if (item instanceof String s) {
                                extracted.add(s);
                            } else {
                                Variable v = (Variable) item;
                                extracted.add((String) v.getValue());
                            }
                        }

                        variables.put(varName, new Variable(varName, var.getType(), extracted));
                    }

                    else {
                        VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);
                        throw new RuntimeException("Type mismatch for variable " + varName + ": expected " + VariableType.STRING_ARRAY + " but got " + valueType);
                    }
                } else {
                    throw new RuntimeException("Invalid value: expected a list for array " + varName);
                }

                break;
            }

            case BOOLEAN_ARRAY: {
                if (value instanceof Variable v && v.getType().equals(var.getType()) && v.getValue() instanceof List<?>) {
                    value = v.getValue();
                }

                if (value instanceof List<?> rawList) {
                    if (rawList.isEmpty()) {
                        throw new RuntimeException("Empty list: expected an array of elements for array " + varName);
                    }

                    if (rawList.stream().allMatch(item ->
                            item instanceof Boolean ||
                                    (item instanceof Variable v && v.getType().equals(VariableType.BOOLEAN) && v.getValue() instanceof Boolean))) {

                        List<Boolean> extracted = new ArrayList<>();

                        for (Object item : rawList) {
                            if (item instanceof Boolean b) {
                                extracted.add(b);
                            } else {
                                Variable v = (Variable) item;
                                extracted.add((Boolean) v.getValue());
                            }
                        }

                        variables.put(varName, new Variable(varName, var.getType(), extracted));
                    }

                    else {
                        VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);
                        throw new RuntimeException("Type mismatch for variable " + varName + ": expected " + VariableType.BOOLEAN_ARRAY + " but got " + valueType);
                    }
                } else {
                    throw new RuntimeException("Invalid value: expected a list for array " + varName);
                }

                break;
            }

            default:
                throw new RuntimeException("Unsupported variable type: " + var.getType());
        }

        return null;
    }

    @Override
    public Object visitPrint_statement(CZParser.Print_statementContext ctx) {
        StringBuilder output = new StringBuilder("\uD83D\uDCE2 ");

        if (ctx.arguments() != null) {
            for (CZParser.ExpressionContext exprCtx : ctx.arguments().expression()) {
                Object value = visit(exprCtx);

                if (value instanceof Variable variable) {
                    value = variable.getValue();
                }

                if (value instanceof List<?> arrayValue) {
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

                else {
                    output.append(value);
                }
            }
        }

        System.out.println(output);
        return null;
    }

    @Override
    public Object visitRead_statement(CZParser.Read_statementContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Scanner scanner = new Scanner(System.in);
        Variable var = variables.get(varName);

        System.out.print("\uD83D\uDCBB Enter a(n) " + TypeMapper.toString(var.getType()) + " value for variable " + varName + ": ");

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
                throw new RuntimeException("Unsupported variable type: " + var.getType());
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

    private String findEnclosingFunctionName(ParserRuleContext ctx) {
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

    @Override
    public Object visitReturn_statement(CZParser.Return_statementContext ctx) {
        Object value = visit(ctx.expression());

        String functionName = findEnclosingFunctionName(ctx);
        Function function = functions.get(functionName);

        if (function != null) {
            VariableType declaredReturnType = function.getReturnType();
            VariableType valueType = TypeChecker.inferTypeFromValue(value);

            if (!declaredReturnType.equals(valueType)) {
                throw new RuntimeException("Type mismatch: expected return type " + declaredReturnType + " but got " + valueType);
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

        if (value instanceof Variable) {
            value = ((Variable) value).getValue();
        }

        switch (ctx.op.getType()) {
            case CZParser.NOT:
                if (value instanceof Boolean) return !(Boolean) value;
                throw new RuntimeException("Logical NOT (!) requires a boolean operand");

            case CZParser.BITWISE_NOT:
                if (value instanceof Integer) return ~(Integer) value;
                throw new RuntimeException("Bitwise NOT (~) requires an integer operand");
        }

        return value;
    }

    @Override
    public Object visitPowerExpression(CZParser.PowerExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (left instanceof Double || right instanceof Double) {
            double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
            double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;

            return Math.pow(l, r);
        }

        else if (left instanceof Integer && right instanceof Integer) {
            int l = (Integer) left;
            int r = (Integer) right;

            return (int) Math.pow(l, r);
        }

        throw new RuntimeException("Invalid operand types for power expression");
    }

    @Override
    public Object visitMultiplicativeExpression(CZParser.MultiplicativeExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (left instanceof Double || right instanceof Double) {
            double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
            double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;

            return switch (ctx.op.getType()) {
                case CZParser.MULTIPLICATION -> l * r;
                case CZParser.DIVISION -> l / r;
                case CZParser.MODULUS -> l % r;
                default -> throw new RuntimeException("Invalid operator for doubles");
            };
        }

        else if (left instanceof Integer && right instanceof Integer) {
            int l = (Integer) left;
            int r = (Integer) right;

            return switch (ctx.op.getType()) {
                case CZParser.MULTIPLICATION -> l * r;
                case CZParser.DIVISION -> l / r;
                case CZParser.MODULUS -> l % r;
                default -> 0;
            };
        }

        throw new RuntimeException("Invalid operand types for multiplicative expression");
    }

    @Override
    public Object visitAdditiveExpression(CZParser.AdditiveExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (ctx.op.getType() == CZParser.ADDITION) {
            if (left instanceof String || right instanceof String || left instanceof Character || right instanceof Character) {
                return String.valueOf(left) + right;
            }

            else if (left instanceof Double || right instanceof Double) {
                double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
                double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;
                return l + r;
            }

            else {
                return (Integer) left + (Integer) right;
            }
        }

        else {
            if (left instanceof Double || right instanceof Double) {
                double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
                double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;
                return l - r;
            }

            else {
                return (Integer) left - (Integer) right;
            }
        }
    }

    @Override
    public Object visitShiftExpression(CZParser.ShiftExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (left instanceof Integer && right instanceof Integer) {
            int l = (Integer) left;
            int r = (Integer) right;

            return switch (ctx.op.getType()) {
                case CZParser.SHIFT_LEFT -> l << r;
                case CZParser.SHIFT_RIGHT -> l >> r;
                default -> 0;
            };
        }

        throw new RuntimeException("Shift operations require integer operands");
    }

    @Override
    public Object visitRelationalExpression(CZParser.RelationalExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (left instanceof Double || right instanceof Double) {
            double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
            double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;

            return switch (ctx.op.getType()) {
                case CZParser.LESS_THAN -> l < r;
                case CZParser.GREATER_THAN -> l > r;
                case CZParser.LESS_THAN_OR_EQUAL -> l <= r;
                case CZParser.GREATER_THAN_OR_EQUAL -> l >= r;
                default -> false;
            };
        }

        else if (left instanceof Integer && right instanceof Integer) {
            int l = (Integer) left;
            int r = (Integer) right;

            return switch (ctx.op.getType()) {
                case CZParser.LESS_THAN -> l < r;
                case CZParser.GREATER_THAN -> l > r;
                case CZParser.LESS_THAN_OR_EQUAL -> l <= r;
                case CZParser.GREATER_THAN_OR_EQUAL -> l >= r;
                default -> false;
            };
        }

        else if (left instanceof Character && right instanceof Character) {
            char l = (Character) left;
            char r = (Character) right;

            return switch (ctx.op.getType()) {
                case CZParser.LESS_THAN -> l < r;
                case CZParser.GREATER_THAN -> l > r;
                case CZParser.LESS_THAN_OR_EQUAL -> l <= r;
                case CZParser.GREATER_THAN_OR_EQUAL -> l >= r;
                default -> false;
            };
        }

        else if (left instanceof String && right instanceof String) {
            int cmp = ((String) left).compareTo((String) right);

            return switch (ctx.op.getType()) {
                case CZParser.LESS_THAN -> cmp < 0;
                case CZParser.GREATER_THAN -> cmp > 0;
                case CZParser.LESS_THAN_OR_EQUAL -> cmp <= 0;
                case CZParser.GREATER_THAN_OR_EQUAL -> cmp >= 0;
                default -> false;
            };
        }

        throw new RuntimeException("Invalid operands for relational comparison");
    }

    @Override
    public Object visitEqualityExpression(CZParser.EqualityExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        return switch (ctx.op.getType()) {
            case CZParser.EQUALS -> Objects.equals(left, right);
            case CZParser.NOT_EQUALS -> !Objects.equals(left, right);
            default -> false;
        };
    }

    @Override
    public Object visitBitwiseExpression(CZParser.BitwiseExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (left instanceof Character) left = (int) (Character) left;
        if (right instanceof Character) right = (int) (Character) right;

        if (!(left instanceof Integer) || !(right instanceof Integer)) {
            throw new RuntimeException("Bitwise operations require integer operands");
        }

        int l = (Integer) left;
        int r = (Integer) right;

        return switch (ctx.op.getType()) {
            case CZParser.BITWISE_AND -> l & r;
            case CZParser.BITWISE_OR -> l | r;
            case CZParser.BITWISE_XOR -> l ^ r;
            default -> 0;
        };
    }

    @Override
    public Object visitLogicalExpression(CZParser.LogicalExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (!(left instanceof Boolean) || !(right instanceof Boolean)) {
            throw new RuntimeException("Logical operations require boolean operands");
        }

        boolean l = (Boolean) left;
        boolean r = (Boolean) right;

        return switch (ctx.op.getType()) {
            case CZParser.LOGICAL_AND -> l && r;
            case CZParser.LOGICAL_OR -> l || r;
            default -> false;
        };
    }

    @Override
    public Object visitTernaryExpression(CZParser.TernaryExpressionContext ctx) {
        boolean condition = (boolean) visit(ctx.condition);

        if (condition) {
            return visit(ctx.trueExpr);
        } else {
            return visit(ctx.falseExpr);
        }
    }

    private double toDouble(Object value) {
        if (value instanceof Integer) return ((Integer) value).doubleValue();
        if (value instanceof Double) return (Double) value;
        throw new RuntimeException("Expected numeric value but got: " + value);
    }

    @Override
    public Object visitFunctionCallExpression(CZParser.FunctionCallExpressionContext ctx) {
        String functionName = ctx.function_call().IDENTIFIER() != null ? ctx.function_call().IDENTIFIER().getText() : ctx.function_call().standard_function().getText();

        Function f = functions.get(functionName);

        if (f == null) {
            throw new RuntimeException("Function '" + functionName + "' is not declared.");
        }

        if (f.getIsDeclaredOnly()) {
            throw new RuntimeException("Function '" + functionName + "' is declared but not defined.");
        }

        switch (functionName) {
            case "<MDA>sine":
            case "<MDA>vibe_sway": {
                Object value = visit(ctx.function_call().arguments().expression(0));

                if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
                    return Math.sin((Double)v.getValue());
                }

                else if (value instanceof Double v) {
                    return Math.sin(v);
                }

                throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().getFirst().getName()
                        + "' in function " + functionName + ": expected " + f.getParameters().getFirst().getType() + " but got " + TypeChecker.inferTypeFromValue(value));
            }

            case "<MDA>cosine":
            case "<MDA>side_chill": {
                Object value = visit(ctx.function_call().arguments().expression(0));

                if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
                    return Math.cos((Double)v.getValue());
                }

                else if (value instanceof Double v) {
                    return Math.cos(v);
                }

                throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().getFirst().getName()
                        + "' in function " + functionName + ": expected " + f.getParameters().getFirst().getType() + " but got " + TypeChecker.inferTypeFromValue(value));
            }

            case "<MDA>tangent":
            case "<MDA>angle_tea": {
                Object value = visit(ctx.function_call().arguments().expression(0));

                if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
                    return Math.tan((Double)v.getValue());
                }

                else if (value instanceof Double v) {
                    return Math.tan(v);
                }

                throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().getFirst().getName()
                        + "' in function " + functionName + ": expected " + f.getParameters().getFirst().getType() + " but got " + TypeChecker.inferTypeFromValue(value));

            }

            case "<MDA>cotangent":
            case "<MDA>cotan_drip": {
                Object value = visit(ctx.function_call().arguments().expression(0));

                if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
                    if ((Double) v.getValue() == 0) {
                        throw new RuntimeException("Undefined: cotangent undefined at zero");
                    }

                    return 1.0 / Math.tan((Double)v.getValue());
                }

                else if (value instanceof Double v) {
                    return 1.0 / Math.tan(v);
                }

                throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().getFirst().getName()
                        + "' in function " + functionName + ": expected " + f.getParameters().getFirst().getType() + " but got " + TypeChecker.inferTypeFromValue(value));
            }

            case "<MDA>arcsine":
            case "<MDA>vibe_rewind": {
                Object value = visit(ctx.function_call().arguments().expression(0));

                if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
                    return Math.asin((Double)v.getValue());
                }

                else if (value instanceof Double v) {
                    return Math.asin(v);
                }

                throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().getFirst().getName()
                        + "' in function " + functionName + ": expected " + f.getParameters().getFirst().getType() + " but got " + TypeChecker.inferTypeFromValue(value));

            }
            case "<MDA>arccosine":
            case "<MDA>side_throwback": {
                Object value = visit(ctx.function_call().arguments().expression(0));

                if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
                    return Math.acos((Double)v.getValue());
                }

                else if (value instanceof Double v) {
                    return Math.acos(v);
                }

                throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().getFirst().getName()
                        + "' in function " + functionName + ": expected " + f.getParameters().getFirst().getType() + " but got " + TypeChecker.inferTypeFromValue(value));
            }

            case "<MDA>arctangent":
            case "<MDA>angle_flash": {
                Object value = visit(ctx.function_call().arguments().expression(0));

                if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
                    return Math.atan((Double)v.getValue());
                }

                else if (value instanceof Double v) {
                    return Math.atan(v);
                }

                throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().getFirst().getName()
                        + "' in function " + functionName + ": expected " + f.getParameters().getFirst().getType() + " but got " + TypeChecker.inferTypeFromValue(value));
            }

            case "<MDA>arccotangent":
            case "<MDA>cotan_flashback": {
                Object value = visit(ctx.function_call().arguments().expression(0));

                if (value instanceof Variable v && v.getType().equals(VariableType.DOUBLE)) {
                    return Math.atan(toDouble(1.0 / (Double)v.getValue()));
                }

                else if (value instanceof Double v) {
                    return Math.atan(toDouble(1.0 / v));
                }

                throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().getFirst().getName()
                        + "' in function " + functionName + ": expected " + f.getParameters().getFirst().getType() + " but got " + TypeChecker.inferTypeFromValue(value));
            }

            case "<MDA>array_length":
            case "<MDA>squad_countdown": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                if (array instanceof Variable var && var.getValue() instanceof List<?>) {
                    return ((List<?>) var.getValue()).size();
                }

                else {
                    throw new RuntimeException("The standard 'array_length' function requires an array argument");
                }
            }

            case "<MDA>array_get_at":
            case "<MDA>squad_peep": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object index = visit(ctx.function_call().arguments().expression(1));

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_at' function requires the first argument to be an array variable");
                }

                int idx;

                if (index instanceof Integer) {
                    idx = (Integer) index;
                }

                else if (index instanceof Variable var2 && var2.getType() == VariableType.INTEGER && var2.getValue() instanceof Integer i) {
                    idx = i;
                }

                else {
                    VariableType gotType = (index instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(index);
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(1).getName()
                            + "' in function " + functionName + ": expected " + VariableType.INTEGER + " but got " + gotType);
                }

                if (idx < 0 || idx >= list.size()) {
                    throw new RuntimeException("Index out of bounds in function " + functionName + ": tried to access index " + idx + " of array with size " + list.size());
                }

                return list.get(idx);
            }

            case "<MDA>array_set_at":
            case "<MDA>squad_seep": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object index = visit(ctx.function_call().arguments().expression(1));
                Object value = visit(ctx.function_call().arguments().expression(2));

                Variable variable;

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_set_at' function requires the first argument to be an array variable");
                } else {
                    variable = var;
                }

                int idx;
                if (index instanceof Integer) {
                    idx = (Integer) index;
                } else if (index instanceof Variable var2 && var2.getType() == VariableType.INTEGER && var2.getValue() instanceof Integer i) {
                    idx = i;
                } else {
                    VariableType gotType = (index instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(index);
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(2).getName()
                            + "' in function " + functionName + ": expected " + VariableType.INTEGER + " but got " + gotType);
                }

                if (idx < 0 || idx >= list.size()) {
                    throw new RuntimeException("Index out of bounds in function " + functionName + ": tried to access index " + idx + " of array with size " + list.size());
                }

                VariableType expectedType = TypeChecker.inferTypeFromArrayType(variable.getType());

                VariableType valueType = value instanceof Variable vValue ? vValue.getType() : TypeChecker.inferTypeFromValue(value);

                if (!valueType.equals(expectedType)) {
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(2).getName()
                            + "' in function " + functionName + ": expected " + expectedType + " but got " + valueType);
                }

                List<Object> typedList = (List<Object>) list;
                typedList.set(idx, value);

                return typedList;
            }

            case "<MDA>array_copy":
            case "<MDA>squad_join": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                if (array instanceof Variable var && var.getValue() instanceof List<?> list) {
                    return new ArrayList<>(list);
                }

                else {
                    throw new RuntimeException("The 'array_copy' function requires an array variable");
                }
            }

            case "<MDA>array_contains":
            case "<MDA>squad_vibeswith": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                Variable variable;

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_contains' function requires the first argument to be an array variable");
                } else {
                    variable = var;
                }

                VariableType expectedType = TypeChecker.inferTypeFromArrayType(variable.getType());

                VariableType valueType = value instanceof Variable vValue ? vValue.getType() : TypeChecker.inferTypeFromValue(value);

                if (!valueType.equals(expectedType)) {
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(1).getName()
                            + "' in function " + functionName + ": expected " + expectedType + " but got " + valueType);
                }

                List<Object> typedList = (List<Object>) list;

                if (value instanceof Variable vValue) {
                    value = vValue.getValue();
                }

                return typedList.contains(value);
            }

            case "<MDA>array_index_of":
            case "<MDA>squad_whereat": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                Variable variable;

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_index_of' function requires the first argument to be an array variable");
                } else {
                    variable = var;
                }

                VariableType expectedType = TypeChecker.inferTypeFromArrayType(variable.getType());

                VariableType valueType = value instanceof Variable vValue ? vValue.getType() : TypeChecker.inferTypeFromValue(value);

                if (!valueType.equals(expectedType)) {
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(1).getName()
                            + "' in function " + functionName + ": expected " + expectedType + " but got " + valueType);
                }

                List<Object> typedList = (List<Object>) list;

                if (value instanceof Variable vValue) {
                    value = vValue.getValue();
                }

                return typedList.indexOf(value);
            }

            case "<MDA>array_count":
            case "<MDA>squad_howmany": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                Variable variable;

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_count' function requires the first argument to be an array variable");
                } else {
                    variable = var;
                }

                VariableType expectedType = TypeChecker.inferTypeFromArrayType(variable.getType());

                VariableType valueType = value instanceof Variable vValue ? vValue.getType() : TypeChecker.inferTypeFromValue(value);

                if (!valueType.equals(expectedType)) {
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(1).getName()
                            + "' in function " + functionName + ": expected " + expectedType + " but got " + valueType);
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

            case "<MDA>array_insert_first":
            case "<MDA>squad_pushup": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                Variable variable;

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_insert_first' function requires the first argument to be an array variable");
                } else {
                    variable = var;
                }

                VariableType expectedType = TypeChecker.inferTypeFromArrayType(variable.getType());

                VariableType valueType = value instanceof Variable vValue ? vValue.getType() : TypeChecker.inferTypeFromValue(value);

                if (!valueType.equals(expectedType)) {
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(1).getName()
                            + "' in function " + functionName + ": expected " + expectedType + " but got " + valueType);
                }

                List<Object> typedList = (List<Object>) list;

                if (value instanceof Variable vValue) {
                    value = vValue.getValue();
                }

                typedList.addFirst(value);

                return typedList;
            }

            case "<MDA>array_insert_at":
            case "<MDA>squad_dropin": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object index = visit(ctx.function_call().arguments().expression(1));
                Object value = visit(ctx.function_call().arguments().expression(2));

                Variable variable;

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_insert_at' function requires the first argument to be an array variable");
                } else {
                    variable = var;
                }

                int idx;
                if (index instanceof Integer) {
                    idx = (Integer) index;
                } else if (index instanceof Variable var2 && var2.getType() == VariableType.INTEGER && var2.getValue() instanceof Integer i) {
                    idx = i;
                } else {
                    VariableType gotType = (index instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(index);
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(1).getName()
                            + "' in function " + functionName + ": expected " + VariableType.INTEGER + " but got " + gotType);
                }

                if (idx < 0 || idx > list.size()) {
                    throw new RuntimeException("Index out of bounds in function " + functionName + ": tried to insert at index " + idx + " in array of size " + list.size());
                }

                VariableType expectedType = TypeChecker.inferTypeFromArrayType(variable.getType());
                VariableType actualType = (value instanceof Variable vValue) ? vValue.getType() : TypeChecker.inferTypeFromValue(value);

                if (!actualType.equals(expectedType)) {
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(2).getName()
                            + "' in function " + functionName + ": expected " + expectedType + " but got " + actualType);
                }

                List<Object> typedList = (List<Object>) list;

                if (value instanceof Variable vValue) {
                    value = vValue.getValue();
                }

                typedList.add(idx, value);

                return typedList;
            }

            case "<MDA>array_insert_last":
            case "<MDA>squad_slidein": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                Variable variable;

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_insert_last' function requires the first argument to be an array variable");
                } else {
                    variable = var;
                }

                VariableType expectedType = TypeChecker.inferTypeFromArrayType(variable.getType());
                VariableType valueType = (value instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(value);

                if (!valueType.equals(expectedType)) {
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(1).getName()
                            + "' in function " + functionName + ": expected " + expectedType + " but got " + valueType);
                }

                List<Object> typedList = (List<Object>) list;

                if (value instanceof Variable vValue) {
                    value = vValue.getValue();
                }

                typedList.add(value);

                return typedList;
            }

            case "<MDA>array_delete_first":
            case "<MDA>squad_chopfirst": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_delete_first' function requires the first argument to be an array variable");
                }

                List<Object> typedList = (List<Object>) list;

                if (typedList.isEmpty()) {
                    throw new RuntimeException("Cannot delete first element of an empty array in function " + functionName);
                }

                typedList.removeFirst();

                return typedList;
            }

            case "<MDA>array_delete_at":
            case "<MDA>squad_chopspot": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object index = visit(ctx.function_call().arguments().expression(1));

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_delete_at' function requires the first argument to be an array variable");
                }

                int idx;
                if (index instanceof Integer) {
                    idx = (Integer) index;
                } else if (index instanceof Variable var2 && var2.getType() == VariableType.INTEGER && var2.getValue() instanceof Integer i) {
                    idx = i;
                } else {
                    VariableType gotType = (index instanceof Variable v) ? v.getType() : TypeChecker.inferTypeFromValue(index);
                    throw new RuntimeException("Type mismatch for parameter '" + f.getParameters().get(1).getName()
                            + "' in function " + functionName + ": expected " + VariableType.INTEGER + " but got " + gotType);
                }

                List<Object> typedList = (List<Object>) list;

                if (idx < 0 || idx >= typedList.size()) {
                    throw new RuntimeException("Index out of bounds in function " + functionName + ": tried to delete at index " + idx + " from array of size " + typedList.size());
                }

                typedList.remove(idx);

                return typedList;
            }

            case "<MDA>array_delete_last":
            case "<MDA>squad_choplast": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                if (!(array instanceof Variable var) || !(var.getValue() instanceof List<?> list)) {
                    throw new RuntimeException("The standard 'array_delete_last' function requires the first argument to be an array variable");
                }

                List<Object> typedList = (List<Object>) list;

                if (typedList.isEmpty()) {
                    throw new RuntimeException("Cannot delete last element of an empty array in function " + functionName);
                }

                typedList.removeLast();

                return typedList;
            }

            default: {
                String functionNameLower = functionName.toLowerCase();
                Function function = functions.get(functionNameLower);

                if (function == null || function.getIsDeclaredOnly()) {
                    throw new RuntimeException("Function " + functionName + " not defined or missing implementation.");
                }

                List<Object> argumentValues = new ArrayList<>();

                if (ctx.function_call().arguments() != null) {
                    for (CZParser.ExpressionContext exprCtx : ctx.function_call().arguments().expression()) {
                        argumentValues.add(visit(exprCtx));
                    }
                }

                List<Variable> parameters = function.getParameters();

                if (argumentValues.size() != parameters.size()) {
                    throw new RuntimeException("Argument count mismatch for function " + functionName);
                }

                Map<String, Variable> functionVariables = new HashMap<>();

                for (int i = 0; i < parameters.size(); i++) {
                    Variable param = parameters.get(i);
                    Object argValue = argumentValues.get(i);

                    if (argValue instanceof Variable variableArg) {
                        VariableType argType = variableArg.getType();

                        if (!param.getType().equals(argType)) {
                            throw new RuntimeException("Type mismatch for parameter '" + param.getName()
                                    + "' in function " + functionName + ": expected " + param.getType() + " but got " + argType);
                        }

                        functionVariables.put(param.getName(), new Variable(param.getName(), param.getType(), variableArg.getValue()));
                    }

                    else {
                        VariableType argType = TypeChecker.inferTypeFromValue(argValue);

                        if (!param.getType().equals(argType)) {
                            throw new RuntimeException("Type mismatch for parameter '" + param.getName()
                                    + "' in function " + functionName + ": expected " + param.getType() + " but got " + argType);
                        }

                        functionVariables.put(param.getName(), new Variable(param.getName(), param.getType(), argValue));
                    }
                }

                Map<String, Variable> previousVariables = new HashMap<>(variables);
                variables.clear();
                variables.putAll(functionVariables);

                Object result = null;

                try {
                    result = visit(function.getBody());
                } catch (ReturnValue rv) {
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

        if (macros.containsKey(varName)) {
            String value = macros.get(varName);
            return parseMacroValue(value);
        }

        Variable var = variables.get(varName);

        if (var != null) {
            return var;
        }

        else {
            throw new RuntimeException("Variable " + varName + " not defined");
        }
    }

    @Override
    public Object visitLiteralExpression(CZParser.LiteralExpressionContext ctx) {
        return visit(ctx.literal());
    }

    @Override
    public Object visitLiteral(CZParser.LiteralContext ctx) {
        if (ctx.INTEGER_NUMBER() != null) {
            return Integer.parseInt(ctx.INTEGER_NUMBER().getText());
        } else if (ctx.DOUBLE_NUMBER() != null) {
            return Double.parseDouble(ctx.DOUBLE_NUMBER().getText());
        } else if (ctx.CHARACTER() != null) {
            return ctx.CHARACTER().getText().charAt(1);
        } else if (ctx.STRING_LITERAL() != null) {
            return ctx.STRING_LITERAL().getText().substring(1, ctx.STRING_LITERAL().getText().length() - 1);
        } else if (ctx.boolean_literal() != null) {
            return ctx.boolean_literal().TRUE() != null;
        } else if (ctx.array_literal() != null) {
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
        boolean matched = false;

        for (CZParser.Switch_blockContext block : ctx.switch_block()) {
            Object caseValue = visit(block.literal());

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