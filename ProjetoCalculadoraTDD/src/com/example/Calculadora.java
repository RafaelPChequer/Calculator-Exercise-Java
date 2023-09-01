package com.example;

public class Calculadora {
	public int soma(int a, int b) {
		return a + b;
	}
	
	public int mult(int a, int b) {
		return a * b;
	}

	public int div(int a, int b) {
		if(b != 0) {
			return a / b;
		}
		else {
			return 0;
		}
	}

	public int subtrai(int a, int b) {
        return a - b;
    }
}
