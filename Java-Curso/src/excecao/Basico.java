package excecao;

public class Basico {

	public static void main(String[] args) {
		
		try { // Abrindo exceção para o erro ArithmeticException 
			System.out.println(7 / 0);
		} catch (ArithmeticException e) { // O que o sistema deve fazer 
			System.out.println("Ocorreu o erro: " 
					+ e.getMessage()); // getMessage printa o erro 
		}
		
		// Linha de codigo rodada após o tratamento de erro 
		System.out.println("Fim:) "); 
	}	
}