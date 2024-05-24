package Unidade5;

import java.util.Scanner;

public class Atividade07 {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        System.out.print("Insira o valor de n: ");
        int valorN = valores.nextInt();

        System.out.print("Insira o o valor 1: ");
        float primeiroValor = valores.nextFloat();

        float maiorValor = primeiroValor;
        float menorValor = primeiroValor;

        for (int i = 2; i <= valorN; i++) {
            System.out.printf("Insira o valor %d: ", i);
            float numeros = valores.nextFloat();
            if (numeros > maiorValor) {
                maiorValor = numeros;
            }
            if (numeros < menorValor) {
                menorValor = numeros;
            }

        }
        System.out.printf("O maior número é: %.1f%n", maiorValor);
        System.out.printf("O menor número é: %.1f", menorValor);
    }
}
