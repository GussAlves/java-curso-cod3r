package controle;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {

		String txt = "";
		int i = 1;
		
		do {
			JOptionPane.showMessageDialog(null, "Voc� precisa falar as palavras m�gicas");
			if(i < 3) {
				txt = JOptionPane.showInputDialog("Voc� quer sair?"); i++;			
			} else {
				txt = JOptionPane.showInputDialog("Voc� quer sair? (Por Favor)");				
			}
		} while(!txt.equalsIgnoreCase("Por Favor"));
		
		JOptionPane.showMessageDialog(null, "Obrigado!");
	}
}
