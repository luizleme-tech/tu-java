package br.com.luizleme.tech.tujava.exemplo;

import br.com.luizleme.tech.tujava.transacao.Cliente;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class ExemplosComAssertJ {

	@Test
	void deveValidarUmNomeComAssertJ() {
		String nome = "Java";
		Assertions.assertThat(nome).isEqualTo("Java").startsWith("J").endsWith("a").contains("av");
	}

	@Test
	void deveValidarUmClienteComAssertJ() {
		var cliente = new Cliente("Clotilde", 50);
		Assertions.assertThat(cliente)
				.isNotNull()
				.isInstanceOf(Cliente.class);
	}
}
