package Vetor;

import java.util.Scanner;

public class ExemploMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		float[][][] notasAlunos = new float[3][10][2];
		
		Scanner dado = new Scanner(System.in);
		for (int k = 0; k < notasAlunos.length; k++) {
			for (int j = 0; j < 10; j++) {
				for(int i = 0; i < 3; i++) {
					System.out.println("Informe a " + (i+1) + "� nota do " + (j+1) + "� aluno da " + (k+1)+ "� Turma: ");
					notasAlunos[i][j][k] = dado.nextFloat();
				}
			}
		}
		

	}

}
