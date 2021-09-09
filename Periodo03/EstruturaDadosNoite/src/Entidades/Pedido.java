package Entidades;

public class Pedido {

	private Cliente cliente;
	private String itensPedido;
	private double valor;
	private String formaPag;

	public Pedido(Cliente cliente, String itensPedido, double valor, String formaPag) {
		super();
		this.cliente = cliente;
		this.itensPedido = itensPedido;
		this.valor = valor;
		this.formaPag = formaPag;
	}

	public String getItensPedido() {
		return itensPedido;
	}

	public void setItensPedido(String itensPedido) {
		this.itensPedido = itensPedido;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

	public String getFormaPag() {
		return formaPag;
	}

	public void setFormaPag(String formaPag) {
		this.formaPag = formaPag;
	}

	public Cliente getCliente() {
		return cliente;
	}
	
	public String toString() {
		String retorno = this.getCliente().toString();
		retorno += "\nPedido: " + this.itensPedido + " | ";
		retorno += "Forma Pg: " + this.formaPag + " | ";
		retorno += "Total R$ " + this.valor;
		return retorno;		
	}

}
