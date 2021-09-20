package Projeto_Prova01;

import java.util.ArrayList;

public class Aluno {

	private float total;
	private String nome, cpf, situacao = "Reprovado";
	private ArrayList<Float> notasAluno = new ArrayList<>();

	public Aluno() {

	}

	public Aluno(String nome, String cpf) {
		setNome(nome);
		setCpf(cpf);
	}

	void insereNotas(float nota) {
		notasAluno.add(nota);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public ArrayList<Float> getNotasAluno() {
		return notasAluno;
	}

	public void setNotasAluno(ArrayList<Float> notasAluno) {
		this.notasAluno = notasAluno;
	}

	void listar() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("CPF: " + this.cpf);

		for (int i = 0; i < notasAluno.size(); i++) {
			System.out.println("Nota " + (i + 1) + ": " + this.notasAluno.get(i));
		}
	}

	void mostrarSituacoes() {
		System.out.println("\nNome: " + this.nome);
		System.out.println("\nTotal: " + this.total);
		System.out.println("\nSituação: " + this.situacao);
	}

	void calculaNotas() {
		for (float notaDaLista : notasAluno) {
			total += notaDaLista;

		}
		if (total >= 70) {
			this.situacao = "Aprovado!";
		} else {
			this.situacao = "Reprovado!";
		}
	}
}
