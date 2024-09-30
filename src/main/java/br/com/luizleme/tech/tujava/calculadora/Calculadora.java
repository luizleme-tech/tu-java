package br.com.luizleme.tech.tujava.calculadora;

public class Calculadora {
	public int somar(int parcela1, int parcela2) {
		return parcela1 + parcela2;
	}

	public boolean validaSeEhMaiorQueZero(int i) {
		return i > 0;
	}

	public int dividir(int dividendo, int divisor) {
		if (divisor == 0) {
			throw new ArithmeticException("Divisor nao pode ser zero");
		}
		return dividendo / divisor;
	}
}
