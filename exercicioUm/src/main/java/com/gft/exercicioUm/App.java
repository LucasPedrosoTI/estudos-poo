package com.gft.exercicioUm;

import com.gft.exercicioUm.Veiculo.Veiculo;

public class App {

    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo();
        veiculo.setCor("Preto");
        
        veiculo.ligar();

        veiculo.acelerar();
        veiculo.acelerar();

        System.out.println("Acelerou para " + veiculo.getVelocidade());
        
        veiculo.frear();
        veiculo.frear();
        veiculo.desligar();
        veiculo.abastecer(30);

        System.out.println("Tanque: " + veiculo.getLitrosCombustivel());

        veiculo.abastecer(30);

        System.out.println("Tanque: " + veiculo.getLitrosCombustivel());
        
        veiculo.ligar();
        veiculo.acelerar();
        veiculo.frear();

        System.out.println("Freou para " + veiculo.getVelocidade());

        veiculo.desligar();
        
        System.out.println("Cor anterior: " + veiculo.getCor());

        veiculo.pintar("Vermelho");

        System.out.println("Cor nova: " + veiculo.getCor());

        System.out.println("Veiculo ligado: " + veiculo.isLigado());
        veiculo.ligar();   
        System.out.println("Veiculo ligado: " + veiculo.isLigado());
                          
        veiculo.desligar(); 
        System.out.println("Veiculo ligado: " + veiculo.isLigado());

    }

}
