package fundamentos;

import java.util.Date;

import javax.swing.JButton;

public class Import {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		String s = "Bom dia!";
		System.out.println(s);
		
		Date d = new Date();
		System.out.println(s + " " + d.getDay() + "/" + d.getMonth() + "/" + d.getYear());
		
		@SuppressWarnings("unused")
		JButton botao = new JButton();
	}
}
