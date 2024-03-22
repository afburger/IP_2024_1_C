package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe13App {

	public static void main(String[] args) {
		Uni3Exe13 azuleijos = new Uni3Exe13();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o comprimento da parede: ");
		azuleijos.comprimento = scanner.nextDouble();
		
		System.out.println("Informe a altura da parede: ");
		azuleijos.altura = scanner.nextDouble();
		
		System.out.println("O valor total é de: " + azuleijos.calculaValorParede());
		
		scanner.close();
	}
}
