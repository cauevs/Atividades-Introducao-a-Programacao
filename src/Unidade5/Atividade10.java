package Unidade5;

public class Atividade10 {
    public static void main(String[] args) {
        int soma = 0;
        int potencia = 0;
        int contador = 0;
        String termo1S, termo2S;

        for (int termo1 = 0; termo1 <= 10000; termo1++) {
            for (int termo2 = 0; termo2 <= 10000; termo2++) {
                soma = termo1 + termo2;
                potencia = soma * soma;
                termo1S = potencia + "";
                termo2S = termo1 + "" + termo2;
                if (termo1S.equals(termo2S)){
                   contador++;
               
                   System.out.printf("[%d] %d + %d = %d -> %d%n", contador, termo1, termo2, soma, potencia);
                   if (contador >= 10){
                    break;
                   }
           
                }
            }
            if (contador >= 10){
                break;
               }
        }
    }
}
