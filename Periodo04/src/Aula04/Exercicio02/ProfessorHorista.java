package Aula04.Exercicio02;

public class ProfessorHorista extends Professor {
	
	private Float valorHora;
	private int qtdHora;
	private Float horaExtra;
	
	public ProfessorHorista(String nome, String matricula, Float valorHora, int qtdHora) {
		super(nome, matricula);
		this.valorHora = valorHora;
		this.qtdHora = qtdHora;
//		this.salario = salario;
	}

	public Float getValorHora() {
		return valorHora;
	}

	public void setValorHora(Float valorHora) {
		this.valorHora = valorHora;
	}

	public int getQtdHora() {
		return qtdHora;
	}

	public void setQtdHora(int qtdHora) {
		this.qtdHora = qtdHora;
	}

	public void setHoraExtra(Float setHoraExtra) {
		this.horaExtra = this.qtdHora * this.valorHora;
	}
	
	public Float getHoraExtra() {
		return horaExtra;
	}

	public String status() {
		System.out.println("=========== PROFESSOR ===========");
		System.out.println("Professor(a): " + getNome());
		System.out.println("Matricula: " + getMatricula());
		System.out.println("Valor da hora extra: " + getValorHora());
		System.out.println("Quantidade de horas: " + getQtdHora());
//		System.out.println("Salario: " + salario);
//		System.out.println("Salario: " + setHoraExtra(getHoraExtra()));
		return null;	
	}
	
	
}
