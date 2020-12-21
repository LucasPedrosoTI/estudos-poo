package com.gft.exercicio_tres_game;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.gft.exercicio_tres_game.util.TestUtils;

import model.Mago;
import model.Personagem;
import utils.Utils;

@TestInstance(Lifecycle.PER_CLASS)
public class AppTest {

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeAll
	void closeMock() {
		TestUtils.closeStaticMock();
	}

	@BeforeEach
	public void setup() throws Exception {
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	public void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}
	
	@Test
	void mainDeveRodar() throws Exception {
		assertDoesNotThrow(() -> App.main(null));
	}

	@Test
	void deveGerarNumeroRandomicoMenorQue300() throws Exception {

		assertTrue(Utils.gerarNumeroRandomico() <= 300);
	}

	@Test
	void deveRetornarQtdDePersonagensInstanciados() throws Exception {

		Mago.builder().build();

		Personagem.getNumOfInstances();

		assertTrue(outContent.toString().contains("Existe(m)"));

	}
}
