package org.moldi_dev;

import org.moldi_dev.antlr_4_gen.CZParser;
import java.util.List;

public class Function {
    private String functionName;
    private List<String> parameterNames;
    private CZParser.BlockContext body;

    public Function(String functionName, List<String> parameterNames, CZParser.BlockContext body) {
        this.functionName = functionName;
        this.parameterNames = parameterNames;
        this.body = body;
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

    public void setFunctionName(String functionName) {
        this.functionName = functionName;
    }

    public void setParameterNames(List<String> parameterNames) {
        this.parameterNames = parameterNames;
    }

    public void setBody(CZParser.BlockContext body) {
        this.body = body;
    }
}
