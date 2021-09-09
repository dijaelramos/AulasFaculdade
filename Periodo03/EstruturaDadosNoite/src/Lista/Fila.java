package Lista;

public class Fila {

	private No inicio;
	private No fim;

	public Fila() {
		this.inicio = null;
		this.fim = null;
	}

	public void inserirElemento(Object elemento) {
		No novo = new No(elemento, null);
		if (this.fim == null) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			this.fim.setProximo(novo);
			this.fim = novo;
		}
	}

	public boolean removerElemento() {
		if (this.estaVazia()) {
			System.out.println("Fila Vazia!");
			return false;
		} else if (this.inicio.equals(this.fim)) {
			this.inicio = null;
			this.fim = null;
			return true;
		} else {
			No aux = this.inicio;
			this.inicio = this.inicio.getProximo();
			aux.setProximo(null);
			return true;
		}
	}

	public boolean estaVazia() {
		if (this.inicio == null) {
			return true;
		} else {
			return false;
		}
	}

	public void esvaziarFila() {
		while (this.inicio != null) {
			No aux = this.inicio;
			this.inicio = this.inicio.getProximo();
			aux.setProximo(null);
		}
	}

	public String toString() {
		String retorno = ".:: Fila ::. \n\n";
		No daVez = this.inicio;
		while (daVez != null) {
			retorno += daVez.getElemento().toString() + "\n\n";
			daVez = daVez.getProximo();
		}
		return retorno;
	}

	public No buscarNo(Object elemento) {
		for (No daVez = this.inicio; daVez != null; daVez = daVez.getProximo()) {
			if (daVez.getElemento().equals(elemento)) {
				return daVez;
			}
		}
		return null;
	}

	public int buscarIndElemento(Object elemento) {
		int indice = 0;
		for (No daVez = this.inicio; daVez != null; daVez = daVez.getProximo()) {
			indice++;
			if (daVez.getElemento().equals(elemento)) {
				return indice;
			}
		}
		indice = -1;
		return indice;
	}

	public int qtdElementos() {
		int tamanho = 0;
		No daVez = this.inicio;
		while (daVez != null) {
			tamanho++;
			daVez = daVez.getProximo();
		}
		return tamanho;
	}

	protected No getInicio() {
		return inicio;
	}

	protected void setInicio(No inicio) {
		this.inicio = inicio;
	}

	protected No getFim() {
		return fim;
	}

	protected void setFim(No fim) {
		this.fim = fim;
	}
}
