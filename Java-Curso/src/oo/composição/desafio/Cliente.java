package oo.composição.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {

	String nome;
	List<Compra> compras = new ArrayList<>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	// Método para adicionar uma nova compra ao cliente
	void adicionarCompra(Compra compra) {
		this.compras.add(compra);
	}
	
	// Método para somar todos os itens da compra 
	double obterValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.obterValorTotal();
		}
		
		return total;
	}
}
