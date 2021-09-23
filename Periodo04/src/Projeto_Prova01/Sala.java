package Projeto_Prova01;

import java.util.ArrayList;

public class Sala {

	ArrayList<Aluno> listaDeAlunos;

	public Sala() {
		this.listaDeAlunos = new ArrayList<>();
	}

	void insereAluno(Aluno novo) {
		novo.calculaNotas(); 
		listaDeAlunos.add(novo);
	}
	
	void listarAlunos() {
		System.out.println("\n########################");
		System.out.println("\nLista de alunos");
		
		for(Aluno alunoNaLista : listaDeAlunos) {
			alunoNaLista.listar();
		}
		System.out.println("\n########################");
	}
	
	void listarSituacoes() {
		System.out.println("\n########################");
		System.out.println("\nSituações");
		
		for(Aluno alunoNaLista : listaDeAlunos) {
			alunoNaLista.mostrarSituacoes();
		}
	}
}
