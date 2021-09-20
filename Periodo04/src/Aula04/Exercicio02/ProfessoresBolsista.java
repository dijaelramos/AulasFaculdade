package Aula04.Exercicio02;

public class ProfessoresBolsista extends Professor {
	
	private Float salario = 1100.00f;

	public ProfessoresBolsista(String nome, String matricula, Float salario) {
		super(nome, matricula);
		this.salario = salario;
	}

	public Float getSalario() {
		return salario;
	}
	
}
