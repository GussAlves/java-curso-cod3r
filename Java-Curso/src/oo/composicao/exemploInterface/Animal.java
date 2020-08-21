package oo.composicao.exemploInterface;

public abstract class Animal {

	String nome;
	
	public abstract String emitirSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
