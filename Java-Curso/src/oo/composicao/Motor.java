package oo.composicao;

public class Motor {

	boolean ligado = false;
	double fatorInjecao = 1;
	
	int giros() {
		if(!ligado) { // Verificando se o motor está ligado
			return 0;
		} else { // Se estiver ligado ira contar 3000 giros por injeção
			return (int) Math.round(fatorInjecao * 3000);
		}
	}
}