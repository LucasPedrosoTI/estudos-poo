package com.gft.tdd_loja_poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.tdd_loja_poo.model.Livro;

public class LivroTest {

	private Livro livro;

	@BeforeEach
	void setup() {
		livro = Livro.builder()
				.withPreco(100.0)
				.withAutor("Robert Cecil Martin")
				.withNome("Código Limpo")
				.withQtd(25)
				.withQtdPag(457)
				.build();
	}

	@Test
	void deveRetornarImpostoZeroParaTemaEducativo() throws Exception {
		livro.setTema("educativo");

		assertEquals(0.0, livro.calculaImposto(), 0.0001);
	}

	@Test
	void deveRetornarImpostoDe10PorCento() throws Exception {
		livro.setTema("ficção");

		assertEquals(10.0, livro.calculaImposto(), 0.0001);
	}

}
