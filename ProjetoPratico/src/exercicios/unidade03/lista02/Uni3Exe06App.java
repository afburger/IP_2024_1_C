package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe06App {

	public static void main(String[] args) {
		Uni3Exe06 restaurante = new Uni3Exe06();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe o peso do prato:");
		double pesoPrato = scan.nextDouble();
		
		System.out.println("O valor do prato é de:  " + restaurante.calculaValorPrato(pesoPrato) +" reais.");
		
		scan.close();
	}
}
