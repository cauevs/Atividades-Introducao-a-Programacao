package Unidade6;

import java.util.Scanner;

import javafx.scene.media.Media;
public class Atividade02{

    private Atividade02() {
        Scanner teclado = new Scanner(System.in);
        double  vetor[] = new double[12];
        leVetor(teclado, vetor);
        mostraAcimaDaMedia(vetor, calculaMedia(vetor));
    }

    private void leVetor(Scanner tec, double vetor[]){
        System.out.println("*** LEITURA DO VETOR ***");
        for (int i = 0; i < vetor.length; i++){
            System.out.printf("Insira o valor %d: ", i + 1);
            vetor[i] = tec.nextDouble();
        }
    }

    private void mostraAcimaDaMedia(double vetor[], double media){
        System.out.printf("Média: %.2f%n *** VALORES ACIMA DA MÉDIA ***%n", media);
        for (int i = 0; i < vetor.length; i++){
            if (vetor[i] > media){
                System.out.printf("Posição: %d | Número: %.2f%n", i + 1, vetor[i]);
            }
        }
    }

    private double calculaMedia(double vetor[]){
        double acumula = 0;
        for (int i = 0; i < vetor.length; i++){
            acumula += vetor[i];
        }
        return acumula / vetor.length;
    }

    public static void main (String[] args) {
        new Atividade02();
    }
}
