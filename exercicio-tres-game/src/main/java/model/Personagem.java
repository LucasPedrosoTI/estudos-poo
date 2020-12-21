package model;

public abstract class Personagem {
	private String nome;
	private int vida;
	private int mana;
	private float xp;
	private int inteligencia;
	private int forca;
	private int level;
	private static int counter;

	protected abstract void lvlUp();

	protected abstract double attack();

	{
		counter++;
	}

	protected Personagem() {
	}

	protected Personagem(String nome, int vida, int mana, float xp, int inteligencia, int forca, int level) {
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

	public int getInteligencia() {
		return this.inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
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
