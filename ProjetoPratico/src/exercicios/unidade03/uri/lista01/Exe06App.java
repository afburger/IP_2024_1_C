package exercicios.unidade03.uri.lista01;

public class Exe06App {

	public static void main(String[] args) {
		Exe06 veiculo = new Exe06();
		
		veiculo.modelo = "Gol";
		veiculo.capacidadeTanque = 50;
		veiculo.quilometragem = 630;
		
		System.out.println("A média da ultima viagem foi: " + veiculo.calculaMedia());
	}
}
