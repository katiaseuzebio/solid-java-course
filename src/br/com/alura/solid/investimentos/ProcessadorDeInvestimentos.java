package br.com.alura.solid.investimentos;

import java.util.Arrays;
import java.util.List;

public class ProcessadorDeInvestimentos {

    public static void main(String[] args) {

        for (ContaComum conta : contasComuns()) {
            conta.rende();

            System.out.println("Novo Saldo:");
            System.out.println(conta.getSaldo());
        }
        
        for (ContaDeEstudante conta : contasEstudante()) {
            System.out.println("Saldo:");
            System.out.println(conta.getSaldo());
        }
    }

    private static List<ContaComum> contasComuns() {
        return Arrays.asList(umaContaCom(100), umaContaCom(150), umaContaCom(200));
    }
    
    private static List<ContaDeEstudante> contasEstudante() {
        return Arrays.asList(contaDeEstudanteCom(100), contaDeEstudanteCom(150), contaDeEstudanteCom(200));
    }

    private static ContaDeEstudante contaDeEstudanteCom(double amount) {
        ContaDeEstudante c = new ContaDeEstudante();
        c.deposita(amount);
        return c;
    }

    private static ContaComum umaContaCom(double valor) {
        ContaComum c = new ContaComum();
        c.deposita(valor);
        return c;
    }
}
