package com.gft.exercicioUm.Veiculo;

public class Veiculo {

	private String marca;
	private String modelo;
	private String placa;
	private String cor;
	private float km;
	private boolean isLigado = false;
	private int litrosCombustivel;
	private int velocidade;
	private Double preco;

	public void acelerar() {
		this.velocidade += 20;
	}

	public void abastecer(int combustivel) throws Exception {
		if (this.litrosCombustivel + combustivel > 60) {
			throw new Exception("A capacidade máxima do tanque é 60 litros. Não é possível abastecer.");
		}

		this.litrosCombustivel += combustivel;
	}

	public void frear() throws Exception {
		if (this.velocidade <= 0) {
			throw new Exception("Não foi possível frear pois o veículo já está parado");
		}

		this.velocidade -= 20;
	}

	public void pintar(String cor) {
		this.cor = cor;
	}

	public void ligar() throws Exception {
		if (isLigado) {
			throw new Exception("Veículo já está ligado");
		}

		this.isLigado = true;
	}

	public void desligar() throws Exception {
		if (!isLigado) {
			throw new Exception("Veículo já está desligado");
		}

		if (this.velocidade > 0) {
			throw new Exception("Não é possível desligar veículo com velocidade maior que 0");
		}

		this.isLigado = false;
	}

	public Veiculo() {
		super();
	}

	public Veiculo(String marca, String modelo, String placa, String cor, float km, boolean isLigado,
			int litrosCombustivel, int velocidade, Double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.placa = placa;
		this.cor = cor;
		this.km = km;
		this.isLigado = isLigado;
		this.litrosCombustivel = litrosCombustivel;
		this.velocidade = velocidade;
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public float getKm() {
		return km;
	}

	public void setKm(float km) {
		this.km = km;
	}

	public boolean isLigado() {
		return isLigado;
	}

	public void setLigado(boolean isLigado) {
		this.isLigado = isLigado;
	}

	public int getLitrosCombustivel() {
		return litrosCombustivel;
	}

	public void setLitrosCombustivel(int litrosCombustivel) {
		this.litrosCombustivel = litrosCombustivel;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

}
