package br.edu.uninassau.menutestes;

import br.edu.uninassau.conexaobanco.ConexaoMySQL;

public class MenuPrincipal_Banco {

	public static void main(String[] args) {
			
		System.out.println( ConexaoMySQL.statusConection()); //Serve para saber se estar conectado ou n�o
		ConexaoMySQL.getConexaoMySQL(); // Serve para fazer a conex�o do Banco
		System.out.println( ConexaoMySQL.statusConection()); //Serve para saber se estar conectado ou n�o
		ConexaoMySQL.FecharConexao(); // Vai fechar a conex�o com o Banco
	}
}