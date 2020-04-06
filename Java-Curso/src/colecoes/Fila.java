package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<>();
		
		// Offer e add -> adicionam elementos a fila
		// Diferença é o comportamento ocorre quando a fila está cheia!
		fila.add("Ana"); // Retorna false
		fila.offer("Bia"); // Lança uma exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafaela");
		fila.offer("Gui");
		
		// peek e element -> obter o próximo elemento da fila (Sem resolver)
		// Diferença é o comportamento ocorre quando a fila está vazia!
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.element()); // Lança uma exceção
		
		// Diferenã é o comportamento ocorre quando a fila está vazia
		
		System.out.println(fila.poll()); // retorna false
		System.out.println(fila.remove()); // Lança uma exceção
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.remove());
		
		// fila.size(); // Verifica o tamanho da fila
		// fila.clear(); // Limpa a fila
		// fila.isEmpty(); // Verifica se a fila está vazia 
		//fila.contains(..); 
	}
}