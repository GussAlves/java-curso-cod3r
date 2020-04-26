package fundamentos;

public class Wrapper {

	public static void main(String[] args) {
		
		// byte
		Byte b = 100;
		Short s = 1000;
		
		//Integer.parseInt(entrada.next());
		Integer i = 10000; //int
		@SuppressWarnings("unused")
		Long l = 100000l;
		
		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
				
		boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		
		Character c = '#'; //char
		System.out.println(c + "...");
	}
}
