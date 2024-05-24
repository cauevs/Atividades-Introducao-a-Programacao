package Unidade2;
//Atividade Conversão de Tempo
import java.util.Scanner;
public class Atividade14 {
public static void main(String [] agrs) {
Scanner tempo = new Scanner (System.in);
System.out.print("Insira o tempo em um número inteiro: ");
int tempoInteiro = tempo.nextInt();
int horas = (tempoInteiro / 3600);
int minutos = ((tempoInteiro % 3600) / 60);
int segundos = (tempoInteiro % 60);
System.out.println(horas + ":" + minutos + ":" + segundos);

}
}
