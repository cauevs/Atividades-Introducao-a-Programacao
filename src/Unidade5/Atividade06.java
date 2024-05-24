package Unidade5;

import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner numeros = new Scanner(System.in);
        float media = 0;
        float soma = 0;

        for (float i = 1; i <= 20; i++) {
            System.out.printf("Insira a altura %.0f: ", i);
            float altura = numeros.nextFloat();
            soma += altura;
        }

        media = soma / 20;
        System.out.printf("A média das alturas é de %.2f", media);
    }
}
