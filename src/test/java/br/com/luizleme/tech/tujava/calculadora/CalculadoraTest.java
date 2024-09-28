package br.com.luizleme.tech.tujava.calculadora;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

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

	@Test
	void deveValidarSeNumeroEhMaiorQueZero(){
		//ARRANGE
		Calculadora calculadora = new Calculadora();

		//ACT
		boolean resultado = calculadora.validaSeEhMaiorQueZero(1);

		//ASSERT
		assertTrue(resultado, "o número 1 é maior que zero");
	}

	@Test
	void deveValidarSeNumeroEhMenorQueZero(){
		//ARRANGE
		Calculadora calculadora = new Calculadora();

		//ACT
		boolean resultado = calculadora.validaSeEhMaiorQueZero(-5);

		//ASSERT
		assertFalse(resultado, "o número -5 é menor que zero");
	}

	@Test
	void deveValidarSeEhNulo() {

		//ARRANGE
		Calculadora calculadora = new Calculadora();

		//ACT
		int resultado = calculadora.somar(1, 6);

		//ASSERT
		assertNotNull(resultado, "o resultado não deve ser nulo");
	}
}
