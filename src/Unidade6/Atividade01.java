package Unidade6;
import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int vetor[] = new int[10];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Insira o valor %d: ", i + 1);
            vetor[i] = teclado.nextInt();
        }
        for (int i = vetor.length - 1; i >= 0; i--) {
            System.out.printf("Valor de Posição %d: %d%n", i + 1, vetor[i]);
        }

    }
}