package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

	public static void main(String[] args) {
		
		// Representa uma operação que aceita um único argumento de entrada 
		// e não retorna nenhum resultado.
		Consumer<String> print = System.out::print;
		Consumer<Object> println = System.out::println;
		
		// Criando uma Stream 
		Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
		langs.forEach(print);
		
		// Criando uma lista para atribuila a uma Stream
		String[] maisLangs = { "Python ", "List ", "Perl ", "Go\n" };
		
		Stream.of(maisLangs).forEach(print); // Atribuindo a Stream
		Arrays.stream(maisLangs).forEach(print); // Usando Array para atribuir a Steam
		Arrays.stream(maisLangs, 1, 2).forEach(print);
		
		List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
		outrasLangs.stream().forEach(print);
		outrasLangs.parallelStream().forEach(print);
		
//		Stream.generate(() -> "a").forEach(println); // Stream infinita com Generate
		Stream.iterate(0, n -> n + 1).forEach(println); // Stream Infinita com Interate
		
	}
}