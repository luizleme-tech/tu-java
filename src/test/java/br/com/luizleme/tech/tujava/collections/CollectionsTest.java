package br.com.luizleme.tech.tujava.collections;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.*;

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
	void deveValidarUsandoSet() {
		Set<String> cafes = new HashSet<>(List.of("Expresso", "Cappuccino", "Mocha", "Latte", "Americano", "Macchiato", "Filtrado"));
		Assertions.assertThat(cafes)
				.hasSize(7)
				.contains("Filtrado")
				.doesNotContain("Pingado")
				.containsOnly("Expresso", "Cappuccino", "Mocha", "Latte", "Americano", "Macchiato", "Filtrado");
	}

	@Test
	void deveValidarUsandoMap() {
		Map<String, Integer> idades = new HashMap<>();
		idades.put("Madruga", 45);
		idades.put("Chaves", 8);

		Assertions.assertThat(idades)
				.hasSize(2)
				.containsKeys("Madruga", "Chaves")
				.containsValues(45,8)
				.doesNotContainEntry("Seu Barriga", 60);
	}
}
