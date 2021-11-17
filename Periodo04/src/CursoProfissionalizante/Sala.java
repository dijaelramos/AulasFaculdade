package CursoProfissionalizante;

import java.util.ArrayList;

public class Sala extends Aluno {

	static int totAlunos = 20;
	static public ArrayList<Aluno> novoAluno = new ArrayList<Aluno>();
	
	static public boolean matricularAluno(String matricula, String nome, String cpf, int idade) {
		Aluno a = new Aluno(matricula, nome, cpf, idade);
		if(novoAluno.size() <= totAlunos) {
			if(novoAluno.add(a)) {
				return true;
			}
		}
		return false;
	}
	static public int retornarPosicaoAluno(String matricula) {
		for(Aluno a : novoAluno) {
			if(a.getMatricula().equalsIgnoreCase(matricula)) {
				return novoAluno.indexOf(a);
			}
		}
		return -1;
	}
	static public boolean removerAluno(String matricula) {
		for(Aluno a : novoAluno) {
			if(a.getMatricula().equalsIgnoreCase(matricula)) {
				novoAluno.remove(a);
				return true;
			}
		}
		return false;
	}

	
	static public boolean pesquisarAluno(String matricula) {
		for(Aluno a : novoAluno) {
			if(a.getMatricula().equalsIgnoreCase(matricula)) {
				return true;
			}
		}
		return false;
	}	
}






