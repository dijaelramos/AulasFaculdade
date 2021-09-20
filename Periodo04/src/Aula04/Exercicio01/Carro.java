package Aula04.Exercicio01;

public class Carro {
	private String nome;
	private	Boolean ligado;
	private Boolean destruido;
	private int blindagem;
	private Boolean armamento;

	public Carro(String nome) {
		this.nome = nome;
		this.ligado = false;
		this.destruido = false;
		this.blindagem = 0;
		this.armamento = false;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Boolean getLigado() {
		return this.ligado;
	}

	public void setLigado(Boolean ligado) {
		this.ligado = ligado;
	}

	public Boolean getDestruido() {
		return this.destruido;
	}

	public void setDestruido(Boolean destruido) {
		this.destruido = destruido;
	}

	public int getBlindagem() {
		return blindagem;
	}

	public void setBlindagem(int blindagem) {
		this.blindagem = blindagem;
	}

	public Boolean getArmamento() {
		return this.armamento;
	}

	public void setArmamento(Boolean armamento) {
		this.armamento = armamento;
	}
	public void info () {
		System.out.println("------------");
		System.out.printf("Nome.........: %s%n", this.nome);
		System.out.printf("Ligado.........: %s%n", this.ligado ? "Sim" : "Nao");
		System.out.printf("Destruido.........: %s%n", this.destruido ? "Sim" : "Nao");
		System.out.printf("Blindagem.........: %d%n", this.blindagem);
		System.out.printf("Armamento.........: %s%n", this.armamento ? "Sim" : "Nao");
	}
}
