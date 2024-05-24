package Extras;

import java.util.Scanner;

public class ExercicioMetodo {

    private ExercicioMetodo() {
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[10];
        leVetor(teclado, vetor);
        imprimeVetor(vetor);
        teclado.close();
    }

    private void leVetor(Scanner tec, int vetor[]) { // podemos mudar o nome do scanner e do inteiro, e dps o java irá
                                                     // converter para os outros nomes tbm
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Informe a Posição %d: ", i + 1);
            vetor[i] = tec.nextInt();
        }
    }

    private void imprimeVetor(int vetor[]) {
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.printf("Posição %d | Valor %d%n", i + 1, vetor[i]);
        }
    }

    public static void main(String[] args) {
        new ExercicioMetodo();
    }
}
