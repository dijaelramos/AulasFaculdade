package Aula05.Exercicio01;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int opcao = 0;
		int qtdPessoa = 2;
		String nome;
		int idade;
		float altura;
		boolean sair = true;

		Agenda agenda = new Agenda();
		Scanner teclado = new Scanner(System.in);

		do {
			System.out.println("\n-------------------");
			System.out.println("       MENU");
			System.out.println("ESCOLHA UMA OPÇÃO:");
			System.out.println("1 - Inserir Pessoa");
			System.out.println("2 - Remover Pessoa");
			System.out.println("3 - Encontrar a posição da pessoa na agenda");
			System.out.println("4 - Listar a Agenda");
			System.out.println("5 - Informar a pessoa que deseja encontrar");
			System.out.println("0 - Sair");

			opcao = teclado.nextInt();
			teclado.nextLine();

			switch (opcao) {
			case 1:
//				for (int i = 0; i < qtdPessoa; i++) {
					System.out.println("\nNome: ");
					nome = teclado.nextLine();
					System.out.println("\nIdade: ");
					idade = teclado.nextInt();
					System.out.println("\nAltura: ");
					altura = teclado.nextFloat();
					
					
					agenda.armazenarPessoa(nome, idade, altura);
//				}
				
				break;
			case 2:
				System.out.println("\nInforme o nome para ser removido: ");
				nome = teclado.nextLine();
				agenda.removerPessoa(nome);
				break;
			case 3:
				System.out.println("\nInforme o nome para ser encontrado: ");
				nome = teclado.nextLine();
				System.out.println(nome + " esta na posição da agenda: " + agenda.buscarPessoa(nome));
				break;
			case 4:
				agenda.imprimirAgenda();
				break;
			case 5:
				System.out.println("\nInforme pessoa que deseja encontrar");
				nome = teclado.nextLine();
				System.out.println(nome);
				break;
			case 0:
				sair = false;
				break;
			default:
				System.exit(0);
			}

		} while (sair);
	}
}
