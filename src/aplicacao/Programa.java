package aplicacao;
/*
 * Funções que recebem funções como parâmetros
 * Programa que, a partir de uma lista de produtos, 
 * calcule a soma dos preços somente dos produtos cujo nome começa com "T".
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
		
		//Agora é só passar a expressão lambda como predicado
		double soma = ps.filtroSoma(list, p -> p.getNome().charAt(0) == 'T');
		
		System.out.println("Soma = "+ String.format("%.2f", soma));

	}

}
