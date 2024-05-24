package Unidade3;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Atividade02 {
    public static void main(String [] args){
        Scanner sapatos = new Scanner (System.in);
        System.out.print("Informe o valor do par de sapatos: R$ ");
        double preco = sapatos.nextDouble();
        double desconto = 0.12;
        double descontosemproduto = (preco * desconto);
        double precocomdesconto = (preco - descontosemproduto);
        DecimalFormat decimal = new DecimalFormat("0.00");

        System.out.println("O valor do desconto é de: R$ " + decimal.format(descontosemproduto));
        System.out.println("O preço do par de sapatos com desconto é de: R$ " + decimal.format(precocomdesconto));



    }
}
