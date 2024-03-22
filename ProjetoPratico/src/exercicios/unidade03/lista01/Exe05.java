package exercicios.unidade03.lista01;

public class Exe05 {

	String nome;
	double preco;
	double quantidadeEstoque;
	
	void adicionarEstoque() {
		quantidadeEstoque = quantidadeEstoque + 5;
	}
	
	void removerEstoque() {
		quantidadeEstoque = quantidadeEstoque - 1;
	}
	
	double totalEstoque() {
		return quantidadeEstoque * preco;
	}
}
