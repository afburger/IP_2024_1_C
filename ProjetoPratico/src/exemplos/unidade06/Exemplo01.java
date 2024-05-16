package exemplos.unidade06;

import java.util.Scanner;

public class Exemplo01 {

//	public static void main(String[] args) {
//		Scanner teclado = new Scanner(System.in);
//		
//		int vetor[] = new int[10];
//		
//		for (int i = 0; i < vetor.length; i++) {
//			System.out.println("Informe o valor " + (i + 1) + " vetor[" + i + "]: ");
//			vetor[i] = teclado.nextInt();
//		}
//		
//		for (int i = vetor.length - 1; i >= 0; i--) {
//			System.out.println("vetor[" + i + "]: " + vetor[i]);
//		}
//		
//		teclado.close();
//	}
	
	public Exemplo01() {
		Scanner teclado = new Scanner(System.in);
		int vetor[] = new int[10];
		
		leituraVetor(teclado, vetor);
		
		int vetor2[] = new int[4];
		imprimeOrdemInversa(vetor2);
		
		imprimeOrdemNormal(vetor);
		
		teclado.close();
	}
	
	public static void main(String[] args) {
		new Exemplo01();
	}
	
	private void leituraVetor(Scanner teclado, int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Informe o valor " + (i + 1) + " vetor[" + i + "]: ");
			vetor[i] = teclado.nextInt();
		}
	}
	
	private void imprimeOrdemInversa(int[] vetor) {
		for (int i = vetor.length - 1; i >= 0; i--) {
			System.out.println("vetor[" + i + "]: " + vetor[i]);
		}
	}
	
	private void imprimeOrdemNormal(int[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("vetor[" + i + "]: " + vetor[i]);
		}
	}
	
}
