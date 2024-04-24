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
	
	public void imprimeNome(String nome) {
		System.out.println(nome);
	}
	
	public void imprimeNomeDois(Aluno aluno) {
		aluno.nome = "André";
		System.out.println(nome);
	}
	
	public void imprimeNota(float nota) {
		System.out.println(nota);
	}
	
	public void imprimeNotaDois(float nota) {
		nota++;
		System.out.println(nota);
	}
}
