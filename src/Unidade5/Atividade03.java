package Unidade5;

public class Atividade03 {
    public static void main(String[] args) {
        float fracao = 0;
        float soma = 0;
        for (float i = 1; i <= 100; i++) {
            fracao = 1 / i;
            soma += 1 / i;
        System.out.printf("1 sobre %.0f é igual a: %.5f%n", i, fracao);
        }
        System.out.printf("A soma das frações é de: %.2f", soma);
    }
}
