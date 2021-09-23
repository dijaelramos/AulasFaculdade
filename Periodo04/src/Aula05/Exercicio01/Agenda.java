package Aula05.Exercicio01;

import java.util.ArrayList;

public class Agenda {
	private ArrayList<Pessoa> pessoas;

    public Agenda() {
        this.pessoas = new ArrayList<Pessoa>();
    }

    public void armazenarPessoa(String nome, int idade, double altura){
        this.pessoas.add(new Pessoa(nome, idade, altura));
    }

    public void removerPessoa(String nome){
        this.pessoas.removeIf(p -> p.getNome().equals(nome));
    }

    public int buscarPessoa(String nome){
        Pessoa pessoaProcurada = null;
        for (Pessoa p : this.pessoas) {
            if (p.getNome().equals(nome)){
                pessoaProcurada = p;
            }
        }

        return this.pessoas.indexOf(pessoaProcurada);
    }

    public void imprimirAgenda(){
        this.pessoas.forEach(pessoa -> System.out.println(pessoa));
    }

    public void imprimiPessoa(int index){
        System.out.println(this.pessoas.get(index + 1));
    }
	
	
}
