package Unidade6;

import java.util.Scanner;

public class Atividade05 {
    private Atividade05() {
        Scanner teclado = new Scanner(System.in);
        String perguntas[] = {"Gosta de música sertaneja?", "Gosta de futebol?", "Gosta de seriados?",
                "Gosta de redes sociais?", "Gosta da Oktoberfest?" };
        String respostasRapaz[] = lerReposta(teclado, perguntas, "rapaz");
        String respostasGarota[] = lerResposta(teclado, perguntas, "garota");
        int afinidade = calculaAfinidade(respostasRapaz, respostasGarota);

    }

    private String lerReposta(Scanner tec, String perguntas[], String id[]) {

    }

    private int calculaAfinidade(String respostasRapaz[], String respostasGarota[]) {

    }

    public static void main(String[] args) {
        new Atividade05();
    }
}
