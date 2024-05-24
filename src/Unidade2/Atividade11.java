package Unidade2;
//Atividade Distância entre dois pontos
import java.util.Scanner;
public class Atividade11 {
public static void main(String [] args) {
Scanner distanciaEntrePontos = new Scanner (System.in);
System.out.print("Insira o valor de x1: ");
double x1 = distanciaEntrePontos.nextDouble();
System.out.print("Insira o valor de y1: ");
double y1 = distanciaEntrePontos.nextDouble();
System.out.print("Insira o valor de x2: ");
double x2 = distanciaEntrePontos.nextDouble();
System.out.print("Insira o valor de y2: ");
double y2 = distanciaEntrePontos.nextDouble();
double distancia = ((x1 - x2) * (x1 - x2)) + ((y1 - y2) * (y1 - y2));
double raiz = Math.sqrt(distancia);
System.out.println(raiz);
}
}
