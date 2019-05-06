package br.com.alura.solid.pagamentos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Fatura {

    private String cliente;
    private double valor;
    private List<Pagamento> pagamentos;
    private boolean pago;

    public Fatura(String cliente, double valor) {
        this.cliente = cliente;
        this.valor = valor;
        this.pagamentos = new ArrayList<Pagamento>();
        this.pago = false;
    }

    public String getCliente() {
        return cliente;
    }

    public double getValor() {
        return valor;
    }

    public List<Pagamento> getPagamentos() {
        return Collections.unmodifiableList(pagamentos);
    }

    public boolean isPago() {
        return pago;
    }

	public void addPagamento(Pagamento pagamento) {
		this.pagamentos.add(pagamento);	
		if(valorTotalPago() >= valor) {
			this.pago = true;
		}
	}

	private double valorTotalPago() {
		double totalPago = 0;
		for (Pagamento pagamento : pagamentos) {
			totalPago += pagamento.getValor();
		}
		return totalPago;
	}

}