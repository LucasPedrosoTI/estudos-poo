package com.gft.models;

public class Supervisor extends Funcionario {

  @Override
  public double bonificacao() {
    return this.salario + 5000;
  }

  public Supervisor() {
  }

  public Supervisor(String nome, int idade, double salario) {
    super(nome, idade, salario);
  }

}
