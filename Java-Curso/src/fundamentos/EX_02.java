package fundamentos;

import java.util.Scanner;

public class EX_02 {

	/**
	 * Criar um programa que leia a temperatura em Fahrenheit 
	 * e converta para Celsius.
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//(F - 32) * 5/9 = 0
		double constante = 5 / 9.0;
		double alteracao = 32;
		
		System.out.print("Qual sua temperatura em Fahrenheit: ");
		double num = sc.nextDouble();
		
		double total = (num - alteracao) * constante;
		
		System.out.printf("Sua temperatura em Celcius é de %.1fºC.", total);
		
		sc.close();	
	}
}
