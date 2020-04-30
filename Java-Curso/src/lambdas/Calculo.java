package lambdas;

@FunctionalInterface
public interface Calculo { // interface é abstrata

	double executar(double a, double b); // Mesmo não declarando o executar é public e abstract
	
	// Na interface funcional é possível criar um método default conforme o exeplo abaixo 
	default String legal() {
		return "Legal";
	}
	
	// Também é possível ter um método statico
	static String muitoLegal() {
		return "Muito legal";
	}
	
	// Teste 
}