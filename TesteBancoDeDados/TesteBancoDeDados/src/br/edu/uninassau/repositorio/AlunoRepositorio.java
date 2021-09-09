package br.edu.uninassau.repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import br.edu.uninassau.classes.Aluno;
import br.edu.uninassau.conexaobanco.ConexaoMySQL;


public class AlunoRepositorio {
	
//	ConexaoMySQL conn;
	
	public void save(Aluno aluno) {
		Connection conn = ConexaoMySQL.getConexaoMySQL();
		
		String sql = "INSERT INTO Alunos (matricula, nome, email) VALUES (?, ?, ?)";	
		
		try {
			//	preparando...
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, aluno.getMatricula());
			ps.setString(2,  aluno.getNome());
			ps.setString(3,  aluno.getEmail());
			
			//	executa a instrução
			ps.execute();
			
			System.out.println("=== SALVO COM SUCESSO! ===");			
			
		} catch (SQLException e) {
			System.out.println("=== ERRO AO SALVAR! ===");
			e.printStackTrace();
		} finally {
			ConexaoMySQL.FecharConexao();
		}
		
	}

}
