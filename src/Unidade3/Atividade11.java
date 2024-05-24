package Unidade3;
import java.util.Scanner;
public class Atividade11 {
public static void main(String[] args) {
    Scanner temperatura = new Scanner (System.in);
System.out.print("Insira a temperatura em °C para ser transformada: ");
double celcius = temperatura.nextDouble();
double farenheit = (celcius * 9 / 5) + 32;
    System.out.println("A temperatura em °F é de: " + farenheit);

}
}
