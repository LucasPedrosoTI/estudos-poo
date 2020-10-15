package main.java.com.gft.exercicioDois.model;

import main.java.com.gft.exercicioDois.interfaces.Imposto;

public class VideoGame extends Produto implements Imposto {
  private String marca;
  private String modelo;
  private boolean isUsado;
  private String espaco = " ";

  public VideoGame() {
  }

  public VideoGame(String nome, double preco, int qtd, String marca, String modelo, boolean isUsado) {
    this.nome = nome;
    this.preco = preco;
    this.qtd = qtd;
    this.marca = marca;
    this.modelo = modelo;
    this.isUsado = isUsado;
  }

  public String getMarca() {
    return this.marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  public String getModelo() {
    return this.modelo;
  }

  public void setModelo(String modelo) {
    this.modelo = modelo;
  }

  public boolean isIsUsado() {
    return this.isUsado;
  }

  public boolean getIsUsado() {
    return this.isUsado;
  }

  public void setIsUsado(boolean isUsado) {
    this.isUsado = isUsado;
  }

  @Override
  public String toString() {
    return "{" + " marca='" + getMarca() + "'" + ", modelo='" + getModelo() + "'" + ", isUsado='" + isIsUsado() + "'"
        + "}";
  }

  @Override
  public void calculaImposto() {
    if (isUsado) {
      System.out.println("Imposto " + this.nome + espaco + this.modelo + espaco + "usado, R$ " + this.preco * 0.25);
    } else {
      System.out.println("Imposto " + this.nome + espaco + this.modelo + espaco + " R$ " + this.preco * 0.45);
    }
  }

}
