package Unidade3;
import java.util.Scanner;
public class Atividade08 {
public static void main(String [] args){
Scanner cambio = new Scanner (System.in);
System.out.print("Insira o valor em dólares a serem trocados: U$ ");
double dolar = cambio.nextDouble();
int diferenca = 5;
double real = (dolar * 5);
System.out.println("O valor em reais a ser devolvido é: R$ " + real);

}
}
