package exercicios.unidade05;

import java.util.Scanner;

public class Uni5Exe22 {

  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);

    int ano = 1995;
    double salario = 2000;
    double percentualAumento = 1.5;
    double valorAumento = (salario * percentualAumento) / 100;
    
    while (ano < 2024) {
    	salario +=  valorAumento;
    	valorAumento = valorAumento * 2;
    	ano++;
	}
    
    System.out.println("O salário atual é de: R$ " + salario);
    
    teclado.close();
  }

}

