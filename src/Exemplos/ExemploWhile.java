package Exemplos;

import java.util.Scanner;

public class ExemploWhile {
    public static void main(String[] args) {
        Scanner exemplo = new Scanner(System.in);
        System.out.print("Escreva o nome 1 (Se escrito fim, o programa terminará): ");
        String nomes = exemplo.next();
        int contador = 1;

        while (!nomes.equalsIgnoreCase("fim")) {
            contador++;
            System.out.printf("Olá %s, Boa Noite!%n", nomes);
            System.out.printf("Escreva o nome %d (Se escrito fim, o programa terminará):", contador);
            nomes = exemplo.next();
        }

        System.out.println("Fim!");
    }
}

// Teste (Básico):

// int contador = 1;
// while (contador < 5){
// System.out.println("Roubou o não? \nEu robei D:");
// contador+=4; // O comando while necessita que mudemos o valor da variavel

// }
// System.out.println("Então tá pela ordi");