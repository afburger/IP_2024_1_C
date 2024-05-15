package provas.prova01.modelo01;

import java.util.Scanner;

public class Prova01Questao01 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o esporte:");
		String esporte = teclado.nextLine();
		
		System.out.println("Informe o estilo:");
		String estilo = teclado.nextLine();
		
		if (esporte.isEmpty() && estilo.isEmpty()) {
			System.out.println("Não é possivel informar os dados");
			System.out.println("Vazio");
		} else {
			System.out.println("esporte: " + esporte);
			if (estilo.isEmpty()) {
				System.out.println("Estilo vazio");	
			} else {
				System.out.println("Estilo: " + estilo);	
			}
		}
		
		System.out.println("FIM");
		
		teclado.close();
		
	}
	
}
