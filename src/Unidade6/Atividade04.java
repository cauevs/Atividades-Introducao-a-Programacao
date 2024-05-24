package Unidade6;

import java.util.Scanner;

public class Atividade04 {

    private Atividade04() {
        Scanner teclado = new Scanner(System.in);
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetorSoma[] = new int[10];

        leVetor(teclado, vetor1);
        leVetor(teclado, vetor2);
        vetorSoma = somaVetor(vetor1, vetor2);
        escreveVetor(vetor1, vetor2, vetorSoma);
        
    }

    private void leVetor(Scanner tec, int vetor[]) {
        System.out.println("\n\t*** LEITURA DO VETOR ***\n");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Insira o valor %d: ", i + 1);
            vetor[i] = tec.nextInt();
        }
    }

    private int [] somaVetor(int v1[], int v2[]) {
        int soma [] = new int[v1.length];
        for(int i = 0; i < v1.length; i++){
            soma[i] = v1[i] + v2[i];
        }
        return soma;
    }

    private void escreveVetor(int vetor1[], int vetor2[], int vetor3[]) {
        System.out.println("\n\t***VETOR 1***\n");
        for (int i = 0; i < vetor1.length; i++) {
            System.out.printf("Posição: %d | Valor: %d%n", i + 1, vetor1[i]);
        }
        System.out.println("\n\t***VETOR 2***\n");
        for (int i = 0; i < vetor2.length; i++) {
            System.out.printf("Posição: %d | Valor: %d%n", i + 1, vetor2[i]);
        }
        System.out.println("\n\t***VETOR 3***\n");
        for (int i = 0; i < vetor3.length; i++) {
            System.out.printf("Posição: %d | Valor: %d%n", i + 1, vetor3[i]);
        }
    }

    public static void main(String[] args) {
        new Atividade04();
    }
}
