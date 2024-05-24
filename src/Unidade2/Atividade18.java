package Unidade2;
import java.util.Scanner;
public class Atividade18 {
public static void main(String [] args) {
Scanner pisos = new Scanner (System.in);
System.out.print("Insira o comprimentos em metros da parede: ");
int comprimento = pisos.nextInt();
System.out.print("Insira a altura em metros da parede: ");
int altura = pisos.nextInt();
double valor = 12.50;
double valorTotal = (comprimento * altura) * valor;
System.out.println("O valor total de pisos será de: R$ " + valorTotal);

}
}
