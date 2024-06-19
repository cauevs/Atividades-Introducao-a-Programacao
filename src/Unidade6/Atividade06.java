package Unidade6;

import java.util.Scanner;

public class Atividade06 {

    private Atividade06() {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor de n: ");
        int n = teclado.nextInt();
        double valores[] = new double[n];
        leVetor(teclado, valores);
        if (verificaVetor(valores, teclado) == true) {
            System.out.println("Valor já cadastrado");
        } else {
            System.out.println("Valor não cadastrado");
        }
    }

    private void leVetor(Scanner tec, double vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Insira o valor %d: ", i + 1);
            vetor[i] = tec.nextDouble();

        }
    }

    private boolean verificaVetor(double vetor[], Scanner tec) {
        System.out.print("Insira o valor a ser procurado: ");
        double valorProcurado = tec.nextDouble();
        for (int i = 0; i < vetor.length; i++) {
            if (valorProcurado == vetor[i]) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        new Atividade06();
    }
}