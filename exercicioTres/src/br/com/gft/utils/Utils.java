package utils;

public class Utils {
  public static double gerarNumeroRandomico() {
    double numeroRandomico = Math.round(Math.random() * 300 * 100) / 100;

    return numeroRandomico;
  }
}
