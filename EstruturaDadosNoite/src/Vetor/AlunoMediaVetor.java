package Vetor;

import java.util.Scanner;

public class AlunoMediaVetor {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[] notas = new float[5];
		float media = 0;
		
		Scanner dado = new Scanner(System.in);
		
		System.out.println(".:: Programa para calcular a média de notas do Aluno UNINASSAU ::.\n");
		
		for (int i = 0; i < notas.length; i++) {
			System.out.println("Informe a " + (i+1) + "º nota do aluno: ");
			notas[i] = dado.nextFloat();
			media = media + notas[i];
		}
		
		
		media = media/notas.length;
		
		System.out.println("A média do Aluno é: " + media);
	}
}
