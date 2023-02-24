package com.springboot.calculator.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorApplicationTests {

	@Autowired
	CalculatorImpl calc;

	@Test
	void contextLoads() {
		assertNotNull(calc);
		assertEquals(15, calc.sum(5, 10));
	}

}
