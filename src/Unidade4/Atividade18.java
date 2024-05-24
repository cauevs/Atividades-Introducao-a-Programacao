package Unidade4;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner pagamentos = new Scanner(System.in);
        System.out.print("Insira o dia do vencimento: ");
        int vencimento = pagamentos.nextInt();
        System.out.print("Insira o dia em que o pagamento foi efetuado: ");
        int diaPagamento = pagamentos.nextInt();
        System.out.print("Insira o valor da prestação: ");
        float valorPrestacao = pagamentos.nextFloat();
        float desconto = valorPrestacao * 0.10F;
        float multa = valorPrestacao * 0.02F;
        if ((diaPagamento < vencimento) || (diaPagamento == vencimento)) {
            valorPrestacao = valorPrestacao - desconto;
            System.out.println("Valor a ser pago: " + valorPrestacao + "\nO pagamento está em dia! :D");
        } else if (diaPagamento <= 5 + vencimento) {
            System.out.println("Valor a ser pago: " + valorPrestacao + "\nVocê perdeu o desconto :(");
        } else if (diaPagamento >= 6 + vencimento){
            float multaAPagar = (diaPagamento - vencimento) * multa;
            float valorTotal = multaAPagar + valorPrestacao; 
            System.out.println("Valor a ser pago: " + valorTotal + "\nAí já é demais colega >:(");
        }
        
    }
}
