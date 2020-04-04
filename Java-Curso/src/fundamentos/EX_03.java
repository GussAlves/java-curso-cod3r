package fundamentos;

import java.util.Scanner;

public class EX_03 {

	/**
	 * Criar um programa que leia o peso e a 
	 * altura do usuário e imprima no console o IMC.
	 */
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Insira o seu peso: ");
		double peso = sc.nextDouble();
		
		System.out.print("Insira o sua altura: ");
		double altura = sc.nextDouble();
		
		double imc = peso / (altura*altura);
		
		System.out.printf("Atualmente o seu IMC é de %.2f!",imc);
		
		sc.close();
	}

}
