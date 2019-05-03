package br.com.alura.solid.calcprecos;

public class CalculadoraDePrecos {

	private TabelaPreco tabela;
	private Entrega entrega;

	public CalculadoraDePrecos(TabelaPreco tabela, Entrega entrega) {
		this.tabela = tabela;
		this.entrega = entrega;
	}

	public double calcula(Compra produto) {

		double desconto = tabela.descontoPara(produto.getValor());
		double frete = entrega.para(produto.getCidade());

		return produto.getValor() * (1 - desconto) + frete;
	}
}