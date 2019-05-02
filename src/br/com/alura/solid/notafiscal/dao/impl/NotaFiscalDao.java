package br.com.alura.solid.notafiscal.dao.impl;

import br.com.alura.solid.notafiscal.dao.AcaoGeraNotaFiscal;
import br.com.alura.solid.notafiscal.model.NotaFiscal;

public class NotaFiscalDao implements AcaoGeraNotaFiscal {

    public void executa(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}