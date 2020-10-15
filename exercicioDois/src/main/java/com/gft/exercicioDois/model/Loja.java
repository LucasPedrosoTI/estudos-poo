package main.java.com.gft.exercicioDois.model;

import java.util.List;

public class Loja {
  private String nome;
  private String cnpj;
  private List<Livro> livros;
  private List<VideoGame> videoGames;

  public void listarLivros() {
    System.out.println("----------------------------------------");
    if (this.livros.size() <= 0) {
      System.out.println("A loja não tem livros no seu estoque");
    } else {
      System.out.println("A loja " + this.nome + " possui estes livros para venda:");
      for (Livro livro : livros) {
        System.out.println("Titulo: " + livro.getNome() + ", preço: " + livro.getPreco() + ", quantidade: "
            + livro.getQtd() + " em estoque.");
      }
    }
  }

  public void listarVideoGames() {
    System.out.println("----------------------------------------");
    if (this.videoGames.size() <= 0) {
      System.out.println("A loja não tem video-games no seu estoque");
    } else {
      System.out.println("A loja " + this.nome + " possui estes video-games para venda:");
      for (VideoGame videogame : videoGames) {
        System.out.println("Titulo: " + videogame.getNome() + ", preço: " + videogame.getPreco() + ", quantidade: "
            + videogame.getQtd() + " em estoque.");
      }
    }
  }

  public void calculaPatrimonio() {
    double totalLivros = 0;
    double totalVideoGames = 0;
    double patrimonio = 0;

    for (Livro livro : this.livros) {
      totalLivros += (livro.getPreco() * livro.getQtd());
    }

    for (VideoGame videoGame : this.videoGames) {
      totalVideoGames += (videoGame.getPreco() * videoGame.getQtd());
    }

    patrimonio = totalLivros + totalVideoGames;

    System.out.println("----------------------------------------");
    System.out.println("O patrimônio da loja " + this.nome + " é de R$ " + patrimonio);
  }

  public Loja() {
  }

  public Loja(String nome, String cnpj, List<Livro> livros, List<VideoGame> videoGames) {
    this.nome = nome;
    this.cnpj = cnpj;
    this.livros = livros;
    this.videoGames = videoGames;
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getCnpj() {
    return this.cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public List<Livro> getLivros() {
    return this.livros;
  }

  public void setLivros(List<Livro> livros) {
    this.livros = livros;
  }

  public List<VideoGame> getVideoGames() {
    return this.videoGames;
  }

  public void setVideoGames(List<VideoGame> videoGames) {
    this.videoGames = videoGames;
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", cnpj='" + getCnpj() + "'" + ", livros='" + getLivros() + "'"
        + ", videoGames='" + getVideoGames() + "'" + "}";
  }

}
