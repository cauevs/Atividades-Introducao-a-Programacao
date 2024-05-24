package Unidade5;

import java.util.Scanner;

public class Atividade15 {
    public static void main(String[] args) {
        Scanner sala = new Scanner(System.in);
        System.out.print("Insira o nome do aluno 1 (caso insira fim, o programa terminará): ");
        String nomes = sala.next();

        int contador = 1;
        float soma = 0;

        while (!nomes.equalsIgnoreCase("fim")) {
            contador++;
            System.out.print("Insira a nota 1: ");
            float nota1 = sala.nextFloat();
            System.out.print("Insira a nota 2: ");
            float nota2 = sala.nextFloat();

            soma = nota1 + nota2;
            float media = soma / 2;

            System.out.printf("A média do aluno %s é de: %.2f %n", nomes, media);
            System.out.printf("Insira o nome do aluno %d (caso insira fim, o programa terminará): ", contador);
            nomes = sala.next();
        }

        System.out.println("Fim!");
    }
}
