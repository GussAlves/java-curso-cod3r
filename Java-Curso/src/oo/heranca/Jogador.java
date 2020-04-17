package oo.heranca;

public class Jogador {

	int x;
	int y;
	
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