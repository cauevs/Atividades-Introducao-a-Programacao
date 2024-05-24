package Unidade4;
import java.util.Scanner;
public class Atividade16 {
public static void main(String [] args){
Scanner idades = new Scanner (System.in);
System.out.print("Digite a idade do homem 1: ");
int homem1 = idades.nextInt();
System.out.print("Digite a idade do homem 2: ");
int homem2 = idades.nextInt();
System.out.print("Digite a idade da mulher 1: ");
int mulher1 = idades.nextInt();
System.out.print("Digite a idade da mulher 2: ");
int mulher2 = idades.nextInt();

int somaIdades = Math.max(homem1, homem2) + Math.min(mulher1, mulher2);
System.out.println("A soma das idades é de: " + somaIdades);

int produtoIdades = Math.max(mulher1, mulher2) * Math.min(homem1, homem2);
System.out.println("O produto das idades é de: " + produtoIdades);
}
}
