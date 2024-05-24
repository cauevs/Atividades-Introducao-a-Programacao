package Unidade4;
import java.util.Scanner;
public class Atividade07 {
public static void main(String [] args){
Scanner jaiminho = new Scanner (System.in);
System.out.print("Insira o peso da carta: ");
float pesoCarta = jaiminho.nextFloat();
float valorPagar = 0.45f;
if (pesoCarta > 50) {
    float pesoExcedido = (pesoCarta - 50);
    float precoExtra = (pesoExcedido / 20) + 1;
    float totalPagar = ((0.45F + 0.45F) * precoExtra);
    System.out.println("Custo do selo: " + totalPagar);
}

else {
    System.out.println("Custo do selo: " + valorPagar * pesoCarta);
}



}
}
