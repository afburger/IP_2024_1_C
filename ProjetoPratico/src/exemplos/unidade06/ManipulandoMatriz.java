package exemplos.unidade06;

import java.util.Random;
import java.util.Scanner;

public class ManipulandoMatriz {

	private int[][] matriz;
	
	public static void main(String[] args) {
		new ManipulandoMatriz();
	}
	
	public ManipulandoMatriz() {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Insira a quantidade de linhas");
		int qtdLinhas = teclado.nextInt();
		
		System.out.println("Insira a quantidade de colunas");
		int qtdColunas = teclado.nextInt();
		
		matriz = new int[qtdLinhas][qtdColunas];
		
		preencheMatriz(teclado);
		
		imprimeMatriz();
		System.out.println("A soma da matriz é: " + calcularSoma());
		
		System.out.println("--------------------------------------------");

//		System.out.println("Infome a linha do elemento que será excluido:");
//		int linhaExclusao = teclado.nextInt();
//		
//		System.out.println("Infome a coluna do elemento que será excluido:");
//		int colunaExclusao = teclado.nextInt();
		
		System.out.println("Infome o valor que será excluido:");
		int valorExclusao = teclado.nextInt();
		
		excluirValor(buscaLinhaValor(valorExclusao), buscaColunaValor(valorExclusao));
		
		
		imprimeMatriz();
		System.out.println("A soma da matriz é: " + calcularSoma());
		
		System.out.println("--------------------------------------------");
		System.out.println("Infome o valor que será alterado:");
		int valorAltecao = teclado.nextInt();
		
		System.out.println("Infome o novo valor:");
		int novoValor = teclado.nextInt();
		
		alteraValor(buscaLinhaValor(valorAltecao), buscaColunaValor(valorAltecao), novoValor);
		
		imprimeMatriz();
		System.out.println("A soma da matriz é: " + calcularSoma());
		
		teclado.close();
	}
	
	/**
	 * Valida se a linha e a coluna são válidas.
	 * @param linha - a linha que será verificada
	 * @param coluna - a coluna que será verificada.
	 * @return <code>true</code> se for válido e <code>false</code> caso inválido.
	 */
	private boolean isLinhaColunaValida(int linha, int coluna) {
		if (linha >= 0 && linha < matriz.length && 
				coluna >= 0 && coluna < matriz[linha].length) {
			return true;
		} 
		System.out.println("Posição inválida");
		return false;
	}
	
	
	private void inserirValor(int linha, int coluna, int valor) {
		if (isLinhaColunaValida(linha, coluna)) {
			// Verifica se a posição está vazia, se estiver insere o valor, caso contrário apresenta um erro.
			if (matriz[linha][coluna] == 0) {
				matriz[linha][coluna] = valor;
			} else {
				System.out.println("Posição já preenchida");
			}
			
		} 
	}
	
	private void alteraValor(int linha, int coluna, int valor) {
		if (isLinhaColunaValida(linha, coluna)) {
			matriz[linha][coluna] = valor;
		} 
	}
	
	private void excluirValor(int linha, int coluna) {
		if (isLinhaColunaValida(linha, coluna)) {
			matriz[linha][coluna] = 0;
		} 
	}
	
	public int calcularSoma() {
		int soma = 0;
		// percorre as linhas
		for (int i = 0; i < matriz.length; i++) {
			// percorrer as colunas
			for (int j = 0; j < matriz[i].length; j++) {
				soma += matriz[i][j];
			}
		}
		return soma;
	}
	
	private void preencheMatriz(Scanner teclado) {
		System.out.println("Preencha a matriz com valores inteiros");
		
		Random geradorRandomico = new Random();
		
		// percorre as linhas
		for (int i = 0; i < matriz.length; i++) {
			// percorrer as colunas
			for (int j = 0; j < matriz[i].length; j++) {
//				System.out.println("Valor do elemento na posição [" + i + "] [" + j + "]: ");
				inserirValor(i, j, geradorRandomico.nextInt(9));
			}
		}
	}
	
	private void imprimeMatriz() {
		for (int i = 0; i < matriz.length; i++) {
			// percorrer as colunas
			for (int j = 0; j < matriz[i].length; j++) {
				System.out.println("Valor: [" + i + "] [" + j + "] = " + matriz[i][j]);
			}
		}
	}
	
	private int buscaLinhaValor(int valor) {
		for (int i = 0; i < matriz.length; i++) {
			// percorrer as colunas
			for (int j = 0; j < matriz[i].length; j++) {
				if (valor == matriz[i][j]) {
					return i;
				}
			}
		}
		return -1;
	}
	
	private int buscaColunaValor(int valor) {
		for (int i = 0; i < matriz.length; i++) {
			// percorrer as colunas
			for (int j = 0; j < matriz[i].length; j++) {
				if (valor == matriz[i][j]) {
					return j;
				}
			}
		}
		return -1;
	}
}
