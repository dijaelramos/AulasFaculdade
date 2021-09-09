package Aula03.Exercicio02;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		
//***********************************************************		
//		Dados digitalizados pelo usuário por telas:			*
//															*
//***********************************************************
		pessoa.setNome(JOptionPane.showInputDialog(null, "Digite o nome da pesssoa:", "NOME", JOptionPane.QUESTION_MESSAGE));
		pessoa.setCpf(JOptionPane.showInputDialog(null, "Digite o CPF da pesssoa: ", "CPF", JOptionPane.QUESTION_MESSAGE));
		pessoa.setIdade(JOptionPane.showInputDialog(null, "Digite a idade da pesssoa:", "IDADE", JOptionPane.QUESTION_MESSAGE));
		JOptionPane.showMessageDialog(null, pessoa.StatusPessoa(), "RESULTADO", JOptionPane.INFORMATION_MESSAGE);
		System.out.println(pessoa.StatusPessoa());
		System.out.println("================================================");
	
//***********************************************************		
//				Dados digitalizados pelo usuário:			*
//															*
//***********************************************************
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite o nome da pesssoa: ");
		pessoa.setNome(dados.nextLine());
		System.out.println("Digite o CPF da pesssoa: ");
		pessoa.setCpf(dados.nextLine());
		System.out.println("Digite a idade da pesssoa: ");
		pessoa.setIdade(dados.nextLine());
		System.out.println(pessoa.StatusPessoa());
		System.out.println("================================================");	
					
//***************************************************************		
//		Dados digitalizados pelo usuário para alteração:		*
//																*
//***************************************************************		
		System.out.println("Digite o número que você deseja mudar: [1] para nome, [2] para cpf, [3] para idade ");
		String operacao = dados.nextLine();
			switch (operacao) {
				case "1":
					System.out.println("Digite o nome da pesssoa: ");
					pessoa.setNome(dados.nextLine());
					break;
				case "2":
					System.out.println("Digite o CPF da pesssoa: ");
					pessoa.setCpf(dados.nextLine());
					break;
				case "3":
					System.out.println("Digite a idade da pesssoa: ");
					pessoa.setIdade(dados.nextLine());
					break;
				default:
					System.out.println("Case incorreta!! \nDigite o número correto");
					break;
				}
		System.out.println(pessoa.StatusAlterarPessoa());

				
//***********************************************************		
//		Dados digitalizados para alteração:					*
//															*
//***********************************************************		
		pessoa.setNome("Dijael Ramos");
		pessoa.setIdade("20");
		pessoa.setCpf("111.555.666-87");
		System.out.println(pessoa.StatusPessoa());
		System.out.println("================================================");
		
						
//***********************************************************		
//		Dados digitalizados para alteração:					*
//															*
//***********************************************************		
		pessoa.setIdade("52");
		System.out.println(pessoa.StatusAlterarPessoa());
	}
}
