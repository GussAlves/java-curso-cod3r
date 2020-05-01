package excecao;

import excecao.personalizadaA.NumeroForaIntervaloException;
import excecao.personalizadaA.StringVaziaException;

public class Validar {

	private Validar() {}
	
	public static void aluno(Aluno aluno) {
		
		if(aluno == null) {
			throw new IllegalArgumentException("O aluno está nulo!");
		}
		
		// isEmpty valida se o if é verdadeiro 
		if(aluno.nome == null || aluno.nome.trim().isEmpty()) {
			throw new StringVaziaException("nome");
		}
		
		if(aluno.nota < 0 || aluno.nota > 10) {
			throw new NumeroForaIntervaloException("nota");
		}
	}
}