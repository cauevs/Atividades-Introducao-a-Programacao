package Unidade3;
import java.util.Scanner;
public class Atividade04 {
    public static void main(String [] args){
Scanner notas = new Scanner (System.in);
System.out.print("Insira a primeira nota: ");
double notaA = notas.nextDouble();
System.out.print("Insira a segunda nota: ");
double notaB = notas.nextDouble();
System.out.print("Insira a terceira nota: ");
double notaC = notas.nextDouble();

int peso1 = 5;
int peso2 = 3;
int peso3 = 2;

double mediatotal = ((notaA*peso1) + (notaB*peso2) + (notaC*peso3)) / 10;
System.out.println("A média final é de: " + mediatotal);


    }

}
