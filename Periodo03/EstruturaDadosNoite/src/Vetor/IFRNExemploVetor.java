package Vetor;

import java.util.Scanner;

public class IFRNExemploVetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[10];
		int numBusca;
		
		Scanner dado = new Scanner(System.in);
		
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + (i+1) + "º número do vetor de números(int): ");
			numeros[i] = dado.nextInt();
		}
		
		System.out.println("Infome um número a ser buscado no vetor de números(int): ");
		numBusca = dado.nextInt();
		
		for (int i = 0; i < numeros.length; i++) {
			if(numBusca == numeros[i]) {
				System.out.println("O número " + numBusca + " está presente no vetor de números(int) na posição " + i);
				break;
			}
			if(i == (numeros.length - 1)) {
				System.out.println("O número " + numBusca + " não pertence ao vetor de números(int)!");
			}
		}	

	}

}
