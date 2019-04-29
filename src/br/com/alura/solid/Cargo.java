package br.com.alura.solid;

public enum Cargo {
	DESENVOLVEDOR(new CalculaSalarioDezOuVintePorcento()), DBA(new CalculaSalarioQuinzeOuVinteCincoPorcento()),
	TESTER(new CalculaSalarioQuinzeOuVinteCincoPorcento());

	private CalculaSalario calculaSalario;

	Cargo(CalculaSalario calculaSalario) {
		this.calculaSalario = calculaSalario;
	}

	public CalculaSalario getCalculaSalario() {
		return calculaSalario;
	}

}
