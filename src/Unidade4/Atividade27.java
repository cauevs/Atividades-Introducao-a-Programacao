package Unidade4;

import java.util.Scanner;

public class Atividade27 {
    public static void main(String[] args) {
        Scanner estacionamento = new Scanner(System.in);
        System.out.print("Escreva a hora de chegada: ");
        int horaChegada = estacionamento.nextInt();
        System.out.print("Escreva o minuto de chegada: ");
        int minutoChegada = estacionamento.nextInt();
        System.out.print("Escreva a hora de saída: ");
        int horaSaida = estacionamento.nextInt();
        System.out.print("Escreva o minuto de saída: ");
        int minutoSaida = estacionamento.nextInt();

        if ((horaChegada >= 0) && (horaChegada <= 24) && (minutoChegada >= 0) && (minutoChegada <= 60)
                && (horaSaida >= 0) && (horaSaida <= 24) && (minutoSaida >= 0) && (minutoSaida <= 60)
                && (horaSaida > horaChegada)) {
            int minutoChegadaTotal = (horaChegada * 60) + minutoChegada;
            int minutoSaidaTotal = (horaSaida * 60) + minutoSaida;
            int minutoTotal = (minutoChegadaTotal - minutoSaidaTotal);
            int quantidadeHoras = (minutoTotal / 60);
            int quantidadeMinutos = (minutoTotal % 60);
            System.out.printf("O tempo total no estacionamento foi de: %dh%dm", quantidadeHoras, quantidadeMinutos);
            if (quantidadeMinutos >= 30) {
                quantidadeHoras++;
            }
            System.out.printf("Vai pagar por %d horas", quantidadeHoras);
            double valorCobrado = 0;

            switch (quantidadeHoras) {
                case 0:
                case 1:
                    valorCobrado = 5;
                    break;
                case 2:
                    valorCobrado = 10;
                    break;
                case 3:
                    valorCobrado = 17.50;
                    break;
                case 4:
                    valorCobrado = 25;
                    break;
                default:
                    valorCobrado = 25 + (10 * (quantidadeHoras - 4));
                    break;
            }
            System.out.printf("O valor cobrado será de: %.2f", valorCobrado);
            
        } else {
            System.out.println("Hora ou Minuto errado");
        }
    }
}
