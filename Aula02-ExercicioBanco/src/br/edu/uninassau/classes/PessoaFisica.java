package br.edu.uninassau.classes;

public class PessoaFisica {

	public String cpf;
	public String nome;
	public int idade;
	public String endereco;
	public String profissao;
	
	public PessoaFisica() {
		
	}
	
	public PessoaFisica(String cpf, String nome, int idade, String endereco, String profissao) {
		this.cpf = cpf;
		this.nome = nome;
		this.idade = idade;
		this.endereco = endereco;
		this.profissao = profissao;
	}
	
}
