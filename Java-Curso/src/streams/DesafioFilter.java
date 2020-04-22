package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {

	// Usando 2 filters
	// 2 expressoes lambda
	// MAP no final
	
	public static void main(String[] args) {
		
		Personagens batman = new Personagens("Batman", 70.5, 20.4, 100);
		Personagens naruto = new Personagens("Naruto", 100.0, 5.4, 100);
		Personagens jaspion = new Personagens("Jaspion", 80.0, 40.0, 100);
		Personagens ironMan = new Personagens("Iron-Man", 50.0, 100.0, 80);
		Personagens sonic = new Personagens("Sonic", 5.0, 40.0, 2);
		
		List<Personagens> personagens = Arrays.asList(batman, naruto, jaspion, ironMan, sonic);
		
		Predicate<Personagens> fullLife = p -> p.vida == 100;
		
		Predicate<Personagens> apelao = p -> p.dano < 100;
		
		Function<Personagens, String> format = p -> p.nome + "!!!";
		
		personagens.stream()
			.filter(fullLife)
			.filter(apelao)
			.map(format)
			.forEach(Utilitarios.println);
	}
}
