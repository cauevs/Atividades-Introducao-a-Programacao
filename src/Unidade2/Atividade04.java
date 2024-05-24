package Unidade2;

//Atividade Produto Simples
import java.util.Scanner;

public class Atividade04 {
  public static void main(String[] args) {
    Scanner multiplicacao = new Scanner(System.in);
    System.out.print("Insira o primeiro valor: ");
    int valor1 = multiplicacao.nextInt();
    System.out.print("Insira o segundo valor: ");
    int valor2 = multiplicacao.nextInt();
    int prod = valor1 * valor2;
    System.out.println("PROD = " + prod);
    System.out.printf("%d x %d = %d", valor1, valor2, prod);
  }
}
