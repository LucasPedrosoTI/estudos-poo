package utils;

public class Utils {

	private Utils() {}

	public static Double gerarNumeroRandomico() {
		return Math.round(Math.random() * 300.0 * 100.0) / 100.0;
	}
}
