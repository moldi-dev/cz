package org.moldi_dev;

import org.moldi_dev.antlr_4_gen.CZParser;
import java.util.List;

public class Function {
    private String functionName;
    private List<String> parameterNames;
    private CZParser.BlockContext body;
    private boolean isDeclaredOnly;

    public Function(String functionName, List<String> parameterNames, CZParser.BlockContext body, boolean isDeclaredOnly) {
        this.functionName = functionName;
        this.parameterNames = parameterNames;
        this.body = body;
        this.isDeclaredOnly = isDeclaredOnly;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<String> getParameterNames() {
        return parameterNames;
    }

    public CZParser.BlockContext getBody() {
        return body;
    }

    public boolean getIsDeclaredOnly() {
        return isDeclaredOnly;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setParameterNames(List<String> parameterNames) {
        this.parameterNames = parameterNames;
    }

    public void setBody(CZParser.BlockContext body) {
        this.body = body;
    }

    public void setIsDeclaredOnly(boolean isDeclaredOnly) {
        this.isDeclaredOnly = isDeclaredOnly;
    }
}
