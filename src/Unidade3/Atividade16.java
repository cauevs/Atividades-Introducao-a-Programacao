package Unidade3;
import java.util.Scanner;
public class Atividade16 {
public static void main(String [] args){
Scanner troco = new Scanner (System.in);
System.out.print("Insira o valor: R$ ");
int valor = troco.nextInt();

int nota100 = valor / 100;
valor %= 100;


int nota10 = valor / 10;
valor %= 10;


int nota1 = valor / 1;
valor %= 1;

System.out.println(nota100 + " nota(s) de R$ 100,00");
System.out.println(nota10 + " nota(s) de R$ 10,00");
System.out.println(nota1 + " nota(s) de R$ 1,00");

}
}
