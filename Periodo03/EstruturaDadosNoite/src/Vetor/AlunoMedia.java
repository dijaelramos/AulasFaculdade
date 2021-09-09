package Vetor;

import java.util.Scanner;

public class AlunoMedia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float nota1, nota2, nota3, nota4, nota5, media;
		
		Scanner dado = new Scanner(System.in);
		
		System.out.println(".:: Programa para calcular a média de notas do Aluno UNINASSAU ::.\n");
		
		System.out.println("Informe a primeira nota do aluno: ");
		nota1 = dado.nextFloat();
		
		System.out.println("Informe a segaunda nota do aluno: ");
		nota2 = dado.nextFloat();
		
		System.out.println("Informe a terceira nota do aluno: ");
		nota3 = dado.nextFloat();
		
		System.out.println("Informe a quarta nota do aluno: ");
		nota4 = dado.nextFloat();
		
		System.out.println("Informe a quinta nota do aluno: ");
		nota5 = dado.nextFloat();
		
		media = (nota1 + nota2 + nota3 + nota4 + nota5)/5;
		
		System.out.println("A média do Aluno é: " + media);
	}

}
