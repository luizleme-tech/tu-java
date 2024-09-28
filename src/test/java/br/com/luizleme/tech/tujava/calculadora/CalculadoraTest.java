package br.com.luizleme.tech.tujava.calculadora;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

	@Test
	void deveSomarDoisNumerosEValidarOResultado() {

		//ARRANGE
		Calculadora calculadora = new Calculadora();

		//ACT
		int resultado = calculadora.somar(1, 6);

		//ASSERT
		assertEquals(7, resultado,"a soma de 1 + 6 deve ser igual 7");

	}
}
