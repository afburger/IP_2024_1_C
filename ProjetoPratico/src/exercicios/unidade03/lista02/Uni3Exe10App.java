package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe10App {

	public static void main(String[] args) {
		Uni3Exe10 triangulo = new Uni3Exe10();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o cateto 1:");
		triangulo.cateto1 = scanner.nextDouble();
		
		System.out.println("Informe o cateto 1:");
		triangulo.cateto2 = scanner.nextDouble();
		
		System.out.println("A Hipotenusa do triangulo informado é: " + triangulo.calculaHipotenusa());
		
		scanner.close();
	}
}
