package br.com.alura.solid.investimentos;

public class ManipuladorSaldo {

	private double saldo;
	
	public ManipuladorSaldo() {
		this.saldo = 0;
	}

	public void deposita(double valor) {
		this.saldo += valor;
	}

	public void saca(double valor) {
		if (valor <= this.saldo) {
			this.saldo -= valor;
		} else {
			throw new IllegalArgumentException();
		}
	}
	
	public double getSaldo() {
		return saldo;
	}

}
