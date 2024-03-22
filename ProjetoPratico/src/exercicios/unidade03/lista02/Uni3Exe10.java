package exercicios.unidade03.lista02;

public class Uni3Exe10 {

	double cateto1;
	double cateto2;
	
	double calculaHipotenusa() {
		double hipotenusaQuadrado = Math.pow(cateto1, 2) + Math.pow(cateto2, 2);
		return Math.sqrt(hipotenusaQuadrado);
	}
}
