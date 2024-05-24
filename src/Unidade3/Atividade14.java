package Unidade3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Atividade14 {
public static void main(String [] args){
Scanner caminhao = new Scanner (System.in);
System.out.print("Insira a distância percorrida em km: ");
double distancia = caminhao.nextDouble();
System.out.print("Insira o tempo gasto na viagem em horas: ");
double tempoGasto = caminhao.nextDouble();
double velocidadeMedia = (distancia / tempoGasto);
double combustivelGasto = (distancia / 12);

DecimalFormat decimal = new DecimalFormat("#.##");

System.out.println("Velocidade Média: " + velocidadeMedia + " Km/h");
System.out.println("Combustível Gasto: " + decimal.format(combustivelGasto) + " Litros");

}
}