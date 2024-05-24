package Unidade2;
//Atividade Cálculo Simples
import java.util.Scanner;
public class Atividade09 {
public static void main(String [] args) {
Scanner pecas = new Scanner (System.in);
System.out.print("Insira o código da peça número 1: ");
int codigoPeca1 = pecas.nextInt();
System.out.print("Insira o número da peça número 1: ");
int numeroPeca1 = pecas.nextInt();
System.out.print("Insira o valor unitário da peça número 1: ");
double valorpeca1 = pecas.nextDouble();
System.out.print("Insira o código da peça número 2: ");
int codigoPeca2 = pecas.nextInt();
System.out.print("Insira o número da peça número 2: ");
int numeroPeca2 = pecas.nextInt();
System.out.print("Insira o valor unitário da peça número 2: ");
double valorpeca2 = pecas.nextDouble();
double totalpeca = ((valorpeca1 * numeroPeca1) + (valorpeca2 * numeroPeca2));
System.out.println("VALOR A PAGAR: R$ " + totalpeca);

}
}
