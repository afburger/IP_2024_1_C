package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe11App {

	public static void main(String[] args) {
		Uni3Exe11 termometro = new Uni3Exe11();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a temperatura em Grau Celsius:");
		termometro.grausCelcius = scanner.nextDouble();
		
		
		System.out.println("A temperatura em fahrenheit é: " + termometro.converteFahrenheit());
		
		scanner.close();
	}
}
