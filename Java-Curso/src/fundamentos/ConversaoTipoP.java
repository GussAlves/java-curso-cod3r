package fundamentos;

public class ConversaoTipoP {

	public static void main(String[] args) {
		
		double a = 1; //Implícita
		System.out.println(a);
		
		// Trucando de double para float, valor sai cortado
		float b = (float) 1.123456788888; // Explícita (CAST); 
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Explícita (CAST); 
		System.out.println(d);
	}
}
