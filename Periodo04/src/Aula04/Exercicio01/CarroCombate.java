package Aula04.Exercicio01;

public class CarroCombate extends Carro{
	
	private final int MAX_ARMAMENTO = 100;
	private final int MIN_ARMAMENTO = 0;
	private int qtdeArmamento;
	
	
	public CarroCombate(String nome, int blindagem) {
		super(nome);
		setArmamento(true);
		setBlindagem(blindagem);
		this.qtdeArmamento = 100;
	}

	public void setQtdeArmamento(int qtdeArmamento) {
		this.qtdeArmamento += qtdeArmamento;
		if (this.qtdeArmamento > MAX_ARMAMENTO) {
			this.qtdeArmamento = MAX_ARMAMENTO;
		} if (this.qtdeArmamento < MIN_ARMAMENTO) {
			this.qtdeArmamento = MIN_ARMAMENTO;
		}
	}
	
	public int getQtdeArmamento() {
		return this.qtdeArmamento;
	}

	public int getMAX_ARMAMENTO() {
		return this.MAX_ARMAMENTO;
	}

	public int getMIN_ARMAMENTO() {
		return this.MIN_ARMAMENTO;
	}	
}
