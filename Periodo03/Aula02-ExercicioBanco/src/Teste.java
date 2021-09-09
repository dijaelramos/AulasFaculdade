import br.edu.uninassau.classes.ContaCorrente;
import br.edu.uninassau.classes.PessoaFisica;
import br.edu.uninassau.negocio.ContaCorrenteNegocio;

public class Teste {

	public static void main(String[] args) {
		PessoaFisica pf1 = new PessoaFisica("12345678901", "joao", 22, "rua antonio borba, 23", "professor");
		ContaCorrente conta1 = new ContaCorrente("1234", "03332", 445, pf1);
		
		
		PessoaFisica pf2 = new PessoaFisica("22233344455", "maria", 20, "rua antonio borba, 23", "vendedora");
		ContaCorrente conta2 = new ContaCorrente("3331", "00555", 1000, pf2);

		ContaCorrenteNegocio negocio1 = new ContaCorrenteNegocio(conta1);
		ContaCorrenteNegocio negocio2 = new ContaCorrenteNegocio(conta2);
				
		
		negocio1.mostrarSaldo();
		negocio2.mostrarSaldo();
		
		negocio1.depositar(300);
		negocio1.mostrarSaldo();
		negocio2.mostrarSaldo();
		
		
		negocio1.transferir(conta2, 700);
		negocio1.mostrarSaldo();
		negocio2.mostrarSaldo();
		
		negocio1.sacar(100);
		negocio1.mostrarSaldo();
		negocio2.mostrarSaldo();
		
	}

}
