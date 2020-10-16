import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import models.Pessoa;

public class Main {

  public static void main(String[] args) throws Exception {
    List<Pessoa> pessoas = new ArrayList<Pessoa>();

    Pessoa joao = new Pessoa("João", 15);
    Pessoa leandro = new Pessoa("Leandro", 21);
    Pessoa paulo = new Pessoa("Paulo", 17);
    Pessoa jessica = new Pessoa("Jessica", 18);

    pessoas.add(joao);
    pessoas.add(leandro);
    pessoas.add(jessica);
    pessoas.add(paulo);

    Pessoa.pessoaMaisVelha(pessoas);

    System.out.println("Qtd pessoas: " + pessoas.size());

    pessoas = pessoas.stream().filter(pessoa -> pessoa.getIdade() >= 18).collect(Collectors.toList());

    System.out.println("Qtd maiores: " + pessoas.size());

    for (Pessoa pessoa : pessoas) {
      if (pessoa.getNome().equals("Jessica")) {
        System.out.println("Jessica encontrada, idade: " + pessoa.getIdade() + " anos");
        break;
      }

    }

  }

}