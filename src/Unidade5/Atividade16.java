package Unidade5;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int totalPessoas = 0;
        float alturaMulheres = 0;
        float alturaGrupo = 0;
        int numeroMulheres = 0;
        float mediaMulheres = 0;
        float mediaGrupo = 0;

        while (true) {
            System.out.print("Insira a altura da pessoa em metros (Número 0 encerra o programa): ");
            float altura = teclado.nextFloat();
            if (altura == 0) {
                break;
            }
            
            System.out.print("Insira o gênero da pessoa ('M' para Masculino, 'F' para Feminino e 'O' para Indefinido): ");
            char genero = teclado.next().charAt(0);

            if (genero == 'f' || genero == 'F') {
                numeroMulheres++;
                alturaMulheres += altura;
                mediaMulheres = alturaMulheres / numeroMulheres;
            }
            alturaGrupo += altura;
            totalPessoas++;
            mediaGrupo = alturaGrupo / totalPessoas;

        }

        System.out.printf("A média das alturas das mulheres é de: %.2f%n", mediaMulheres);
        System.out.printf("A média das alturas do grupo é de: %.2f", mediaGrupo);

    }
}