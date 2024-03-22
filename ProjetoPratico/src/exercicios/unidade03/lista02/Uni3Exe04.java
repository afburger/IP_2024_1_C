package exercicios.unidade03.lista02;

public class Uni3Exe04 {

	double nota1;
	double nota2;
	double nota3;
	
	double calculaMedia() {
		double nota1Ponderada = nota1 * 0.5;
		double nota2Ponderada = nota2 * 0.3;
		double nota3Ponderada = nota3 * 0.2;
		return nota1Ponderada + nota2Ponderada + nota3Ponderada;
	}
}
