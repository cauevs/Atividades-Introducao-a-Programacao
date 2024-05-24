package Unidade4;
import java.util.Scanner;
public class Atividade17 {
public static void main(String [] args){
Scanner dados = new Scanner (System.in);
System.out.print("Insira a renda anual: ");
float rendaAnual = dados.nextFloat();
System.out.print("Insira o número de dependentes: ");
int dependentes = dados.nextInt();
float rendaLiquida = rendaAnual * (0.2F * dependentes);
if (rendaLiquida <= 2000){
    System.out.println(rendaLiquida + "\nNão há imposto");
}
else if ((rendaLiquida > 2000) && (rendaLiquida < 5000)){
    rendaLiquida = rendaLiquida * 0.5F;
    System.out.println(rendaLiquida + "\nImposto de 5%");
}
else if ((rendaLiquida >= 5000) && (rendaLiquida < 10000)){
    rendaLiquida = rendaLiquida * 0.10F;
    System.out.println(rendaLiquida + "\nImposto de 10%");
}
else if((rendaLiquida >= 10000)){
    rendaLiquida = rendaLiquida * 0.15F;
    System.out.println(rendaLiquida + "\nImposto de 15%");
}
}
}
