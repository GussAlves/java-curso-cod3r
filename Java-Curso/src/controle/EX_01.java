package controle;

import javax.swing.JOptionPane;

public class EX_01 {
	
	public static void main(String[] args) {
		
		// Criar um programa que receba um n�mero e verifique se ele est� entre 0 e 10 e � par!
		
		String valor = JOptionPane.showInputDialog("Digite um valor de 1 a 10");
		int num = Integer.parseInt(valor);
		
		if (num >= 0 && num <= 10) {
			if (num % 2 == 0) {
				JOptionPane.showMessageDialog(null, "O n�mero � par!");
			}else {
				JOptionPane.showMessageDialog(null, "O n�mero � impar!");				
			}
		}else {
			JOptionPane.showMessageDialog(null, "O Numero " + num + " n�o � compativel!");							
		}
	}
}
