package lambdas;

import java.util.function.Predicate;

public class Predicado {
	
	// Predicate le um tipo e retorna um boolean 

	public static void main(String[] args) {
		
		// Predicado retorna um valor Boolean
		// Declarando um predicado do tipo Produto, inserindo a condição de preço maior igual 
		Predicate<Produto> isCaro = prod -> (prod.PRECO * (1 - prod.DESCONTO)) >= 750;
		
		Produto produto = new Produto("Notebook", 3893.89, 0.15);
		System.out.println(isCaro.test(produto));
	}
}