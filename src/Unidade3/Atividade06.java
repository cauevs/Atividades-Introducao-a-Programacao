package Unidade3;
import java.util.Scanner;
public class Atividade06 {
public static void main(String [] args){
Scanner comida = new Scanner (System.in);
System.out.print("Insira o peso em kg do prato: ");
int pesoTotal = comida.nextInt();
double pesoPrato = 0.75;
int precoQuilo = 25;
double total = (pesoTotal * pesoPrato) * precoQuilo;
System.out.println("O valor a ser pago pelo prato é de: R$ " + total);

}
}
