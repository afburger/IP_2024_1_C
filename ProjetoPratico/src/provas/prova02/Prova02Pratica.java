package provas.prova02;

import java.util.Scanner;

public class Prova02Pratica {

	private int tamanhoMochila;
	private int capacidadeMaxima;
	private String[] mochilaValores;
	private int[] mochilaPesos;
	Scanner teclado;
	
	public static void main(String[] args) {
		new Prova02Pratica();
	}

	public Prova02Pratica() {
		
		teclado = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da mochila:");
		tamanhoMochila = teclado.nextInt();
		
		System.out.println("Informe a capacidade m�xima da mochila em Kg:");
		capacidadeMaxima = teclado.nextInt();
		
		mochilaValores = new String[tamanhoMochila];
		mochilaPesos = new int[tamanhoMochila];
		
		String menu = "";
		do {
			
			System.out.println("Informe a op��o desejada: \n"
					+ "   a) Inserir \n"
					+ "   b) Imprimir Mochila \n"
					+ "   c) Qual � o valor do item mais pesado \n"
					+ "   d) OrdenarMochila \n"
					+ "   e) Excluir item da mochila \n"
					+ "   Digite SAIR para encerrar o sistema");
			
			menu = teclado.next().toUpperCase();
			
			executaOpcaoMenu(menu);
			
		} while (!menu.equals("SAIR"));
		
		
		teclado.close();
	}
	
	/**
	 * 
	 * Quest�o A
	 * 
	 */
	private void inserir(String valor, int peso) {
		int pesoTotal = getPesoTotal();
		int pesoAtualizado = pesoTotal + peso;
		int quantidadeTotal = getQuantidadeTotal();
		int tamanhoAtualizado = quantidadeTotal + 1;
		// Verifica se ir� ultrapassar a capacidade m�xima ou o tamanho da mochila.
		if (pesoAtualizado <= capacidadeMaxima && tamanhoAtualizado <= tamanhoMochila) {
			// Percorre o vetor de valores(nomes), para identificar em que posi��o deve inserir o novo elemento.
			for (int i = 0; i < mochilaValores.length; i++) {
				String valorPosicaoVetor = mochilaValores[i];
				// Se a posi��o estiver vazia, insere nesse posi��o.
				if (valorPosicaoVetor == null) {
					// Tanto o nome do elemento como o peso, devem ser inseridos na mesma posi��o
					mochilaValores[i] = valor;
					mochilaPesos[i] = peso;
					break;
				}
			}
		} else {
			// Se a mochila n�o tiver mais capacidade n�o insere o novo elemento.
			System.out.println("N�o inseriu o item " + valor +" (" + peso + ") pois excede a capacidade ("+ pesoTotal + "/" + capacidadeMaxima +") ou o tamanho (" + quantidadeTotal + "/" + tamanhoMochila + ") da mochila!" );
		}
		
	}
	
	private int getPesoTotal() {
		int pesoTotal = 0;
		// Percorre o vetor com os pesos, para calcular o total de peso da mochila.
		for (int i = 0; i < mochilaPesos.length; i++) {
			pesoTotal += mochilaPesos[i];
		}
		return pesoTotal;
	}
	
	private int getQuantidadeTotal() {
		int quantidadeTotal = 0;
		// Percorre o vetor com os valores, para calcular a quantidade de itens que tem na mochila.
		for (int i = 0; i < mochilaValores.length; i++) {
			if (mochilaValores[i] != null) {
				quantidadeTotal++;
			}
		}
		return quantidadeTotal;
	}
	
	
	/**
	 * 
	 * Quest�o B
	 * 
	 */
	private void imprimeMochila() {
		// Percorre em ordem inversa a mochila, para imprimir os valores
		for (int i = mochilaValores.length - 1; i >= 0; i--) {
			if (mochilaValores[i] != null) {
				String valor = mochilaValores[i];
				int peso = mochilaPesos[i];
				System.out.println(valor + ": " + peso);
			}
		}
	}
	
	
	/**
	 * 
	 * Quest�o C
	 * 
	 */
	private String valorItemMaisPesado() {
		int pesoMaisPesado = 0;
		String valorMaisPesado = "";
		// Percorre o vetor de pesos, para identificar o item mais pesado.
		for (int i = 0; i < mochilaPesos.length; i++) {
			if (mochilaPesos[i] > pesoMaisPesado) {
				// Armazena o peso e o valor do item mais pesado.
				pesoMaisPesado = mochilaPesos[i];
				valorMaisPesado = mochilaValores[i];
			}
		}
		return valorMaisPesado;
	}
	
	/**
	 * 
	 * Quest�o D
	 * 
	 */
	private void ordenaMochila() {
		// Executa a ordena��o da mochila baseada no peso.
		int pesoBolha;
		String valorBolha;
		
		for (int i = 0; i < mochilaPesos.length - 1; i++) {
			for (int j = 0; j < mochilaPesos.length - 1; j++) {
				if (mochilaPesos[j] > mochilaPesos[j + 1]) {
					pesoBolha = mochilaPesos[j];
					mochilaPesos[j] = mochilaPesos[j + 1];
					mochilaPesos[j + 1] = pesoBolha;
					
					valorBolha = mochilaValores[j];
					mochilaValores[j] = mochilaValores[j + 1];
					mochilaValores[j + 1] = valorBolha;
					
					j--;
				}
			}
		}
	}
	
	/**
	 * 
	 * Quest�o E
	 * 
	 */
	private void excluirItemMochila(String valor) {
		// Percorre o vetor, para encontrar o item que deve ser removido.
		for (int i = 0; i < mochilaValores.length; i++) {
			if (valor.equals(mochilaValores[i])) {
				// Remove o item da mochila
				mochilaValores[i] = null;
				// Atualiza o peso do item removido para zero.
				mochilaPesos[i] = 0;
			}
		}
	}
	
	/**
	 * 
	 * Quest�o F
	 * 
	 */
	private void executaOpcaoMenu(String menu) {
		switch (menu) {
		case "A":
			System.out.println("Informe o nome do item");
			String valor = teclado.next();
			
			System.out.println("Informe o peso do item");
			int peso = teclado.nextInt();
			
			inserir(valor, peso);
			
			break;

		case "B":
			imprimeMochila();
			break;
			
		case "C":
			System.out.println("O valor do item mais pesado �: " + valorItemMaisPesado());
			break;
			
		case "D":
			ordenaMochila();
			break;
			
		case "E":
			System.out.println("Informe o nome do item que deseja excluir");
			String nome = teclado.next();
			excluirItemMochila(nome);
			break;
		default:
			break;
		}
		
	}
}
