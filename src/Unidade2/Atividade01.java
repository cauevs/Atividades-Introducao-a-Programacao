package Unidade2;
//Atividade Extremamente Básico
import java.util.Scanner;
public class Atividade01 {
    public static void main(String[] args) {
    Scanner coisaSimples  = new Scanner (System.in);
    System.out.print("Informe o valor de A: ");
    int a = coisaSimples.nextInt();
    System.out.print("Insira o valor de B: ");
    int b = coisaSimples.nextInt();
    int x = a + b;
    System.out.println("A soma do número " + a + " com o número " + b + " É: " + x);
      //ou podemos usar o seguinte comando:
        System.out.println(String.format("A soma de %d com %d é %d", a, b, x));
        //esse comando é mais simples e funciona da mesma forma:
            System.out.printf("A soma do número %d com %d tem como resultado: %d \n", a, b, x);
            System.out.println("Tudo prontinho!");

    }
}


