package controle;

import javax.swing.JOptionPane;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		// Testando loop indeterminado com String
		
		String coisa = ""; // Vari�vel para entrar no While
		
		while(!coisa.equalsIgnoreCase("sair")) {
			coisa = JOptionPane.showInputDialog("Digite alguma coisa!!!");
		}
		// Mensagem printa na tela do usu�rio
		JOptionPane.showMessageDialog(null, "Voc� saiu!!");
	}
}