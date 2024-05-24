package Unidade5;

import java.util.Scanner;

public class Atividade08 {
    public static void main(String[] args) {
        Scanner valores = new Scanner(System.in);
        System.out.print("Insira o valor de n: ");
        int valorN = valores.nextInt();

        System.out.print("Insira o valor 1: ");
        float valor1 = valores.nextFloat();

        float menorValor = valor1;
        float soma = 0;
        float numerosMaiores = 0;

        for (int i = 2; i <= valorN; i++) {
            System.out.printf("Insira o valor %d: ", i);
            float numeros = valores.nextFloat();
    
            if (numeros < 0) {
                if (numeros > menorValor) {
                    menorValor = numeros;
                }
            }
                if (numeros > 0) {
                    soma += numeros;
                    numerosMaiores++;
                }
        }
        float media = soma / numerosMaiores;
        System.out.printf("O menor número negativo é: %.1f%n", menorValor);
        System.out.printf("A média dos número positivos é de: %.1f", media);

    }
}
