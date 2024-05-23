package exemplos.unidade06;

public class Matriz {

	public static void main(String[] args) {
		int[][] matriz = new int[3][3];
		
		matriz[0][0] = 99;
		
		int[][] matriz2 = { 
				{1, 2, 3}, 
				{4, 5, 6}, 
				{7, 8, 9}
			};
		
		// Percorrendo as linhas
		for (int i = 0; i < matriz2.length; i++) {
			// Percorrer as colunas
			for (int j = 0; j < matriz2[i].length; j++) {
				System.out.print(matriz2[i][j] + " ");
			}
			// Faz a quebra de linha
			System.out.println();
		}
		
	}
	
}
