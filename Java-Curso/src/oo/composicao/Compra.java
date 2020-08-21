package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> itens = new ArrayList<>(); // Declarando um ArrayList para a classe Item
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
	}
	
	void adicionarItem(Item item) {
		this.itens.add(item);
		item.compra = this; 
	}
	
	double obterValorTotal() { // Metodo para verificar o valor total da compra
		double total = 0;
		
		for(Item item: itens) {  // Usando laço Foreath para realizar a soma total a compra 
			total += item.quantidade * item.preco;
		}
		
		return total;
	}
}