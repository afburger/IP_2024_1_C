package exercicios.unidade03.lista02;

public class Uni3Exe02 {

	double percentualDesconto = 12;
	double valorProduto;
	
	void aplicaDesconto() {
		double valorDesconto = (valorProduto * percentualDesconto) / 100;
		double valorLiquidoProduto = valorProduto - valorDesconto;
		System.out.println("O valor do desconto é de R$ " + valorDesconto);
		System.out.println("O preço do par de sapatos com desconto é R$ " + valorLiquidoProduto);
	}
}
