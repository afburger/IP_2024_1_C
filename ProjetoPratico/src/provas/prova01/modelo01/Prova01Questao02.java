package provas.prova01.modelo01;

import java.util.Scanner;

public class Prova01Questao02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a primeira temperatura:");
		double temperatura1 = teclado.nextDouble();
		
		System.out.println("Informe a segunda temperatura:");
		double temperatura2 = teclado.nextDouble();
		
		System.out.println("Informe a terceira temperatura:");
		double temperatura3 = teclado.nextDouble();
		
		System.out.println("Escolha uma das opções do menu: \n"
				+ "a) temperatura mais alta \n"
				+ "b) temperatura mais baixa \n"
				+ "c) valores impressos em ordem decrescente (mais alto para o mais baixo) \n"
				+ "d) média das temperaturas");
		
		String menu = teclado.next();
		
		
		if (temperatura1 < temperatura2) {
            double temp = temperatura1;
            temperatura1 = temperatura2;
            temperatura2 = temp;
        }
        if (temperatura2 < temperatura3) {
            double temp = temperatura2;
            temperatura2 = temperatura3;
            temperatura3 = temp;
        }
        if (temperatura1 < temperatura2) {
            double temp = temperatura1;
            temperatura1 = temperatura2;
            temperatura2 = temp;
        }
		
		
		switch (menu) {
		case "a":
			System.out.println("A temperatura mais alta é: " + temperatura1 + "º");
			break;
			
		case "b":
			System.out.println("A temperatura mais baixa é: " + temperatura3 + "º");
			break;
			
		case "c":
			System.out.println("As temperatura em ordem decrescente são: \n"
					+ temperatura1 + "º \n"
					+ temperatura2 + "º \n"
					+ temperatura3 + "º \n");
			break;
		case "d":
			Double media = (temperatura1 + temperatura2 + temperatura3) / 3;
			System.out.println("A méda das temperaturas é: " + media);
			break;
			
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		teclado.close();
		
	}
	
}
