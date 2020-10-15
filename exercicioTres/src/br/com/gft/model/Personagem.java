package model;

public abstract class Personagem {
  protected String nome;
  protected int vida;
  protected int mana;
  protected float xp;
  protected int inteligencia;
  protected int forca;
  protected int level;
  private static int counter;

  abstract protected void lvlUp();

  abstract protected void attack();

  {
    counter++;
  }

  public Personagem() {
  }

  public Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
    this.nome = nome;
    this.vida = vida;
    this.mana = mana;
    this.xp = xp;
    this.inteligencia = inteligencia;
    this.forca = forca;
    this.level = level;
  }

  public static void getNumOfInstances() {
    System.out.println("Existe(m) " + counter + " personagem(s)");
  }

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getVida() {
    return this.vida;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public int getMana() {
    return this.mana;
  }

  public void setMana(int mana) {
    this.mana = mana;
  }

  public float getXp() {
    return this.xp;
  }

  public void setXp(float xp) {
    this.xp = xp;
  }

  public int getForca() {
    return this.forca;
  }

  public void setForca(int forca) {
    this.forca = forca;
  }

  public int getLevel() {
    return this.level;
  }

  public void setLevel(int level) {
    this.level = level;
  }

  @Override
  public String toString() {
    return "{" + " nome='" + getNome() + "'" + ", vida='" + getVida() + "'" + ", mana='" + getMana() + "'" + ", xp='"
        + getXp() + "'" + ", forca='" + getForca() + "'" + ", level='" + getLevel() + "'" + "}";
  }

}
