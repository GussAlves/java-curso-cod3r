package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<>();
		
		livros.add("O Pequeno Príncipe"); // retorna true/false
		livros.push("Harry potter");
		livros.push("Hobbit");
		
		System.out.println(livros.peek());
		System.out.println(livros.element());
		
		for(String book: livros) {
			System.out.println(book);
		}
		
		System.out.println(livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
	}
}