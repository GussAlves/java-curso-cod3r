package controle;

import javax.swing.JOptionPane;

public class EX_01 {
	
	public static void main(String[] args) {
		
		// Criar um programa que receba um número e verifique se ele está entre 0 e 10 e é par!
		
		String valor = JOptionPane.showInputDialog("Digite um valor de 1 a 10");
		int num = Integer.parseInt(valor);
		
		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "O número é par!");
			}else {
				JOptionPane.showMessageDialog(null, "O número é impar!");				
			}
		}else {
			JOptionPane.showMessageDialog(null, "O Numero " + num + " não é compativel!");							
		}
	}
}
