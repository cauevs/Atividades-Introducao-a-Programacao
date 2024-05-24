package Unidade4;
import java.util.Scanner;
public class Atividade09 {
public static void main(String [] args){
Scanner multiplos = new Scanner (System.in);
System.out.print("Insira seu valor inteiro: ");
int valor1 = multiplos.nextInt();
System.out.print("Insira seu segundo valor inteiro: ");
int valor2 = multiplos.nextInt();
    if (valor1 % valor2 ==0){
        System.out.println(valor1 + " é multiplo de " + valor2);
    }

    else {
        System.out.println(valor1 + " não é multiplo de " + valor2);
    }

}
}
