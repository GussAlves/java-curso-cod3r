/**
 * Crie um programa para alterar F� para C�
 * Utilizar 2 constantes e uma vari�vel
 */

package fundamentos;

public class DesafioTemperatura {
	
	public static void main(String[] args) {
		//Declarando Constantes
		final int ajust= 32;
		final double multi = 5/9.0;
		
		double numero = 45;
		
		double total = (numero - ajust) * multi;
		System.out.println("O Total � de " + total + "�C.");
	}
}
