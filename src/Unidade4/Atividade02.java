package Unidade4;
import java.util.Scanner;
public class Atividade02 {
public static void main(String [] args){
Scanner impar = new Scanner (System.in);
System.out.print("Entre com um valor inteiro maior que 0: ");
int numero = impar.nextInt();
if (numero == 0) {
    System.out.println("Tá errado, escreva novamente");
}
else if (numero % 2 == 1) {
    System.out.println("O número é ímpar");
}
    else {
        System.out.println("O número é par");
    }
}
}
