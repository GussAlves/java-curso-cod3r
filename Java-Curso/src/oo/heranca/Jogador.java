package oo.heranca;

public class Jogador {

	int vida = 100;
	int x;
	int y;
	
	// Metodo para um jogador atacar o outro retirando 10 de vida 
	boolean atacar(Jogador oponente) {
		
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(x - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 10;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 10;
			return true;
		} else {
			return false;
		}
	}
	
	boolean andar(Direcao direcao) { // Utilizando a Enum como paramentro 
		switch(direcao) {
		case NORTE: // ENUM Direcao.NORTE
			y--;
			break;
		case LESTE:
			x++;
			break;
		case SUL:
			y++;
			break;
		case OESTE:
			x--;
			break;
		}
		return true;
	}
}