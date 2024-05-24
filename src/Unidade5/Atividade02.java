package Unidade5;

public class Atividade02 {
    public static void main(String[] args) {
        int somaPares = 0;
        int somaImpares = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {
                somaImpares += i;
            } else {
                somaPares += i;
            }
        }
        System.out.printf("A soma dos números ímpares é: %d\n", somaImpares);
        System.out.printf("A soma dos números pares é: %d\n", somaPares);

    }
}
