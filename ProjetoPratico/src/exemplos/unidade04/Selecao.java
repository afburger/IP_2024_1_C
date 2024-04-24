package exemplos.unidade04;

import java.util.Scanner;

public class Selecao {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

//		System.out.println("Digite a média do aluno:");
//		int media = scan.nextInt();
//		
//		if (media >= 6) {
//			System.out.println("Aluno aprovado");
//			System.out.println("Parabéns passou de ano");
//		}
//
//		
//		System.out.println("Terminou a aplicação");
		
//		System.out.println("Digite a idade da pessoa:");
//		int idade = scan.nextInt();
//		
//		if (idade >= 18) {
//			System.out.println("É adulto");
//		} else {
//			System.out.println("É criança");
//		}

//		System.out.println("Digite a nota1 do aluno:");
//		int nota1 = scan.nextInt();
//		
//		System.out.println("Digite a nota2 do aluno:");
//		int nota2 = scan.nextInt();
//		
//		if (nota1 > 6 && nota2 > 6) {
//			System.out.println("Aluno aprovado");
//		} else {
//			System.out.println("Reprovado!");
//		}

		
		System.out.println("Digite uma cor do semáforo:");
		String cor = scan.next();
		
		switch (cor) {
			case "verde": {
				System.out.println("Siga");
				break;
			}
			
			case "amarelo": {
				System.out.println("Atenção");
				break;
			}
			
			case "vermelho": {
				System.out.println("Pare");
				break;
			}
			
			default:
				System.out.println("Não é uma cor");;
			}
		
		scan.close();
	}
}
