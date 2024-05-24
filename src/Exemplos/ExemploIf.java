package Exemplos;
import java.util.Scanner;
public class ExemploIf {
public static void main(String [] args) {
    Scanner exemplo = new Scanner (System.in);
    System.out.print("Digite seu número: ");
    int numero = exemplo.nextInt();
    if (numero % 2 == 0) { // Usando a função "if" estamos fazendo a comparação para ver se é "true" ou "false"
        System.out.println("O número é par");
        if (numero >= 1000) { // Botamos esse "if" dentro do outro para que seja executado juntamente com o anterior
            System.out.println("O número também é maior ou igual a mil");
        }
    }
    System.out.println("Prontinho"); // Colocamos esse print fora das chaves dos "if" para que seja executado idenpedente do resultado
    }

    
}

