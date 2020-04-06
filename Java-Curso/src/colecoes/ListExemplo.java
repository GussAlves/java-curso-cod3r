package colecoes;

import java.util.ArrayList;
import java.util.List;

public class ListExemplo {

	/**
	 * Pode ser Hetergêneo
	 * Pode ser Homogênio
	 * Aceita obj. duplicados
	 * É ordenado
	 * É indexado
	 */
	
	public static void main(String[] args) {
		List<Usuario> lista = new ArrayList<>(); // Declarando List com ArrayList
		
		Usuario u1 = new Usuario("Ana"); // Declarando o usuário
		
		lista.add(u1);
		lista.add(new Usuario("Carlos")); // Declarando o usuário diretamente dentro da lista 
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		System.out.println(lista.get(3)); // Acessar pelo indice
		
		System.out.println(">>>>" + lista.remove(1));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("Tem? " + lista.contains(new Usuario("Lia")));
		System.out.println("Tem? " + lista.contains(u1));
		
		for(Usuario u: lista) {
			System.out.println(u);
		}
	}
}