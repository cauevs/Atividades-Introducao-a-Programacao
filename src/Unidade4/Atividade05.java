package Unidade4;
import java.util.Scanner;
public class Atividade05 {
public static void main(String [] args) {
    Scanner cor = new Scanner (System.in);
System.out.print("A cor é azul ?\nR:");
boolean cor2 = cor.nextBoolean();


if (cor2 == true) {
System.out.println("Sim");
}
else {
    System.out.println("Não");
}
}
}
