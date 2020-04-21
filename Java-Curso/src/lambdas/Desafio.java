package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

	public static void main(String[] args) {
		
		/*
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8.5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixa duas casas decimais
		 * 5. Formatar: R$1234,56
		 */
		
		Produto p = new Produto("iPad", 3235.89, 0.13); // Declarando produto
		
		Function<Produto, Double> precoFinal = prod -> prod.PRECO * (1 - prod.DESCONTO); 
		
		UnaryOperator<Double> ImpostoMunicipal = valor -> valor >= 2500 ? valor * 1.085 : valor;
		
		UnaryOperator<Double> frete = valor -> valor >= 3000 ? valor + 100 : valor + 50;
		
		UnaryOperator<Double> arredondar = valor -> Double.parseDouble(String.format("%.2f", valor));
		
		// Função formatar ira puxar o double e retornar uma String 
		Function<Double, String> formatar = valor -> ("R$" + valor).replace(".", ",");
				
		String preco = precoFinal.andThen(ImpostoMunicipal)
				.andThen(frete).andThen(arredondar).andThen(formatar).apply(p);	
		
		System.out.println("O preço final é " + preco);
	}
}
