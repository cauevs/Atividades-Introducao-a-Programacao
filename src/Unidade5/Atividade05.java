package Unidade5;

import java.util.Scanner;

public class Atividade05 {
    public static void main(String[] args) {
        Scanner termos = new Scanner(System.in);
        System.out.print("Insira o termo maior do que 2: ");
        int quantidade = termos.nextInt();

        int numero = 8;
        int soma = 0;

        for (int i = 2; i <= quantidade; i++) {
            System.out.printf("%d, %d, ", numero, numero + 2);
            soma = soma + numero + (numero + 2);
            numero *= 2;
        }

    }
}
