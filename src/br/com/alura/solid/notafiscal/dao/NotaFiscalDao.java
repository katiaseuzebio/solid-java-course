package br.com.alura.solid.notafiscal.dao;

import br.com.alura.solid.notafiscal.model.NotaFiscal;

public class NotaFiscalDao {

    public void persiste(NotaFiscal nf) {
        System.out.println("salva nf no banco");
    }
}