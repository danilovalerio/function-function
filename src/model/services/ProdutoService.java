package model.services;

import java.util.List;
import java.util.function.Predicate;

import entities.Produto;

public class ProdutoService {
	
	//aqui ser� passado agora um criterio como Predicado
	public double filtroSoma(List<Produto> lista, Predicate<Produto> criterio) {
		double soma = 0;
		for(Produto p : lista) {
			//teste gen�rico de qualquer predicado que chega como par�metro 
			if(criterio.test(p)) {
				soma += p.getPreco();				
			}
		}
		
		return soma;
	}

}
