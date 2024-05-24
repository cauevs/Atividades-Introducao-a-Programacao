package Unidade2;
import java.util.Scanner;
public class Atividade20 {
public static void main(String [] args){
Scanner papel = new Scanner (System.in);
System.out.print("Insira o número de dobras: ");
int dobras = papel.nextInt();
int quadrados = (dobras * dobras); 
System.out.println("O número de quadrados que podem ser vistos no papel é de: " + quadrados);


}

}
