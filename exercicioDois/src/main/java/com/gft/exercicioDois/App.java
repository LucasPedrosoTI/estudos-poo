package main.java.com.gft.exercicioDois;

import java.util.ArrayList;
import java.util.List;

import main.java.com.gft.exercicioDois.model.*;

public class App {
  public static void main(String[] args) {
    Livro l1 = new Livro("Harry Potter", 40, 50, "J. K. Rowling", "fantasia", 300);
    Livro l2 = new Livro("Senhor dos Anéis", 60, 30, "J. R. R. Tolkein", "fantasia", 500);
    Livro l3 = new Livro("Java POO", 20, 50, "GFT", "educativo", 500);

    VideoGame ps4 = new VideoGame("PS4", 1800, 100, "Sony", "Slim", false);
    VideoGame ps4Usado = new VideoGame("PS4", 1000, 7, "Sony", "Slim", true);
    VideoGame xbox = new VideoGame("XBOX", 1500, 500, "Microsoft", "One", false);

    List<Livro> livros = new ArrayList<Livro>();
    livros.add(l1);
    livros.add(l2);
    livros.add(l3);

    List<VideoGame> games = new ArrayList<VideoGame>();
    games.add(ps4);
    games.add(ps4Usado);
    games.add(xbox);

    Loja saraiva = new Loja("Saraiva", "12345678000123", livros, games);

    l2.calculaImposto();
    l3.calculaImposto();

    ps4.calculaImposto();
    ps4Usado.calculaImposto();

    saraiva.listarLivros();
    saraiva.listarVideoGames();

    saraiva.calculaPatrimonio();
  }
}
