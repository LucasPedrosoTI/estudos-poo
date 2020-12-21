package com.gft.exercicio_tres_game.util;

import static org.mockito.Mockito.mockStatic;

import org.mockito.MockedStatic;

import utils.Utils;

public class TestUtils {

	public static final MockedStatic<Utils> utils = mockStatic(Utils.class);

	public static void mockGerarNumeroRandomico() {
		utils.when(Utils::gerarNumeroRandomico).thenReturn(100.0);
	}

	public static void closeStaticMock() {
		if (!utils.isClosed()) {
			utils.close();
		}
	}

}
