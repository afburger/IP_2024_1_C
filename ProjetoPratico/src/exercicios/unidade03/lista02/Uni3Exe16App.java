package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe16App {

	public static void main(String[] args) {
		Uni3Exe16 compra = new Uni3Exe16();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o valor da compra: ");
		compra.valorCompra = scanner.nextInt();
		
		System.out.println("Informe o valor pago: ");
		compra.valorPago = scanner.nextInt();
		
		compra.escrevaNotas();
		
		scanner.close();
	}
}
