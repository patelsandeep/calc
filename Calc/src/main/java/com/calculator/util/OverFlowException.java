package com.calculator.util;

public class OverFlowException extends RuntimeException {

    private static final long serialVersionUID = 42L;

    public OverFlowException(String message) {
        super(message);
    }

}
