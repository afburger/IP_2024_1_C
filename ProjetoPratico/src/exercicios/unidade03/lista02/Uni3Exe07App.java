package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe07App {

	public static void main(String[] args) {
		Uni3Exe07 ambev = new Uni3Exe07();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade de latas 350ml:");
		ambev.quantidadeLata = scan.nextInt();
		
		System.out.println("Informe a quantidade de garrafas 600ml:");
		ambev.quantidadeGarrafa = scan.nextInt();
		
		System.out.println("Informe a quantidade de garrafas 2L:");
		ambev.quantidadePet = scan.nextInt();
		
		System.out.println("A quantidade total de refrigerante em Litros é de: " + ambev.calculaLitros());
		
		scan.close();
	}
}
