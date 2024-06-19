import java.util.Scanner;
import java.util.Random;

public class TrabalhoFinal {
    private TrabalhoFinal() {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int linhas = 8;
        int colunas = 8;
        int[][] matrizBatalhaNaval = new int[linhas][colunas];
        int[][] matrizBatalhaNavalNavios = new int[linhas][colunas];
        hudDaMatriz(teclado, matrizBatalhaNaval);
        posicionamentoNavio(linhas, colunas, random, matrizBatalhaNavalNavios);
        simbolizarAgua(linhas, colunas, matrizBatalhaNavalNavios);
    }

    private void simbolizarAgua(int linhas, int colunas, int[][] matrizBatalhaNavalNavios) {
        for (int i = 0; i < matrizBatalhaNavalNavios.length; i++) {
            if (matrizBatalhaNavalNavios[linhas][colunas] != 'n') {
                matrizBatalhaNavalNavios[linhas][colunas] = 'a';
            }
        }
    }

    private void hudDaMatriz(Scanner tec, int[][] matrizBatalhaNaval) {
        System.out.println("\033[H\033[2J");
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < matrizBatalhaNaval.length; i++) {
            System.out.printf("%d ~ ~ ~ ~ ~ ~ ~ ~%n", i);
        }
    }

    private void posicionamentoNavio(int linhas, int colunas, Random random, int[][] matrizBatalhaNavalNavios) {
        int[] navio = new int[10];
        for (int i = 0; i < navio.length; i++) {
            navio[i] = (int) Math.random();
            if (matrizBatalhaNavalNavios[linhas][colunas] == 'N') {
                navio[i]--;
            } else {
                matrizBatalhaNavalNavios[linhas][colunas] = 'N';
            }
        }
    }

    public static void main(String[] args) {
        new TrabalhoFinal();
    }
}