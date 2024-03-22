package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe15App {

	public static void main(String[] args) {
		Uni3Exe15 numero = new Uni3Exe15();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe um número de até 3 dígitos: ");
		String numeroStr = scanner.next();
		
		// Formata o número com apenas 3 dígitos
		numero.numero = Integer.parseInt(numeroStr, 0, 3, 10);
		
		numero.escrevaDecomposicao();
		
		scanner.close();
	}
}
