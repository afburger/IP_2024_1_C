package provas.prova01.modelo02;

import java.util.Scanner;

public class Prova02Questao01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a sigla do tamanho:");
		String tamanho = teclado.nextLine();
		
		tamanho = tamanho.toUpperCase();
		
		if (tamanho.equals("P") || tamanho.equals("M") || tamanho.equals("G")) {
			
			if (tamanho.equals("P")) {
				System.out.println("Tamanho pequeno");
			}
			if (tamanho.equals("M")) {
				System.out.println("Tamanho médio");
			}
			if (tamanho.equals("G")) {
				System.out.println("Tamanho grande");
			}
			
		} else {
			System.out.println("Entrada incorreta");
		}
		
		teclado.close();
		
	}
	
}
