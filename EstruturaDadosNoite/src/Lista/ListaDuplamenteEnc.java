package Lista;

public class ListaDuplamenteEnc {

	private NoDuplo inicio;
	private NoDuplo fim;

	public ListaDuplamenteEnc() {
		this.inicio = null;
		this.fim = null;
	}

	public void addInicio(Object elemento) {
		// Novo elemento
		NoDuplo novo = new NoDuplo(elemento, null, null);
		// Anlisa se lista está vazia
		if (this.inicio == null) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			this.inicio.setAnterior(novo);
			novo.setProximo(this.inicio);
			this.inicio = novo;
		}
	}

	public void addFim(Object elemento) {
		// Novo elemento
		NoDuplo novo = new NoDuplo(elemento, null, null);
		// Anlisa se lista está vazia
		if (this.fim == null) {
			this.inicio = novo;
			this.fim = novo;
		} else {
			novo.setAnterior(this.fim);
			this.fim.setProximo(novo);
			this.fim = novo;
		}

	}

	public String toString() {
		String retorno = ".:: Lista ::. \n\n";
		NoDuplo daVez = this.inicio;
		while (daVez != null) {
			retorno += daVez.getElemento().toString() + "\n\n";
			daVez = (NoDuplo) daVez.getProximo();
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

	public NoDuplo buscarNo(Object elemento) {
		NoDuplo noBuscado = null;
		for (NoDuplo daVez = this.inicio; daVez != null; daVez = (NoDuplo) daVez.getProximo()) {
			if (daVez.getElemento().equals(elemento)) {
				return daVez;
			}
		}
		return noBuscado;
	}

	public int buscarIndElemento(Object elemento) {
		int indice = 0;
		for (NoDuplo daVez = this.inicio; daVez != null; daVez = (NoDuplo) daVez.getProximo()) {
			indice++;
			if (daVez.getElemento().equals(elemento)) {
				return indice;
			}
		}
		indice = -1;
		return indice;
	}

	public boolean removerInicio() {
		if (this.inicio == null) {
			System.out.println("Lista vazia!");
			return false;
		} else if (this.inicio.equals(this.fim)) {
			this.inicio = null;
			this.fim = null;
			return true;
		} else {
			NoDuplo antigoInicio = this.inicio;
			this.inicio = (NoDuplo) this.inicio.getProximo();
			this.inicio.setAnterior(null);
			antigoInicio.setProximo(null);
			return true;
		}
	}

	public boolean removerFim() {
		if (this.inicio == null) {
			System.out.println("Lista vazia!");
			return false;
		} else if (this.inicio.equals(this.fim)) {
			this.inicio = null;
			this.fim = null;
			return true;
		} else {
			NoDuplo antigoFim = this.fim;
			this.fim.getAnterior().setProximo(null);
			this.fim = (NoDuplo) this.fim.getAnterior();
			antigoFim.setAnterior(null);
			return true;
		}
	}

	public boolean removerElmento(Object elemento) {
		NoDuplo removido = this.buscarNo(elemento);
		if (removido.equals(null)) {
			System.out.println("Elemento não está na lista!");
			return false;
		} else if (removido.equals(this.inicio)) {
			return this.removerInicio();
		} else if (removido.equals(this.fim)) {
			return this.removerFim();
		} else {
			removido.getAnterior().setProximo(removido.getProximo());
			removido.setAnterior(null);
			removido.setProximo(null);
			return true;
		}
	}

	// Esvaziar a lista metodo free
	public void esvaziarLista() {
		while (this.inicio != null) {
			NoDuplo aux = this.inicio;
			this.inicio = (NoDuplo) this.inicio.getProximo();
			aux.setProximo(null);
		}
	}

}
