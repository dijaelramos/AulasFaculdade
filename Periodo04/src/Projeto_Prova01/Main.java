package Projeto_Prova01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opc, qtdNotas;
		float nota = 0;
		String nome, cpf;
		Scanner teclado = new Scanner(System.in);
		
		Aluno novoAluno = new Aluno();
		Sala novaSala = new Sala();

		do {
			System.out.println("\n-------------------");
			System.out.println("       MENU");
			System.out.println("ESCOLHA UMA OPÇÃO:");
			System.out.println("1 - Inserir Aluno");
			System.out.println("2 - Listar Alunos");
			System.out.println("3 - Situações");
			System.out.println("0 - Sair");

			opc = teclado.nextInt();
			// Serve para limpar o buffer para poder digitar na tela do Scanner
			teclado.nextLine();

			switch (opc) {
			case 1:
				System.out.println("\nNome: ");
				nome = teclado.nextLine();
				System.out.println("\nCPF: ");
				cpf = teclado.nextLine();
				
				novoAluno = new Aluno(nome, cpf);
				
				System.out.println("\nQuantas notas?");
				qtdNotas = teclado.nextInt(); 
				
				for (int i = 0; i < qtdNotas; i++) {
					System.out.println("\nNota " + (i+1));
					nota = teclado.nextFloat();
					novoAluno.insereNotas(nota);
				}
				
				novaSala.insereAluno(novoAluno);
				
				break;
			case 2:
				
				novaSala.listarAlunos();
				
				break;
			case 3: 

				novaSala.listarSituacoes();
				
				break;
			case 0:
				System.out.println("Saindo...");
				break;

			default:
				System.out.println("\nOpção Invalida! \nDigite o número correto!");
				break;
			}

		} while (opc != 0);

	}

}
