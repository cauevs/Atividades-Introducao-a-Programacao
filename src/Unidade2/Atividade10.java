package Unidade2;
//Atividade Área 
import java.util.Scanner;
public class Atividade10 {
    public static void main(String [] args) {
Scanner areas = new Scanner (System.in);
System.out.print("Insira o valor A: ");
double valorA = areas.nextDouble();
System.out.print("Insira o valor B: ");
double valorB = areas.nextDouble();
System.out.print("Insira o valor C: ");
double pi = 3.14159;
double valorC = areas.nextDouble();
double areaTriangulo = ((valorA * valorC) / 2);
double areaCirculo = ((valorC * valorC) * pi);
double areaTrapezio = ((valorA + valorB) * (valorC) / 2);
double areaQuadrado = (valorB * valorB);
double areaRetangulo = (valorA * valorB);
System.out.println("TRIANGULO: " + areaTriangulo);
System.out.println("CIRCULO: " + areaCirculo);
System.out.println("TRAPEZIO: " + areaTrapezio);
System.out.println("QUADRADO: " + areaQuadrado);
System.out.println("RETANGULO: " + areaRetangulo);
    }
}
