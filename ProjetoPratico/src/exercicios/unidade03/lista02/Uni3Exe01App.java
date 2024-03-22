package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe01App {

	public static void main(String[] args) {
		Uni3Exe01 terreno1 = new Uni3Exe01();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a medida do lado A do terreno:");
		terreno1.ladoA = scan.nextFloat();
		
		System.out.println("Digite a medida do lado B do terreno:");
		terreno1.ladoB = scan.nextFloat();
		
		System.out.println("Esse terreno possui uma área de: " + terreno1.calculaArea() + "m²");
		
		scan.close();
	}
}
