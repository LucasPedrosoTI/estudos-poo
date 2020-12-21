package com.gft.tdd_loja_poo.model;

import java.util.List;

public class Loja {

	private String nome;
	private String cnpj;
	private List<Livro> livros;
	private List<VideoGame> videoGames;

	public Loja() {}

	public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.livros = livros;
		this.videoGames = videoGames;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public List<VideoGame> getVideoGames() {
		return videoGames;
	}

	public void setVideoGames(List<VideoGame> videoGames) {
		this.videoGames = videoGames;
	}

	public void adicionarLivro(Livro livro) {
		livros.add(livro);
	}

	public void adicionarVideoGame(VideoGame game) {
		videoGames.add(game);
	}

	public void listaLivros() {
		if (getLivros().isEmpty()) {
			System.out.print("A loja não tem livros no seu estoque.");
		} else {
			System.out.print(String.format("A loja %s possui estes livros para venda: %n", getNome()));

			getLivros().forEach(livro -> System.out
					.print(String.format("Titulo: %s, preço: %s, quantidade: %s em estoque. %n", livro.getNome(),
							livro.getPreco(), livro.getQtd())));
		}
	}

	public void listaVideoGames() {
		if (getVideoGames().isEmpty()) {
			System.out.print("A loja não tem video-games no seu estoque.");
		} else {
			System.out.print(String.format("A loja %s possui estes video-games para venda: %n", getNome()));

			getVideoGames().forEach(game -> System.out
					.print(String.format(
							"Video-game: %s, preço: %s, quantidade: %s em estoque. %n", game.getNome(),
							game.getPreco(), game.getQtd())));

		}
	}

	public double calculaPatrimonio() {
		
		double totalLivros = getLivros().stream().mapToDouble(livro -> livro.getPreco() * livro.getQtd()).sum();
		double totalGames = getVideoGames().stream().mapToDouble(game -> game.getPreco() * game.getQtd()).sum();
		
		return totalLivros + totalGames;
	}

}
