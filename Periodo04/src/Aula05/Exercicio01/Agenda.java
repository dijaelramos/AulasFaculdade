package Aula05.Exercicio01;

public class Agenda {
	private String nome;
	private int idade;
	private float altura;
	
	public Agenda(String nome, int idade, float altura) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.altura = altura;
	}

	public void armazenaPessoa(String nome, int idade, float altura ) {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
		System.out.println("Altura: " + getAltura());
	}
	
	public void removePessoa() {
		
	}
	public int buscaPessoa() {
		return idade;
		
	}
	public void imprimeAgenda() {
		
	}
	public void imprimePessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	
	
}
