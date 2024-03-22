package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe12App {

	public static void main(String[] args) {
		Uni3Exe12 folha = new Uni3Exe12();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o nome do funcionário: ");
		folha.nome = scanner.next();
		
		System.out.println("Informe o número de dependentes: ");
		folha.numeroDependentes = scanner.nextInt();
		
		System.out.println("Informe a quantidade de horas trabalhadas: ");
		folha.horasTrabalhadas = scanner.nextInt();
		
		System.out.println("O salário bruto é: " + folha.calculaSalarioBruto());
		System.out.println("A Salário liquido é: " + folha.calculaSalarioLiquido());
		
		scanner.close();
	}
}
