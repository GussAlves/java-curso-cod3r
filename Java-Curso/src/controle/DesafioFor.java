package controle;

public class DesafioFor {

	/**
	 *  Vers�o desafio 
	 *  N�o pode usar valor n�merico para controlar o la�o!
	 */
	
	public static void main(String[] args) {
		
//		String valor = "#";
//		for(int i = 1; i <= 5; i++) {
//		}
		
		for(String v = "#"; !v.equals("######"); v += "#") {
			System.out.println(v);			
		}
		
//		do {
//			valor += "#";			 
//		} while(!"######".equals(valor));
	}
}
