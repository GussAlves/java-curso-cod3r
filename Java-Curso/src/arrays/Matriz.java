package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos alunos para cadastar as notas: ");
		int qtdaAlunos = sc.nextInt();
		
		System.out.print("Quantas notas por aluno: ");
		int qtdaNotas = sc.nextInt();
		
		double[][] notasAlunos = new double[qtdaAlunos][qtdaNotas];
		
		// Matriz utilizando dois laços com for
		double total = 0;
		for (int i = 0; i < notasAlunos.length; i++) {
			for (int j = 0; j < notasAlunos[i].length; j++) {
				System.out.printf("Insira a nota %d do aluno %d: ", j + 1, i + 1);
				notasAlunos[i][j] = sc.nextDouble();
				total += notasAlunos[i][j];
			}
		}
		
		double media = total / (qtdaAlunos * qtdaNotas);
		System.out.println("Media da turma é de " + media);
		
		for(double[] notas: notasAlunos) { // Utilizando foretch para verificar as notas dos alunos 
			System.out.println(Arrays.toString(notas));
		}
		
		System.out.println(Arrays.toString(notasAlunos));
		
		sc.close();
	}
}