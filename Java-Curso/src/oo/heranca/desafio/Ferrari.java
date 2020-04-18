package oo.heranca.desafio;

public class Ferrari extends Carro implements Esportivo {

	public Ferrari() {
		this(315);
	}
	
	public Ferrari(int velocidadeMaxima) {

	}
	
	@Override
	public void acelerar() {
		if(ligado == true) {
			if(this.velocidade >= 0) {
				this.velocidade += 15;							
			}
		}
	}
	
	@Override
	public void freiar() {
		if(ligado == true) {
			if(this.velocidade > 0) {
				this.velocidade -= 15;							
			}
		}
	}
	
	@Override
	public void ligarTurbo() {
	}
	
	@Override
	public void desligarTurbo() {
	}
}