package exercicios.unidade04.lista01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Uni4Exe07 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.print("Entre com peso da carta: ");
		int peso = teclado.nextInt();

		double valorPagar = 0;
		if (peso <= 50) {
			valorPagar = 0.45f;
		} else {
			int pesoExcedido = peso - 50;
			int qtAdicional = (pesoExcedido / 20) + 1;
			valorPagar = 0.45f + 0.45f * qtAdicional;
		}

		DecimalFormat df_2 = new DecimalFormat("0.00");
		System.out.println("Custo do selo: " + df_2.format(valorPagar));
		teclado.close();
	}
}
