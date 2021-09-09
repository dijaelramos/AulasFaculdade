package br.edu.uninassau.classes;

public class ContaCorrente {

	public String agencia;
	public String numeroConta;
	public float saldo;
	public PessoaFisica pessoaFisica;

	public ContaCorrente() {
		
	}

	public ContaCorrente(String agencia, String numeroConta, float saldo, PessoaFisica pessoaFisica) {
		super();
		this.agencia = agencia;
		this.numeroConta = numeroConta;
		this.saldo = saldo;
		this.pessoaFisica = pessoaFisica;
	}
	
}
