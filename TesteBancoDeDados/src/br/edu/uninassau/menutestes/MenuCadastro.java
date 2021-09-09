package br.edu.uninassau.menutestes;

import br.edu.uninassau.bancodedados.AlunoBD;
import br.edu.uninassau.salas.Alunos;

public class MenuCadastro {

	public static void main(String[] args) {

		Alunos aluno = new Alunos ();
		aluno.setMatricula("01");
		aluno.setCpf("111.526.000.65");
		aluno.setNome("Dijael Ramos Ferreira");
		aluno.setDtnascimento("20/02/2000");
		
		//Comando para salvar os alunos acima
		AlunoBD bd = new AlunoBD();
		bd.salvar(aluno);
	}
}
