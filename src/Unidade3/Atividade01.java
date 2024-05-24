package Unidade3;
import java.util.Scanner;
public class Atividade01 {
    public static void main(String [] args){
        Scanner terreno = new Scanner (System.in);
        System.out.print("Informe a altura do terreno (m): ");
        int altura = terreno.nextInt();
        System.out.print("Informe a largura do terreno (m): ");
        int largura = terreno.nextInt();
        int area = altura * largura;
        System.out.println("A área total do terreno é de: " + area + " m²");
    

    }
}
