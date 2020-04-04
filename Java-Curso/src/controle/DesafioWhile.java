package controle;

import java.util.Scanner;

public class DesafioWhile {
	
	/**
	 * Media das notas de uma turma
	 * usu�rio ir� digitar uma nota v�lida de 0 a 10, quando ele digitar uma nota 
	 * valida essa ira ser agregada em uma v�riavel total, 
	 * O Programa ir� ter que ter uma variavel para contar a quantidade de alunos 
	 * o programa ir� fechar com -1
	 */

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	
		int nAlunos = 0;
		double input = 0;
		double total = 0;
		
		do {
			System.out.printf("\nFavor digite uma nota v�lida: ");
			input = sc.nextDouble();
			double nota = input;
			if (nota >= 0 && nota <= 10) {
				total = total + nota; 
				nAlunos++;
				System.out.printf("\nNota registrada! \ntotal de notas registradas: %s\n", nAlunos);
			}else if (input != -1) {
				System.out.println("Digite uma nota v�lida!");
			}
		} while(input != -1);
		
		System.out.printf("\nA m�dia da sala foi de %.2f pontos!", (total / nAlunos));
		
		sc.close();	
	}
}
