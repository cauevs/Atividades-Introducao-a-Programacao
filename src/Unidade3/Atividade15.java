package Unidade3;
import java.util.Scanner;
public class Atividade15 {
public static void main(String [] args){
Scanner inteiros = new Scanner (System.in);
System.out.print("Insira o número inteiro: ");
int numeroInteiro = inteiros.nextInt();

int centenas = numeroInteiro / 100;
numeroInteiro %= 100;


int dezenas = numeroInteiro / 10;
numeroInteiro %= 10;


int unidades = numeroInteiro / 1;
numeroInteiro %= 1;

System.out.print(centenas + " centena(s)  " + dezenas + " dezenas(s)  " + unidades + " unidade(s)" );
}
}
