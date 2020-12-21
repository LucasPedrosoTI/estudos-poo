package model;

import java.util.ArrayList;
import java.util.List;

import utils.Utils;

public class Mago extends Personagem {

	private List<String> magias;

	private Mago(Builder builder) {
		super(builder.nome,
				builder.vida,
				builder.mana,
				builder.xp,
				builder.inteligencia,
				builder.forca,
				builder.level);

		this.magias = builder.magias;
	}

	@Override
	public void lvlUp() {
		this.setLevel(getLevel() + 1);
		this.setForca(getForca() + 5);
		this.setVida(getVida() + 5);
		this.setMana(getMana() + 10);
		this.setInteligencia(getInteligencia() + 10);
	}

	@Override
	public double attack() {
		return (this.getInteligencia() * this.getLevel()) + Utils.gerarNumeroRandomico();
	}

	public void aprenderMagia(String magia) {
		magias.add(magia);
	}

	public List<String> getMagias() {
		return this.magias;
	}

	@Override
	public String toString() {
		super.toString();
		return "{" + " magias='" + getMagias() + "'" + "}";
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private List<String> magias = new ArrayList<>();
		private String nome;
		private int vida;
		private int mana;
		private float xp;
		private int inteligencia;
		private int forca;
		private int level;

		private Builder() {}

		public Builder withMagias(List<String> magias) {
			this.magias = magias;
			return this;
		}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withVida(int vida) {
			this.vida = vida;
			return this;
		}

		public Builder withMana(int mana) {
			this.mana = mana;
			return this;
		}

		public Builder withXp(float xp) {
			this.xp = xp;
			return this;
		}

		public Builder withInteligencia(int inteligencia) {
			this.inteligencia = inteligencia;
			return this;
		}

		public Builder withForca(int forca) {
			this.forca = forca;
			return this;
		}

		public Builder withLevel(int level) {
			this.level = level;
			return this;
		}

		public Mago build() {
			return new Mago(this);
		}
	}

}
