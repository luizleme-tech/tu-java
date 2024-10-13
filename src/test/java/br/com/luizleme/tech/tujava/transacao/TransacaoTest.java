package br.com.luizleme.tech.tujava.transacao;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.converter.ConvertWith;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.Convert;

import java.time.LocalDate;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class TransacaoTest {

	@ParameterizedTest
	@CsvSource({
			"'tx1', 100.0, '2024-10-12', 'DEBITO', true",
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
		var transacao = new Transacao("TX", 100.0, LocalDate.now(), tipoTransacao);
		assertTrue(transacao.validar());
	}

	@ParameterizedTest
	@MethodSource("forneceDadosParaValidarTransacao")
	void deveValidarTransacaoComMethodSource(String id, double valor, LocalDate data, TipoTransacao tipo, boolean resultadoEsperado){
		var transacao = new Transacao(id, valor, data, tipo);
		assertEquals(resultadoEsperado, transacao.validar());
	}

	@ParameterizedTest
	@CsvSource({
			"'Jose,45',45,",
			"'Ana,65',65"
	})
	void deveValidarConstrucaoObjetoClienteEvaliarIdade(@ConvertWith(ClienteConverter.class) Cliente cliente, int idadeEsperada) {
		assertEquals(idadeEsperada, cliente.getIdade());
	}

	static Stream<Arguments> forneceDadosParaValidarTransacao() {
		return Stream.of(
				Arguments.of("tx1", 100.0, LocalDate.of(2024,10,12), TipoTransacao.DEBITO, true),
				Arguments.of("tx2", -50.0, LocalDate.of(2024,10,13), TipoTransacao.CREDITO, false),
				Arguments.of("tx3", 200.0, LocalDate.of(2024,11,12), TipoTransacao.TRANSFERENCIA, false),
				Arguments.of("tx4", 150.0, LocalDate.of(2024,12,12), null, false)
		);
	}
}
