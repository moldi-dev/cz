package org.moldi_dev;

import java.util.*;

public class Struct {
    private String structName;
    private List<Variable> fields;

    public Struct(String structName, List<Variable> fields) {
        this.structName = structName;
        this.fields = fields;
    }

    public String getStructName() {
        return structName;
    }

    public List<Variable> getFields() {
        return fields;
    }

    public void setFields(List<Variable> fields) {
        this.fields = fields;
    }

    public void setStructName(String structName) {
        this.structName = structName;
    }
}
