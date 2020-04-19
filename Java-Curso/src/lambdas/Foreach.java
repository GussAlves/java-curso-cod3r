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
		System.out.println("\nMethod Reference...");
		aprovados.forEach(System.out::println);
	}	
}