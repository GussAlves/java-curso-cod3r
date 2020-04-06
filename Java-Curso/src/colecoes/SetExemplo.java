package colecoes;

import java.util.HashSet;
import java.util.Set;

public class SetExemplo {

	/**
	 * Pode ser heterogêneo
	 * Pode ser Homogênio
	 * Não aceita obj. duplicados
	 * Pode ser ordenado
	 * Não é indexado
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" }) // Silencia as advertencias
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet(); // Declarando Set
		
		conjunto.add(1.2); // Adicionando valores
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println("Tamanho é " + conjunto.size()); // Verificando o tamanho do HashSet
		
		System.out.println(conjunto.remove("teste")); // Removendo items 
		System.out.println(conjunto.remove("Teste"));
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é " + conjunto.size()); 
		
		System.out.println(conjunto.contains('x')); // verifica se tem o x dentro do set // Retorna boolean
		System.out.println(conjunto.contains(1));
		System.out.println(conjunto.contains(true));
		
		Set nums = new HashSet(); // Declarando HashSet utilizando Set
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		// conjunto.addAll(nums); // União entre dois conjuntos
		
		conjunto.retainAll(nums); // Retem o que está no outro conjunto // Interseção! 
		System.out.println(conjunto);
		
		conjunto.clear(); // Limpa o HashSet
		System.out.println(conjunto);
		
	}
}
