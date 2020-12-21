package com.gft.models;

public class Vendedor extends Funcionario {

  @Override
  public double bonificacao() {
    return this.salario + 3000;
  }

  public Vendedor() {
  }

  public Vendedor(String nome, int idade, double salario) {
    super(nome, idade, salario);
  }
}
