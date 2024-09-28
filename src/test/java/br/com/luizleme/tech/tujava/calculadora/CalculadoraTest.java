package br.com.luizleme.tech.tujava.calculadora;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTest {

	Calculadora calculadora;

	@BeforeEach
	void setUp() {
		calculadora = new Calculadora();
	}

	@Test
	void deveSomarDoisNumerosEValidarOResultado() {
		//ACT
		int resultado = calculadora.somar(1, 6);

		//ASSERT
		assertEquals(7, resultado,"a soma de 1 + 6 deve ser igual 7");
	}

	@Test
	void deveValidarSeASomaDeDoisNumerosNaoEhIgualAoValorInformado() {
		//ACT
		int resultado = calculadora.somar(1, 6);

		//ASSERT
		assertNotEquals(8, resultado, "a soma de 1 + 6 não deve ser igual a 8");
	}

	@Test
	void deveValidarSeNumeroEhMaiorQueZero(){
		//ACT
		boolean resultado = calculadora.validaSeEhMaiorQueZero(1);

		//ASSERT
		assertTrue(resultado, "o número 1 é maior que zero");
	}

	@Test
	void deveValidarSeNumeroEhMenorQueZero(){
		//ACT
		boolean resultado = calculadora.validaSeEhMaiorQueZero(-5);

		//ASSERT
		assertFalse(resultado, "o número -5 é menor que zero");
	}

	@Test
	void deveValidarSeEhNulo() {
		//ACT
		int resultado = calculadora.somar(1, 6);

		//ASSERT
		assertNotNull(resultado, "o resultado não deve ser nulo");
	}
}
