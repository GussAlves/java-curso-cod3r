package streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {
		
		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luna", 6.1);
		Aluno a3 = new Aluno("Gui", 8.1);
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Maria", 10);
		
		List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);
		
		System.out.println("Distinct.. "); // Serve para tirar os objetos duplicados
		alunos.stream().distinct().forEach(System.out::println);
		
		System.out.println("\nSkip/Limit..."); // Pular Objetos da fila 
		alunos.stream()
			.distinct()
			.skip(2) // Pula 
			.limit(2) // Para 2 antes de acabar a lista
			.forEach(System.out::println);
		
		System.out.println("\ntakeWhile..."); // Enquanto foi true ele continua 
		alunos.stream()
			.distinct()
			.skip(2)
			.takeWhile(a -> a.nota >= 7.0) // Condição 
			.forEach(System.out::println);
		
	}
}
