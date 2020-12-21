package com.gft.exercicio_tres_game.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.exercicio_tres_game.util.TestUtils;

import model.Guerreiro;

public class GuerreiroTest {

	private Guerreiro guerreiro;

	@BeforeEach
	public void setup() throws Exception {
		guerreiro = Guerreiro.builder()
				.withNome("Ragnar")
				.withVida(0)
				.withMana(0)
				.withXp(0)
				.withInteligencia(0)
				.withForca(0)
				.withLevel(1)
				.withHabilidades(new ArrayList<>())
				.build();
	}

	@Test
	void deveUparSendoVidaEForcaEmDobro() throws Exception {

		guerreiro.lvlUp();

		assertEquals(2, guerreiro.getLevel());
		assertEquals(10, guerreiro.getForca());
		assertEquals(10, guerreiro.getVida());
		assertEquals(5, guerreiro.getMana());
		assertEquals(5, guerreiro.getInteligencia());
	}

	@Test
	void deveAtacar() throws Exception {
		TestUtils.mockGerarNumeroRandomico();

		assertEquals(100.0, guerreiro.attack());
	}

	@Test
	void deveAprenderMagia() throws Exception {
		guerreiro.aprenderHabilidade("Perfurar");

		assertEquals(1, guerreiro.getHabilidades().size());
	}

}
