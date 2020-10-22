package models;

import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
import static java.util.Comparator.*;

public class Pessoa {
  private String nome;
  private int idade;

  public static void pessoaMaisVelha(List<Pessoa> pessoas) throws Exception {

    if (pessoas.size() <= 0)
      throw new Exception("Não há pessoas na lista");

    Comparator<Pessoa> comparator = comparing(Pessoa::getIdade, reverseOrder());
    Pessoa pessoaMaisVelha = pessoas.stream().sorted(comparator).collect(Collectors.toList()).get(0);

    // for (Pessoa pessoa : pessoas) {
    // if (pessoa.getIdade() > pessoaMaisVelha.getIdade()) {
    // pessoaMaisVelha = pessoa;
    // }
    // }

    System.out.println("A pessoa mais velha da lista é o " + pessoaMaisVelha.getNome() + " com "
        + pessoaMaisVelha.getIdade() + " anos");
  }

  public static List<Pessoa> removerMenores(List<Pessoa> pessoas) {
    return pessoas.stream().filter(pessoa -> pessoa.idade > 18).collect(Collectors.toList());
  }

  public Pessoa() {
  }

  public Pessoa(String nome, int idade) {
    this.nome = nome;
    this.idade = idade;
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

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", idade='" + getIdade() + "'" + "}";
  }

}
