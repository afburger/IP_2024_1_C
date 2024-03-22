package exercicios.unidade03.lista01;

public class Exe04App {

	public static void main(String[] args) {
		
		Exe04 conta = new Exe04();
		
		conta.numeroConta = 12345;
		conta.saldo = 100.00;
		
//		conta.saldo = conta.saldo + 100.00;
		
		conta.depositar(150.00);
		
		conta.sacar(50);
		
		
//		System.out.println(conta.saldo);
		
	}
}
