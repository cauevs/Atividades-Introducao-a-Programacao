package Unidade5;
import java.util.Scanner;
public class Atividade18 {
public static void main(String [] args){
Scanner teclado = new Scanner (System.in);

float canal4 = 0;
float canal5 = 0;
float canal9 = 0;
float canal12 = 0;
float totalPessoas = 0;

while (true){

System.out.print("Insira o número do canal (4, 5, 9, 12 ou 0 para encerrar): ");
int numeroCanal = teclado.nextInt();

if (numeroCanal == 0){
    break;
}

System.out.print("Insira quantas pessoas estão assistindo TV: ");
int numeroPessoas = teclado.nextInt();

switch (numeroCanal) {
    case 4:
    canal4 += numeroPessoas;
        break;
    case 5:
    canal5 += numeroPessoas;
    break;
    case 9:
    canal9 += numeroPessoas;
    break;
    case 12:
    canal12 += numeroPessoas;
    break;
    default:
    System.out.println("Canal Inválido!");
    totalPessoas -= numeroPessoas;
        break;
}

totalPessoas += numeroPessoas;
}

float percetualCanal4 = canal4 / totalPessoas * 100;
float percetualCanal5 = canal5 / totalPessoas * 100;
float percetualCanal9 = canal9 / totalPessoas * 100;
float percetualCanal12 = canal12 / totalPessoas * 100;

System.out.println("\nPercentual de Cada Canal:\n");
System.out.printf("Canal 4: %.2f%%%n", percetualCanal4);
System.out.printf("Canal 5: %.2f%%%n", percetualCanal5);
System.out.printf("Canal 9: %.2f%%%n", percetualCanal9);
System.out.printf("Canal 12: %.2f%%", percetualCanal12);
}
}