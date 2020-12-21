package com.gft.model;


public class Gerente extends Funcionario {

	private Gerente(Builder builder) {
		this.nome = builder.nome;
		this.idade = builder.idade;
		this.salario = builder.salario;
	}

	@Override
	public double bonificacao() {
		return this.salario + 10000;
	}


	public static Builder builder() {
		return new Builder();
	}

	public static final class Builder {
		private String nome;
		private int idade;
		private double salario;

		private Builder() {}

		public Builder withNome(String nome) {
			this.nome = nome;
			return this;
		}

		public Builder withIdade(int idade) {
			this.idade = idade;
			return this;
		}

		public Builder withSalario(double salario) {
			this.salario = salario;
			return this;
		}

		public Gerente build() {
			return new Gerente(this);
		}
	}

}
