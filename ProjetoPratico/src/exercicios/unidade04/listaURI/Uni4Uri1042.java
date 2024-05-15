package exercicios.unidade04.listaURI;

import java.util.Scanner;

public class Uni4Uri1042 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int numeroA = teclado.nextInt();
		int numeroB = teclado.nextInt();
		int numeroC = teclado.nextInt();
		if ((numeroA >= numeroB) && (numeroA >= numeroC)) {
			if ((numeroB >= numeroC)) {
				System.out.println(numeroC);
				System.out.println(numeroB);
				System.out.println(numeroA);
				System.out.println("");
				System.out.println(numeroA);
				System.out.println(numeroB);
				System.out.println(numeroC);
			} else {
				System.out.println(numeroB);
				System.out.println(numeroC);
				System.out.println(numeroA);
				System.out.println("");
				System.out.println(numeroA);
				System.out.println(numeroB);
				System.out.println(numeroC);
			}
		} else if ((numeroB >= numeroA) && (numeroB >= numeroC)) {
			if ((numeroA >= numeroC)) {
				System.out.println(numeroC);
				System.out.println(numeroA);
				System.out.println(numeroB);
				System.out.println("");
				System.out.println(numeroA);
				System.out.println(numeroB);
				System.out.println(numeroC);
			} else {
				System.out.println(numeroA);
				System.out.println(numeroC);
				System.out.println(numeroB);
				System.out.println("");
				System.out.println(numeroA);
				System.out.println(numeroB);
				System.out.println(numeroC);
			}
		} else if ((numeroC >= numeroA) && (numeroC >= numeroB)) {
			if ((numeroA >= numeroB)) {
				System.out.println(numeroB);
				System.out.println(numeroA);
				System.out.println(numeroC);
				System.out.println("");
				System.out.println(numeroA);
				System.out.println(numeroB);
				System.out.println(numeroC);
			} else {
				System.out.println(numeroA);
				System.out.println(numeroB);
				System.out.println(numeroC);
				System.out.println("");
				System.out.println(numeroA);
				System.out.println(numeroB);
				System.out.println(numeroC);
			}
		}
		teclado.close();
	}
}