package exemplo;

public class Exemplo01 {

	public static void main(String[] args) {
		System.out.println("Olá Mundo!");

		Aluno aluno = new Aluno();
		
		aluno.nome = "André";
		aluno.nota1 = 10;
		aluno.nota2 = 7;
		aluno.nota3 = 7;
		
		System.out.println("A nota do aluno " + aluno.nome + " é: " + aluno.calculaMedia());
		
	}

}
