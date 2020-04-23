package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter2 {

	// Desconto maior que 30 
	// Frete Gratis 
	// Map nome do produto + Preço + Superpromoção 
	
	public static void main(String[] args) {
		
		Predicate<Produto> desconto = 
				d -> d.desconto >= 30;
		Predicate<Produto> freeteGratis = 
				f -> f.frete == true;
		Function<Produto, String> formate = 
				p -> "Super promoção " + p.nome + " por apenas R$" + String.format("%.2f", p.preco).replace(".", ",") + " + desconto de " + p.desconto + "%";
		
		Produto p1 = new Produto("Notebook", 2860.5, 15, true);
		Produto p2 = new Produto("Caderno", 10.0, 20, false);
		Produto p3 = new Produto("Caneta", 4, 40, false);
		Produto p4 = new Produto("TV 32p", 1300, 20, true);
		Produto p5 = new Produto("Fogão", 600, 30, true);
		
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		produtos.stream() // Pipeline de execução 
			.filter(freeteGratis)
			.filter(desconto)
			.map(formate)
			.forEach(Utilitarios.println);
	}
}