package Vetor;

import java.util.Scanner;

public class IFRNExercio2Vetor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numeros = new int[10];

		Scanner dado = new Scanner(System.in);

		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Informe o " + (i + 1) + "º número do vetor de números(int): ");
			numeros[i] = dado.nextInt();
		}
		
		System.out.print("Os números pares presente no vetor de números(int) são:");
		for (int i = 0; i < numeros.length; i++) {
			if((numeros[i]%2) == 0) {
				System.out.print(" " + numeros[i]);
			}
		}

	}

}
