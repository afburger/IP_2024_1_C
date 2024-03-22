package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe04App {

	public static void main(String[] args) {
		Uni3Exe04 aluno = new Uni3Exe04();
		
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite a primeira nota:");
		aluno.nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota:");
		aluno.nota2 = scan.nextDouble();
		
		System.out.println("Digite a terceira nota:");
		aluno.nota3 = scan.nextDouble();
		
		System.out.println("A média final do aluno é:  " + aluno.calculaMedia());
		
		scan.close();
	}
}
