package br.edu.uninassau.menutestes;
																		//*******************************************************************
import java.util.ArrayList;												//		VERIFICAR ESSA CLASSE DE LISTAR PARA VER SE ESTA CORRETO	*
import java.util.List;

//*******************************************************************
import br.edu.uninassau.bancodedados.AlunoBD;							
import br.edu.uninassau.salas.Alunos;

public class MenuListar {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
	
		AlunoBD aluno = new AlunoBD ();
		try {
			ArrayList<Alunos> alunos = aluno.listar ();
			
//			if (aluno.size() > 0 ) {																	//************************************************************
			if (((List<Alunos>) aluno).size() > 0 ) {											// Verificar de onde foi que o professor utilizou esse "size"
				System.out.println("===== Alunos =====");						//************************************************************
	
				for (Alunos alunos1 : alunos) {
					System.out.println(alunos1.getMatricula() + " - " + alunos1.getNome());
					
				} {
				} 		
			} else {
				System.out.println("===== LISTA DE ALUNOS VAZIA =====");	
			}
			
		} catch (Exception e) {
			System.out.println("===== ERRO NA TENTATIVA DE LISTAR ALUNOS! =====");
						
		}
	}
}