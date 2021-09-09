package br.edu.uninassau.menutestes;

import br.edu.uninassau.bancodedados.AlunoBD;
import br.edu.uninassau.salas.Alunos;

public class MenuApagar {

	public static void main(String[] args) {
		
		Alunos aluno = new Alunos ();
		aluno.setMatricula("");
		
		
		//Comando para apagar os alunos acima
		AlunoBD bd = new AlunoBD();
		
		try {
			bd.apagar(aluno);
		}catch (Exception e) {
			System.out.println("===== ERRO AO DELETAR =====");
		}
	}
}
