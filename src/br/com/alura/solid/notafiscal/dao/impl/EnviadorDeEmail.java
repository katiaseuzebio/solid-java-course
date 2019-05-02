package br.com.alura.solid.notafiscal.dao.impl;

import br.com.alura.solid.notafiscal.dao.AcaoGeraNotaFiscal;
import br.com.alura.solid.notafiscal.model.NotaFiscal;

public class EnviadorDeEmail implements AcaoGeraNotaFiscal {

    public void executa(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}