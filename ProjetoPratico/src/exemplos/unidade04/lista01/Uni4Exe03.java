package exemplos.unidade04.lista01;

import java.util.Scanner;

public class Uni4Exe03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro número inteiro:");
		int numero1 = sc.nextInt();
		
		System.out.println("Entre com o segundo número inteiro:");
		int numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.println("Número um é maior");
		} else {
			System.out.println("Número dois é maior");
		}
		
		sc.close();
	}
}
