package fundamentos;

import java.util.Scanner;

public class EX_01 {

	/**
	 * Criar um programa que leia a temperatura em Celsius 
	 * e converta para Fahrenheit.
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// (c X 9/5) + 32 = F
		final double constante = 9 / 5.0;
		final double alteracao = 32;
	
		System.out.print("Insira a temperatura em Celcius: ");
		double num = sc.nextDouble();
		
		double total = (num * constante) + alteracao;
		
		System.out.printf("Atualmente sua temperatura em Fahrenheit é de %sºF", total);
		sc.close();
	}
}
