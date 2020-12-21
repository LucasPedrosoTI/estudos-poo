package com.gft.exercicio_sete_funcionario;

import com.gft.model.Gerente;
import com.gft.model.Supervisor;
import com.gft.model.Vendedor;

public class App {

	private static final String BONIFICACAO = ", bonificação: ";

	public static void main(String[] args) {
		Gerente mark = Gerente.builder().withNome("Mark Zuckerberg").withIdade(30).withSalario(100000).build();
		Supervisor jeff = Supervisor.builder().withNome("Jeff Bezos").withIdade(40).withSalario(80000).build();
		Vendedor bill = Vendedor.builder().withNome("Bill").withIdade(60).withSalario(50000).build();

		System.out.println(mark.toString() + BONIFICACAO + mark.bonificacao());
		System.out.println(jeff.toString() + BONIFICACAO + jeff.bonificacao());
		System.out.println(bill.toString() + BONIFICACAO + bill.bonificacao());
	}

}
