package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe08App {

	public static void main(String[] args) {
		Uni3Exe08 casaCambio = new Uni3Exe08();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe a cotação do dia:");
		casaCambio.cotacao = scanner.nextDouble();
		
		System.out.println("Informe a quantidade em reais:");
		casaCambio.valorReais = scanner.nextDouble();
		
		System.out.println("Você receberá: U$$ " + casaCambio.converterEmDolares());
		
		scanner.close();
	}
}
