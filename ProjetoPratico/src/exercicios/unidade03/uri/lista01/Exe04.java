package exercicios.unidade03.uri.lista01;

public class Exe04 {

	int numeroConta;
	double saldo;
	
	double retornaSaldo() {
		return saldo;
	}
	
	void depositar(double valorDeposito) {
		System.out.println("Você está depositando: " + valorDeposito + " reais");
		saldo = saldo + valorDeposito;
		imprimeSaldoAtualizado(saldo);
		
	}
	
	double sacar(double valorSaque) {
		saldo = saldo - valorSaque;
		imprimeSaldoAtualizado(saldo);
		return saldo;
	}
	
	void imprimeSaldoAtualizado(double saldoAtualizado) {
		System.out.println("Seu saldo atualizado é de: " + saldoAtualizado + "reais");
	}
	
	
}
