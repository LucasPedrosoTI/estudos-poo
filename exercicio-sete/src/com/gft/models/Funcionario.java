package com.gft.models;

public abstract class Funcionario {
  protected String nome;
  protected int idade;
  protected double salario;

  public double bonificacao() {
    return this.salario;
  }

  public Funcionario() {
  }

  public Funcionario(String nome, int idade, double salario) {
    this.nome = nome;
    this.idade = idade;
    this.salario = salario;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getIdade() {
    return this.idade;
  }

  public void setIdade(int idade) {
    this.idade = idade;
  }

  public double getSalario() {
    return this.salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", idade='" + getIdade() + "'" + ", salario='" + getSalario() + "'"
        + "}";
  }
}