package Unidade2;
import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner coca = new Scanner(System.in);
        System.out.print("Informe quantas latas de 350ml foram compradas: ");
        int latas = coca.nextInt();
        System.out.print("Informe quantas garrafas de 600ml foram compradas: ");
        int garrafas = coca.nextInt();
        System.out.print("Informe quantas garrafas de 2L foram compradas: ");
        int litrao = coca.nextInt();

        double lataslitros = (latas * 0.35);
        double garrafaslitros = (garrafas * 0.6);
        int litraolitros = (litrao * 2);
        double qntotal = (lataslitros + garrafaslitros + litraolitros);

        System.out.println("A quantidade total é de: " + qntotal + " Litros");

    }
}
