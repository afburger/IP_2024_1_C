package exemplos.unidade06;

import java.util.Scanner;

public class JogoVelha {
	
	public static void main(String[] args) {
		new JogoVelha();
	}

	public JogoVelha() {
		String[][] jogoVelha = new String[3][3];

		Scanner teclado = new Scanner(System.in);

		String proximaJogada = "";

		do {
			realizarJogada(teclado, jogoVelha);
			System.out.println("Se deseja parar, digite 'sair'");
			proximaJogada = teclado.next();
		} while (!proximaJogada.equals("sair"));

	}

	private void realizarJogada(Scanner teclado, String[][] jogo) {
		System.out.println("Informe 'X' ou 'O' para realizar sua jogada.");
		String jogada = teclado.next();

		System.out.println("Informe '1, 2 ou 3' para a linha da jogada.");
		int linha = teclado.nextInt();

		System.out.println("Informe '1, 2 ou 3' para a coluna da jogada.");
		int coluna = teclado.nextInt();

		jogo[linha - 1][coluna - 1] = jogada;

		imprimirJogo(jogo);
	}

	private void imprimirJogo(String[][] jogo) {
		for (int i = 0; i < jogo.length; i++) {
			// Iterando sobre as colunas
			for (int j = 0; j < jogo[i].length; j++) {
				String jogada = jogo[i][j];
				if (jogada == null) {
					System.out.print("N" + " ");
				} else {
					System.out.print(jogada + " ");
				}
			}
			// Mudando para a próxima linha após imprimir os elementos da linha atual
			System.out.println();
		}
	}
}
