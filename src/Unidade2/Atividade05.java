package Unidade2;

//Atividade Média 1
import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner notas = new Scanner(System.in);
        System.out.print("Insira a primeira nota: ");
        double notaA = notas.nextDouble();
        System.out.print("Insira a segunda nota: ");
        double notaB = notas.nextDouble();
        double peso1 = 3.5F;
        double peso2 = 7.5F;
        double MEDIA = ((notaA * peso1) + (notaB * peso2)) / 11;
        System.out.println("MEDIA = " + MEDIA);
    }
}
