package Unidade4;
import java.util.Scanner;
public class Atividade25 {
public static void main(String [] args){
Scanner escolhas = new Scanner (System.in);

System.out.print("Valor 1: ");
int valor1 = escolhas.nextInt();
System.out.print("Valor 2: ");
int valor2 = escolhas.nextInt();
System.out.print("Escolha sua operação:\n1 - Soma de dois números. \n2 - Diferença entre dois números. \n3 - Produto entre dois números. \n4 -Divisão entre dois números \nR:");
int operacao = escolhas.nextInt();

switch (operacao) {
    case 1:
        int soma = (valor1 + valor2);
        System.out.println("Resultado: " + soma);
        break;
    case 2:
        int diferenca = (valor1 - valor2);
        System.out.println("Resultado: " + diferenca);
        break;
    case 3:
        int produto = (valor1 * valor2);
        System.out.println("Resultado: " + produto);
        break;
    case 4:
        int divisao = (valor1 / valor2);
        System.out.println("Resultado: " + divisao);
        break;
    default:
    System.out.println("Opção Inválida");
        break;
}

}
}
