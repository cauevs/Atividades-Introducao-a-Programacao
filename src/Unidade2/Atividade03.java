package Unidade2;

//Atividade Soma Simples
import java.util.Scanner;

public class Atividade03 {
    public static void main(String[] args) {
        Scanner conta = new Scanner(System.in);
        System.out.print("Insira o valor de A: ");
        int A = conta.nextInt();
        System.out.print("Insira o valor de B: ");
        int B = conta.nextInt();
        int soma = A + B;
        System.out.println("O resultado dessa soma é: " + soma);
    }
}
