package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe03App {

	public static void main(String[] args) {
		Uni3Exe03 carro = new Uni3Exe03();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor da gasolina:");
		carro.precoCombustivel = scan.nextDouble();
		
		System.out.println("Digite o valor total do abastecimento:");
		carro.valorPago = scan.nextDouble();
		
		System.out.println("Você conseguiu abastecer " + carro.calculaLitros() + "L de combustível.");
		
		scan.close();
	}
}
