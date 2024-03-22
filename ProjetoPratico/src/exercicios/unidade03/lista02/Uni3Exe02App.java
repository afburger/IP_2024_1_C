package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe02App {

	public static void main(String[] args) {
		Uni3Exe02 sapato = new Uni3Exe02();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite o valor do sapato:");
		
		sapato.valorProduto = scan.nextDouble();
		sapato.aplicaDesconto();
		
		scan.close();
		
	}
}
