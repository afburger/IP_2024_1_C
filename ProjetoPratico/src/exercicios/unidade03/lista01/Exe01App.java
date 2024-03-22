package exercicios.unidade03.lista01;

import java.util.Scanner;

public class Exe01App {

	public static void main(String[] args) {
		
		Exe01 calculadora = new Exe01();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Digite o primeiro número inteiro");
		
		calculadora.numero1 = scanner.nextDouble();
		
		System.out.println("Digite o segundo número inteiro");
		
		calculadora.numero2 = scanner.nextDouble();
		
		scanner.close();
		
		System.out.println("Resultado da soma = " + calculadora.soma());
		System.out.println("Resultado da subtração = " + calculadora.subtracao());
		System.out.println("Resultado da multiplicação = " + calculadora.multiplicacao());
		System.out.println("Resultado da divisão = " + calculadora.divisao());
	}
}
