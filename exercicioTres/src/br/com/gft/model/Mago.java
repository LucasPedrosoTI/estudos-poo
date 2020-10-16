package model;

import java.util.List;

import utils.Utils;

public class Mago extends Personagem {

  private List<String> magias;

  @Override
  public void lvlUp() {
    this.setLevel(this.getLevel() + 1);
    this.setForca(this.getForca() + 5);
    this.setVida(this.getVida() + 5);
    this.setMana(this.getMana() + 10);
    this.setInteligencia(this.getInteligencia() + 10);
  }

  @Override
  public void attack() {
    double dano = (this.getInteligencia() * this.getLevel()) + Utils.gerarNumeroRandomico();
    System.out.println("O Mago " + this.getNome() + " solta magia e infringe dano de " + dano);
  }

  public void aprenderMagia(String magia) {
    this.magias.add(magia);
  }

  public Mago() {
  }

  public Mago(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level, List<String> magias) {
    super(nome, vida, mana, xp, inteligencia, forca, level);
    this.magias = magias;
  }

  public List<String> getMagias() {
    return this.magias;
  }

  public void setMagias(List<String> magias) {
    this.magias = magias;
  }

  @Override
  public String toString() {
    super.toString();
    return "{" + " magias='" + getMagias() + "'" + "}";
  }

}
