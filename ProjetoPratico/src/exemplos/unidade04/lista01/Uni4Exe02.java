package exemplos.unidade04.lista01;

import java.util.Scanner;

public class Uni4Exe02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com um valor inteiro maior do que 0:");
		int valor = sc.nextInt();
		
		if (valor % 2 == 0) {
			System.out.println("Número é par");
		} else {
			System.out.println("Número é impar");
		}
		sc.close();
	}
}
