package Unidade4;
import java.util.Scanner;
public class Atividade03 {
public static void main(String [] args){
Scanner diferenca = new Scanner (System.in);
System.out.print("Insira o primeiro número inteiro: ");
int numero1 = diferenca.nextInt();
System.out.print("Insira o segundo número inteiro: ");
int numero2 = diferenca.nextInt();
if (numero1 == numero2){
System.out.println("Os número são iguais"); }
else if (numero1 > numero2) {
    System.out.println("O maior número é o número 1: " + numero1);
}
else {
    System.out.println("O maior número é o número 2: " + numero2);
    //System.out.println(numero1 == numero2 ? "iguais" : numero1 > numero2 ? "numero1 maior" : "numero2 maior") outra forma de fazer (mtt foda)
}
}
}