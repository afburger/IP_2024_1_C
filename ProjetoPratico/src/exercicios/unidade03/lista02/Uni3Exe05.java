package exercicios.unidade03.lista02;

public class Uni3Exe05 {

	int anelChip = 1;
	int anelAlimento = 2;
	double valorAnelChip = 4;
	double valorAnelAlimento = 3.5;
	
	double calculaGasto(int quantidadeGalinhas) {
		double gastoChipPorGalinha = anelChip * valorAnelChip;
		double gastoAlimentoPorGalinha = anelAlimento * valorAnelAlimento;
		double valorGasto = (gastoAlimentoPorGalinha * quantidadeGalinhas) + (gastoChipPorGalinha * quantidadeGalinhas);
		return valorGasto;
	}
}
