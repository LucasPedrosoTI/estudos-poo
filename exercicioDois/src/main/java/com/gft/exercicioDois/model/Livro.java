package main.java.com.gft.exercicioDois.model;

import main.java.com.gft.exercicioDois.interfaces.Imposto;

public class Livro extends Produto implements Imposto {
  private String autor;
  private String tema;
  private int qtdPag;

  public Livro() {
  }

  public Livro(String nome, double preco, int qtd, String autor, String tema, int qtdPag) {
    super(nome, preco, qtd);
    this.autor = autor;
    this.tema = tema;
    this.qtdPag = qtdPag;
  }

  public String getAutor() {
    return this.autor;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public String getTema() {
    return this.tema;
  }

  public void setTema(String tema) {
    this.tema = tema;
  }

  public int getQtdPag() {
    return this.qtdPag;
  }

  public void setQtdPag(int qtdPag) {
    this.qtdPag = qtdPag;
  }

  @Override
  public String toString() {
    return "{" + " autor='" + getAutor() + "'" + ", tema='" + getTema() + "'" + ", qtdPag='" + getQtdPag() + "'" + "}";
  }

  @Override
  public void calculaImposto() {
    if (this.tema.equalsIgnoreCase("educativo")) {
      System.out.println("Livro educativo nao tem imposto: " + this.getNome());
    } else {
      System.out.println("R$ " + this.getPreco() * 10 + " de impostos sobre o livro " + this.getNome());
    }
  }

}
