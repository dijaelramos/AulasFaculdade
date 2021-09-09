package Lista;

import java.util.Random;

public class ListaSorteio {

	private Object[] lista;
	private int capacidade;
	private int tamanho;

	public ListaSorteio(int capacidade) {
		this.lista = new Object[capacidade];
		this.capacidade = capacidade;
		this.tamanho = 0;
	}

	public boolean adicionar(Object elemento) {
		if (elemento.equals(null)) {
			System.out.println("O elemento é vázio, não será inserido na lista!");
			return false;
		} else {
			if (this.tamanho == this.capacidade) {
				System.out.println(
						"A lista está cheia, o elemento " + elemento.toString() + " não foi inserido na lista!");
				return false;
			} else {
				this.lista[this.tamanho] = elemento;
				this.tamanho++;
				return true;
			}
		}
	}

	public int buscarIndiceElemento(Object elemento) {
		for (int i = 0; i < this.tamanho; i++) {
			if (this.lista[i].equals(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public Object buscarElementoIndice(int indice) {
		if (indice >= 0 || indice < this.capacidade) {
			return this.lista[indice];
		} else {
			System.out.println("Indice inválido!");
			return null;
		}
	}

	public boolean remover(Object elemento) {
		int indice = this.buscarIndiceElemento(elemento);
		if (indice == -1) {
			System.out.println("O elemento " + elemento.toString() + "não existe na lista para ser removido!");
			return false;
		} else {
			for (int i = indice; i < (this.tamanho - 1); i++) {
				this.lista[i] = this.lista[i + 1];
			}			
			this.tamanho--;
			this.lista[this.tamanho] = null;
			return true;
		}
	}

	public int qtdElementos() {
		return this.tamanho;
	}

	public boolean estaVazia() {
		if (this.tamanho == 0) {
			return true;
		} else {
			return false;
		}
	}

	public int getCapacidade() {
		return this.capacidade;
	}
	
	public String toString() {
		String retorno = "Lista:\n";
		for (int i = 0; i < this.tamanho; i++) {
			retorno += (this.lista[i].toString() + "\n");
		}
		return retorno;
	}
	
	public void esvaziar() {
		for (int i = 0; i < this.tamanho; i++) {
			this.lista[i] = null;
		}
	}
	
	public Object sortearElemento() {
		Random numAletorio = new Random();
		return this.buscarElementoIndice((Math.abs(numAletorio.nextInt()))%this.tamanho);
	}
}
