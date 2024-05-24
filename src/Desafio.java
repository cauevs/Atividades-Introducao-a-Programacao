import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o número na qual deseja a tabuada: ");
        int numero = teclado.nextInt();
        int denominador = 0;

        System.out.println("\nTABUADA EM FOR:\n");
        for (int i = 0; i <= 10; i++) {
            System.out.printf("%d x %d = %d%n", numero, i, (numero * i));
        }

        System.out.println("\nTABUADA EM WHILE:\n");
        int i = 0;
        while (i <= 10) {
            System.out.printf("%d x %d = %d%n", numero, i, (numero * i++));
        }
        
        System.out.println("\nTABUADA EM DO WHILE:\n");
        i = 0;
        do {
        System.out.printf("%d x %d = %d%n", numero, i, (numero * i++));
        } while (i <= 10);
    }
}
