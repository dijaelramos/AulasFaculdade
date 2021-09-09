package Lista;

public class ListaEncadeada {

	private No inicio;
	private No fim;

	public ListaEncadeada() {
		this.inicio = null;
		this.fim = null;
	}

	public void addInicio(Object elemento) {
		No novo = new No(elemento, null);
		if (this.inicio == null) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			novo.setProximo(this.inicio);
			this.inicio = novo;
		}
	}

	public void addFim(Object elemento) {
		No novo = new No(elemento, null);
		if (this.fim == null) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			this.fim.setProximo(novo);
			this.fim = novo;
		}
	}

	// SOBRESCRITA - OVERRIDE
	public String toString() {
		String retorno = ".:: Lista ::. \n\n";
		No daVez = this.inicio;
		while (daVez != null) {
			retorno += daVez.getElemento().toString() + "\n\n";
			daVez = daVez.getProximo();
		}
		return retorno;
	}

	public boolean estaVazia() {
		if (this.inicio == null) {
			return true;
		} else {
			return false;
		}
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

	public boolean removerInicio() {
		if (this.estaVazia()) {
			System.out.println("Lista Vazia!");
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

	public boolean removerFim() {
		if (this.estaVazia()) {
			System.out.println("Lista Vazia!");
			return false;
		} else if (this.inicio.equals(this.fim)) {
			this.inicio = null;
			this.fim = null;
			return true;
		} else {
			No anterior = null;
			for (No daVez = this.inicio; daVez != null; daVez = daVez.getProximo()) {
				if (daVez.getProximo() == null) {
					anterior.setProximo(null);
					this.fim = anterior;
				}
				anterior = daVez;
			}
			return true;
		}
	}

	public boolean removerElemento(Object elemento) {
		No removido = this.buscarNo(elemento);
		if (removido.equals(null)) {
			System.out.println("Elemento não está na lista!");
			return false;
		} else if (removido.equals(this.inicio)) {
			return this.removerInicio();
		} else if (removido.equals(this.fim)) {
			return this.removerFim();
		} else {
			No anterior = null;
			for (No daVez = this.inicio; daVez != null; daVez = daVez.getProximo()) {
				if (daVez.equals(removido)) {
					anterior.setProximo(daVez.getProximo());
					daVez.setProximo(null);
				}
				anterior = daVez;
			}
			return true;
		}
	}

	public void esvaziarLista() {
		while (this.inicio != null) {
			No aux = this.inicio;
			this.inicio = this.inicio.getProximo();
			aux.setProximo(null);
		}
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
