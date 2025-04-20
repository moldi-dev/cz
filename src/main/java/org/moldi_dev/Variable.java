package org.moldi_dev;

public class Variable {
    private String name;
    private VariableType type;
    private String enumName;
    private Integer enumValue;
    private Object value;

    public Variable() {}

    public Variable(String name, String enumName, VariableType type, Integer enumValue) {
        this.name = name;
        this.type = type;
        this.enumName = enumName;
        this.enumValue = enumValue;
    }

    public Variable(String name, VariableType type, Object value) {
        this.name = name;
        this.type = type;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public VariableType getType() {
        return type;
    }

    public void setEnumName(String enumName) {
        this.enumName = enumName;
    }

    public String getEnumName() {
        return enumName;
    }

    public Integer getEnumValue() {
        return enumValue;
    }

    public void setEnumValue(Integer enumValue) {
        this.enumValue = enumValue;
    }

    public void setType(VariableType type) {
        this.type = type;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
