package Unidade2;
//Ativade Área do Círculo 
import java.util.Scanner;
public class Atividade02 {
    public static void main(String [] args){
Scanner continha = new Scanner (System.in);
System.out.print("Insira o valor do raio: ");
double raio = continha.nextDouble();
double n = 3.14159;
double raioTotal = raio * raio;
double area = n * raioTotal;
System.out.println("O valor da Área é de: " + area);
    }

}
