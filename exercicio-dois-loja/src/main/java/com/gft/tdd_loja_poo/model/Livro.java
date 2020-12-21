package com.gft.tdd_loja_poo.model;

public class Livro extends Produto {

	private String autor;
	private String tema;
	private int qtdPag;

	private Livro(Builder builder) {
		super(builder.nome, builder.preco, builder.qtd);
		this.autor = builder.autor;
		this.tema = builder.tema;
		this.qtdPag = builder.qtdPag;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTema() {
		return tema;
	}

	public void setTema(String tema) {
		this.tema = tema;
	}

	public int getQtdPag() {
		return qtdPag;
	}

	public void setQtdPag(int qtdPag) {
		this.qtdPag = qtdPag;
	}

	@Override
	public double calculaImposto() {
		return getTema().equalsIgnoreCase("educativo") ? 0.0 : getPreco() * 0.1;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String autor;
		private String tema;
		private int qtdPag;
		private String nome;
		private double preco;
		private int qtd;

		private Builder() {}

		public Builder withAutor(String autor) {
			this.autor = autor;
			return this;
		}

		public Builder withTema(String tema) {
			this.tema = tema;
			return this;
		}

		public Builder withQtdPag(int qtdPag) {
			this.qtdPag = qtdPag;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withPreco(double preco) {
			this.preco = preco;
			return this;
		}

		public Builder withQtd(int qtd) {
			this.qtd = qtd;
			return this;
		}

		public Livro build() {
			return new Livro(this);
		}
	}

}
