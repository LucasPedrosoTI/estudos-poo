package model;

import java.util.List;

import utils.Utils;

public class Guerreiro extends Personagem {

  private List<String> habilidades;

  @Override
  public void lvlUp() {
    this.setLevel(this.getLevel() + 1);

    this.setForca(this.getForca() + 10);
    this.setVida(this.getVida() + 10);
    this.setMana(this.getMana() + 5);
    this.setInteligencia(this.getInteligencia() + 5);
  }

  @Override
  public void attack() {
    double dano = (this.getForca() * this.getLevel()) + Utils.gerarNumeroRandomico();
    System.out.println("O Guerreiro " + this.getNome() + " usa habilidade e infringe dano de " + dano);
  }

  public void aprenderHabilidade(String habilidade) {
    this.habilidades.add(habilidade);
  }

  public Guerreiro() {
  }

  public Guerreiro(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level,
      List<String> habilidades) {
    super(nome, vida, mana, xp, inteligencia, forca, level);
    this.habilidades = habilidades;
  }

  public List<String> getHabilidades() {
    return this.habilidades;
  }

  public void setHabilidades(List<String> habilidades) {
    this.habilidades = habilidades;
  }

  @Override
  public String toString() {
    super.toString();
    return "{" + " habilidades='" + getHabilidades() + "'" + "}";
  }

}
