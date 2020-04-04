package controle;

import java.util.Scanner;

public class For2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		for (int i = 10;i >= 0; i -= 2) {
			System.out.println(i);
		}

		sc.close();
	}
}
