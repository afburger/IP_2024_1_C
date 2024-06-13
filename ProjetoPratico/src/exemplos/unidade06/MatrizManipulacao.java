package exemplos.unidade06;

import java.util.Scanner;

public class MatrizManipulacao {

    // M�todo para preencher a matriz com valores fornecidos pelo usu�rio
    public static void preencherMatriz(int[][] matriz, Scanner scanner) {
        System.out.println("Preencha a matriz com valores inteiros:");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                inserirValor(matriz, i, j, scanner.nextInt());
            }
        }
    }

    // M�todo para inserir um valor na matriz
    public static void inserirValor(int[][] matriz, int linha, int coluna, int valor) {
        if (linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz[linha].length) {
            matriz[linha][coluna] = valor;
        } else {
            System.out.println("Posi��o inv�lida!");
        }
    }

    // M�todo para alterar um valor na matriz
    public static void alterarValor(int[][] matriz, int linha, int coluna, int novoValor) {
        if (linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz[linha].length) {
            matriz[linha][coluna] = novoValor;
        } else {
            System.out.println("Posi��o inv�lida!");
        }
    }

    // M�todo para excluir um valor da matriz
    public static void excluirValor(int[][] matriz, int linha, int coluna) {
        if (linha >= 0 && linha < matriz.length && coluna >= 0 && coluna < matriz[linha].length) {
            matriz[linha][coluna] = 0; // Definindo o valor como 0 para representar a exclus�o
        } else {
            System.out.println("Posi��o inv�lida!");
        }
    }

    // M�todo para calcular a soma de todos os elementos da matriz
    public static int calcularSoma(int[][] matriz) {
        int soma = 0;
        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        Scanner scanner = new Scanner(System.in);

        // Preenchendo a matriz inicialmente
        preencherMatriz(matriz, scanner);

        // Demonstrando inser��o
        System.out.println("Insira um valor na matriz:");
        System.out.print("Linha: ");
        int linhaInserir = scanner.nextInt();
        System.out.print("Coluna: ");
        int colunaInserir = scanner.nextInt();
        System.out.print("Valor: ");
        int valorInserir = scanner.nextInt();
        inserirValor(matriz, linhaInserir, colunaInserir, valorInserir);

        // Demonstrando altera��o
        System.out.println("Altere um valor na matriz:");
        System.out.print("Linha: ");
        int linhaAlterar = scanner.nextInt();
        System.out.print("Coluna: ");
        int colunaAlterar = scanner.nextInt();
        System.out.print("Novo Valor: ");
        int valorAlterar = scanner.nextInt();
        alterarValor(matriz, linhaAlterar, colunaAlterar, valorAlterar);

        // Demonstrando exclus�o
        System.out.println("Exclua um valor da matriz:");
        System.out.print("Linha: ");
        int linhaExcluir = scanner.nextInt();
        System.out.print("Coluna: ");
        int colunaExcluir = scanner.nextInt();
        excluirValor(matriz, linhaExcluir, colunaExcluir);

        // Calculando e mostrando os resultados
        System.out.println("Soma dos elementos: " + calcularSoma(matriz));
        
        scanner.close();
    }
}
