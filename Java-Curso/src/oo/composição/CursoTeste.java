package oo.composição;

public class CursoTeste {

	public static void main(String[] args) {
		
		// Adicinando alunos
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Maria");
		Aluno aluno3 = new Aluno("Pedro");
		
		// Adicionando cursos
		Curso curso1 = new Curso("Java Completo");
		Curso curso2 = new Curso("Web 2023");
		Curso curso3 = new Curso("React Native");
		
		// Atribuindo alunos a curso 
		curso1.adicionarAluno(aluno1);
		curso1.adicionarAluno(aluno2);
		
		curso2.adicionarAluno(aluno1);
		curso2.adicionarAluno(aluno3);
		
		aluno1.adicionarCurso(curso3);
		aluno2.adicionarCurso(curso3);
		aluno3.adicionarCurso(curso3);
		
		for(Aluno aluno: curso3.alunos ) { // For para printar alunos 
			System.out.println("Estou Matriculado no curso " + curso3.nome + "...");
			System.out.println("...E o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos); // usando o objeto aluno1 para acessas os alunos do curso
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Completo");
		
		if(cursoEncontrado != null) { // caso o resultado for diferente de null esse irá retornar os cursos
			System.out.println(cursoEncontrado.nome); // Console: Java Completo
			System.out.println(cursoEncontrado.alunos); // console[João, Maria]
		}
	}
}