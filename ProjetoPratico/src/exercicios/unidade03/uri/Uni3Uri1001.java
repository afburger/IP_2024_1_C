package exercicios.unidade03.uri;

import java.util.Scanner;

public class Uni3Uri1001 {

	public static void main(String[] args) {
		int a, b, x;
		
		Scanner scan = new Scanner(System.in);
		a = scan.nextInt();
		
		b = scan.nextInt();

		scan.close();
				
		x = a + b;
		System.out.println("X = " + x);
	}
}
