package Unidade4;
import java.util.Scanner;
public class Atividade15 {
public static void main(String [] args){
Scanner empresa = new Scanner (System.in);
System.out.print("Digite a quantidade de meses desde a admissão: ");
int meses = empresa.nextInt();
if (meses <= 12){
    System.out.println("O reajuste será de 5%");
}
else if ((meses >= 13) && (meses < 48)){
    System.out.println("O reajuste será de 7%");
}

}
}
