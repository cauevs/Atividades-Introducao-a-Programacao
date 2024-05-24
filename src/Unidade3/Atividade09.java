package Unidade3;
import java.util.Scanner;
public class Atividade09 {
public static void main(String[] args) {
Scanner oleo = new Scanner (System.in);
System.out.print("insira o raio da lata de óleo: ");
double raio = oleo.nextDouble();
System.out.print("Insira a altura da lata de óleo: ");
double altura = oleo.nextDouble();
double volume = ((raio * raio) * altura) * Math.PI;
System.out.println("O volume da lata é de: " + volume);

}
}
