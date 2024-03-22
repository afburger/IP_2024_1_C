package exercicios.unidade03.lista02;

public class Uni3Exe12 {

	String nome;
	double horasTrabalhadas;
	int numeroDependentes;
	double valorHoraTrabalhada = 10;
	double valorDependente = 60;
	
	double calculaValorHoras() {
		return horasTrabalhadas * valorHoraTrabalhada;
	}
	
	double calculaValorDependente() {
		return numeroDependentes * valorDependente;
	}
	
	double calculaSalarioBruto() {
		return calculaValorDependente() + calculaValorHoras();
	}
	
	double aplicaINSS(double salarioBruto) {
		return salarioBruto * 0.085;
	}
	
	double aplicaIR(double salarioBruto) {
		return salarioBruto * 0.05;
	}
	
	double calculaSalarioLiquido() {
		double salarioHoras = calculaValorHoras();
		double descontos = aplicaINSS(salarioHoras) + aplicaIR(salarioHoras);
		double salarioLiquido = salarioHoras - descontos;
		salarioLiquido = salarioLiquido + calculaValorDependente();
		return salarioLiquido;
	}
}
