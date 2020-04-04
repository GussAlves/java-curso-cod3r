package arrays;

import java.util.Arrays;

public class Exercicio {

	public static void main(String[] args) {

		double[] notasAlunoA = new double[3];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double total = 0;
		for(int i = 0; i < notasAlunoA.length; i++) { // Array.length é possível medir o tamanho do Array
			total += notasAlunoA[i];
		}
		
		System.out.println(total / notasAlunoA.length);
		
		double[] notasAlunoB = { 6.9, 8.9, 5.5, 10 }; // Incluindo dados com {}
		
		for(double nota : notasAlunoB) { // Laço ForEach
			System.out.println(nota);
		}
	}
}
