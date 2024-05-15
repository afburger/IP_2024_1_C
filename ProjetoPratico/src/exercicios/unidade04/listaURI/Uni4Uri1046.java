package exercicios.unidade04.listaURI;

import java.util.Scanner;

public class Uni4Uri1046 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int comeco_jogo = teclado.nextInt();
		int fim_jogo = teclado.nextInt();
		int duracao = 0;
		if (fim_jogo <= comeco_jogo) {
			duracao = (24 - comeco_jogo) + fim_jogo;
		} else {
			duracao = fim_jogo - comeco_jogo;
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		teclado.close();
	}
}