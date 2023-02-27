package com.springboot.calculator.Calculator;

import org.springframework.stereotype.Component;

@Component
public interface CalculatorInterface {
    
    int num1 = 0;
    int num2 = 0;

    public int sum(int num1, int num2);
}
