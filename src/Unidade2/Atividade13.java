package Unidade2;
// Cédulas 
import java.util.Scanner;
public class Atividade13 {
    public static void main(String [] args) {
Scanner cedulas = new Scanner (System.in);
System.out.print("Insira o valor a ser decomposto: ");
int valorInicial = cedulas.nextInt();

int valorInteiro = (int) valorInicial;

//calcular o valor de cada nota
 
int nota100 = valorInteiro / 100;
valorInteiro %= 100;

int nota50 = valorInteiro / 50;
valorInteiro %= 50;

int nota20 = valorInteiro/ 20;
valorInteiro %= 20;

int nota10 = valorInteiro/ 10;
valorInteiro %= 10;

int nota5 = valorInteiro / 5;
valorInteiro %=5;

int nota2 = valorInteiro / 2;
valorInteiro %=2;

int nota1 = valorInteiro / 1;
valorInteiro %=1;

// agora faça o código para ele exibir a quantidade inserida e a qnt de cada nota

System.out.println(valorInicial);
System.out.println(nota100 + " notas (s) de R$ 100.00");
System.out.println(nota50 + " notas (s) de R$ 50.00");
System.out.println(nota20 + " notas (s) de R$ 20.00");
System.out.println(nota10 + " notas (s) de R$ 10.00");
System.out.println(nota5 + " notas (s) de R$ 5.00");
System.out.println(nota2 + " notas (s) de R$ 2.00");
System.out.println(nota1 + " notas (s) de R$ 1.00");
    }
}