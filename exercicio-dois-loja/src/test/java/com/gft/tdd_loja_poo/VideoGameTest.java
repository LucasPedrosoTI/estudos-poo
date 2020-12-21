package com.gft.tdd_loja_poo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.tdd_loja_poo.model.VideoGame;

public class VideoGameTest {
	
	private VideoGame game;
	
	@BeforeEach
	void setup() {
		game = VideoGame.builder()
				.withPreco(100.0)
				.withIsUsado(false)
				.withMarca("Playstation")
				.withModelo("PS5")
				.withNome("Play 5")
				.withQtd(50)
				.build();
	}
	
	@Test
	void deveRetornar25porCentoDeImpostoParaGameUsado() throws Exception {
		game.setUsado(true);
		
		assertEquals(25.0, game.calculaImposto());
	}
	
	@Test
	void deveRetornar45porCentoDeImpostoParaGameNovo() throws Exception {
		assertEquals(45.0, game.calculaImposto());		
	}	
	
}







