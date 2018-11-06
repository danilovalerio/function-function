package model.services;

import java.util.List;

import entities.Produto;

public class ProdutoService {
	
	public double filtroSoma(List<Produto> lista) {
		double soma = 0;
		for(Produto p : lista) {
			if(p.getNome().charAt(0) == 'T') {
				soma += p.getPreco();				
			}
		}
		
		return soma;
	}

}
