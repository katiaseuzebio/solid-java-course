package br.com.alura.solid.notafiscal.service;

import java.util.List;

import br.com.alura.solid.notafiscal.dao.AcaoGeraNotaFiscal;
import br.com.alura.solid.notafiscal.model.Fatura;
import br.com.alura.solid.notafiscal.model.NotaFiscal;

public class GeradorDeNotaFiscal {
	private List<AcaoGeraNotaFiscal> acoes;

	public GeradorDeNotaFiscal(List<AcaoGeraNotaFiscal> acoes) {
		this.acoes = acoes;
	}

	public NotaFiscal gera(Fatura fatura) {

		double valor = fatura.getValorMensal();

		NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));
		for (AcaoGeraNotaFiscal acaoGeraNotaFiscal : acoes) {
			acaoGeraNotaFiscal.executa(nf);
		}

		return nf;
	}

	private double impostoSimplesSobreO(double valor) {
		return valor * 0.06;
	}
}
