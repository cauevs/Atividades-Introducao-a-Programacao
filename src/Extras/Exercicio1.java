package Extras;
import java.util.Scanner;
public class Exercicio1 {
public static void main (String [] args){
Scanner horario = new Scanner (System.in);
System.out.print("Insira o valor da hora: ");
int hora = horario.nextInt();
System.out.print("Insira o valor do minuto: ");
int minuto = horario.nextInt();
System.out.print("Insira o valor do segundo: ");
int segundo = horario.nextInt();

int segundoHoras = (hora * 3600);
int segundoMinuto = (minuto * 60);
int totalTempo = (segundoHoras + segundoMinuto + segundo);
System.out.println("Se passaram um total de " + totalTempo + " segundos.");


}
}
