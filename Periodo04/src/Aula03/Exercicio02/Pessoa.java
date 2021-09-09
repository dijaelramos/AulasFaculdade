package Aula03.Exercicio02;

public class Pessoa {
	
	private String nome;
	private String idade;
//	private Integer idade;
	private String cpf;
	
	public boolean Pessoa(String nome, String idade, String cpf) {
		if (Pessoa(nome, idade, cpf) == true) {
			this.nome = nome;
			this.idade = idade;
			this.cpf = cpf;
		}
		return false;	
	}
	
	public boolean AlterarPessoa(String nomeA, String idadeA, String cpfA) {
		if(AlterarPessoa(nome, idade, cpf) == true) {
			this.nome = null;
			this.nome = nomeA;
			this.idade = null;
			this.idade = idadeA;
			this.cpf = null;
			this.cpf = cpfA;
		} else {
			System.out.println("Nada foi alterado!");
			return Pessoa(nome, idade, cpf );
		}	
		return false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
			this.nome = nome;
	}
	
	public String getIdade() {
		return idade;
	}

	public void setIdade(String idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String StatusPessoa() {
		System.out.println("=========================================");
		System.out.println("CADASTRO FINALIZADO COM SUCESSO!");
		return "Nome: " + nome + ". \nIdade: " + idade + " anos. \nCPF: " + cpf + ".";
	}
	public String StatusAlterarPessoa() {
		System.out.println("=========================================");
		System.out.println("\nAlteração concluida com sucesso!");
		return "ALTERAÇÕES: \nNome: " + nome + ". \nIdade: " + idade + " anos. \nCPF: " + cpf + ".";
	}
}

