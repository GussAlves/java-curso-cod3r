package controle;

import javax.swing.JOptionPane;

public class IfElse {

	public static void main(String[] args) {
		
		// biblioteca para gerar um input com popout 
		String valor = JOptionPane.showInputDialog("Informe o n�mero:");
		int numero = Integer.parseInt(valor); // Convertendo String para n�mero
		
		if(numero % 2 == 0) {
			JOptionPane.showMessageDialog(null, "N�mero Par!");
		} else {
			JOptionPane.showMessageDialog(null, "N�mero Impar!");
		}
	}
}
