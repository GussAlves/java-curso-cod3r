package oo.heranca.desafio;

public class Civic extends Carro {

	@Override
	public void freiar() {
		if(ligado == true) {
			if(this.velocidade > 0) {
				this.velocidade -= 10;							
			}
		}
	}
	
	@Override
	public void acelerar() {
		if(ligado == true) {
			if(this.velocidade >= 0) {
				this.velocidade += 10;							
			}
		}
	}
}