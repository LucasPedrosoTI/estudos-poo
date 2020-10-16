package com.gft.models;

public class Gerente extends Funcionario {

  @Override
  public double bonificacao() {
    return this.salario + 10000;
  }

  public Gerente() {
  }

  public Gerente(String nome, int idade, double salario) {
    super(nome, idade, salario);
  }

}
