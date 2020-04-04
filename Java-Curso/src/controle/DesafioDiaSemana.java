package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Que dia da semana é hoje? ");
		String resposta = sc.next();
		resposta = resposta.toUpperCase();
		
		// .equals utilizado para comparar a resposta em String
		if ("DOMINGO".equals(resposta)) {
			System.out.println("hoje é o 1º dia da semana!");
		}else if ("SEGUNDA".equals(resposta)) {
			System.out.println("hoje é o 2º dia da semana!");
		}else if ("TERÇA".equals(resposta) || "TERCA".equals(resposta)) {
			System.out.println("hoje é o 3º dia da semana!");
		}else if ("QUARTA".equals(resposta)) {
			System.out.println("hoje é o 4º dia da semana!");
		}else if ("QUINTA".equals(resposta)) {
			System.out.println("hoje é o 5º dia da semana!");
		}else if ("SEXTA".equals(resposta)) {
			System.out.println("hoje é o 6º dia da semana!");
		}else if ("SABADO".equals(resposta)) {
			System.out.println("hoje é o 7º dia da semana!");			
		}else {
			System.out.println("Dia não encontrado :(");
		}
		sc.close();
	}
}
