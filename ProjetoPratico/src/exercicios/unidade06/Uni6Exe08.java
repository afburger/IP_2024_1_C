package exercicios.unidade06;

import java.util.Scanner;

public class Uni6Exe08 {

	private Uni6Exe08() {
		Scanner teclado = new Scanner(System.in);

		int tamVet;
		do {
			System.out.print("Tamanho Vetor: ");
			tamVet = teclado.nextInt();
		} while ((tamVet < 1) || (tamVet > 20));
		double vet[] = new double[tamVet];

		ler(vet, teclado);
		System.out.println("---");
		escrever(vet);
		System.out.println("---");
		acharIgual(vet);

		teclado.close();
	}

	private void ler(double vet[], Scanner teclado) {
		for (int i = 0; i < vet.length; i++) {
			System.out.print("vet[" + i + "]: ");
			vet[i] = teclado.nextDouble();
		}
	}

	private void escrever(double vet[]) {
		for (int i = 0; i < vet.length; i++) {
			System.out.println(vet[i]);
		}
	}

	private void acharIgual(double vetor[]) {
		boolean achou[] = new boolean[vetor.length];
		
		for (int i = 0; i < achou.length; i++) {
			achou[i] = false;
		}
		
		System.out.println();
		System.out.println("VALOR   |  FREQÜÊNCIA  ");
		int contador;
		for (int i = 0; i < vetor.length; i++) {
			contador = 0;
			for (int j = 0; j < vetor.length; j++) {
				if (!achou[j]) {
					if (vetor[i] == vetor[j]) {
						achou[j] = true;
						contador++;
					}
				}
			}
			if (contador > 0) {
				System.out.println(vetor[i] + " | " + contador);
			}
		}
	}

	public static void main(String[] args) {
		new Uni6Exe08();
	}

}
