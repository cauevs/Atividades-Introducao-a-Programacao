package Unidade6;

import java.util.Scanner;

public class Atividade05 {
    private Atividade05() {
        Scanner teclado = new Scanner(System.in);
        String perguntas[] = { "Gosta de música sertaneja?\nR:", "Gosta de futebol?\nR:", "Gosta de seriados?\nR:",
                "Gosta de redes sociais?\nR:", "Gosta da Oktoberfest?\nR:" };
        String respostasRapaz[] = lerResposta(teclado, perguntas, "Garoto");
        String respostasGarota[] = lerResposta(teclado, perguntas, "Garota");
        int afinidade = calculaAfinidade(respostasRapaz, respostasGarota);
        System.out.println(determinaStatus(afinidade));
    }

    private String[] lerResposta(Scanner tec, String perguntas[], String id) {
        String respostas[] = new String[perguntas.length];
        System.out.printf("%n****Respostas do(a) - %s****%n", id);
        for (int i = 0; i < perguntas.length; i++) {
            System.out.printf("%s", perguntas[i]);
            respostas[i] = tec.next().toUpperCase();
        }
        return respostas;
    }

    private int calculaAfinidade(String respostasRapaz[], String respostasGarota[]) {
        int afinidade = 0;
        for (int i = 0; i < respostasGarota.length; i++) {
            if (respostasGarota[i].equals(respostasRapaz[i])) {
                afinidade += 3;
            } else if (((respostasGarota[i].equals("IND") &&
                    respostasRapaz[i].equals("SIM") ||
                    respostasRapaz[i].equals("NÃO")))
                    ||
                    (respostasRapaz[i].equals("IND") &&
                            respostasGarota[i].equals("SIM") ||
                            respostasGarota[i].equals("NÃO"))) {
                afinidade++;
            } else if ((respostasGarota[i].equals("SIM") && respostasRapaz[i].equals("NÃO"))
                    ||
                    respostasGarota[i].equals("NÃO") && respostasRapaz[i].equals("SIM")) {
                afinidade -= 2;
            }
        }
        return afinidade;
    }

    private String determinaStatus(int afinidade) {
        if (afinidade == 15) {
            return "\nCasem!";
        } else if (afinidade >= 10 && afinidade <= 14) {
            return "\nVocês têm muita coisa em comum!";
        } else if (afinidade >= 5 && afinidade <= 9) {
            return "\nTalvez não dê certo :(";
        } else if (afinidade >= 0 && afinidade <= 4) {
            return "\nVale um encontro.";
        } else if (afinidade >= -1 && afinidade <= -9) {
            return "\nMelhor não perder tempo";
        } else if (afinidade == -10) {
            return "Vocês se odeiam!";
        }
        return null;
    }

    public static void main(String[] args) {
        new Atividade05();
    }
}