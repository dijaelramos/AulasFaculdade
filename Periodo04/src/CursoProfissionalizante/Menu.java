package CursoProfissionalizante;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Menu extends Aluno {

	public static void main(String[] args) {
		int tela = 0;

		do {
			tela = Testes.exibirTela();

			switch (tela) {
			case 1:
				Sala.matricularAluno("1", "Zumira Crizodia", "111.111.111-11", 20);
				Sala.matricularAluno("2", "Papaleguas", "222.222.222-22", 25);
				Sala.matricularAluno("3", "Neymar Junior", "333.333.333-33", 30);
				Sala.matricularAluno("4", "Pedro Nunes", "444.444.444-44", 32);
				Sala.matricularAluno("5", "Nunes Pedro", "555.555.555-55", 21);
				Sala.matricularAluno("6", "Vein Diesel", "666.666.666-66", 18);
				Sala.matricularAluno("7", "Levandovisqui Brito", "777.777.777-77", 24);
				Sala.matricularAluno("8", "Jounclou Vandaime", "888.888.888-88", 32);
				Sala.matricularAluno("9", "Instivem Segal", "999.999.999-99", 33);
				Sala.matricularAluno("10", "Maicon Jecson", "101.010.101-01", 25);
				Testes.matricular();
				break;
			case 2:
				Testes.remover();
				break;
			case 3:
				Testes.retornarAluno();
				break;
			case 4:
				Testes.status();
				break;
			case 5:
				//Situação do aluno
				Testes.inserirNota();
				break;
			case 6:
				System.out.println("Saindo...");
				break;
			default:
				JOptionPane.showMessageDialog(null, "Opção inválida!", "ERRO NO DIGITO!", JOptionPane.ERROR_MESSAGE);
			}

		} while (tela != 6);
	}
}






