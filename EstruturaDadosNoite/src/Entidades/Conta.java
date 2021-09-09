package Entidades;

import java.util.Date;

public class Conta {

	private int numero;
	private Cliente cliente;
	private double saldo;
	private double limite;
	private Date dataIni;
	
	public Conta() {
		super();
	}

	public Conta(int numero, Cliente cliente, double saldo, double limite, Date dataIni) {
		super();
		this.numero = numero;
		this.cliente = cliente;
		this.saldo = saldo;
		this.limite = limite;
		this.dataIni = dataIni;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}

	public int getNumero() {
		return numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public Date getDataIni() {
		return dataIni;
	}

}
