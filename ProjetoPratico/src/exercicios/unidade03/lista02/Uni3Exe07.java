package exercicios.unidade03.lista02;

public class Uni3Exe07 {

	int quantidadeLata;
	int quantidadeGarrafa;
	int quantidadePet;
	
	double conteudoLata = 350;
	double conteudoGarrafa = 600;
	double conteudoPet = 2000;
	
	double calculaLitros() {
		double totalLata = quantidadeLata * conteudoLata;
		double totalGarrafa = quantidadeGarrafa * conteudoGarrafa;
		double totalPet = quantidadePet * conteudoPet;
		double totalEmLitros = (totalLata + totalGarrafa + totalPet) / 1000;
		return totalEmLitros;
	}
}
