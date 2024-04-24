package exemplos.unidade04.listauri;

import java.util.Scanner;

public class Uni4Uri1041 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		double x = teclado.nextDouble();
		double y = teclado.nextDouble();
		if ((x == 0) && (y == 0)) {
			System.out.println("Origem");
		} else {
			if (y == 0) {
				System.out.println("Eixo X");
			} else {
				if (x == 0) {
					System.out.println("Eixo Y");
				} else {
					if (x > 0) {
						if (y > 0) {
							System.out.println("Q1");
						} else {
							System.out.println("Q4");
						}
					} else {
						if (y > 0) {
							System.out.println("Q2");
						} else {
							System.out.println("Q3");
						}
					}
				}
			}
		}
		teclado.close();
	}
}