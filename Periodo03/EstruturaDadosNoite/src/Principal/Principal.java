package Principal;

import java.util.Date;

import Entidades.Cliente;
import Entidades.Conta;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Olá Mundo!");
		
		Cliente cliSilas;
		cliSilas = new Cliente("Silas Buarque Lira Neto", "123.456.789-00","Olinda", "8199999999");
		Conta contaSilas = new Conta(023407, cliSilas, 3560.30, 300, new Date());
		
		
		cliSilas.setNome("Silas Buarque Lira");
		System.out.println("O saldo de " + contaSilas.getCliente().getNome() + 
				" possui um saldo de R$ " + contaSilas.getSaldo());
		
	}

}
