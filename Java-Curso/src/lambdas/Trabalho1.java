package lambdas;

public class Trabalho1 implements Runnable {
	
	/*
	 * Exemplo 1
	 * Criando uma classe Trabalho1 e implementando essa com a interface Runneble 
	 * Essa vem com obrigação de criar o método run 
	 * 
	 */
	
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Trabalho #01");
			try { // Prevensão de erros 
				Thread.sleep(100);
			}catch (Exception e) {
			}
		}
	}
}