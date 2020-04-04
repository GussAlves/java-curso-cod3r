package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
		// Ker num1
		// Ler num2
		// + - * / %
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número 1: ");
		int num1 = sc.nextInt();
		
		System.out.print("Insira o número 2: ");
		int num2 = sc.nextInt();
		
		System.out.print("Qual operação você quer usar: ");
		String operacao = sc.next();
		
		double resultado = "+".equals(operacao) ? num1 + num2 : 0;
		resultado = "-".equals(operacao) ? num1 - num2 : resultado;
		resultado = "*".equals(operacao) ? num1 * num2 : resultado;
		resultado = "/".equals(operacao) ? num1 / num2 : resultado;
		resultado = "%".equals(operacao) ? num1 % num2 : resultado;
		
		System.out.printf("%.2f %s %.2f = %.2f", num1, operacao, num2, resultado);
		
		sc.close();
	}
}
