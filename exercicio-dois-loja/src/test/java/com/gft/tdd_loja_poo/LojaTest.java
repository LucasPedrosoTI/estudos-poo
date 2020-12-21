package com.gft.tdd_loja_poo;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.gft.tdd_loja_poo.model.Livro;
import com.gft.tdd_loja_poo.model.Loja;
import com.gft.tdd_loja_poo.model.VideoGame;

class LojaTest {

	private Loja loja;
	private Livro livro;
	private VideoGame game;

	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;

	@BeforeEach
	void setup() {
		loja = new Loja("Saraiva", "12.345.678/0001-99", new ArrayList<>(), new ArrayList<>());
		
		livro = Livro.builder()
					.withPreco(100.0)
					.withAutor("Robert Cecil Martin")
					.withNome("Código Limpo")
					.withQtd(25)
					.withQtdPag(457)
					.build();
		
		game = VideoGame.builder()
					.withPreco(100.0)
					.withIsUsado(false)
					.withMarca("Playstation")
					.withModelo("PS5")
					.withNome("Play 5")
					.withQtd(50)
					.build();
		
		System.setOut(new PrintStream(outContent));
		System.setErr(new PrintStream(errContent));
	}

	@AfterEach
	void restoreStreams() {
		System.setOut(originalOut);
		System.setErr(originalErr);
	}

	@Test
	void deveDizerNaoHaLivrosEmEstoqueParaListaVazia() throws Exception {
		loja.listaLivros();

		assertEquals("A loja não tem livros no seu estoque.", outContent.toString());
	}

	@Test
	void deveListarOsLivros() throws Exception {
		
		loja.adicionarLivro(livro);
		loja.listaLivros();

		assertEquals(String.format("A loja %s possui estes livros para venda: %n"
				+ "Titulo: %s, preço: %s, quantidade: %s em estoque. %n", 
					loja.getNome(), 
					livro.getNome(),
					livro.getPreco(), 
					livro.getQtd()),
				outContent.toString());
	}
	
	@Test
	void deveDizerNaoHaVideoGamesEmEstoqueParaListaVazia() throws Exception {
		loja.listaVideoGames();

		assertEquals("A loja não tem video-games no seu estoque.", outContent.toString());
	}
	
	@Test
	void deveListarOsVideoGames() throws Exception {
		
		loja.adicionarVideoGame(game);
		loja.listaVideoGames();

		assertEquals(String.format("A loja %s possui estes video-games para venda: %n"
				+ "Video-game: %s, preço: %s, quantidade: %s em estoque. %n", 
					loja.getNome(), 
					game.getNome(),
					game.getPreco(), 
					game.getQtd()),
				outContent.toString());
	}
	
	@Test
	void deveRetornarOPatrimonio() throws Exception {
		loja.adicionarLivro(livro);
		loja.adicionarVideoGame(game);
		
		assertEquals(7500.0, loja.calculaPatrimonio());		
	}
	
	
}
