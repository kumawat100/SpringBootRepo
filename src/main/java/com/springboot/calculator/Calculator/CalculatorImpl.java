package com.springboot.calculator.Calculator;

import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements CalculatorInterface {

    @Override
    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}