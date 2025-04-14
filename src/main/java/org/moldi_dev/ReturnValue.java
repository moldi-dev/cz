package org.moldi_dev;

public class ReturnValue extends RuntimeException {
    private Object value;

    public ReturnValue(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}

