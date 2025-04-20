package org.moldi_dev;

import org.moldi_dev.antlr_4_gen.CZParser;

import java.util.Objects;
import java.util.function.Supplier;

public class ExpressionEvaluator {
    public ExpressionEvaluator() {}

    public Object evaluateUnaryExpression(Object value, int operation) {
        if (value instanceof Variable) {
            value = ((Variable) value).getValue();
        }

        switch (operation) {
            case CZParser.NOT:
                if (value instanceof Boolean) return !(Boolean) value;
                throw new RuntimeException("Logical NOT (!) requires a boolean operand");

            case CZParser.BITWISE_NOT:
                if (value instanceof Integer) return ~(Integer) value;
                throw new RuntimeException("Bitwise NOT (~) requires an integer operand");
        }

        return value;
    }

    public Object evaluatePowerExpression(Object left, Object right) {
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

    public Object evaluateMultiplicativeExpression(Object left, Object right, int operation) {
        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (left instanceof Double || right instanceof Double) {
            double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
            double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;

            return switch (operation) {
                case CZParser.MULTIPLICATION -> l * r;
                case CZParser.DIVISION -> l / r;
                case CZParser.MODULUS -> l % r;
                default -> throw new RuntimeException("Invalid operator for doubles");
            };
        }

        else if (left instanceof Integer && right instanceof Integer) {
            int l = (Integer) left;
            int r = (Integer) right;

            return switch (operation) {
                case CZParser.MULTIPLICATION -> l * r;
                case CZParser.DIVISION -> l / r;
                case CZParser.MODULUS -> l % r;
                default -> 0;
            };
        }

        throw new RuntimeException("Invalid operand types for multiplicative expression");
    }

    public Object evaluateAdditiveExpression(Object left, Object right, int operation) {
        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (operation == CZParser.ADDITION) {
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

    public Object evaluateShiftExpression(Object left, Object right, int operation) {
        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (left instanceof Integer && right instanceof Integer) {
            int l = (Integer) left;
            int r = (Integer) right;

            return switch (operation) {
                case CZParser.SHIFT_LEFT -> l << r;
                case CZParser.SHIFT_RIGHT -> l >> r;
                default -> 0;
            };
        }

        throw new RuntimeException("Shift operations require integer operands");
    }

    public Object evaluateRelationalExpression(Object left, Object right, int operation) {
        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (left instanceof Double || right instanceof Double) {
            double l = (left instanceof Integer) ? ((Integer) left).doubleValue() : (Double) left;
            double r = (right instanceof Integer) ? ((Integer) right).doubleValue() : (Double) right;

            return switch (operation) {
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

            return switch (operation) {
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

            return switch (operation) {
                case CZParser.LESS_THAN -> l < r;
                case CZParser.GREATER_THAN -> l > r;
                case CZParser.LESS_THAN_OR_EQUAL -> l <= r;
                case CZParser.GREATER_THAN_OR_EQUAL -> l >= r;
                default -> false;
            };
        }

        else if (left instanceof String && right instanceof String) {
            int cmp = ((String) left).compareTo((String) right);

            return switch (operation) {
                case CZParser.LESS_THAN -> cmp < 0;
                case CZParser.GREATER_THAN -> cmp > 0;
                case CZParser.LESS_THAN_OR_EQUAL -> cmp <= 0;
                case CZParser.GREATER_THAN_OR_EQUAL -> cmp >= 0;
                default -> false;
            };
        }

        throw new RuntimeException("Invalid operands for relational comparison");
    }

    public Object evaluateEqualityExpression(Object left, Object right, int operation) {
        if (left instanceof Variable variable) {
            if (variable.getType() == VariableType.ENUM) {
                left = variable.getEnumValue();
            }

            else {
                left = variable.getValue();
            }
        }

        if (right instanceof Variable variable) {
            if (variable.getType() == VariableType.ENUM) {
                right = variable.getEnumValue();
            }

            else {
                right = variable.getValue();
            }
        }

        return switch (operation) {
            case CZParser.EQUALS -> Objects.equals(left, right);
            case CZParser.NOT_EQUALS -> !Objects.equals(left, right);
            default -> false;
        };
    }

    public Object evaluateBitwiseExpression(Object left, Object right, int operation) {
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

        return switch (operation) {
            case CZParser.BITWISE_AND -> l & r;
            case CZParser.BITWISE_OR -> l | r;
            case CZParser.BITWISE_XOR -> l ^ r;
            default -> 0;
        };
    }

    public Object evaluateLogicalExpression(Object left, Supplier<Object> rightSupplier, int operation) {
        if (left instanceof Variable) {
            left = ((Variable) left).getValue();
        }

        if (!(left instanceof Boolean)) {
            throw new RuntimeException("Logical operations require boolean operands");
        }

        boolean l = (Boolean) left;

        switch (operation) {
            case CZParser.LOGICAL_OR:
                if (l) {
                    return true;
                }
                break;
            case CZParser.LOGICAL_AND:
                if (!l) {
                    return false;
                }
                break;
            default:
                throw new RuntimeException("Unknown logical operator");
        }

        Object right = rightSupplier.get();

        if (right instanceof Variable) {
            right = ((Variable) right).getValue();
        }

        if (!(right instanceof Boolean)) {
            throw new RuntimeException("Logical operations require boolean operands");
        }

        boolean r = (Boolean) right;

        return switch (operation) {
            case CZParser.LOGICAL_AND -> l && r;
            case CZParser.LOGICAL_OR -> l || r;
            default -> false;
        };
    }
}
