package br.com.luizleme.tech.tujava.collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.List;

public class CollectionsTest {
	@Test
	void deveValidarUsandoList() {
		List<String> nomes = List.of("Maria", "Joana", "Augusta");
		Assertions.assertThat(nomes)
				.hasSize(3)
				.contains("Joana")
				.containsExactly("Maria", "Joana", "Augusta")
				.doesNotContain("Marta")
				.containsSequence("Joana", "Augusta");
	}
}
