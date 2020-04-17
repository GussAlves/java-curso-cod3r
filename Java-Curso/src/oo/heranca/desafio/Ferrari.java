package oo.heranca.desafio;

public class Ferrari extends Carro {

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
}