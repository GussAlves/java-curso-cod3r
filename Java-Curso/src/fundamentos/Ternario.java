package fundamentos;

import java.util.Scanner;

public class Ternario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira a m�dia do aluno: ");
		double media = sc.nextDouble();
		
		// ? Serve para realizar uma pergunta a String 
		String resultadoRecuperacao = media >= 5.0 ? "em recupe��o." : "reprovado."; 
		String resultado = media >= 7.0 ? "Aprovado." : "em recupera��o.";
		
		// Print 
		System.out.println("O aluno est� " + resultado);
		System.out.println("O aluno est� " + resultadoRecuperacao);
		
		sc.close();
	}
}
