package fundamentos;

public class ConversaoTipoP {

	public static void main(String[] args) {
		
		double a = 1; //Impl�cita
		System.out.println(a);
		
		// Trucando de double para float, valor sai cortado
		float b = (float) 1.123456788888; // Expl�cita (CAST); 
		System.out.println(b);
		
		int c = 4;
		byte d = (byte) c; // Expl�cita (CAST); 
		System.out.println(d);
	}
}
