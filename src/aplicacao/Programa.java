package aplicacao;
/*
 * Fun��es que recebem fun��es como par�metros
 * Programa que, a partir de uma lista de produtos, 
 * calcule a soma dos pre�os somente dos produtos cujo nome come�a com "T".
 */

import java.util.ArrayList;
import java.util.List;

import entities.Produto;
import model.services.ProdutoService;

public class Programa {

	public static void main(String[] args) {
		
		List<Produto> list = new ArrayList<>();
		list.add(new Produto("Tv", 900.00));
		list.add(new Produto("Mouse", 50.00));
		list.add(new Produto("Tablet", 350.50));
		list.add(new Produto("HD Case", 80.90));
		
		ProdutoService ps = new ProdutoService();
		
		double soma = ps.filtroSoma(list);
		
		System.out.println("Soma = "+ String.format("%.2f", soma));

	}

}
