package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {

	// Consumer le um Tipo e não retorna nada
	
	public static void main(String[] args) {
		
		// Criando lambda imprimir através da interface Consumer
		Consumer<Produto> imprimirNome = p -> System.out.println(p.NOME + "!!!");

		Produto p1 = new Produto("Caneta", 12.34, 0.09);
		imprimirNome.accept(p1); // Utilizando imprimir para mostrar objeto

		Produto p2 = new Produto("Notebook", 2989.99, 0.25);
		Produto p3 = new Produto("Caderno", 19.90, 0.03);
		Produto p4 = new Produto("Borracha", 7.80, 0.18);
		Produto p5 = new Produto("Lapis", 4.39, 0.19);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5); // Lista produtos 
		produtos.forEach(imprimirNome); // Foreach com a Lambda criada Imprimir
		produtos.forEach(p -> System.out.println(p.PRECO)); // Utilizando a expressar diretamente 
		// Utilizando Method Reference (Para usar assim temos que declarar um toString
		produtos.forEach(System.out::println); 
	}
}