package Unidade3;
import java.util.Scanner;
public class Atividade10 {
public static void main (String [] args){
Scanner trianguloRetangulo = new Scanner (System.in);
System.out.print("Insira o comprimento do cateto 1: ");
int cateto1 = trianguloRetangulo.nextInt();

System.out.print("Insira o comprimento do cateto 2: ");
int cateto2 = trianguloRetangulo.nextInt();

int hipotenusa = (cateto1 * cateto1) + (cateto2 * cateto2);
int hipotenusaTotal = (hipotenusa * hipotenusa);

System.out.println("O comprimento da hipotenusa é de: " + hipotenusaTotal);




}
}
