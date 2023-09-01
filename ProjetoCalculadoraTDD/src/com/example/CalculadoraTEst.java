package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculadoraTEst {

	@Test
	public void testSoma() {
		Calculadora calc = new Calculadora();
		assertEquals(5, calc.soma(2, 3));
	}
	
	@Test
	public void testMult() {
		Calculadora calc = new Calculadora();
		assertEquals(6, calc.mult(2, 3));
	}

	@Test
	public void testDiv() {
		Calculadora calc = new Calculadora();
		assertEquals(6, calc.div(2, 3));
	}

	@Test
    	public void testSubtrai() {
        	Calculadora calc = new Calculadora();
        	assertEquals(-1, calc.subtrai(2, 3));
    }
}
