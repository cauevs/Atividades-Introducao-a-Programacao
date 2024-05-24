package Unidade3;
import java.util.Scanner;
public class Atividade03 {
public static void main(String [] args){
Scanner gasolina = new Scanner (System.in); 
System.out.print("Insira o preço por litro da gasolina: R$ ");
double preco = gasolina.nextDouble();
System.out.print("Insira o valor dado para a gasolina: R$ ");
double pagamento = gasolina.nextDouble();
double litros = (pagamento / preco);
System.out.println("A quantidade de litros de gasolina foi de: " + litros);




}
}
