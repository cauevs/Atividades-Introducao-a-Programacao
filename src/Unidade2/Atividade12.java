package Unidade2;
//Distância 
import java.util.Scanner;
public class Atividade12 {
    public static void main(String [] agrs) {
    Scanner carros = new Scanner (System.in);
System.out.print("Insira a distância: ");
double distanciaCarros = carros.nextDouble();
double tempo = (distanciaCarros / 30);
double tempoTotal = (tempo * 60);
System.out.println(tempoTotal + " minutos");




    }
}
