package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
		
		Compra compra1 = new Compra();
		compra1.cliente = "João Pedro";		
		compra1.adicionarItem("Caneta", 20, 7.45);
		compra1.adicionarItem(new Item("Borracha", 12, 2.89));
		compra1.adicionarItem(new Item("Caderno", 3, 18.79));
		compra1.adicionarItem("Marca pagina", 3, 1.00);
		
		System.out.println("Quantidade de itens " + compra1.itens.size()); // Verificando quantidade de itens da compra
		System.out.println("O valor total da compra é de R$ " + compra1.obterValorTotal()); // Retornando o valor total da compra
	
		// Sao para mostrar a realacao bidirecional!!!
		double total = compra1.itens.get(0).compra.itens.get(1).compra.obterValorTotal();
		System.out.println("O total é " + total);
		
		System.out.println("*****");
		System.out.println("Compra do cliente " + compra1.cliente);
		System.out.println("Itens: \n");
		for(Item itens: compra1.itens) {
			System.out.println("Produto: " +  itens.nome);
			System.out.println("Quantidade: " +  itens.quantidade);
			System.out.println("Preço S$ " +  itens.preco);
			System.out.println("**");
		}
		System.out.println("Total a pagar: " + total);
		System.out.println("*****");
	}
}
