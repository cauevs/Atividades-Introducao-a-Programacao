package Unidade5;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Insira a inscrição do atleta 1 (caso inserido 0, o programa terminará): ");
        int primeiraInscricao = teclado.nextInt();

        System.out.print("Insira a altura do atleta 1: ");
        float primeiraAltura = teclado.nextFloat();

        int contador = 1;
        float maiorAltura = primeiraAltura;
        float menorAltura = primeiraAltura;
        int inscricaoMaior = primeiraInscricao;
        int inscricaoMenor = primeiraInscricao;
        float alturaGrupo = primeiraAltura;
        float totalPessoas = 1;
        float mediaGrupo = 0;

        while (true) {

            contador++;
            System.out.printf("Insira a inscrição do atleta %d (caso inserido 0, o programa terminará): ", contador);
            int inscricaoAtleta = teclado.nextInt();
            if (inscricaoAtleta == 0) {
                break;
            }
            System.out.printf("Insira a altura do atleta %d: ", contador);
            float alturaAtleta = teclado.nextFloat();
            totalPessoas++;
            alturaGrupo += alturaAtleta;
            mediaGrupo = alturaGrupo / totalPessoas;

            if (alturaAtleta > maiorAltura) {
                maiorAltura = alturaAtleta;
                inscricaoMaior = inscricaoAtleta;
            }

            if (alturaAtleta < menorAltura) {
                menorAltura = alturaAtleta;
                inscricaoMenor = inscricaoAtleta;
            }
        }

        System.out.printf("%nNúmero de inscrição do atleta mais alto: %d %nE altura do atleta mais alto: %.2f m %n",
                inscricaoMaior, maiorAltura);
        System.out.printf("%nNúmero de inscrição do atleta mais baixo: %d %nE altura do atleta mais baixo: %.2f m %n",
                inscricaoMenor, menorAltura);
        System.out.printf("%nA altura média do grupo de atletas é de: %.2f m", mediaGrupo);
    }
}
