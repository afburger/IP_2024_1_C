import java.util.Scanner;

public class Uni5Exe15a {
  public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
    String nome = "";
    double nota1, nota2, media;

    while (!nome.equals("fim")) {
      System.out.print(" nome: "); nome = teclado.next();
      if (!nome.equals("fim")) {
        System.out.print(" nota1: "); nota1 = teclado.nextDouble();
        System.out.print(" nota2: "); nota2 = teclado.nextDouble();
        media = (nota1 + nota2) / 2;
        System.out.println(" Média: " + media);
      }
    }

    teclado.close();
  }
}

