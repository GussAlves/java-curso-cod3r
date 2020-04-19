package lambdas;

public class CalculoTeste2 {

	public static void main(String[] args) {
		
		// Utilizando uma expressão Lambda para executar o método da interface Calculo
		Calculo calculo = (x, y) -> {return x + y; }; // 5
		System.out.println(calculo.executar(2, 3));
		
		// Quando não há o par de chaves ele irá retornar o resultado do mesmo
		calculo = (x, y) -> x * y;
		
		System.out.println(calculo.legal()); // Utilizando método Default 
		System.out.println(Calculo.muitoLegal());
	}
}