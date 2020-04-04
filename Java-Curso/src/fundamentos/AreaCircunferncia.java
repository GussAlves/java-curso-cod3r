package fundamentos;

public class AreaCircunferncia {

	public static void main(String[] args) {
		double raio = 3.4;
		final double PI = 3.14159; //Constante deixamos com caixa alta 
		
		double area = PI * raio * raio;
		
		System.out.println(area);
		
		//Alterando valores sem declarar qual o tipo da variável
		raio = 10;
		area = PI * raio * raio;
		System.out.println("Área = " + area + "m2."); //Print str + double
	}
}
