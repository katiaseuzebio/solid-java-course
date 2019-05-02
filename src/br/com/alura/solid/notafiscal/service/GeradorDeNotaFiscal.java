package br.com.alura.solid.notafiscal.service;

import br.com.alura.solid.notafiscal.dao.EnviadorDeEmail;
import br.com.alura.solid.notafiscal.dao.NotaFiscalDao;
import br.com.alura.solid.notafiscal.model.Fatura;
import br.com.alura.solid.notafiscal.model.NotaFiscal;

public class GeradorDeNotaFiscal {
	private final EnviadorDeEmail email;
    private final NotaFiscalDao dao;

    public GeradorDeNotaFiscal(EnviadorDeEmail email, NotaFiscalDao dao) {
        this.email = email;
        this.dao = dao;
    }

    public NotaFiscal gera(Fatura fatura) {

        double valor = fatura.getValorMensal();

        NotaFiscal nf = new NotaFiscal(valor, impostoSimplesSobreO(valor));

        email.enviaEmail(nf);
        dao.persiste(nf);

        return nf;
    }

    private double impostoSimplesSobreO(double valor) {
        return valor * 0.06;
    }
}	
