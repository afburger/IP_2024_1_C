package exemplos.unidade04.lista01;

import java.util.Scanner;

public class Uni4Exe27 {
	
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("horChegada: ");
		int horChegada = teclado.nextInt();
		System.out.print("minChegada: ");
		int minChegada = teclado.nextInt();
		System.out.print("horSaida:   ");
		int horSaida = teclado.nextInt();
		System.out.print("minSaida:   ");
		int minSaida = teclado.nextInt();

		// Chegada/Saida hora[0..24] minuto[0..60]
		if (horChegada >= 0 && horChegada <= 24 && minChegada >= 0 && minChegada <= 60 && horSaida >= 0 && horSaida <= 24
				&& minSaida >= 0 && minSaida <= 60 && horSaida >= horChegada) {

			// Quantidade de horas que ficou estacionado
			int minChegadaTotal = (horChegada * 60) + minChegada; // converter hora para minutos
			int minSaidaTotal = (horSaida * 60) + minSaida; // converter hora para minutos
			int minTotal = minSaidaTotal - minChegadaTotal;
			int qtdHoras = minTotal / 60;
			int qtdMinutos = (minTotal % 60);

			System.out.println("Ficou estacionado " + qtdHoras + " horas e " + qtdMinutos + " minutos");
			if (qtdMinutos >= 30) {
				qtdHoras += 1;
			}
			System.out.println("Vai pagar por " + qtdHoras + " horas");

			// Definir a faixa de valores que deve pagar pelas horas estacionada.
			double precoCobrado = 0;
			switch (qtdHoras) {
				case 0: // 5,00
				case 1: // 5,00
					precoCobrado = 5;
					break;
				case 2: // 5,00+5,00 = 10,00
					precoCobrado = 10;
					break;
				case 3: // 5,00+5,00+7,5 = 17,5
					precoCobrado = 17.5;
					break;
				case 4: // 5,00+5,00+7,5+7,5 = 25,00
					precoCobrado = 25;
					break;
				default: // 25,00 + (10 * (5 - 4))
					precoCobrado = 25 + (10 * (qtdHoras - 4));
					break;
			}
			System.out.println("Preço cobrado: " + precoCobrado);
		} else {
			System.out.println(" Hora/Minuto ERRADO");
		}
		teclado.close();
	}
}

/*
__ Valores de Testes ERRADOS: 
_ Caso 1 ___
horChegada: 13
minChegada: 09
horSaida: 25
minSaida: 16

_ Caso 2 ___
horChegada: 14
minChegada: 64
horSaida: 15
minSaida: 15

*/

/*
__ Valores de Testes: 
_ Caso 0 horas ___
Permanaceu 0 horas e 12 minutos
horChegada: 13
minChegada: 10
horSaida: 13
minSaida: 22
	precoCobrado = 5,00

_ Caso 1 horas ___
Permanaceu 1 hora e 10 minutos
horChegada: 15
minChegada: 05
horSaida: 16
minSaida: 15
	precoCobrado = 5,00

_ Caso 2 horas ___
Permanaceu 1 hora e 35 minutos
horChegada: 03
minChegada: 40
horSaida: 05
minSaida: 15
	precoCobrado = 10,00

	_ Caso 3 horas ___
Permanaceu 3 hora e 5 minutos
horChegada: 08
minChegada: 24
horSaida: 11
minSaida: 29
	precoCobrado = 17.50

_ Caso 4 horas ___
Permanaceu 3 hora e 37 minutos
horChegada: 14
minChegada: 00
horSaida: 17
minSaida: 37
	precoCobrado = 25,00

_ Caso 5 horas ___
Permanaceu 4 hora e 41 minutos
horChegada: 08
minChegada: 05
horSaida: 12
minSaida: 46
	precoCobrado = 35,00

_ Caso 6 horas ___
Permanaceu 5 hora e 31 minutos
horChegada: 10
minChegada: 07
horSaida: 15
minSaida: 38
	precoCobrado = 45,00

*/