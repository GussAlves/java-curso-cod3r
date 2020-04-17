package oo.heranca.desafio;

public class Carro {

	double velocidade;
	boolean ligado;
	
	public Carro() {
		this.ligado = false;
	}
	
	public void acelerar() {
		if(ligado == true) {
			if(this.velocidade >= 0) {
				this.velocidade += 5;							
			}
		}
	}
	
	public void freiar() {
		if(ligado == true) {
			if(this.velocidade > 0) {
				this.velocidade -= 5;							
			}
		}
	}
	
	public boolean ligar() {
		return this.ligado = true;
	}
	
	public boolean desligar() {
		return this.ligado = false;
	}
	
	public String velocimetro() {
		return "Velocidade atual é de " + this.velocidade + "Kh..";
	}
}