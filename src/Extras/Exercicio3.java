package Extras;
import java.util.Scanner;
public class Exercicio3 {
public static void main (String [] args){
Scanner conversor = new Scanner (System.in);
System.out.print("Insira o tempo em segundos: ");
int tempoSegundos = conversor.nextInt();

int horas = (tempoSegundos / 3600);
int sobraMinutos = (tempoSegundos - (horas * 3600));
int minutos = (sobraMinutos / 60);
int segundos = (tempoSegundos - (horas * 3600) - (minutos * 60));
System.out.printf("Horas: %d \nMinutos: %d \nSegundos: %d", horas, minutos, segundos);
}
}
