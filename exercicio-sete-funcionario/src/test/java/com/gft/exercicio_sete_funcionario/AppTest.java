package com.gft.exercicio_sete_funcionario;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.gft.model.Funcionario;
import com.gft.model.Gerente;
import com.gft.model.Supervisor;
import com.gft.model.Vendedor;

public class AppTest {

	private void assertBonificacao(Funcionario funcionario, double expected) {
		assertEquals(expected, funcionario.bonificacao());
	}

	@Test
	void mainDeveRodar() throws Exception {
		assertDoesNotThrow(() -> App.main(null));
	}

	@Test
	void paraGerenteBonificacaoDeveSerDezMil() throws Exception {
		Gerente gerente = Gerente.builder().build();

		assertBonificacao(gerente, 10000.0);
	}

	@Test
	void paraSupervisorBonificacaoDeveSerCincoMil() throws Exception {
		Supervisor supervisor = Supervisor.builder().build();

		assertBonificacao(supervisor, 5000.0);
	}

	@Test
	void paraVendedorBonificacaoDeveSerTresMil() throws Exception {

		Vendedor vendedor = Vendedor.builder().build();

		assertBonificacao(vendedor, 3000.0);
	}


}
