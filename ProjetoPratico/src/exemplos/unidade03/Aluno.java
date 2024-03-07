package exemplos.unidade03;

public class Aluno {

	float nota1;
	float nota2;
	float nota3;
	String nome;
	char sexo;
	
	float calculaMedia() {
		float soma = nota1 + nota2 + nota3;
		float media = soma / 3;
		return media;
	}
	
}
