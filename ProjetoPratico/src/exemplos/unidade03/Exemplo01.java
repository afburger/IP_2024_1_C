package exemplos.unidade03;

public class Exemplo01 {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");

		Aluno alunoAndre = new Aluno();
		
		alunoAndre.nome = "André";
		alunoAndre.nota1 = 10;
		alunoAndre.nota2 = 7;
		alunoAndre.nota3 = 7;
		
		System.out.println("A nota do aluno " + alunoAndre.nome + " é: " + alunoAndre.calculaMedia());

		Aluno alunoJoao;
		
		
		alunoJoao = new Aluno();
		
		alunoJoao.nome = "Joâo";
		
		
	}

}
