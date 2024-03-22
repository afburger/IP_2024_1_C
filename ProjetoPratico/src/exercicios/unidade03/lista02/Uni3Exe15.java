package exercicios.unidade03.lista02;

public class Uni3Exe15 {

	int numero;
	
	void escrevaDecomposicao() {
		int centenas = numero / 100;
		numero = numero - (centenas * 100);
		
		int dezenas = numero / 10;
		numero = numero - (dezenas * 10);
		
		int unidades = numero / 1;
		
		System.out.println(centenas + " centena(s) " + dezenas + " dezena(s) " + unidades + " unidade(s)");
		
		
		
	}
	
}
