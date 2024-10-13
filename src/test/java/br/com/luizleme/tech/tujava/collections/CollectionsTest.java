package br.com.luizleme.tech.tujava.collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

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

	@Test
	void deveValisarUsandoSet() {
		Set<String> cafes = new HashSet<>(List.of("Expresso", "Cappuccino", "Mocha", "Latte", "Americano", "Macchiato", "Filtrado"));
		Assertions.assertThat(cafes)
				.hasSize(7)
				.contains("Filtrado")
				.doesNotContain("Pingado")
				.containsOnly("Expresso", "Cappuccino", "Mocha", "Latte", "Americano", "Macchiato", "Filtrado");
	}
}
