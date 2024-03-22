package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe05App5 {

	public static void main(String[] args) {
		Uni3Exe05 granja = new Uni3Exe05();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Informe a quantidade de galinhas:");
		int quantidadeGalinha = scan.nextInt();
		
		System.out.println("O gasto final com as galinhas é de:  " + granja.calculaGasto(quantidadeGalinha));
		
		scan.close();
	}
}
