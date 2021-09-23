package Aula05.Exercicio02;

public class Elevador {

	public static void main(String[] args) {
	
		Elevador elevador = new Elevador();
		elevador.status();
		
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.status();
		
		elevador.desceAndar();
		elevador.desceAndar();
		elevador.status();
		
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.sobeAndar();
		elevador.status();
		
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.acrencentarPessoa();
		elevador.status();
		
		elevador.removerPessoa();
		elevador.removerPessoa();
		elevador.status();
		

		
	}
	int andar = 0;
	int andarTot = 10;
	int capPessoas = 8;
	int qtdPessoas = 0;
	
	public int sobeAndar() {
		if (this.andar > 0 || this.andar <= andarTot) {
			this.andar += + 1;
		} 
		else {
			System.out.println("\nO elevador já esta no topo.");
		}
		return this.andar;
	}
	
	public int desceAndar() {
		if (this.andar > 0 || this.andar <= andarTot) {
			this.andar -= 1;
		} else {
			System.out.println("\nO elevador já esta no Térreo.");
		}
		return this.andar;
	}
	
	public int acrencentarPessoa() {
		if (this.qtdPessoas <= this.capPessoas) {
			this.qtdPessoas += 1;
		} else {
			System.out.println("\nElevador esta cheio!");
			System.out.println("Capacidade total de pessoas é de: " + this.capPessoas);
		}
		return this.qtdPessoas;
	}
	
	public int removerPessoa() {
		if (this.qtdPessoas > 0) {
			this.qtdPessoas -= 1;
		} else {
			System.out.println("\\nO elevador já esta vazio!");
		}
		return this.qtdPessoas;
	}
	
	public void status() {
		if (this.qtdPessoas <= this.capPessoas) {
			System.out.println("\nO elevador estar no andar: " + this.andar + ", com " + this.qtdPessoas + " pessoas nele.");
		} else {
			System.out.println("\nElevador esta cheio!");
			System.out.println("Capacidade total de pessoas é de: " + this.capPessoas);
		}
	}

	
	
	
	
	public int getTerreo() {
		return andar;
	}

	public void setTerreo(int terreo) {
		this.andar = terreo;
	}

	public int getAndarTot() {
		return andarTot;
	}

	public void setAndarTot(int andarTot) {
		this.andarTot = andarTot;
	}

	public int getCapPessoas() {
		return capPessoas;
	}

	public void setCapPessoas(int capPessoas) {
		this.capPessoas = capPessoas;
	}

	public int getQtdPessoas() {
		return qtdPessoas;
	}

	public void setQtdPessoas(int qtdPessoas) {
		this.qtdPessoas = qtdPessoas;
	}
}





