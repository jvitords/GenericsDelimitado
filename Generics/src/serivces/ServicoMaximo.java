package serivces;

import java.util.List;

public class ServicoMaximo {

	public static <T extends Comparable<T>> T calclularMaxima(List<T> listaDeItens) { 
		// O "extends Comparable" foi usado p/ herdar o método "compoareTo" da super class, que no caso é a "Porduto".
		// Acima colocamos static pois o método será chamado sem precisar inicializar a classe.
		
		
		if(listaDeItens.isEmpty()) {
			throw new IllegalStateException("Não existe itens na lista!");
		}
		
		T maximoDaLista = listaDeItens.get(0);
		for(T item : listaDeItens) {
			if(item.compareTo(maximoDaLista) > 0) { // compara(através da class "Produto") o item atual do loop com a váriavel "maximoDaLista"
				maximoDaLista = item;
			}
		}
		return maximoDaLista;
	}
}
