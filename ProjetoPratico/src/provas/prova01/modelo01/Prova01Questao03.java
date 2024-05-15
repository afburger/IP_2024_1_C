package provas.prova01.modelo01;

import java.util.Scanner;

public class Prova01Questao03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a sigla do unidade de medida:");
		String unidadeMedida = teclado.nextLine();
		
		unidadeMedida = unidadeMedida.toUpperCase();
		
		if (unidadeMedida.equals("M") || unidadeMedida.equals("H") || unidadeMedida.equals("S")) {
			
			if (unidadeMedida.equals("M")) {
				System.out.println("Unidade de medida: Metros");
			}
			if (unidadeMedida.equals("H")) {
				System.out.println("Unidade de medida: Horas");
			}
			if (unidadeMedida.equals("S")) {
				System.out.println("Unidade de medida: Segundos");
			}
			
		} else {
			System.out.println("Entrada incorreta");
		}
		
		teclado.close();
		
	}
	
}
