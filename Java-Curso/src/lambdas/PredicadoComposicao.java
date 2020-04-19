package lambdas;

import java.util.function.Predicate;

public class PredicadoComposicao {

	public static void main(String[] args) {
		
		Predicate<Integer> isPar = num -> num % 2 == 0; // Verificando número parImpar
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999; // Verifica se o número é descimal
	
		System.out.println(isPar.and(isTresDigitos).negate().test(221)); //
		System.out.println(isPar.or(isTresDigitos).test(221));
	}
}
