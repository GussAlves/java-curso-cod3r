package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		// biblioteca para gerar um input com popout 
		String valor = JOptionPane.showInputDialog("Informe o número:");
		int numero = Integer.parseInt(valor); // Convertendo String para número
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "Número Par!");
		} else {
			JOptionPane.showMessageDialog(null, "Número Impar!");
		}
	}
}
