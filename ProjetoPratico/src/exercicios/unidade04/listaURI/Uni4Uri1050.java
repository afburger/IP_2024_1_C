package exercicios.unidade04.listaURI;

import java.util.Scanner;

public class Uni4Uri1050 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int DDD = teclado.nextInt();
		if (DDD == 61) {
			System.out.println("Brasilia");
		} else if (DDD == 71) {
			System.out.println("Salvador");
		} else if (DDD == 11) {
			System.out.println("Sao Paulo");
		} else if (DDD == 21) {
			System.out.println("Rio de Janeiro");
		} else if (DDD == 32) {
			System.out.println("Juiz de Fora");
		} else if (DDD == 19) {
			System.out.println("Campinas");
		} else if (DDD == 27) {
			System.out.println("Vitoria");
		} else if (DDD == 31) {
			System.out.println("Belo Horizonte");
		} else {
			System.out.println("DDD nao cadastrado");
		}
		teclado.close();
	}
}