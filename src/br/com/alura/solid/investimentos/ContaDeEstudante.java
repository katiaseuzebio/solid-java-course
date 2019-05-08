package br.com.alura.solid.investimentos;

public class ContaDeEstudante {

	private ManipuladorSaldo manipuladorSaldo;
	private int milhas;
	
	public ContaDeEstudante() {
		this.manipuladorSaldo = new ManipuladorSaldo();
	}

	public void deposita(double valor) {
		this.manipuladorSaldo.deposita(valor);
		this.milhas += (int) valor;
	}

	public int getMilhas() {
		return milhas;
	}

	public void saca(double valor) {
		this.manipuladorSaldo.saca(valor);
	}

	public double getSaldo() {
		return manipuladorSaldo.getSaldo();
	}
}
