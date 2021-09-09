package Lista;

import Entidades.Participante;

public class ExemploListaSorteio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ListaSorteio listaAlunos = new ListaSorteio(20);
		System.out.println(listaAlunos.estaVazia());
		System.out.println(listaAlunos.getCapacidade());
		
		Participante danilo = new Participante("Danilo Farias", "danilo.silva@uninassau.edu");
		Participante silas = new Participante("Silas Buarque", "silas@uninassau.edu");
		Participante luan = new Participante("Luan Edgar", "luan@uninassau.edu");
		Participante fabio = new Participante("Fábio Campos", "fabio@uninassau.edu");
		Participante alexandre = new Participante("Alexandre Souza", "alexandre@uninassau.edu");
		Participante joao = new Participante("João Victor", "joao@uninassau.edu");
		
		listaAlunos.adicionar(danilo);
		listaAlunos.adicionar(silas);
		listaAlunos.adicionar(luan);
		listaAlunos.adicionar(fabio);
		listaAlunos.adicionar(alexandre);
		listaAlunos.adicionar(joao);
		
		
		System.out.println(listaAlunos.qtdElementos());
		System.out.println(listaAlunos.buscarIndiceElemento(luan));
		System.out.println(listaAlunos.buscarElementoIndice(3).toString());
		System.out.println(listaAlunos.toString());
		listaAlunos.remover(danilo);
		System.out.println(listaAlunos.toString());
		
		System.out.println("\n\n" + listaAlunos.sortearElemento());

	}

}
