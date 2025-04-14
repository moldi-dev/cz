package org.moldi_dev;

import org.moldi_dev.antlr_4_gen.CZParser;
import java.util.List;

public class Function {
    private String functionName;
    private List<Variable> parameters;
    private CZParser.Function_blockContext body;
    private boolean isDeclaredOnly;
    private VariableType returnType;

    public Function(String functionName, List<Variable> parameters, CZParser.Function_blockContext body, boolean isDeclaredOnly, VariableType returnType) {
        this.functionName = functionName;
        this.parameters = parameters;
        this.body = body;
        this.isDeclaredOnly = isDeclaredOnly;
        this.returnType = returnType;
    }

    public String getFunctionName() {
        return functionName;
    }

    public List<Variable> getParameters() {
        return parameters;
    }

    public CZParser.Function_blockContext getBody() {
        return body;
    }

    public boolean getIsDeclaredOnly() {
        return isDeclaredOnly;
    }

    public VariableType getReturnType() {
        return returnType;
    }

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setParameters(List<Variable> parameters) {
        this.parameters = parameters;
    }

    public void setBody(CZParser.Function_blockContext body) {
        this.body = body;
    }

    public void setIsDeclaredOnly(boolean isDeclaredOnly) {
        this.isDeclaredOnly = isDeclaredOnly;
    }

    public void setReturnType(VariableType returnType) {
        this.returnType = returnType;
    }
}
