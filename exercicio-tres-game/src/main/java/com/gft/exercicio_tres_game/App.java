package com.gft.exercicio_tres_game;

import java.util.ArrayList;
import java.util.List;

import model.Guerreiro;
import model.Mago;
import model.Personagem;

public class App {

	public static void main(String[] args) {

		List<String> magias = new ArrayList<>();
		List<String> habilidades = new ArrayList<>();

		magias.add("Abaffiato");
		habilidades.add("Perfurar");

		Mago harry = Mago.builder()
				.withNome("Harry Potter")
				.withMagias(magias)
				.build();

		Personagem.getNumOfInstances();

		Guerreiro ragnar = Guerreiro.builder()
				.withNome("Ragnar")
				.withHabilidades(habilidades)
				.build();

		Personagem.getNumOfInstances();

		harry.aprenderMagia("Petrificus Totalus");

		System.out.println(harry.getMagias().toString());

		ragnar.aprenderHabilidade("Cortar");

		harry.attack();
		harry.lvlUp();
		harry.attack();
		harry.lvlUp();
		harry.attack();

		ragnar.attack();
		ragnar.lvlUp();
		ragnar.attack();
		ragnar.lvlUp();
		ragnar.attack();

	}

}
