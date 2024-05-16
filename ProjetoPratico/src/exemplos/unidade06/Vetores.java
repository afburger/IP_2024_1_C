package exemplos.unidade06;

import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		int vetorNumeros[] = new int[5];
		
//		vetorNumeros[0] = 123;
//		vetorNumeros[4] = 8;
//		vetorNumeros[2] = 75;
//		vetorNumeros[1] = 2;
//		vetorNumeros[3] = 20;
		
//		int valorPosicaoX = vetorNumeros[0];
//		
//		System.out.println(vetorNumeros[1]);
		
//		System.out.println(valorPosicaoX);
		
		for (int idx = 0; idx < 5; idx++) {
			vetorNumeros[idx] = idx * 10;
		}
		
		for (int idx = 0; idx < vetorNumeros.length; idx++) {
			System.out.println(vetorNumeros[idx]);
		}
		
		
		
		
		
		Scanner teclado = new Scanner(System.in);

		String nomes[] = new String[5];
		
		int nomesInseridos = 0;
		
		while (nomes.length > nomesInseridos) {
			System.out.println("Informe um nome:");
			nomes[nomesInseridos] = teclado.next();
			nomesInseridos++;
		}
		
		teclado.close();
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.println(nomes[i]);
		}
		
		
	}
	
}
