package br.com.alura.solid.calcprecos;

public class TabelaDePrecoDiferenciada implements TabelaPreco {

	@Override
	public double descontoPara(double valor) {		
		return 0.5;
	}

}
