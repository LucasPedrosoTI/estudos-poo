package main.java.com.gft.exercicioDois.model;

abstract public class Produto {
  private String nome;
  private double preco;
  private int qtd;

  public Produto() {
  }

  public Produto(String nome, double preco, int qtd) {
    this.nome = nome;
    this.preco = preco;
    this.qtd = qtd;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public double getPreco() {
    return this.preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public int getQtd() {
    return this.qtd;
  }

  public void setQtd(int qtd) {
    this.qtd = qtd;
  }

}