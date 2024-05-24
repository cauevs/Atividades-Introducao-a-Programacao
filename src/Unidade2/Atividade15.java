package Unidade2;
//Notas e Moedas
import java.util.Scanner;
public class Atividade15 {
public static void main(String [] args) {
Scanner moedas = new Scanner (System.in);
System.out.print("Insira o valor a ser transformado: ");
double valor = moedas.nextDouble();

// Calcular a parte inteiro do valor real
int valorInteiro = (int) valor;

// Calcular a parte decimal do valor real 

double parteDecimal = valor - valorInteiro;

// Valores

int nota100 = valorInteiro / 100;
valorInteiro %= 100;

int nota50 = valorInteiro / 50;
valorInteiro %=50;

int nota20 = valorInteiro / 20;
valorInteiro %= 20;

int nota10 = valorInteiro / 10;
valorInteiro %= 10;

int nota5 = valorInteiro / 5;
valorInteiro %=5;

int nota2 = valorInteiro / 2;
valorInteiro %=2;

// moedas 

int moeda1 = (int) (valorInteiro / 1);
valorInteiro %=1;

int moeda050 = (int) (parteDecimal / 0.50);
parteDecimal %=0.50;

int moeda025 = (int) (parteDecimal / 0.25);
parteDecimal %=0.25;

int moeda010 = (int) (parteDecimal / 0.10);
parteDecimal %=0.10;

int moeda05 = (int) (parteDecimal / 0.05F);
parteDecimal %= 0.05F;

int moeda01 = (int) (parteDecimal / 0.01F);
parteDecimal %= 0.01F;

// Mensagem que sairá:
System.out.println("\nNOTAS \n");
System.out.println(nota100 + " notas (s) de R$ 100.00");
System.out.println(nota50 + " notas (s) de R$ 50.00");
System.out.println(nota20 + " notas (s) de R$ 20.00");
System.out.println(nota10 + " notas (s) de R$ 10.00");
System.out.println(nota5 + " notas (s) de R$ 5.00");
System.out.println(nota2 + " notas (s) de R$ 2.00");
System.out.println("\nMOEDAS \n");
System.out.println(moeda1 + " moeda (s) de R$ 1.00");
System.out.println(moeda050 + " moeda (s) de R$ 0.50");
System.out.println(moeda025 + " moeda (s) de R$ 0.25");
System.out.println(moeda010 + " moeda (s) de R$ 0.10");
System.out.println(moeda05 + " moeda (s) de R$ 0.05");
System.out.println(moeda01 + " moeda (s) de R$ 0.01");

}

}
