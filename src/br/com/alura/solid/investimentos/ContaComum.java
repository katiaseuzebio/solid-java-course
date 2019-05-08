package br.com.alura.solid.investimentos;

public class ContaComum {

	private ManipuladorSaldo manipuladorSaldo;
	
	public ContaComum() {
		this.manipuladorSaldo = new ManipuladorSaldo();
	}

	public void deposita(double valor) {
		this.manipuladorSaldo.deposita(valor);
	}

	public void saca(double valor) {
		this.manipuladorSaldo.saca(valor);
	}

	public void rende() {
		this.manipuladorSaldo.deposita(this.manipuladorSaldo.getSaldo() * 0.01);
	}

	public double getSaldo() {
		return manipuladorSaldo.getSaldo();
	}
}