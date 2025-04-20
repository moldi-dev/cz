package org.moldi_dev;

import org.antlr.v4.runtime.ParserRuleContext;
import org.moldi_dev.antlr_4_gen.CZParser;

import java.util.List;

public class Utility {
    public Utility() {}

    public boolean parametersMatch(List<Variable> a, List<Variable> b) {
        if (a.size() != b.size()) return true;

        for (int i = 0; i < a.size(); i++) {
            if (!a.get(i).getType().equals(b.get(i).getType())) {
                return true;
            }

            if (!a.get(i).getName().equals(b.get(i).getName())) {
                return true;
            }
        }

        return false;
    }

    public String findEnclosingFunctionName(ParserRuleContext ctx) {
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

    public Object parseConstantValue(String value) {
        value = value.trim();

        if (value.equals("true") || value.equals("false")) {
            return Boolean.parseBoolean(value);
        }

        try {
            return Integer.parseInt(value);
        }

        catch (NumberFormatException ignored) {}

        try {
            return Double.parseDouble(value);
        }

        catch (NumberFormatException ignored) {}

        if ((value.startsWith("\"") && value.endsWith("\"")) || (value.startsWith("'") && value.endsWith("'"))) {
            return value.substring(1, value.length() - 1);
        }

        return value;
    }
}
