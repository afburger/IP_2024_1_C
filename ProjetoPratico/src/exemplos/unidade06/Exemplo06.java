package exemplos.unidade06;

import java.util.Scanner;

public class Exemplo06 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de valores que será inserida:");
		
		int tamanhoVetor = teclado.nextInt();
		
		double vetor[] = new double[tamanhoVetor];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Valor:");
			vetor[i] = teclado.nextDouble();
		}
		
		System.out.println("Informe o valor para pesquisa:");
		double valorPesquisado = teclado.nextDouble();
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valorPesquisado) {
				System.out.println("Encontrou");
			}
		}
		
	}
	
}
