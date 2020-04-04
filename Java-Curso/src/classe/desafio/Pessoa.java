package classe.desafio;

public class Pessoa {

	String nome;
	Double peso;
	
	Pessoa(String nome, Double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	//M�todo para a pessoa emgordar
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		return "Ol� eu sou o " + nome + " e tenho " + peso + "Kgs.";
	}
}