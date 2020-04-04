package controle;

public class DesafioFor {

	/**
	 *  Versão desafio 
	 *  Não pode usar valor númerico para controlar o laço!
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
