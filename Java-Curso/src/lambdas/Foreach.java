package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {

	public static void main(String[] args) {
	
		// Declarando uma lista com asList(..)
		List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");
		
		// Imprimindo a lista com Lambda
		System.out.println("\nLambida #01...");
		aprovados.forEach(nome -> System.out.println(nome + "!!!"));
		
		// Imprimindo a lista com Method Reference
		System.out.println("\nMethod Reference #01...");
		aprovados.forEach(System.out::println);
		
		System.out.println("\nLambida #02...");
		aprovados.forEach(nome -> meuImprimir(nome)); // Referência por método
		
		System.out.println("\nMethod Reference #02...");
		aprovados.forEach(Foreach::meuImprimir);
	}	
	
	static void meuImprimir(String nome) { // Função statica criada para printar o nome formatado
		System.out.println("Oi! Meu nome é " + nome);
	}
}