import java.util.ArrayList;
import java.util.List;

import model.Guerreiro;
import model.Mago;
import model.Personagem;

public class Main {
  public static void main(String[] args) {
    List<String> magias = new ArrayList<String>();
    List<String> habilidades = new ArrayList<String>();

    magias.add("Abaffiato");
    habilidades.add("Perfurar");

    Mago harry = new Mago("Harry Potter", 100, 10, 0, 10, 5, 1, magias);

    Personagem.getNumOfInstances();

    Guerreiro ragnar = new Guerreiro("Ragnar", 150, 10, 0, 5, 10, 1, habilidades);

    Personagem.getNumOfInstances();

    harry.aprenderMagia("Petrificus Totalus");
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