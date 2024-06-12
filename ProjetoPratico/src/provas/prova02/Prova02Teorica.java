package provas.prova02;

public class Prova02Teorica {

	public static void main(String[] args) {
		new Prova02Teorica();
	}
	
	public Prova02Teorica() {
		
		int[] vetor = new int[] {1, 2, 3, 4, 5, 6};
		vetorPesquisa(vetor, 4, vetor.length);
		
		int vetor2[] = {10, 5, 3, 8, 9};
		int numero = vetor2.length;
		teste(vetor2, 5, numero);
	}
	
	/**
	 * A) Depende, depende se vai encontrar o valor pesquisado dentro do vetor. Se encontrar não vai imprimir, se não encontrar imprime uma vez, pois ele está após o "for"
	 * 
	 * B) Ira executar no máximo a quantidade de vezes menos um do valor que estiver informado na variável valor ou até encontrar o valor dentro do vetor.
	 * 
	 */
	private boolean vetorPesquisa(int vetor[], int valor, int vetorPos) {
		for (int i = 0; i < vetorPos; i++) {
			if (valor == vetor[i]) {
				return true;
			}
		}
		System.out.println("Fim do método");
		return false;
	}
	
//	private void teste(int vetor[], int tamanho, int numero) {
//		int aux = 0;
//		for (int i = 0; i < tamanho; i++) {
//			for (int j = 0; j < i; j++) {
//				aux = vet[i];
//				vet[i] = vet[j];
//				vet[j] = aux;
//			}
//			numero++;
//		}
//	}
	
	/**
	 * A) Está realizando a troca entre os elementos do vetor.
	 * 
	 * B) Total de Execuções do Laço Interno
	 *	Para calcular o total de execuções do laço interno, devemos somar todas as iterações do laço j para cada valor de i
	 *
	 *	Quando i=0, o laço interno não executa (0 iterações).
	 *	Quando i=1, o laço interno executa 1 vez.
	 *	Quando i=2, o laço interno executa 2 vezes.
	 * 
	 * 	S = ((n-1) * n) / 2
	 * 
	 * R: 10 vezes, pois o vetor tem 5 posições, (0 + 1 + 2 + 3 + 4 = 10)
	 * 
	 * 
	 * C) {9, 8, 3, 5, 10}, pois ele vai realizar a troca entre todos os valores do vetor.
	 * 
	 * D) 10, pois a cada execução do for externo ele incrementa a variável, como esse for vai percorrer 5x ele vai incrementar 5 no valor original que é 5.
	 * 
	 */
	private void teste(int vetor[], int tamanho, int numero) {
		int aux = 0;
		for (int i = 0; i < tamanho; i++) {
			for (int j = 0; j < i; j++) {
				aux = vetor[i];
				vetor[i] = vetor[j];
				vetor[j] = aux;
			}
			numero++;
		}
		System.out.println(numero);
	}
}
