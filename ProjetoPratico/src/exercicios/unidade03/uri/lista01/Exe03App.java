package exercicios.unidade03.uri.lista01;

public class Exe03App {

	public static void main(String[] args) {
		Exe03 retangulo = new Exe03();
		
		retangulo.base = 4;
		retangulo.altura = 2;
		
		System.out.println("A área do retangulo é: " + retangulo.calculaArea());
		System.out.println("O perímetro do retangulo é: " + retangulo.calculaPerimetro());
	}
	
}
