package lambdas;

public class Threads {

	public static void main(String[] args) {

		// Classe para disparar jobs simultaneos 
		
		Runnable trabalho1 = new Trabalho1(); // Exemplo 1
		Runnable trabalho2 = new Runnable() { // Exemplo 2
			public void run() {
				for (int i = 0; i < 10; i++) {
					System.out.println("Trabalho #02");
					try {
						Thread.sleep(100);
					} catch (Exception e) {
					}
				}
			}
		};
		
		Runnable trabalho3 = Threads::trabalho3; // Method Reference // Exemplo 3
		
		// Thread serve para disparar job's simultaneos 
		Thread t1 = new Thread(trabalho1);
		Thread t2 = new Thread(trabalho2);
		Thread t3 = new Thread(trabalho3);
		
		// Startando jobs
		t1.start();
		t2.start();
		t3.start();
	}
	
	// Exemplo 3 
	// Criamos um método statico para usar com Method Reference 
	static void trabalho3() {
		for (int i = 0; i < 10; i++) {
			System.out.println("Trabalho #03");
			try {
				Thread.sleep(100);
			}catch (Exception e){
			}
		}
	}
}