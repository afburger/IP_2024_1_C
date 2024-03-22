package exercicios.unidade03.lista02;

public class Uni3Exe06 {

	double valorKG = 25;
	double tara = 0.750;
	
	double calculaValorPrato(double pesoTotalPrato) {
		return (pesoTotalPrato - tara) * valorKG;
	}
}
