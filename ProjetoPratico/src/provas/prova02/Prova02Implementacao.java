package provas.prova02;

import java.util.Scanner;

public class Prova02Implementacao {

	private int tamanhoMochila;
	private int capacidadeMochila;
	private String[] mochilaValores;
	private int[] mochilaPesos;
	private Scanner teclado;
	
	public static void main(String[] args) {
		new Prova02Implementacao();
	}
	
	public Prova02Implementacao() {
		
		teclado = new Scanner(System.in);
		
		System.out.println("Informe o tamanho da mochila:");
		tamanhoMochila = teclado.nextInt();
		
		System.out.println("Informe a capacidade máxima da mochila em KG:");
		capacidadeMochila = teclado.nextInt();
		
		mochilaValores = new String[tamanhoMochila];
		mochilaPesos = new int[tamanhoMochila];
		
		String menu = "";
		
		do {

			System.out.println("Informe a opção desejada: \n" + "   "
					+ "a) Inserir \n" + "   "
					+ "b) Imprimir Mochila \n"
					+ "c) Qual o valor do item mais pesado \n" 
					+ "d) OrdenarMochila \n"
					+ "e) Excluir item da mochila \n" 
					+ "Digite SAIR para encerrar o sistema");

			menu = teclado.next().toUpperCase();

			executaOpcaoMenu(menu);

		} while (!menu.equals("SAIR"));
		
		
		teclado.close();
	}
	
	private void inserir(String valor, int peso) {
		int pesoTotal = getPesoTotal();
		int pesoAtualizado = pesoTotal + peso;
		
		int quantidadeTotal = getQuantidadeTotal();
		int tamanhoAtualizado = quantidadeTotal + 1;
		
		// Verificar se irá ultrapassar a capacidade máxima ou o tamanho da mochila
		if (pesoAtualizado <= capacidadeMochila 
				&& tamanhoAtualizado <= tamanhoMochila) {
			
			for (int i = 0; i < mochilaValores.length; i++) {
				String valorPosicaoVetor = mochilaValores[i];
				if (valorPosicaoVetor == null) {
					mochilaValores[i] = valor;
					mochilaPesos[i] = peso;
					break;
				}
				
			}
			
		} else {
			System.out.println("Não inseriu o item " + valor +" (" + peso + ") pois excede a capacidade ("+ pesoTotal + "/" + capacidadeMochila +") ou o tamanho (" + quantidadeTotal + "/" + tamanhoMochila + ") da mochila!" );

		}
	}
	
	private int getPesoTotal() {
		int pesoTotal = 0;
		
		for (int i = 0; i < mochilaPesos.length; i++) {
			pesoTotal += mochilaPesos[i];
		}
		
		return pesoTotal;
	}
	
	private int getQuantidadeTotal() {
		int quantidadeTotal = 0;
		
		for (int i = 0; i < mochilaValores.length; i++) {
			if (mochilaValores[i] != null) {
				quantidadeTotal++;
			}
			
		}
		
		return quantidadeTotal;
	}
	
	private void imprimeMochila() {
		for (int i = mochilaValores.length - 1; i >= 0 ; i--) {
			if (mochilaValores[i] != null) {
				String valor = mochilaValores[i];
				int peso = mochilaPesos[i];
				System.out.println(valor + ": " + peso);
			}
		}
	}

	private String valorItemMaisPesado() {
		int pesoMaisPesado = 0;
		String valorMaisPesado = "";
		
		for (int i = 0; i < mochilaPesos.length; i++) {
			if (mochilaPesos[i] > pesoMaisPesado) {
				pesoMaisPesado = mochilaPesos[i];
				valorMaisPesado = mochilaValores[i];
			}
		}
		
		return valorMaisPesado;
	}
	
	private void ordenaMochila() {
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
	
	private void excluirItemMochila(String valor) {
		boolean encontrou = false;
		for (int i = 0; i < mochilaValores.length; i++) {
			if (valor.equals(mochilaValores[i])) {
				mochilaValores[i] = null;
				mochilaPesos[i] = 0;
				encontrou = true;
			}
		}
		
		if (!encontrou) {
			System.out.println("Não encontrei o valor para excluir");
		}
	}
	
	private void executaOpcaoMenu(String menu) {
		switch (menu) {
		case "A": 
			System.out.println("Informe o nome do item");
			String valor = teclado.next();
			
			System.out.println("Informe o peso do item");
			int peso = teclado.nextInt();
			
			inserir(valor, peso);
			break;
		
		case "B" :
			imprimeMochila();
			break;
		
		case "C" :
			System.out.println("O valor do item mais pesado é: " + valorItemMaisPesado());
			break;
		
		case "D" :
			ordenaMochila();
			break;
		
		case "E":
			System.out.println("Informe o nome do item que deseja excluir");
			String nome = teclado.next();
			excluirItemMochila(nome);
			
		default:
			break;
		}
	}
}
