package Unidade5;

import java.util.Scanner;

public class Atividade19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float desconto20 = 0.20F;
        float desconto15 = 0.15F;
        int contador = 1;
        float desconto = 0;
        float valorComDesconto = 0;
        float ganhoTotal = 0;

        while (true) {
            
            contador++;
            ganhoTotal += valorComDesconto;
            System.out.printf("Insira o valor da compra %d (Se o valor for 0, o programa terminará): ", contador);
            float valorCompra = teclado.nextFloat();

            if (valorCompra == 0){
                break;
            }

            if (valorCompra > 500) {
                desconto = (desconto20 * valorCompra);
                valorComDesconto = (valorCompra - desconto);
                System.out.printf("Total a Pagar: R$: %.2f%n", valorComDesconto);
            } 

            else if (valorCompra <= 500) {
                desconto = (desconto15 * valorCompra);
                valorComDesconto = (valorCompra - desconto);
                System.out.printf("Total a Pagar: R$: %.2f%n", valorComDesconto);
            
            }
    
        }

        System.out.printf("%nTotal Recebido No Dia: %.2f ", ganhoTotal);

    }
}
