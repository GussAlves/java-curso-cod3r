package oo.heranca;

public class Jogo {

	public static void main(String[] args) {
		
		Jogador monstro = new Monstro(); // Criado classe Monstro usando a Classe Jogador como referência
		monstro.x = 10;
		monstro.y = 11;
		
		Jogador heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;

		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		System.out.println("Monstro tem => " + monstro.vida);
		System.out.println("Heroi tem => " + heroi.vida);
	}
}