package exercicios.unidade03.lista02;

import java.util.Scanner;

public class Uni3Exe14App {

	public static void main(String[] args) {
		Uni3Exe14 viagem = new Uni3Exe14();
		
		Scanner scanner = new Scanner(System.in);

		System.out.println("Informe o tempo gasto na viagem em horas: ");
		viagem.tempoGasto = scanner.nextInt();
		
		System.out.println("Informe a distância percorrida na viagem: ");
		viagem.distanciaPercorrida = scanner.nextInt();
		
		System.out.println("A velocidade média foi de: " + viagem.calculaVelocidadeMedia() + " km/h");
		
		System.out.println("O Gasto com combustível foi de: " + viagem.calculaGastoCombustivel() + " L");
		
		scanner.close();
	}
}
