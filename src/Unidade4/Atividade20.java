package Unidade4;

import java.util.Scanner;

public class Atividade20 {
    public static void main(String[] args) {
        Scanner notaAmericana = new Scanner(System.in);
        System.out.print("Insira a primeira nota de prova: ");
        float nota1 = notaAmericana.nextFloat();
        System.out.print("Insira a segunda nota de prova: ");
        float nota2 = notaAmericana.nextFloat();
        System.out.print("Insira a terceira nota de prova: ");
        float nota3 = notaAmericana.nextFloat();
        System.out.print("Insira a nota de exercicio: ");
        float notaExercicio = notaAmericana.nextFloat();

        float media = (nota1 + (nota2 * 2) + (nota3 * 3) + notaExercicio) / 7;
        
        if (media >= 9.0) {
            System.out.println("Nota: " + media);
            System.out.println("Aprovado!");
            System.out.println("conceito: A");
        } else if ((media >= 7.5) && (media < 9.0)) {
            System.out.println("Nota: " + media);
            System.out.println("Aprovado!");
            System.out.println("conteito: B");
        } else if ((media >= 6.0) && (media < 7.5)) {
            System.out.println("Nota: " + media);
            System.out.println("Aprovado!");
            System.out.println("conceito: C");
        } else if ((media >= 4.0) && (media < 6.0)) {
            System.out.println("Nota: " + media);
            System.out.println("Reprovado!");
            System.out.println("conceito: D");
        } else {
            System.out.println("Nota: " + media);
            System.out.println("Reprovado!");
            System.out.println("conceito: E");
        }
    }
}
