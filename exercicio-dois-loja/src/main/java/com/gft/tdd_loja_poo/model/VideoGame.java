package com.gft.tdd_loja_poo.model;

public class VideoGame extends Produto {
	private String marca;
	private String modelo;
	private boolean isUsado;

	private VideoGame(Builder builder) {
		super(builder.nome, builder.preco, builder.qtd);
		this.marca = builder.marca;
		this.modelo = builder.modelo;
		this.isUsado = builder.isUsado;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isUsado() {
		return isUsado;
	}

	public void setUsado(boolean isUsado) {
		this.isUsado = isUsado;
	}

	@Override
	public double calculaImposto() {
		double preco = getPreco();

		return isUsado() ? preco * 0.25 : preco * 0.45;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String marca;
		private String modelo;
		private boolean isUsado;
		private String nome;
		private double preco;
		private int qtd;

		private Builder() {}

		public Builder withMarca(String marca) {
			this.marca = marca;
			return this;
		}

		public Builder withModelo(String modelo) {
			this.modelo = modelo;
			return this;
		}

		public Builder withIsUsado(boolean isUsado) {
			this.isUsado = isUsado;
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

		public VideoGame build() {
			return new VideoGame(this);
		}
	}

}
