package exercicios.unidade03.lista02;

public class Uni3Exe16 {

	int notasCem = 100;
	int notasDez = 10;
	int notasUm = 1;
	
	int valorCompra;
	int valorPago;
	
	int calculaValorTroco() {
		int valorTroco = valorPago - valorCompra;
		return valorTroco;
	}
	
	void escrevaNotas() {
		int valorTroco = calculaValorTroco();
		int notas100 = valorTroco / notasCem;
		valorTroco = valorTroco - (notas100 * notasCem);
		
		int notas10 = valorTroco / notasDez;
		valorTroco = valorTroco - (notas10 * notasDez);
		
		int notas1 = valorTroco / notasUm;
		valorTroco = valorTroco - (notas1 * notas100);
		
		int totalNotas = notas100 + notas10 + notas1;
		
		System.out.println("O caixa deve fornecer " + totalNotas + " notas");
		
		
		System.out.println(notas100 + " notas de 100");
		System.out.println(notas10 + " notas de 10");
		System.out.println(notas1 + " notas de 1");
		
	}
	
}
