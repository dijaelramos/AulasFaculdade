package br.edu.uninassau.testes;

import br.edu.uninassau.conexaobanco.ConexaoMySQL;

public class TesteBanco {

	public static void main(String[] args) {
		/*
		ConexaoMySQL conn = new ConexaoMySQL();
		
		System.out.println( conn.statusConection() );
		
		conn.getConexaoMySQL();

		System.out.println( conn.statusConection() );
		*/		
		
		
		System.out.println( ConexaoMySQL.statusConection() );
		ConexaoMySQL.getConexaoMySQL();
		System.out.println( ConexaoMySQL.statusConection() );
		ConexaoMySQL.FecharConexao();

	}

}
