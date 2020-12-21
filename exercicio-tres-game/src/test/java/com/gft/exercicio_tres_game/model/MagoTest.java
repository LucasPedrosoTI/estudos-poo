package com.gft.exercicio_tres_game.model;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.exercicio_tres_game.util.TestUtils;

import model.Mago;

class MagoTest {

	private Mago mago;

	@BeforeEach
	public void setup() throws Exception {
		mago = Mago.builder()
				.withNome("Harry Potter")
				.withVida(0)
				.withMana(0)
				.withXp(0)
				.withInteligencia(0)
				.withForca(0)
				.withLevel(1)
				.withMagias(new ArrayList<>())
				.build();
	}

	@Test
	void deveUparSendoManaEInteligenciaoDobro() throws Exception {

		mago.lvlUp();

		assertEquals(2, mago.getLevel());
		assertEquals(5, mago.getForca());
		assertEquals(5, mago.getVida());
		assertEquals(10, mago.getMana());
		assertEquals(10, mago.getInteligencia());

	}

	@Test
	void deveAtacar() throws Exception {
		TestUtils.mockGerarNumeroRandomico();

		assertEquals(100.0, mago.attack());
	}

	@Test
	void deveAprenderMagia() throws Exception {
		mago.aprenderMagia("Abaffiato");

		assertEquals(1, mago.getMagias().size());
	}
}
