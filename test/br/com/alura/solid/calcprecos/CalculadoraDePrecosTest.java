package br.com.alura.solid.calcprecos;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class CalculadoraDePrecosTest {

	@Test
	public void testaFuncionamentoCalculoFreteComumComTabelaPadrao() {
		Entrega entrega = new Frete();
		TabelaPreco tabela = new TabelaDePrecoPadrao();

		CalculadoraDePrecos calculadoraDePreco = new CalculadoraDePrecos(tabela, entrega);

		Compra produto = new Compra();
		produto.setValor(500.0);
		produto.setCidade("SAO PAULO");
		double valor = calculadoraDePreco.calcula(produto);

		assertEquals(515.0, valor, 0.0001);
	}

	@Test
	public void testaFuncionamentoCalculoFreteComumComTabelaDiferenciada() {
		Entrega entrega = new Frete();
		TabelaPreco tabela = new TabelaDePrecoDiferenciada();

		CalculadoraDePrecos calculadoraDePreco = new CalculadoraDePrecos(tabela, entrega);

		Compra produto = new Compra();
		produto.setValor(500.0);
		produto.setCidade("SAO PAULO");
		double valor = calculadoraDePreco.calcula(produto);

		assertEquals(265.0, valor, 0.0001);
	}

}
