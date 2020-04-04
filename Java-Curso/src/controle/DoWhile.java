package controle;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {

		String txt = "";
		int i = 1;
		
		do {
			JOptionPane.showMessageDialog(null, "Você precisa falar as palavras mágicas");
			if(i < 3) {
				txt = JOptionPane.showInputDialog("Você quer sair?"); i++;			
			} else {
				txt = JOptionPane.showInputDialog("Você quer sair? (Por Favor)");				
			}
		} while(!txt.equalsIgnoreCase("Por Favor"));
		
		JOptionPane.showMessageDialog(null, "Obrigado!");
	}
}
