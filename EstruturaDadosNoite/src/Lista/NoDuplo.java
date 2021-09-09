package Lista;

public class NoDuplo extends No {

	private No anterior;

	public NoDuplo(Object elemento, No proximo, No anterior) {
		super(elemento, proximo);
		// TODO Auto-generated constructor stub
		this.anterior = anterior;
	}

	public No getAnterior() {
		return anterior;
	}

	public void setAnterior(No anterior) {
		this.anterior = anterior;
	}

}
