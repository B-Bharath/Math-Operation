package com.mulesoft.training;

public class MathOperation{
    public String power(String value) {
        return String.valueOf(Math.pow(Double.valueOf(value), 2));
    }
}
