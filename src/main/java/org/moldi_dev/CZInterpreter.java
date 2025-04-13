package org.moldi_dev;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import org.moldi_dev.antlr_4_gen.*;

public class CZInterpreter extends CZBaseVisitor<Object> {
    private final Map<String, Object> variables = new HashMap<>();
    private boolean shouldBreak = false;
    private boolean shouldContinue = false;

    @Override
    public Object visitProgram(CZParser.ProgramContext ctx) {
        for (CZParser.FunctionContext functionCtx : ctx.function()) {
            visit(functionCtx);
        }

        return visit(ctx.main_function());
    }

    @Override
    public Object visitMain_function(CZParser.Main_functionContext ctx) {
        return visit(ctx.block());
    }

    // TODO: implement
    @Override
    public Object visitFunction(CZParser.FunctionContext ctx) {
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
                return result; // For return statements
            }
        }

        return null;
    }

    @Override
    public Object visitDeclaration(CZParser.DeclarationContext ctx) {
        String varName = ctx.IDENTIFIER().getText();
        Object value = null;

        if (ctx.expression() != null) {
            value = visit(ctx.expression());
        }

        variables.put(varName, value);
        return null;
    }

    @Override
    public Object visitAssignment(CZParser.AssignmentContext ctx) {
        String varName = ctx.IDENTIFIER().getText();

        if (ctx.ASSIGNMENT() != null) {
            Object value = visit(ctx.expression());
            variables.put(varName, value);
        }

        return null;
    }

    @Override
    public Object visitPrint_statement(CZParser.Print_statementContext ctx) {
        StringBuilder output = new StringBuilder("\uD83D\uDCE2: ");

        if (ctx.print_arguments() != null) {
            for (CZParser.ExpressionContext exprCtx : ctx.print_arguments().expression()) {
                Object value = visit(exprCtx);
                output.append(value);
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
        }

        else if (currentValue instanceof String) {
            String value = scanner.nextLine();
            variables.put(varName, value);
        }

        else if (currentValue instanceof Character) {
            String input = scanner.nextLine();
            variables.put(varName, input.charAt(0));
        }

        else {
            int value = scanner.nextInt();
            variables.put(varName, value);
        }

        return null;
    }

    @Override
    public Object visitIf_statement(CZParser.If_statementContext ctx) {
        boolean condition = (boolean)visit(ctx.expression());

        if (condition) {
            return visit(ctx.block(0));
        }

        else if (ctx.ELSE() != null) {
            return visit(ctx.block(1));
        }

        return null;
    }

    @Override
    public Object visitWhile_statement(CZParser.While_statementContext ctx) {
        while ((boolean)visit(ctx.expression())) {
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

    // TODO: implement
    @Override
    public Object visitReturn_statement(CZParser.Return_statementContext ctx) {
        if (ctx.expression() != null) {
            return visit(ctx.expression());
        }

        return null;
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

    // TODO: implement
    @Override
    public Object visitFunctionCallExpression(CZParser.FunctionCallExpressionContext ctx) {
        return null;
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

        return null;
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
}