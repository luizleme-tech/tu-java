package br.com.luizleme.tech.tujava.mock;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.*;

public class TrabalhandoComMocskTest {
	@Test
	void deveTestarMockComOsValoresDinamicamentePassadosComParametro() {
		List<String> listaMockada = mock(List.class);
		when(listaMockada.get(anyInt())).thenAnswer(invocation -> {
			int index = invocation.getArgument(0);
			return "item na posicao " + index;
		});
		Assertions.assertThat(listaMockada.get(0)).isEqualTo("item na posicao 0");
		Assertions.assertThat(listaMockada.get(1)).isEqualTo("item na posicao 1");
	}

	@Test
	void deveRetornarRespostasDiferentesEmChamadasSubsequenstes() {
		List<String> listaMockada = mock(List.class);
		when(listaMockada.size()).thenReturn(1,2,3);
		Assertions.assertThat(listaMockada.size()).isEqualTo(1);
		Assertions.assertThat(listaMockada.size()).isEqualTo(2);
		Assertions.assertThat(listaMockada.size()).isEqualTo(3);
		Assertions.assertThat(listaMockada.size()).isEqualTo(3);
	}

	@Test
	void deveCriarUmStubDeException() {
		List<String> listaMockada = mock(List.class);
		when(listaMockada.get(anyInt())).thenThrow(new RuntimeException("Erro ao acessar lista"));

		Assertions.assertThatExceptionOfType(RuntimeException.class)
			.isThrownBy(() -> listaMockada.get(0))
			.withMessage("Erro ao acessar lista");
	}

	@Test
	void deveRealizarUmaVerificacaoSimple() {
		List<String> listaMockada = mock(List.class);
		listaMockada.add("item1");
		listaMockada.clear();

		verify(listaMockada).add("item1");
		verify(listaMockada).clear();
	}

	@Test
	void deveVerificarNumeroDeIteracoesDoMetodo() {
		List<String> listaMockada = mock(List.class);
		listaMockada.add("1");
		listaMockada.add("1");
		listaMockada.add("2");
		listaMockada.add("2");
		listaMockada.add("3");

		listaMockada.clear();

		verify(listaMockada, times(5)).add(anyString());
		verify(listaMockada, never()).add("4");
		verify(listaMockada, atLeastOnce()).clear();
	}

	@Test
	void deveCriarSpy() {
		List<String> spyList = spy(new ArrayList<>());

		spyList.add("1");
		spyList.add("2");

		verify(spyList).add("1");
		verify(spyList).add("2");

		Assertions.assertThat(spyList.size()).isEqualTo(2);
	}

	@Test
	void deveRetornarDiferentesValoresEmChamadasSubsequentes() {
		List<String> listaMockada = mock(List.class);
		when(listaMockada.get(0)).thenReturn("primeira chamada").thenReturn("segunda chamada");

		Assertions.assertThat(listaMockada.get(0)).isEqualTo("primeira chamada");
		Assertions.assertThat(listaMockada.get(0)).isEqualTo("segunda chamada");
	}
}
