package Unidade4;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Atividade04 {
public static void main(String [] args){
Scanner pontoFlutuante = new Scanner (System.in);
System.out.print("Insira um número inteiro ou decimal: ");
float numero = pontoFlutuante.nextFloat();

// Calcular a parte inteiro do valor real
int valorInteiro = (int) numero;

// Calcular a parte decimal do valor real 

double parteDecimal = numero - valorInteiro;

if (numero == valorInteiro) {
System.out.println("O número é inteiro");        // Poderia ser usado o "(Math.floor (numero) != 0.0)" para fazer essa conta, pq ele retira a parte inteiro dos números
}

else {
    System.out.println("O número é decimal");
}

}
}
