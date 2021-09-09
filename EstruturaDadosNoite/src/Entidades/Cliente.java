package Entidades;

public class Cliente {

	private String nome;
	private String cpf;
	private String endereco;
	private String telefone;

	public Cliente() {

	}

	public Cliente(String nome, String cpf, String endereco, String telefone) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
		this.telefone = telefone;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCpf() {
		return cpf;
	}
	
	public String toString() {
		String retorno = "Cliente: ";
		retorno += this.nome + " | ";
		retorno += "Cel.: " + this.telefone + " | ";
		retorno += "End.: " + this.endereco;
		return retorno;
	}

}