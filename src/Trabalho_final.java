import java.util.Random;
import java.util.Scanner;

//valores usados para ininializar o jogo

public class Trabalho_final {
    private static final int TAMANHO_TABULEIRO = 8;
    private static final int NUM_NAVIOS = 10;
    private static final int MAX_TENTATIVAS = 30;
    private static char[][] tabuleiro = new char[TAMANHO_TABULEIRO][TAMANHO_TABULEIRO];
    private static int naviosRestantes = NUM_NAVIOS;
    private static int tentativas = 0;

    // função main responsável por organizar a sequência de inicialização
    public static void main(String[] args) {
        inicializarTabuleiro();
        posicionarNavios();
        jogar();
    }

    // método que inicia o tabuleiro

    private static void inicializarTabuleiro() {
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                tabuleiro[i][j] = '~'; // Água
            }
        }
    }

    // Usado para distribuir as posições dos navios com números randômicos

    private static void posicionarNavios() {
        Random random = new Random();
        int naviosPosicionados = 0;
        while (naviosPosicionados < NUM_NAVIOS) {
            int x = random.nextInt(TAMANHO_TABULEIRO);
            int y = random.nextInt(TAMANHO_TABULEIRO);
            if (tabuleiro[x][y] != 'N') {
                tabuleiro[x][y] = 'N'; // Navio
                naviosPosicionados++;
            }
        }
    }

    // método que inicializa o jogo

    private static void jogar() {
        Scanner teclado = new Scanner(System.in);

        while (tentativas < MAX_TENTATIVAS && naviosRestantes > 0) {
            System.out.println("=-=- Batalha Naval =-=-=\n");
            System.out.println("Tentativa " + (tentativas + 1) + " de " + MAX_TENTATIVAS);
            exibirTabuleiro();
            System.out.print("Digite as coordenadas (linha coluna separadas por um espaço): ");
            int linha = teclado.nextInt();
            int coluna = teclado.nextInt();

            if (linha < 0 || linha >= TAMANHO_TABULEIRO || coluna < 0 || coluna >= TAMANHO_TABULEIRO) {
                System.out.println("Esse número aí não vai, tenta outro.");
                continue;
            }

            // Usado para limpar o que foi mostrado acima no terminal

            System.out.println("\033[H\033[2J");

            if (tabuleiro[linha][coluna] == 'N') {
                System.out.println("Boaaa, acertou em cheio!");
                tabuleiro[linha][coluna] = 'X'; // Navio atingido
                naviosRestantes--;
            } else if (tabuleiro[linha][coluna] == '~') {
                System.out.println("Errouuuuu leigão!");
                tabuleiro[linha][coluna] = 'O'; // Água atingida
            } else {
                System.out.println("Tem parada errada ai, escreve outro número!");
                continue;
            }

            tentativas++;
        }

        if (naviosRestantes == 0) {
            System.out.println("Mandou bem de mais irmão! Mandou pro Krl os navios em " + tentativas + " tentativas.");
        } else {
            System.out.println("Game over! Melhore!");
            System.out.println("Navios restantes: " + naviosRestantes);
        }

        exibirTabuleiroFinal();
        teclado.close();
    }

    private static void exibirTabuleiro() {
        System.out.print("  ");
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                if (tabuleiro[i][j] == 'N') {
                    System.out.print("~ "); // Não mostra a posição dos navios
                } else {
                    System.out.print(tabuleiro[i][j] + " ");
                }
            }
            System.out.println();
        }
    }

    private static void exibirTabuleiroFinal() {
        System.out.println("Tabuleiro final:");
        System.out.print("  ");
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < TAMANHO_TABULEIRO; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < TAMANHO_TABULEIRO; j++) {
                System.out.print(tabuleiro[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Obrigado Por Jogar!");
    }
}