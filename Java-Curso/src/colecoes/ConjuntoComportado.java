package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {
		
		Set<String> listaAprovados = new HashSet<>(); // Declarando um HashSet como String
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
	
		for(String candidato: listaAprovados) { // Valores apresentados não irão aparecer na ordem que foram adicionados
			System.out.println(candidato);
		}
		
		System.out.println();
		
		Set<String> listaAprovados2 = new TreeSet<>(); // TreeSet vai salvar os dados com a order de inclusão!
		listaAprovados2.add("Ana");
		listaAprovados2.add("Carlos");
		listaAprovados2.add("Luca");
		listaAprovados2.add("Pedro");
		
		for(String candidato: listaAprovados2) {
			System.out.println(candidato);
		}
	}
}