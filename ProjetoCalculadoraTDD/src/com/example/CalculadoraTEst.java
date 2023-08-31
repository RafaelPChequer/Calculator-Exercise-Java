package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTEst {

	@Test
	public void testSoma() {
		Calculadora calc = new Calculadora();
		asserEquals(5, calc.soma(2, 3));
	}

}
