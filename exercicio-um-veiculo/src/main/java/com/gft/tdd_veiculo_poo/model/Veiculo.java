package com.gft.tdd_veiculo_poo.model;

import java.util.Objects;

import com.gft.tdd_veiculo_poo.exception.AcaoInvalidaException;
import com.gft.tdd_veiculo_poo.exception.TanqueCheioException;


public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado = false;
	private int litrosCombustivel = 0;
	private int velocidade = 0;
	private Double preco;

	private Veiculo(Builder builder) {
		this.marca = builder.marca;
		this.modelo = builder.modelo;
		this.placa = builder.placa;
		this.cor = builder.cor;
		this.km = builder.km;
		this.isLigado = builder.isLigado;
		this.litrosCombustivel = builder.litrosCombustivel;
		this.velocidade = builder.velocidade;
		this.preco = builder.preco;
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

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}
	
	public boolean isDesligado() {
		return !isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String marca;
		private String modelo;
		private String placa;
		private String cor;
		private float km;
		private boolean isLigado;
		private int litrosCombustivel;
		private int velocidade;
		private Double preco;

		private Builder() {}

		public Builder withMarca(String marca) {
			this.marca = marca;
			return this;
		}

		public Builder withModelo(String modelo) {
			this.modelo = modelo;
			return this;
		}

		public Builder withPlaca(String placa) {
			this.placa = placa;
			return this;
		}

		public Builder withCor(String cor) {
			this.cor = cor;
			return this;
		}

		public Builder withKm(float km) {
			this.km = km;
			return this;
		}

		public Builder withIsLigado(boolean isLigado) {
			this.isLigado = isLigado;
			return this;
		}

		public Builder withLitrosCombustivel(int litrosCombustivel) {
			this.litrosCombustivel = litrosCombustivel;
			return this;
		}

		public Builder withVelocidade(int velocidade) {
			this.velocidade = velocidade;
			return this;
		}

		public Builder withPreco(Double preco) {
			this.preco = preco;
			return this;
		}

		public Veiculo build() {
			return new Veiculo(this);
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(cor, isLigado, km, litrosCombustivel, marca, modelo, placa, preco, velocidade);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Veiculo))
			return false;
		Veiculo other = (Veiculo) obj;
		return Objects.equals(cor, other.cor) && isLigado == other.isLigado
				&& Float.floatToIntBits(km) == Float.floatToIntBits(other.km)
				&& litrosCombustivel == other.litrosCombustivel && Objects.equals(marca, other.marca)
				&& Objects.equals(modelo, other.modelo) && Objects.equals(placa, other.placa)
				&& Objects.equals(preco, other.preco) && velocidade == other.velocidade;
	}

	@Override
	public String toString() {
		StringBuilder builder2 = new StringBuilder();
		builder2.append("Veiculo [marca=").append(marca).append(", modelo=").append(modelo).append(", placa=")
				.append(placa).append(", cor=").append(cor).append(", km=").append(km).append(", isLigado=")
				.append(isLigado).append(", litrosCombustivel=").append(litrosCombustivel).append(", velocidade=")
				.append(velocidade).append(", preco=").append(preco).append("]");
		return builder2.toString();
	}

	public void acelerar() {
		this.velocidade += 20;
	}

	public void abastecer(int combustivel) {
		
		if (this.litrosCombustivel + combustivel > 60) {
			throw new TanqueCheioException();
		}
		
		this.litrosCombustivel += combustivel;
	}

	public void frear() {
		if (this.velocidade - 20 < 0) {
			throw new AcaoInvalidaException("Veículo está parado");
		}
		
		this.velocidade -= 20;
	}

	public void pintar(String cor) {
		this.cor = cor;
	}

	public void ligar() {
		if (isLigado) {
			throw new AcaoInvalidaException("Veículo já está ligado");
		}
		
		setLigado(true);
	}

	public void desligar() {

		if (isDesligado() || this.velocidade > 0) {
			throw new AcaoInvalidaException("Veiculo já desligado ou em movimento");
		}
		
		setLigado(false);
		
	}

}
