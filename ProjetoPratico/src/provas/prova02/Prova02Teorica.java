package provas.prova02;

public class Prova02Teorica {

	public static void main(String[] args) {
		new Prova02Teorica();
	}
	
	public Prova02Teorica() {
		
		int[] vetor = new int[] {1, 2, 3, 4, 5, 6};
		System.out.println(vetorPesquisa(vetor, 7, vetor.length));
		
		
		
		int vetor2[] = {10, 5, 3, 8, 9};
		int numero = vetor2.length;
		teste(vetor2, 5, numero);
		
	}
	
	/**
	 * A) Depende, depende se vai encontrar o valor pesquisado dentro do vetor. Se encontrar n�o vai imprimir, se n�o encontrar imprime uma vez, pois ele est� ap�s o "for"
	 * 
	 * B) Ira executar no m�ximo a quantidade de vezes menos um do valor que estiver informado na vari�vel valor ou at� encontrar o valor dentro do vetor.
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
	 * A) Est� realizando a troca entre os elementos do vetor.
	 * 
	 * B) Total de Execu��es do La�o Interno
	 *	Para calcular o total de execu��es do la�o interno, devemos somar todas as itera��es do la�o j para cada valor de i
	 *
	 *	Quando i=0, o la�o interno n�o executa (0 itera��es).
	 *	Quando i=1, o la�o interno executa 1 vez.
	 *	Quando i=2, o la�o interno executa 2 vezes.
	 * 
	 * 	S = ((n-1) * n) / 2
	 * 
	 * R: 10 vezes, pois o vetor tem 5 posi��es, (0 + 1 + 2 + 3 + 4 = 10)
	 * 
	 * 
	 * C) {9, 8, 3, 5, 10}, pois ele vai realizar a troca entre todos os valores do vetor.
	 * 
	 * D) 10, pois a cada execu��o do for externo ele incrementa a vari�vel, como esse for vai percorrer 5x ele vai incrementar 5 no valor original que � 5.
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
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		System.out.println("Variável número" + numero);
	}
}
