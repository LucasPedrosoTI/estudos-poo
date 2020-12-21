package com.gft.tdd_veiculo_poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import com.gft.tdd_veiculo_poo.exception.AcaoInvalidaException;
import com.gft.tdd_veiculo_poo.exception.TanqueCheioException;
import com.gft.tdd_veiculo_poo.model.Veiculo;

class VeiculoTest {

	private Veiculo veiculo;

	@BeforeEach
	void setup() {
		veiculo = Veiculo.builder().build();
	}

	private void assertAcaoInvalidaException(Executable executable) {
		assertThrows(AcaoInvalidaException.class, executable);
	}

	@Test
	void deveAcelerar20() throws Exception {

		veiculo.acelerar();

		assertEquals(20, veiculo.getVelocidade());
	}

	@Test
	void deveAbastecerAQuantidadeInformada() throws Exception {

		veiculo.abastecer(50);

		assertEquals(50, veiculo.getLitrosCombustivel());
	}

	@Test
	void deveLancarErroCasoAbastecaMaisDe60Litros() throws Exception {
		assertThrows(TanqueCheioException.class, () -> veiculo.abastecer(70));
	}

	@Test
	void deveDiminuirVelocidadeEm20AoFrear() throws Exception {
		veiculo.acelerar();
		veiculo.frear();

		assertEquals(0, veiculo.getVelocidade());
	}

	@Test
	void naoDeveFrearSeVeiculoEstaParado() throws Exception {
		assertAcaoInvalidaException(veiculo::frear);
	}

	@Test
	void devePintarOVeiculo() throws Exception {
		veiculo.pintar("Vermelho");

		assertEquals("Vermelho", veiculo.getCor());
	}

	@Test
	void deveLigarOVeiculo() throws Exception {
		veiculo.ligar();

		assertTrue(veiculo.isLigado());
	}

	@Test
	void deveLancarErroAoLigarVeiculoJaLigado() throws Exception {
		veiculo.setLigado(true);

		assertAcaoInvalidaException(veiculo::ligar);
	}



	@Test
	void deveDesligarOVeiculo() throws Exception {
		veiculo.ligar();
		veiculo.desligar();

		assertFalse(veiculo.isLigado());
	}

	@Test
	void naoDeveDesligarVeiculoJaDesligado() throws Exception {
		assertAcaoInvalidaException(veiculo::desligar);
	}

	@Test
	void naoDeveDesligarVeiculoEmMovimento() throws Exception {
		veiculo.ligar();
		veiculo.acelerar();
		assertAcaoInvalidaException(veiculo::desligar);
	}

}







