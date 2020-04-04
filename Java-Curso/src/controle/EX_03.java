package controle;

import java.util.Scanner;

public class EX_03 {
	
public static void main(String[] args) {
	
		// Criar um programa que calcule a média do aluno e verifique se ele está aprovado!! 
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite a primeira nota: ");
		float nota1 = sc.nextFloat();
		System.out.print("Digite a segunda nota: ");
		float nota2 = sc.nextFloat();
		float mediaFinal = (nota1 + nota2) / 2; 
		
		if (mediaFinal >= 7 ) {
			System.out.println("Aluno Aprovado!");
		}else if (mediaFinal > 4 && mediaFinal < 7) {
			System.out.println("Aluno Aprovado!");
		}else { 
			System.out.println("Aluno Aprovado!");
		}
		sc.close();
	}
}
