package br.com.luizleme.tech.tujava.transacao;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class TransacaoTest {

	@ParameterizedTest
	@CsvSource({
			"'tx1', 100.0, '2024-10-10', 'DEBITO', false",
			"'tx2', -50.0, '2024-10-20', 'CREDITO', false",
			"'tx3', 200.0, '2024-11-20', 'TRANSFERENCIA', false",
			"'tx5', 150.0, '2024-12-20', '', false"
	})
	void deveValidarTransacao(String id, double valor, String data, String tipo, boolean resultadoEsperado) {

		TipoTransacao tipoTransacao = tipo.isEmpty() ? null : TipoTransacao.valueOf(tipo);
		Transacao transacao = new Transacao(id, valor, LocalDate.parse(data), tipoTransacao);

		assertEquals(resultadoEsperado, transacao.validar());
	}

	@ParameterizedTest
	@EnumSource(TipoTransacao.class)
	void deveValidarTipoTransacao(TipoTransacao tipoTransacao) {
		Transacao transacao = new Transacao("TX", 100.0, LocalDate.now(), tipoTransacao);
		assertTrue(transacao.validar());
	}
}
