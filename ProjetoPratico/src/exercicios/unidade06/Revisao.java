package exercicios.unidade06;

import java.util.Scanner;

public class Revisao {

	public static void main(String[] args) {
		new Revisao();
	}
	
	public Revisao() {
		String[] nomes = new String[5];
		double[] medias = new double[5];
		
		// Faz a leitura do dados.
		leituraDados(nomes, medias);
		
		double mediaGeral = calulaMedia(medias);
		System.out.println("A média geral da turma é de: " + mediaGeral);
		
		ordenaNotas(nomes, medias);
		
		imprimeNotas(nomes, medias);
		
	}
	
	private void imprimeNotas(String[] nomes, double[] medias) {
		for (int i = 0; i < medias.length; i++) {
			System.out.println("Aluno: " + nomes[i] + " tem a média de: " + medias[i]);
		}
	}

	private void leituraDados(String[] nomes, double[] medias) {
		int quantidadeDados = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		while (quantidadeDados < nomes.length) {
			
			System.out.println("Informe o nome do aluno:");
			nomes[quantidadeDados] = teclado.next();
			
			System.out.println("Informe a média do aluno:");
			medias[quantidadeDados] = teclado.nextDouble();
			
			quantidadeDados++;
		}
		teclado.close();
	}
	
	private double calulaMedia(double[] medias) {
		
		double mediaGeral = 0;
		int qtdNotas = 0;
		
		for (int i = 0; i < medias.length; i++) {
			double nota = medias[i];
			mediaGeral += nota;
			
			if (nota != 0) {
				qtdNotas++;
			}
			
		}
		
		return mediaGeral / qtdNotas;
	}
	
	private void ordenaNotas(String[] nomes, double[] notas) {
		double bolha;
		String nomeBolha;
		
		for (int i = 0; i < notas.length - 1; i++) {
			for (int j = 0; j < notas.length - 1; j++) {
				if (notas[j] > notas[j + 1]) {
					bolha = notas[j];
					notas[j] = notas[j + 1];
					notas[j + 1] = bolha;
					
					nomeBolha = nomes[j];
					nomes[j] = nomes[j + 1];
					nomes[j + 1] = nomeBolha;
					
					j--;
				}
			}
		}
		
	}
}
