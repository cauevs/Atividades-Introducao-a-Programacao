package Unidade5;

public class Atividade04 {
    public static void main(String[] args) {
        float soma = 0;
        for (float i = 3; i <= 23; i += 2) {
            for (float t = 2; t <= 22; t += 4) {
                soma += (i / t);
            }
        }
        System.out.printf("O resultado da soma é de: %.2f", soma);

    }
}
