package exemplos.unidade03;

public class ExemploParametros {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		
//		
//		aluno.nota1 = 9;
//
//		aluno.imprimeNota(aluno.nota1);
//		
//		aluno.imprimeNotaDois(aluno.nota1);
//		
//		System.out.println(aluno.nota1);
		
		
		aluno.nome = "Felipe";

		aluno.imprimeNome(aluno.nome);
		
		aluno.imprimeNomeDois(aluno);
		
		System.out.println(aluno.nome);
	}
}
