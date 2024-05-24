package Unidade2;
//Salário com Bônus
import java.util.Scanner;
public class Atividade08 {
    public static void main(String [] args) {

Scanner vendedor = new Scanner (System.in);
System.out.print("Insira o nome do vendedor: ");
String nomeVendedor = vendedor.nextLine();
System.out.print("Insira o salário Fixo: ");
double salarioFixo = vendedor.nextDouble();
System.out.print("Insira o total de vendas efetuadas em $: ");
double totalVendas = vendedor.nextDouble();
double comissao = 0.15F;
double totalMes = (salarioFixo) + (totalVendas * comissao);
System.out.println("TOTAL = " + totalMes);

    }

}
