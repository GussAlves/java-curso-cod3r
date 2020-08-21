package oo.composicao;

import java.util.ArrayList;
import java.util.List;

public class Aluno {

	final String nome;
	final List<Curso> cursos = new ArrayList<>();
	
	Aluno(String nome){ // Criando um contrutor para aluno
		this.nome = nome;
	}
	
	void adicionarCurso(Curso curso) { // Metodo para vincular um curso ao aluno
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Curso obterCursoPorNome(String nome) {
		Curso procurado = null;
		
		for(Curso curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		return procurado;
	}
	
	public String toString() {
		return nome;
	}
}
