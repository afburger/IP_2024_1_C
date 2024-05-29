package exemplos.sistema.produtos;

public class Produto {

	private String nome;
	private double preco;
	private int quantidadeEstoque;
	
	public Produto(String nome, double preco, int qtd) {
		this.nome = nome;
		this.preco = preco;
		this.quantidadeEstoque = qtd;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}

	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	
}
