package org.moldi_dev;

import org.moldi_dev.antlr_4_gen.CZBaseVisitor;
import org.moldi_dev.antlr_4_gen.CZParser;

import java.util.*;

public class CZInterpreter extends CZBaseVisitor<Object> {
    private Map<String, Object> variables;
    private final Map<String, Function> functions;
    private boolean shouldBreak = false;
    private boolean shouldContinue = false;

    public CZInterpreter() {
        variables = new HashMap<>();
        functions = new HashMap<>();

        // Built-in functions (my standard library hehehe)
        functions.put("<MDA>sine", new Function("<MDA>sine", List.of("x"), null, false));
        functions.put("<MDA>vibe_sway", new Function("<MDA>vibe_sway", List.of("x"), null, false));

        functions.put("<MDA>cosine", new Function("<MDA>cosine", List.of("x"), null, false));
        functions.put("<MDA>side_chill", new Function("<MDA>side_chill", List.of("x"), null, false));

        functions.put("<MDA>tangent", new Function("<MDA>tangent", List.of("x"), null, false));
        functions.put("<MDA>angle_tea", new Function("<MDA>angle_tea", List.of("x"), null, false));

        functions.put("<MDA>cotangent", new Function("<MDA>cotangent", List.of("x"), null, false));
        functions.put("<MDA>cotan_drip", new Function("<MDA>cotan_drip", List.of("x"), null, false));

        functions.put("<MDA>arcsine", new Function("<MDA>arcsine", List.of("x"), null, false));
        functions.put("<MDA>vibe_rewind", new Function("<MDA>vibe_rewind", List.of("x"), null, false));

        functions.put("<MDA>arccosine", new Function("<MDA>arccosine", List.of("x"), null, false));
        functions.put("<MDA>side_throwback", new Function("<MDA>side_throwback", List.of("x"), null, false));

        functions.put("<MDA>arctangent", new Function("<MDA>arctangent", List.of("x"), null, false));
        functions.put("<MDA>angle_flash", new Function("<MDA>angle_flash", List.of("x"), null, false));

        functions.put("<MDA>arccotangent", new Function("<MDA>arccotangent", List.of("x"), null, false));
        functions.put("<MDA>cotan_flashback", new Function("<MDA>cotan_flashback", List.of("x"), null, false));

        functions.put("<MDA>array_length", new Function("<MDA>array_length", List.of("arr"), null, false));
        functions.put("<MDA>squad_countdown", new Function("<MDA>squad_countdown", List.of("arr"), null, false));

        functions.put("<MDA>array_at", new Function("<MDA>array_at", List.of("arr", "index"), null, false));
        functions.put("<MDA>squad_peep", new Function("<MDA>squad_peep", List.of("arr", "index"), null, false));

        functions.put("<MDA>array_contains", new Function("<MDA>array_contains", List.of("arr", "value"), null, false));
        functions.put("<MDA>squad_vibeswith", new Function("<MDA>squad_vibeswith", List.of("arr", "value"), null, false));

        functions.put("<MDA>array_index_of", new Function("<MDA>array_index_of", List.of("arr", "value"), null, false));
        functions.put("<MDA>squad_whereat", new Function("<MDA>squad_whereat", List.of("arr", "value"), null, false));

        functions.put("<MDA>array_count", new Function("<MDA>array_count", List.of("arr", "value"), null, false));
        functions.put("<MDA>squad_howmany", new Function("<MDA>squad_howmany", List.of("arr", "value"), null, false));

        functions.put("<MDA>array_sort", new Function("<MDA>array_sort", List.of("arr"), null, false));
        functions.put("<MDA>squad_glowup", new Function("<MDA>squad_glowup", List.of("arr"), null, false));

        functions.put("<MDA>array_reverse", new Function("<MDA>array_reverse", List.of("arr"), null, false));
        functions.put("<MDA>squad_flipflop", new Function("<MDA>squad_flipflop", List.of("arr"), null, false));

        functions.put("<MDA>array_insert_first", new Function("<MDA>array_insert_first", List.of("arr", "value"), null, false));
        functions.put("<MDA>squad_pushup", new Function("<MDA>squad_pushup", List.of("arr", "value"), null, false));

        functions.put("<MDA>array_insert_at", new Function("<MDA>array_insert_at", List.of("arr", "index", "value"), null, false));
        functions.put("<MDA>squad_dropin", new Function("<MDA>squad_dropin", List.of("arr", "index", "value"), null, false));

        functions.put("<MDA>array_insert_last", new Function("<MDA>array_insert_last", List.of("arr", "value"), null, false));
        functions.put("<MDA>squad_slidein", new Function("<MDA>squad_slidein", List.of("arr", "value"), null, false));

        functions.put("<MDA>array_delete_first", new Function("<MDA>array_delete_first", List.of("arr"), null, false));
        functions.put("<MDA>squad_chopfirst", new Function("<MDA>squad_chopfirst", List.of("arr"), null, false));

        functions.put("<MDA>array_delete_at", new Function("<MDA>array_delete_at", List.of("arr", "index"), null, false));
        functions.put("<MDA>squad_chopspot", new Function("<MDA>squad_chopspot", List.of("arr", "index"), null, false));

        functions.put("<MDA>array_delete_last", new Function("<MDA>array_delete_last", List.of("arr"), null, false));
        functions.put("<MDA>squad_choplast", new Function("<MDA>squad_choplast", List.of("arr"), null, false));
    }

    @Override
    public Object visitProgram(CZParser.ProgramContext ctx) {
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
    public Object visitMain_function(CZParser.Main_functionContext ctx) {
        try {
            return visit(ctx.function_block());
        } catch (ReturnValue rv) {
            return rv.getValue();
        }
    }

    @Override
    public Object visitFunction_declaration(CZParser.Function_declarationContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<String> parameters = new ArrayList<>();

        if (ctx.parameters() != null) {
            for (CZParser.ParameterContext paramCtx : ctx.parameters().parameter()) {
                parameters.add(paramCtx.IDENTIFIER().getText());
            }
        }

        Function existing = functions.get(functionName);

        if (existing == null || existing.getIsDeclaredOnly()) {
            Function prototype = new Function(functionName, parameters, null, true);
            functions.put(functionName, prototype);
        }

        return null;
    }

    @Override
    public Object visitFunction(CZParser.FunctionContext ctx) {
        String functionName = ctx.IDENTIFIER().getText();
        List<String> parameters = new ArrayList<>();

        if (ctx.parameters() != null) {
            for (CZParser.ParameterContext paramCtx : ctx.parameters().parameter()) {
                parameters.add(paramCtx.IDENTIFIER().getText());
            }
        }

        Function function = new Function(functionName, parameters, ctx.function_block(), false);

        functions.put(functionName, function);

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
        String type = ctx.type.getText();
        Object value = null;

        if (ctx.expression() != null) {
            value = visit(ctx.expression());
        }

        if (type.equals("array<int>") || type.equals("squad<rizz>")) {
            if (value != null) {
                List<Integer> arrayList = new ArrayList<>();

                for (Object obj : (List<?>) value) {
                    if (obj instanceof Integer) {
                        arrayList.add((Integer) obj);
                    } else {
                        throw new RuntimeException("Type mismatch: Expected Integer values.");
                    }
                }

                variables.put(varName, arrayList);
            } else {
                variables.put(varName, new ArrayList<Integer>());
            }
        } else if (type.equals("array<double>") || type.equals("squad<g>")) {
            if (value != null) {
                List<Double> arrayList = new ArrayList<>();

                for (Object obj : (List<?>) value) {
                    if (obj instanceof Double) {
                        arrayList.add((Double) obj);
                    } else {
                        throw new RuntimeException("Type mismatch: Expected Double values.");
                    }
                }

                variables.put(varName, arrayList);
            } else {
                variables.put(varName, new ArrayList<Double>());
            }
        } else if (type.equals("array<string>") || type.equals("squad<squad>")) {
            if (value != null) {
                List<String> arrayList = new ArrayList<>();

                for (Object obj : (List<?>) value) {
                    if (obj instanceof String) {
                        arrayList.add((String) obj);
                    } else {
                        throw new RuntimeException("Type mismatch: Expected String values.");
                    }
                }

                variables.put(varName, arrayList);
            } else {
                variables.put(varName, new ArrayList<String>());
            }
        } else {
            variables.put(varName, value);
        }

        return null;
    }

    @Override
    public Object visitAssignment(CZParser.AssignmentContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Object value = visit(ctx.expression());
        Object var = variables.get(varName);

        if (var instanceof List<?> arrayVar) {

            if (arrayVar.isEmpty()) {
                throw new RuntimeException("Array variable is empty, cannot assign a value.");
            }

            if (arrayVar.getFirst() instanceof Integer && value instanceof List<?>) {
                List<Integer> intList = (List<Integer>) value;

                if (!intList.isEmpty() && intList.getFirst() == null) {
                    throw new RuntimeException("Type mismatch: Expected an Integer array.");
                }

                variables.put(varName, intList);
            } else if (arrayVar.getFirst() instanceof Double && value instanceof List<?>) {
                List<Double> doubleList = (List<Double>) value;

                if (!doubleList.isEmpty() && doubleList.getFirst() == null) {
                    throw new RuntimeException("Type mismatch: Expected a Double array.");
                }

                variables.put(varName, doubleList);
            } else if (arrayVar.getFirst() instanceof String && value instanceof List<?>) {
                List<String> stringList = (List<String>) value;

                if (!stringList.isEmpty() && stringList.getFirst() == null) {
                    throw new RuntimeException("Type mismatch: Expected a String array.");
                }

                variables.put(varName, stringList);
            } else {
                throw new RuntimeException("Type mismatch: Array type mismatch or assignment value type incorrect.");
            }
        } else {
            variables.put(varName, value);
        }

        return null;
    }

    @Override
    public Object visitPrint_statement(CZParser.Print_statementContext ctx) {
        StringBuilder output = new StringBuilder("\uD83D\uDCE2 ");

        if (ctx.arguments() != null) {
            for (CZParser.ExpressionContext exprCtx : ctx.arguments().expression()) {
                Object value = visit(exprCtx);

                if (value instanceof List<?> arrayValue) {

                    output.append("[");

                    for (int i = 0; i < arrayValue.size(); i++) {
                        output.append(arrayValue.get(i));
                        if (i < arrayValue.size() - 1) {
                            output.append(", ");
                        }
                    }

                    output.append("]");
                } else {
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

        System.out.print("\uD83D\uDCBB Enter a value for " + varName + ": ");

        Object currentValue = variables.get(varName);

        if (currentValue instanceof Double) {
            double value = scanner.nextDouble();
            variables.put(varName, value);
        } else if (currentValue instanceof String) {
            String value = scanner.nextLine();
            variables.put(varName, value);
        } else if (currentValue instanceof Character) {
            String input = scanner.nextLine();
            variables.put(varName, input.charAt(0));
        } else if (currentValue instanceof Integer) {
            int value = scanner.nextInt();
            scanner.nextLine();
            variables.put(varName, value);
        } else {
            throw new RuntimeException("Type mismatch for the read operation");
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

    @Override
    public Object visitReturn_statement(CZParser.Return_statementContext ctx) {
        Object value = visit(ctx.expression());
        throw new ReturnValue(value);
    }

    @Override
    public Object visitParenExpression(CZParser.ParenExpressionContext ctx) {
        return visit(ctx.expression());
    }

    @Override
    public Object visitUnaryExpression(CZParser.UnaryExpressionContext ctx) {
        Object value = visit(ctx.expression());

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

        if (left instanceof Double || right instanceof Double) {
            double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
            double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;

            return switch (ctx.op.getType()) {
                case CZParser.MULTIPLICATION -> l * r;
                case CZParser.DIVISION -> l / r;
                case CZParser.MODULUS -> l % r;
                default -> throw new RuntimeException("Invalid operator for doubles");
            };
        } else if (left instanceof Integer && right instanceof Integer) {
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

        if (ctx.op.getType() == CZParser.ADDITION) {
            if (left instanceof String || right instanceof String || left instanceof Character || right instanceof Character) {
                return String.valueOf(left) + right;
            } else if (left instanceof Double || right instanceof Double) {
                double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
                double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;
                return l + r;
            } else {
                return (Integer) left + (Integer) right;
            }
        } else {
            if (left instanceof Double || right instanceof Double) {
                double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
                double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;
                return l - r;
            } else {
                return (Integer) left - (Integer) right;
            }
        }
    }

    @Override
    public Object visitShiftExpression(CZParser.ShiftExpressionContext ctx) {
        Object left = visit(ctx.left);
        Object right = visit(ctx.right);

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
        } else if (left instanceof Integer && right instanceof Integer) {
            int l = (Integer) left;
            int r = (Integer) right;

            return switch (ctx.op.getType()) {
                case CZParser.LESS_THAN -> l < r;
                case CZParser.GREATER_THAN -> l > r;
                case CZParser.LESS_THAN_OR_EQUAL -> l <= r;
                case CZParser.GREATER_THAN_OR_EQUAL -> l >= r;
                default -> false;
            };
        } else if (left instanceof Character && right instanceof Character) {
            char l = (Character) left;
            char r = (Character) right;

            return switch (ctx.op.getType()) {
                case CZParser.LESS_THAN -> l < r;
                case CZParser.GREATER_THAN -> l > r;
                case CZParser.LESS_THAN_OR_EQUAL -> l <= r;
                case CZParser.GREATER_THAN_OR_EQUAL -> l >= r;
                default -> false;
            };
        } else if (left instanceof String && right instanceof String) {
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
            case "<MDA>vibe_sway":
                return Math.sin(toDouble(visit(ctx.function_call().arguments().expression(0))));
            case "<MDA>cosine":
            case "<MDA>side_chill":
                return Math.cos(toDouble(visit(ctx.function_call().arguments().expression(0))));
            case "<MDA>tangent":
            case "<MDA>angle_tea":
                return Math.tan(toDouble(visit(ctx.function_call().arguments().expression(0))));
            case "<MDA>cotangent":
            case "<MDA>cotan_drip": {
                double x = toDouble(visit(ctx.function_call().arguments().expression(0)));
                if (x == 0) throw new ArithmeticException("Cotangent undefined at 0");
                return 1.0 / Math.tan(x);
            }
            case "<MDA>arcsine":
            case "<MDA>vibe_rewind":
                return Math.asin(toDouble(visit(ctx.function_call().arguments().expression(0))));
            case "<MDA>arccosine":
            case "<MDA>side_throwback":
                return Math.acos(toDouble(visit(ctx.function_call().arguments().expression(0))));
            case "<MDA>arctangent":
            case "<MDA>angle_flash":
                return Math.atan(toDouble(visit(ctx.function_call().arguments().expression(0))));
            case "<MDA>arccotangent":
            case "<MDA>cotan_flashback": {
                double x = toDouble(visit(ctx.function_call().arguments().expression(0)));
                return Math.atan(1.0 / x);
            }
            case "<MDA>array_length":
            case "<MDA>squad_countdown": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                if (array instanceof List) {
                    return ((List<?>) array).size();
                } else {
                    throw new RuntimeException("array_length requires an array argument");
                }
            }
            case "<MDA>array_at":
            case "<MDA>squad_peep": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                int index = (int) visit(ctx.function_call().arguments().expression(1));

                if (array instanceof List<?> list) {
                    if (index >= 0 && index < list.size()) {
                        return list.get(index);
                    } else {
                        throw new RuntimeException("Index out of bounds for array_at");
                    }
                } else {
                    throw new RuntimeException("array_at requires an array argument");
                }
            }
            case "<MDA>array_contains":
            case "<MDA>squad_vibeswith": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                if (array instanceof List<?> list) {
                    return list.contains(value);
                } else {
                    throw new RuntimeException("array_contains requires an array argument");
                }
            }
            case "<MDA>array_index_of":
            case "<MDA>squad_whereat": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                if (array instanceof List<?> list) {
                    return list.indexOf(value);
                } else {
                    throw new RuntimeException("array_index_of requires an array argument");
                }
            }
            case "<MDA>array_count":
            case "<MDA>squad_howmany": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                if (array instanceof List<?> list) {
                    return list.stream().filter(item -> Objects.equals(item, value)).count();
                } else {
                    throw new RuntimeException("array_count requires an array argument");
                }
            }
            case "<MDA>array_sort":
            case "<MDA>squad_glowup": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                if (array instanceof List<?> list) {
                    List<Object> stalinSortedList = new ArrayList<>();

                    if (!list.isEmpty()) {
                        stalinSortedList.add(list.get(0));

                        for (int i = 1; i < list.size(); i++) {
                            Comparable current = (Comparable) list.get(i);
                            Comparable last = (Comparable) stalinSortedList.get(stalinSortedList.size() - 1);

                            if (current.compareTo(last) > 0) {
                                stalinSortedList.add(list.get(i));
                            }
                        }
                    }

                    return stalinSortedList;
                } else {
                    throw new RuntimeException("array_sort requires an array argument");
                }
            }
            case "<MDA>array_reverse":
            case "<MDA>squad_flipflop": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                if (array instanceof List<?> list) {
                    Collections.reverse(list);
                    return list;
                } else {
                    throw new RuntimeException("array_reverse requires an array argument");
                }
            }
            case "<MDA>array_insert_first":
            case "<MDA>squad_pushup": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                if (array instanceof List) {
                    List<Object> list = (List<Object>) array;
                    list.addFirst(value);
                    return list;
                } else {
                    throw new RuntimeException("array_insert_first requires an array argument");
                }
            }
            case "<MDA>array_insert_at":
            case "<MDA>squad_dropin": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                int index = (int) visit(ctx.function_call().arguments().expression(1));
                Object value = visit(ctx.function_call().arguments().expression(2));

                if (array instanceof List) {
                    List<Object> list = (List<Object>) array;

                    if (index >= 0 && index <= list.size()) {
                        list.add(index, value);
                        return list;
                    } else {
                        throw new RuntimeException("Index out of bounds for array_insert_at");
                    }
                } else {
                    throw new RuntimeException("array_insert_at requires an array argument");
                }
            }
            case "<MDA>array_insert_last":
            case "<MDA>squad_slidein": {
                Object array = visit(ctx.function_call().arguments().expression(0));
                Object value = visit(ctx.function_call().arguments().expression(1));

                if (array instanceof List) {
                    List<Object> list = (List<Object>) array;
                    list.add(value);
                    return list;
                } else {
                    throw new RuntimeException("array_insert_last requires an array argument");
                }
            }
            case "<MDA>array_delete_first":
            case "<MDA>squad_chopfirst": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                if (array instanceof List) {
                    List<Object> list = (List<Object>) array;

                    if (!list.isEmpty()) {
                        list.removeFirst();
                        return list;
                    } else {
                        throw new RuntimeException("array_delete_first requires a non-empty array");
                    }
                } else {
                    throw new RuntimeException("array_delete_first requires an array argument");
                }
            }
            case "<MDA>array_delete_at":
            case "<MDA>squad_chopspot": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                int index = (int) visit(ctx.function_call().arguments().expression(1));

                if (array instanceof List) {
                    List<Object> list = (List<Object>) array;

                    if (index >= 0 && index < list.size()) {
                        list.remove(index);
                        return list;
                    } else {
                        throw new RuntimeException("Index out of bounds for array_delete_at");
                    }
                } else {
                    throw new RuntimeException("array_delete_at requires an array argument");
                }
            }
            case "<MDA>array_delete_last":
            case "<MDA>squad_choplast": {
                Object array = visit(ctx.function_call().arguments().expression(0));

                if (array instanceof List) {
                    List<Object> list = (List<Object>) array;

                    if (!list.isEmpty()) {
                        list.removeLast();
                        return list;
                    } else {
                        throw new RuntimeException("array_delete_last requires a non-empty array");
                    }
                } else {
                    throw new RuntimeException("array_delete_last requires an array argument");
                }
            }
            default:
                String functionNameLower = functionName.toLowerCase();
                Function function = functions.get(functionNameLower);

                if (function == null) {
                    throw new RuntimeException("Function " + functionName + " not defined");
                }

                List<Object> argumentValues = new ArrayList<>();
                if (ctx.function_call().arguments() != null) {
                    for (CZParser.ExpressionContext exprCtx : ctx.function_call().arguments().expression()) {
                        argumentValues.add(visit(exprCtx));
                    }
                }

                if (argumentValues.size() != function.getParameterNames().size()) {
                    throw new RuntimeException("Argument count mismatch for function " + functionName);
                }

                Map<String, Object> functionVariables = new HashMap<>();
                for (int i = 0; i < function.getParameterNames().size(); i++) {
                    functionVariables.put(function.getParameterNames().get(i), argumentValues.get(i));
                }

                Map<String, Object> previousVariables = new HashMap<>(variables);
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

    @Override
    public Object visitIdentifierExpression(CZParser.IdentifierExpressionContext ctx) {
        String varName = ctx.IDENTIFIER().getText();

        return variables.getOrDefault(varName, 0);
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