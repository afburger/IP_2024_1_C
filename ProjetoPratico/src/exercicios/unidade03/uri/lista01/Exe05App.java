package exercicios.unidade03.uri.lista01;

public class Exe05App {

	public static void main(String[] args) {
		
		Exe05 produto = new Exe05();
		
		produto.nome = "Caneta";
		produto.preco = 5.50;
		produto.quantidadeEstoque = 0;
		
		produto.adicionarEstoque();
		produto.adicionarEstoque();
		produto.adicionarEstoque();
		
		System.out.println(
			"Quantidade em estoque: " + produto.quantidadeEstoque + 
			"Valor total em estoque: " + produto.totalEstoque());
		
		
		produto.removerEstoque();
		produto.removerEstoque();
		
		System.out.println(
				"Quantidade em estoque: " + produto.quantidadeEstoque + 
				"Valor total em estoque: " + produto.totalEstoque());
	}
}
