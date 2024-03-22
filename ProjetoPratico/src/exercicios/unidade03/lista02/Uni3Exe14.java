package exercicios.unidade03.lista02;

public class Uni3Exe14 {

	int tempoGasto;
	int distanciaPercorrida;
	int autonomia = 12;
	
	double calculaVelocidadeMedia() {
		double velocidade = distanciaPercorrida / tempoGasto;
		return velocidade;
	}
	
	double calculaGastoCombustivel() {
		double gastoCombustivel = distanciaPercorrida / autonomia;
		return gastoCombustivel;
	}
}
