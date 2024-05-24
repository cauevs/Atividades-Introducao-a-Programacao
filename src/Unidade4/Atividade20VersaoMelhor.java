package Unidade4;

import java.util.Scanner;

public class Atividade20VersaoMelhor {
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
        char conceito = ' ';

        float media = (nota1 + (nota2 * 2) + (nota3 * 3) + notaExercicio) / 7;

        if (media >= 9.0) {
            conceito = 'A';
        } else if (media >= 7.5) {
            conceito = 'B';
        } else if (media >= 6.0) {
            conceito = 'C';
        } else if (media >= 4.0) {
            conceito = 'D';
        } else {
            conceito = 'E';
        }
        String situacao = " ";
        if (media >= 6) {
            situacao = "Aprovado";
        } else {
            situacao = "Reprovado"; 
        }
        System.out.printf("A média é %.2f com conceito %c e situação %s", media, conceito, situacao);
    }
}