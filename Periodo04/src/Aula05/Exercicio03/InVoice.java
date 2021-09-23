package Aula05.Exercicio03;
import java.util.Scanner;

public class InVoice {

	public static void main(String[] args) {
		int operacao;

		Scanner dados = new Scanner(System.in);
		
		do {
		System.out.println("\nDeseja fazer uma compra? [1] sim [2] não");
		operacao = dados.nextInt();
		dados.nextLine();
		
		switch (operacao) {
			case 1:
				InVoice venda = new InVoice();
				System.out.println("\nO valor do produto é de R$ " + venda.precUnitItem);
				System.out.println("\nDigite a quantidade de produtos que você quer: ");
				venda.setQtdCompItem(dados.nextInt());
//				System.out.println("\nO valor da compra deu R$ " + venda.compra());
				break;
			case 2:
				System.out.println("\nOPERAÇÃO FINALIZADA!");
				break;
			default:
				System.out.println("Case incorreta!! \nDigite o número correto");
				break;
			}
		} while(operacao != 0);
	}

	private int numFatura;
	private String descricaoItem;
	private int qtdCompItem;
	private float precUnitItem = 50.00f;
	private float resultado;
	
	public void informatica() {
		
	}

	public void informatica(int numFatura, String descricaoItem, int qtdCompItem, float precUnitItem) {
		this.numFatura = numFatura;
		this.descricaoItem = descricaoItem;
		this.qtdCompItem = qtdCompItem;
		this.precUnitItem = precUnitItem;
	}
	
	public void compra() {
		if (avaliarCompra() == true) {
			System.out.println("Adicione produtos para comprar");
		} else {
			getInvoiceAmount(resultado);
		}
	}
	public boolean avaliarCompra() {
		if (this.qtdCompItem <= 0) {
			this.qtdCompItem = 0;
			return true;
		}
		if(this.precUnitItem <= 0) {
			this.precUnitItem = (float) 0.0;
			return false;
		}
		return false;
	}
	public float getInvoiceAmount(float resultado) {
		resultado = this.qtdCompItem * this.precUnitItem;
		return resultado;
	}
	public float valorProduto() {
		this.precUnitItem = 50.0f;
		return this.precUnitItem;
	}

	public int getNumFatura() {
		return numFatura;
	}

	public void setNumFatura(int numFatura) {
		this.numFatura = numFatura;
	}

	public String getDescricaoItem() {
		return descricaoItem;
	}

	public void setDescricaoItem(String descricaoItem) {
		this.descricaoItem = descricaoItem;
	}

	public int getQtdCompItem() {
		return qtdCompItem;
	}

	public void setQtdCompItem(int qtdCompItem) {
		this.qtdCompItem = qtdCompItem;
	}

	public float getPrecUnitItem() {
		return precUnitItem;
	}

	public void setPrecUnitItem(float precUnitItem) {
		this.precUnitItem = precUnitItem;
	}

	public float getResultado() {
		return resultado;
	}

	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
}





