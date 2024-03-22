package exercicios.unidade03.lista02;

public class Uni3Exe13 {

	double comprimento;
	double altura;
	
	double valorAzuleijo = 12.50;
	int azuleijosMetro = 9;
	
	double calculaValorParede() {
		double metragemQuadrada = comprimento * altura;
		double quantidadeAzuleijos = metragemQuadrada / azuleijosMetro;
		double valorTotal = quantidadeAzuleijos * valorAzuleijo;
		return valorTotal;
	}
}
