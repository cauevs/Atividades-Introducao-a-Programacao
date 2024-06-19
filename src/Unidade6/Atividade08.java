package Unidade6;

import java.util.Scanner;

public class Atividade08 {
    private Atividade08() {
        Scanner teclado = new Scanner(System.in);
        double numeros[] = new double[leNumero(teclado)];
        leVetor(teclado, numeros);

    }

    private int leNumero(Scanner tec) {
        System.out.printf("Insira o valor n menor do que 20: ");
        int n = tec.nextInt();
        if (n <= 20) {
            return n;
        } else {
            return 0;
        }
    }

    private void leVetor(Scanner tec, double numeros[]) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Insira o valor do vetor %d: ", i + 1);
            numeros[i] = tec.nextDouble();
        }
    }

    public static void main(String[] args) {
        new Atividade08();
    }

}