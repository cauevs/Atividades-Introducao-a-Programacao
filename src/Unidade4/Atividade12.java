package Unidade4;
import java.util.Scanner;
public class Atividade12 {
public static void main(String [] args){
Scanner valores = new Scanner (System.in);
System.out.print("Entre com o comprimento do lado 1: ");
double lado1 = valores.nextDouble();
System.out.print("Entre com o comprimento do lado 2: ");
double lado2 = valores.nextDouble();
System.out.print("Entre com o comprimento do lado 3: ");
double lado3 = valores.nextDouble();
if (lado1 <= (lado2 + lado3) && lado2 <= (lado1 + lado3) && lado3 <= (lado1 + lado2)) {
if (lado1 == lado2 && lado1 == lado3){
    System.out.println("É equilátero");
}
else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3){
    System.out.println("É isósceles");
    
}
else {
    System.out.println("é escaleno");
}
}

    else {
        System.out.println("Não formam um triângulo");
    }
}
}
