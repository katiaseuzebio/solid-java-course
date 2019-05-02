package br.com.alura.solid.notafiscal.dao;

import br.com.alura.solid.notafiscal.model.NotaFiscal;

public class EnviadorDeEmail {

    public void enviaEmail(NotaFiscal nf) {
        System.out.println("envia email da nf " + nf.getId());
    }
}