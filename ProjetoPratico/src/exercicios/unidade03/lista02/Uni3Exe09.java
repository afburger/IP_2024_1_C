package exercicios.unidade03.lista02;

public class Uni3Exe09 {

	double pi = 3.14;
	double raio;
	double altura;
	
	double calculaVolume() {
		return pi * Math.pow(raio, 2) * altura;
//		return pi * ((raio * raio) * altura);
	}
}
