package controle;

import java.util.Scanner;

public class IfElseIF {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("D�gita a nota: ");
		
		double nota = sc.nextDouble();
		
		if(nota > 10 || nota < 0) {
			System.out.println("Nota inv�lida!");
		} else if(nota >= 8.1) {
				System.out.println("Conceito A");
		} else {
			if(nota >= 6.1) {
				System.out.println("Conceito B");
			}
		}
		System.out.println("FIM!");
		sc.close();
	}
}
