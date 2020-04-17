package oo.heranca.desafio;

public class Main {

	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		c1.ligar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
	
		
		System.out.println(c1.velocimetro());
	}
}