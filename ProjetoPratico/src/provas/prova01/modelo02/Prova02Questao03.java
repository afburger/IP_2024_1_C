package provas.prova01.modelo02;

import java.util.Scanner;

public class Prova02Questao03 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Informe a disciplina:");
		String disciplina = teclado.nextLine();
		
		System.out.println("Informe o professor:");
		String professor = teclado.nextLine();
		
		if (disciplina.isEmpty() && professor.isEmpty()) {
			System.out.println("Não é possivel informar os dados");
			System.out.println("Vazio");
		} else {
			System.out.println("disciplina: " + disciplina);
			if (professor.isEmpty()) {
				System.out.println("Professor vazio");	
			} else {
				System.out.println("Professor: " + professor);	
			}
		}
		
		System.out.println("FIM");
		
		teclado.close();
		
	}
	
}
