package Unidade2;

//Atividade Diferença
import java.util.Scanner;

public class Atividade06 {
    public static void main(String[] args) {
        Scanner diferenca = new Scanner(System.in);
        System.out.print("Insira o valor A: ");
        int valorA = diferenca.nextInt();
        System.out.print("Insira o valor B: ");
        int valorB = diferenca.nextInt();
        System.out.print("Insira o valor C: ");
        int valorC = diferenca.nextInt();
        System.out.print("Insira o valor D: ");
        int valorD = diferenca.nextInt();
        int formula = (valorA * valorB - valorC * valorD);
        System.out.println("DIFERENCA = " + formula);

    }

}
