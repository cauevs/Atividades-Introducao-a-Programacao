package Unidade6;

import java.util.Scanner;

public class Atividade07 {

    private Atividade07() {
        Scanner teclado = new Scanner(System.in);
        int valores[] = new int[leNumero(teclado, 20)];
        leVetor(teclado, valores);
        mostraVetor(valores);
        ordenaVetor(valores);
        mostraVetor(valores);
    }

    private void mostraVetor(int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%d, ", vetor[i]);
        }
        System.out.println("");
    }

    private boolean procuraValor(int valor, int vetor[]) {
        for (int i = 0; i < vetor.length; i++) {
            if (valor == vetor[i]) {
                return true;
            }
        }
        return false;
    }

    private int leNumero(Scanner tec, int maximo) {
        int valor = 0;
        do {
            System.out.printf("Informe um número menor que %d: ", maximo);
            valor = tec.nextInt();
        } while (valor > maximo);
        return valor;
    }

    private void leVetor(Scanner tec, int vetor[]) {
        int i = 0;
        while (i < vetor.length) {
            System.out.printf("Posição: %d%n", i);
            int valor = leNumero(tec, 100);
            if (!procuraValor(valor, vetor)) {
                vetor[i] = valor;
                i++;
            } else {
                System.out.printf("Valor %d já existe no vetor%n", valor);
            }
        }
    }

    private void ordenaVetor(int vetor[]) {
        int bolha;
        for (int i = 0; i < vetor.length; ++i) {
            for (int j = i; j < vetor.length; ++j) {
                if (vetor[i] > vetor[j]) {
                    bolha = vetor[i];
                    vetor[i] = vetor[j];
                    vetor[j] = bolha;
                }
            }
        }
    }

    public static void main(String[] args) {
        new Atividade07();

    }
}