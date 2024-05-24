package Unidade3;
import java.util.Scanner;
public class Atividade05 {
public static void main(String [] args){
Scanner granja = new Scanner (System.in);
System.out.print("Insira o número de galinhas na granja: ");
int galinhas = granja.nextInt();
double valorGasto = (4.0 + 3.5) * galinhas;
System.out.println("O valor total gasto para identificar as galinhas é de: R$ " + valorGasto);

}
}
