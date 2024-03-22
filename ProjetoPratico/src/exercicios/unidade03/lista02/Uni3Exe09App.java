package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe09App {

	public static void main(String[] args) {
		Uni3Exe09 lataOleo = new Uni3Exe09();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a altura da lata de óleo em cm:");
		lataOleo.altura = scanner.nextDouble();
		
		System.out.println("Informe o raio da lata de óleo em cm:");
		lataOleo.raio = scanner.nextDouble();
		
		System.out.println("A lata informada possuim um volume de: " + lataOleo.calculaVolume() + "ml");
		
		scanner.close();
	}
}
