package exemplos.unidade06;

import java.util.Scanner;

public class Exemplo06Versao2 {

	public static void main(String[] args) {
		new Exemplo06Versao2();
	}
	
	public Exemplo06Versao2() {
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a quantidade de valores que será inserida:");
		int tamanhoVetor = teclado.nextInt();
		double vetor[] = new double[tamanhoVetor];
		
		lerVetor(teclado, vetor);
		
		System.out.println("Informe o valor para pesquisa:");
		double valorPesquisado = teclado.nextDouble();
		
		boolean encontrou = pesquisaVetor(valorPesquisado, vetor);
		
		if (encontrou) {
			System.out.println("Encontrou");
		} else {
			System.out.println("Elemento não está no vetor");
		}
		
	}
	
	private void lerVetor(Scanner teclado, double[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Valor:");
			vetor[i] = teclado.nextDouble();
		}
	}
	
	private boolean pesquisaVetor(double valorPesquisado, double[] vetor) {
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] == valorPesquisado) {
				return true;
			}
		}
		return false;
	}
	
}
