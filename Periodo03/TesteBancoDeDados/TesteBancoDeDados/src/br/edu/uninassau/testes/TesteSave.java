package br.edu.uninassau.testes;

import br.edu.uninassau.classes.Aluno;
import br.edu.uninassau.repositorio.AlunoRepositorio;

public class TesteSave {

	public static void main(String[] args) {

		Aluno aluno = new Aluno();
		aluno.setMatricula("20210505");
		aluno.setNome("maria francisca da silva");
		aluno.setEmail("mariafrancisca@gmail.com");

		
		AlunoRepositorio repositorio = new AlunoRepositorio();
		repositorio.save(aluno);
		
		
	}

}
