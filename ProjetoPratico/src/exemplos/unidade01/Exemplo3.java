package exemplos.unidade01;

import java.util.Scanner;

public class Exemplo3 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva seu nome:");
        String nome = sc.nextLine();
        System.out.println("Seu nome é: " + nome);
        sc.close();
    }


}
