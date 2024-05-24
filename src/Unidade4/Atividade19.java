package Unidade4;
import java.util.Scanner;
public class Atividade19 {
public static void main(String [] args){
Scanner coordenadas = new Scanner (System.in);
System.out.print("X = ");
int x = coordenadas.nextInt();
System.out.print("Y = ");
int y = coordenadas.nextInt();

if (x == 0 && y == 0){
    System.out.println("Quadrante: 0");
}
else if (x > 0 && y > 0){
    System.out.println("Quadrante: 1");
}
else if (x > 0 && y < 0){
    System.out.println("Quadrante: 2");
}
else if (x < 0 && y < 0){
    System.out.println("Quadrante: 3");
}
else if (x < 0 && y > 0){
    System.out.println("Quadrante: 4");
}
}
}
