package br.edu.uninassau.negocio;

import br.edu.uninassau.classes.ContaCorrente;

public class ContaCorrenteNegocio {

	ContaCorrente contaCorrente;


	public ContaCorrenteNegocio() {
	
	}
	
	public ContaCorrenteNegocio(ContaCorrente contaCorrente) {
		super();
		this.contaCorrente = contaCorrente;
	}
	

	public void sacar(float valor) {
		if (this.contaCorrente.saldo >= valor) {
			this.contaCorrente.saldo = this.contaCorrente.saldo - valor;
//			return true;
		} else {
//			return false;
			System.out.println("SALDO INSUFICIENTE!!!");
		}
	}

	public boolean depositar(float valor) {
		this.contaCorrente.saldo += valor;
		return true;
	}
	
	public boolean transferir(ContaCorrente conta, float valor) {
		if (this.contaCorrente.saldo >= valor) {
			conta.saldo += valor;
			this.contaCorrente.saldo -= valor;
			return true;
		} else {
			return false;
		}
	}
	
	public float verSaldo() {
		return this.contaCorrente.saldo;
	}
	
	public void mostrarSaldo() {
		System.out.println("Saldo de "+this.contaCorrente.pessoaFisica.nome+" : "+this.contaCorrente.saldo);
	}	
	
}
