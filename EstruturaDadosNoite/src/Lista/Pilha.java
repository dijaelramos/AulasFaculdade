package Lista;

public class Pilha {

	private No topo;
	private No base;

	public Pilha() {
		this.topo = null;
		this.base = null;
	}

	public void push(Object elemento) {
		No novo = new No(elemento, null);
		if (this.topo == null) {
			this.topo = novo;
			this.base = novo;
		} else {
			novo.setProximo(this.topo);
			this.topo = novo;
		}
	}

	public boolean pop() {
		if (this.isEmpty()) {
			System.out.println("Pilha Vazia!");
			return false;
		} else if (this.topo.equals(this.base)) {
			this.topo = null;
			this.base = null;
			return true;
		} else {
			No aux = this.topo;
			this.topo = this.topo.getProximo();
			aux.setProximo(null);
			return true;
		}
	}

	public boolean isEmpty() {
		if (this.topo == null) {
			return true;
		} else {
			return false;
		}
	}

	// SOBRESCRITA - OVERRIDE
	public String toString() {
		String retorno = ".:: Pilha ::. \n\n";
		No daVez = this.topo;
		while (daVez != null) {
			retorno += daVez.getElemento().toString() + "\n\n";
			daVez = daVez.getProximo();
		}
		return retorno;
	}

	public No searchNo(Object elemento) {
		for (No daVez = this.topo; daVez != null; daVez = daVez.getProximo()) {
			if (daVez.getElemento().equals(elemento)) {
				return daVez;
			}
		}
		return null;
	}

	public int searchIndElemento(Object elemento) {
		int indice = 0;
		for (No daVez = this.topo; daVez != null; daVez = daVez.getProximo()) {
			indice++;
			if (daVez.getElemento().equals(elemento)) {
				return indice;
			}
		}
		indice = -1;
		return indice;
	}
	
	public void clear() {
		while(this.topo != null) {
			No aux = this.topo;
			this.topo = this.topo.getProximo();
			aux.setProximo(null);
		}
	}
	
	public int size() {
		int tamanho = 0;
		No daVez = this.topo;
		while(daVez != null) {
			tamanho++;
			daVez = daVez.getProximo();
		}		
		return tamanho;
	}

	protected No getTopo() {
		return topo;
	}

	protected void setTopo(No topo) {
		this.topo = topo;
	}

	protected No getBase() {
		return base;
	}

	protected void setBase(No base) {
		this.base = base;
	}

}
