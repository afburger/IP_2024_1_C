package exemplos.sistema.produtos;

public class GerenciadorProdutos {

	private Produto[] produtos;
	private int indice = 0;
	
	public GerenciadorProdutos(int tamanhoEstoque) {
		this.produtos = new Produto[tamanhoEstoque];
	}
	
	
	public void adicionarProduto(Produto produtoAdicionar) {
		if (produtos.length == (indice - 1)) {
			System.out.println("O estoque está cheio.");
		} else {
			produtos[indice] = produtoAdicionar;
			indice++;
		}
	}
	
	public void atualizaEstoque(String nomeProduto, int quantidade) {
		for (int i = 0; i < produtos.length; i++) {
			Produto produtoAux = produtos[i];
			if (produtoAux.getNome().equals(nomeProduto)) {
				produtoAux.setQuantidadeEstoque(quantidade);
				break;
			}
		}
	}
	
	public void listarProdutos() {
		for (int i = 0; i < produtos.length; i++) {
			Produto produto = produtos[i];
			
			if (produto != null) {
				System.out.println("Produto [" + i + "]: "
						+ produto.getNome() 
						+ " Preço: " + produto.getPreco()
						+ " Estoque: " + produto.getQuantidadeEstoque());
			}
			
		}
	}
	
	public double calculaValorTotalEstoque() {
		double totalEstoque = 0;
		
		for (int i = 0; i < produtos.length; i++) {
			Produto produto = produtos[i];
			if (produto != null) {
				totalEstoque += produto.getPreco() * produto.getQuantidadeEstoque();
			}
		}
		
		return totalEstoque;
	}
	
}
