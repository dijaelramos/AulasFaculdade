package Vetor;

import java.util.Scanner;

public class IFRNExemploVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[10];
		int numBusca;
		
		Scanner dado = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + (i+1) + "� n�mero do vetor de n�meros(int): ");
			numeros[i] = dado.nextInt();
		}
		
		System.out.println("Infome um n�mero a ser buscado no vetor de n�meros(int): ");
		numBusca = dado.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			if(numBusca == numeros[i]) {
				System.out.println("O n�mero " + numBusca + " est� presente no vetor de n�meros(int) na posi��o " + i);
				break;
			}
			if(i == (numeros.length - 1)) {
				System.out.println("O n�mero " + numBusca + " n�o pertence ao vetor de n�meros(int)!");
			}
		}	

	}

}
