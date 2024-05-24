package Unidade5;

import java.util.Scanner;

public class Atividade01 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.printf("Insira o número %d: ", i);
            int numero = numeros.nextInt();
            if (numero % 2 == 1) {
                System.out.printf("O número %d é ímpar\n", numero);
            } else {
                System.out.printf("O número %d é par\n", numero);
            }
        }
    }
}