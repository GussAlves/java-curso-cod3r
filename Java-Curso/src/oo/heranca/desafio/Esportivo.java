package oo.heranca.desafio;

public interface Esportivo {

	void ligarTurbo();
	void desligarTurbo();
	
	default int velocidadeDoAr() { // Não é necessário implementar esse método por ser Default
		return 1;
	}
}
