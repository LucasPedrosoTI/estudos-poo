package com.gft.exercicioUm;

import com.gft.exercicioUm.Veiculo.Veiculo;

public class App {

    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo();
        veiculo.setCor("Preto");

        veiculo.acelerar();
        veiculo.acelerar();

        System.out.println("Acelerou para " + veiculo.getVelocidade());

        veiculo.abastecer(30);

        System.out.println("Tanque: " + veiculo.getLitrosCombustivel());

        veiculo.abastecer(30);

        System.out.println("Tanque: " + veiculo.getLitrosCombustivel());

        veiculo.frear();

        System.out.println("Freou para " + veiculo.getVelocidade());

        System.out.println("Cor anterior: " + veiculo.getCor());

        veiculo.pintar("Vermelho");

        System.out.println("Cor nova: " + veiculo.getCor());

        System.out.println(veiculo.isLigado());
        veiculo.ligar();
        System.out.println(veiculo.isLigado());

        veiculo.frear();
        veiculo.desligar();
        System.out.println(veiculo.isLigado());

    }

}
