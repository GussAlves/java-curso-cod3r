package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que dia da semana � hoje? ");
		String resposta = sc.next();
		resposta = resposta.toUpperCase();
		
		// .equals utilizado para comparar a resposta em String
		if ("DOMINGO".equals(resposta)) {
			System.out.println("hoje � o 1� dia da semana!");
		}else if ("SEGUNDA".equals(resposta)) {
			System.out.println("hoje � o 2� dia da semana!");
		}else if ("TER�A".equals(resposta) || "TERCA".equals(resposta)) {
			System.out.println("hoje � o 3� dia da semana!");
		}else if ("QUARTA".equals(resposta)) {
			System.out.println("hoje � o 4� dia da semana!");
		}else if ("QUINTA".equals(resposta)) {
			System.out.println("hoje � o 5� dia da semana!");
		}else if ("SEXTA".equals(resposta)) {
			System.out.println("hoje � o 6� dia da semana!");
		}else if ("SABADO".equals(resposta)) {
			System.out.println("hoje � o 7� dia da semana!");			
		}else {
			System.out.println("Dia n�o encontrado :(");
		}
		sc.close();
	}
}
