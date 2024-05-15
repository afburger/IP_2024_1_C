package provas.prova01.modelo02;

import java.util.Scanner;

public class Prova02Questao02 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe o consumo no primeiro mês:");
		double consumoMes1 = teclado.nextDouble();
		
		System.out.println("Informe o consumo no segundo mês:");
		double consumoMes2 = teclado.nextDouble();
		
		System.out.println("Informe o consumo no terceiro mês:");
		double consumoMes3 = teclado.nextDouble();
		
		System.out.println("Escolha uma das opções do menu: \n"
				+ "a) maior quantidade de água consumida \n"
				+ "b) menor quantidade de água consumida \n"
				+ "c) valores impressos em ordem crescente (mais baixo para o mais alto) \n"
				+ "d) média das quantidades");
		
		String menu = teclado.next();
		
		
		if (consumoMes1 > consumoMes2) {
            double temp = consumoMes1;
            consumoMes1 = consumoMes2;
            consumoMes2 = temp;
        }
        if (consumoMes2 > consumoMes3) {
            double temp = consumoMes2;
            consumoMes2 = consumoMes3;
            consumoMes3 = temp;
        }
        if (consumoMes1 > consumoMes2) {
            double temp = consumoMes1;
            consumoMes1 = consumoMes2;
            consumoMes2 = temp;
        }
		
		
		switch (menu) {
		case "a":
			System.out.println("A maior quantidade de água consumida é: " + consumoMes3 + "º");
			break;
			
		case "b":
			System.out.println("A menor quantidade de água consumida é: " + consumoMes1 + "º");
			break;
			
		case "c":
			System.out.println("Os consumos em ordem crescente são: \n"
					+ consumoMes1 + "º \n"
					+ consumoMes2 + "º \n"
					+ consumoMes3 + "º \n");
			break;
		case "d":
			Double media = (consumoMes1 + consumoMes2 + consumoMes3) / 3;
			System.out.println("A méda das quantidades é: " + media);
			break;
			
		default:
			System.out.println("Opção inválida");
			break;
		}
		
		teclado.close();
		
	}
	
}
