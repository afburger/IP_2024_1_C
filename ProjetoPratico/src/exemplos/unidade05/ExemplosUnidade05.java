package exemplos.unidade05;

import java.util.Iterator;
import java.util.Scanner;

public class ExemplosUnidade05 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		for(int indice = 1; indice <= 10; indice++) {
			System.out.println(indice);
		}
		
		
		for(int indice = 10; indice >= 0; indice--) {
			System.out.println(indice);
		}
		
		
		int repetir = teclado.nextInt();
		
		for (int idx = 0; idx <= repetir; idx+=2) {
			System.out.println(idx);
		}
		
		
		
		for (char x = 'a'; x <= 'z'; x++) {
			System.out.println(x);
		}
		
		for (int nr = 0; nr <= repetir; nr++) {
			if (nr % 2 == 0) {
				System.out.println("Número: " + nr + " é PAR");
			} else {
				System.out.println("Número: " + nr + " é IMPAR");
			}
		}
		
		
		for (int texto = 0; texto < repetir; texto++) {
			String string = args[texto];
			
		}
		
		
		teclado.close();
		
	}
	
}
