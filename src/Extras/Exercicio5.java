package Extras;
import java.util.Scanner;
public class Exercicio5 {
public static void main (String [] args){
Scanner produto = new Scanner (System.in);
System.out.print("Informe o preço: ");
float preco = produto.nextFloat();

float aumento5 = (preco * 0.05F);
float aumento10 = (preco * 0.1F);
float aumento15 = (preco * 0.15F);

if (preco <= 50){ 
    float precoNovo = (preco + aumento5);
    System.out.println("Preço: " + precoNovo);
    if (precoNovo <= 80){
        System.out.println("Barato");
    } if (precoNovo > 80 && precoNovo <= 120){
        System.out.println("Normal");
    } if (precoNovo > 120 && precoNovo <= 200){
        System.out.println("Caro");
    } if (precoNovo > 200){
        System.out.println("Muito caro");
    }
}

else if ((preco > 50) && (preco <= 100)){
    float precoNovo = (preco + aumento10);
    System.out.println("Preço: " + precoNovo);
    if (precoNovo <= 80){
        System.out.println("Barato");
    } if (precoNovo > 80 && precoNovo <= 120){
        System.out.println("Normal");
    } if (precoNovo > 120 && precoNovo <= 200){
        System.out.println("Caro");
    } if (precoNovo > 200){
        System.out.println("Muito caro");
    }
}

else if (preco > 100){
    float precoNovo = (preco + aumento15);
    System.out.println("Preço: " + precoNovo);
    if (precoNovo <= 80){
        System.out.println("Barato");
    } if (precoNovo > 80 && precoNovo <= 120){
        System.out.println("Normal");
    } if (precoNovo > 120 && precoNovo <= 200){
        System.out.println("Caro");
    } if (precoNovo > 200){
        System.out.println("Muito caro");
    }
}
}
}
