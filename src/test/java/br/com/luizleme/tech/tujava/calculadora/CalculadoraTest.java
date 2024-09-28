package br.com.luizleme.tech.tujava.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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

	@Test
	void deveValidarSeASomaDeDoisNumerosNaoEhIgualAoValorInformado() {
		//ARRENGE
		Calculadora calculadora = new Calculadora();

		//ACT
		int resultado = calculadora.somar(1, 6);

		//ASSERT
		assertNotEquals(8, resultado, "a soma de 1 + 6 não deve ser igual a 8");
	}
}
