package exemplos.sistema.produtos;

public class Main {

	public static void main(String[] args) {

		GerenciadorProdutos estoque = new GerenciadorProdutos(100);
		
		estoque.adicionarProduto(new Produto("Coca-cola 2L", 7.80, 100));
		
		Produto cerveja = new Produto("Cerveja 350ml", 5, 1000);
		estoque.adicionarProduto(cerveja);
		
		estoque.atualizaEstoque("Coca-cola 2L", 250);
		
		estoque.adicionarProduto(new Produto(null, 0, 0));
		
		
		estoque.listarProdutos();
		
		System.out.println("O valor total do estoque é de: " + estoque.calculaValorTotalEstoque());
	}

}
