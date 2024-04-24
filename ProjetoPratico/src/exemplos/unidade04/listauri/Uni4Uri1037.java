package exemplos.unidade04.listauri;

import java.util.Scanner;

public class Uni4Uri1037 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double variavel = teclado.nextDouble();
		if ((variavel >= 0) && (variavel <= 25)) {
			System.out.println("Intervalo [0,25]");
		} else if ((variavel > 25) && (variavel <= 50)) {
			System.out.println("Intervalo (25,50]");
		} else if ((variavel > 50) && (variavel <= 75)) {
			System.out.println("Intervalo (50,75]");
		} else if ((variavel > 75) && (variavel <= 100)) {
			System.out.println("Intervalo (75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}
		teclado.close();
	}
}