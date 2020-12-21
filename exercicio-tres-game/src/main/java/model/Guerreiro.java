package model;

import java.util.Collections;
import java.util.List;

import utils.Utils;

public class Guerreiro extends Personagem {

	private List<String> habilidades;

	private Guerreiro(Builder builder) {
		super(builder.nome,
				builder.vida,
				builder.mana,
				builder.xp,
				builder.inteligencia,
				builder.forca,
				builder.level);
		this.habilidades = builder.habilidades;
	}

	@Override
	public void lvlUp() {
		setLevel(this.getLevel() + 1);
		setForca(this.getForca() + 10);
		setVida(this.getVida() + 10);
		setMana(this.getMana() + 5);
		setInteligencia(this.getInteligencia() + 5);
	}

	@Override
	public double attack() {
		return (this.getForca() * this.getLevel()) + Utils.gerarNumeroRandomico();
	}

	public void aprenderHabilidade(String habilidade) {
		this.habilidades.add(habilidade);
	}


	public List<String> getHabilidades() {
		return this.habilidades;
	}

	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}

	@Override
	public String toString() {
		super.toString();
		return "{" + " habilidades='" + getHabilidades() + "'" + "}";
	}

	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private List<String> habilidades = Collections.emptyList();
		private String nome;
		private int vida;
		private int mana;
		private float xp;
		private int inteligencia;
		private int forca;
		private int level;

		private Builder() {}

		public Builder withHabilidades(List<String> habilidades) {
			this.habilidades = habilidades;
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

		public Guerreiro build() {
			return new Guerreiro(this);
		}
	}

}
