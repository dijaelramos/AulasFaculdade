package Lista;

import Entidades.Cliente;
import Entidades.Pedido;

public class ExemploListaEncadeada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListaEncadeada listaPedidos = new ListaEncadeada();
		
		Cliente danilo = new Cliente("Danilo Farias", "111222333-44", "Recife, Boa Vista, Av-Manoel Borbam, N-989, Ap-210", "99998888");
		Pedido pedidoDanilo = new Pedido(danilo, "Pizza G Calabreza", 42.9, "Crédito");
		listaPedidos.addFim(pedidoDanilo);
		
		Cliente roberto = new Cliente("Roberto Melo", "111444555-99", "Olinda, Bairro Novo, R-Ondina, N-85", "99887766");
		Pedido pedidoRoberto = new Pedido(roberto, "Pizza G Portugueza", 44.9, "Dinheiro");
		listaPedidos.addFim(pedidoRoberto);
		
		Cliente thayna = new Cliente("Thayna Oliveira", "22335588-99", "Recife, Pina, R-Capitão Teimoso, N-234, Ap-207", "99887755");
		Pedido pedidoThayna = new Pedido(thayna, "Pizza M Calabrezza, Refrigerante 1L", 36.99, "Débito");
		listaPedidos.addFim(pedidoThayna);
		
		Cliente isis = new Cliente("Maria Isis", "123456789-96", "Recife, Pina, R-Capitão Teimoso, N-234, Ap-1207", "987456123");
		Pedido pedidoIsis = new Pedido(isis, "Pizza G Marguerita", 39.99, "Débito");
		listaPedidos.addInicio(pedidoIsis);
		
		Pedido pedidoIsis2 = new Pedido(isis, "Pizza M Brigadeiro", 29.99, "Débito");
		
		System.out.println(listaPedidos.toString());
		System.out.println(listaPedidos.buscarIndElemento(pedidoRoberto));
		System.out.println(listaPedidos.buscarNo(pedidoIsis).getElemento().toString());
		System.out.println(listaPedidos.buscarIndElemento(pedidoIsis2));
		
		System.out.println(listaPedidos.removerElemento(pedidoRoberto));
		System.out.println(listaPedidos);
		
		System.out.println(listaPedidos.removerElemento(pedidoThayna));
		System.out.println(listaPedidos);
		
		System.out.println(listaPedidos.removerInicio());
		System.out.println(listaPedidos);
		
		System.out.println(listaPedidos.removerFim());
		System.out.println(listaPedidos);
		
		listaPedidos.addFim(pedidoDanilo);
		listaPedidos.addFim(pedidoIsis);
		listaPedidos.addFim(pedidoRoberto);
		listaPedidos.addFim(pedidoThayna);
		System.out.println(listaPedidos.toString());
		listaPedidos.esvaziarLista();
		System.out.println(listaPedidos.toString());
	}

}
