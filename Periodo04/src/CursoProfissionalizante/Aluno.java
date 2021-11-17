package CursoProfissionalizante;

public class Aluno implements Comparable<Sala>{
	protected  String matricula;
	protected   String nome;
	protected  String cpf;
	protected  int idade;
	
	public Aluno() {
		super();
	}

	public Aluno( String matricula, String nome, String cpf, int idade) {
		super();
		this.matricula = matricula;
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	@Override
	public String toString() {
		return "\nMatricula: " + matricula  +
				"\nAluno: " + nome  + 
				"\nCPF:" + cpf +
				"\nIdade:" + idade + ".\n";
	}
	public int compareTo(Sala sala) {
		return getNome().compareToIgnoreCase(sala.getNome());
	}
}
//@Override 
//public int compareTo(Pessoa o) { 
//	return getNome().compareToIgnoreCase(o.getNome()); 
//	}








