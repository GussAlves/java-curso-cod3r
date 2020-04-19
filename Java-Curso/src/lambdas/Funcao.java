package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";
		
		Function<String, String> oResultadoE = valor -> "O Resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + "!!!";
		
		Function<String, String> duvida = valor -> valor + "???";

		// Utilizando o andThen para concatenar uma funcao a outra 
		String resultadoFinal = parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);
		System.out.println(resultadoFinal);

		String resultadoFinal2 = parOuImpar.andThen(oResultadoE).andThen(duvida).apply(32);
		System.out.println("\n" + resultadoFinal2);
		
		System.out.println(parOuImpar.apply(32)); 
	}
}