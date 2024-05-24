package Prova1;
import java.util.Scanner;
public class Questao3 {
public static void main(String[] args) {
Scanner petshop = new Scanner (System.in);
System.out.print("Insira o animal: ");
String animal = petshop.nextLine();
System.out.print("Insira a espécie: ");
String especie = petshop.nextLine();


if (animal.equals("") && especie.equals("")) {
    System.out.println("Nao é possivel informar os dados");
    System.out.println("Vazio");
    System.out.println("FIM");
} else {
    System.out.println("animal: " + animal);
    if (especie.equals("")){
    System.out.println("Especie Vazio");
    System.out.println("FIM");
} else {
    System.out.println("especie: " + especie);
    System.out.println("FIM");
}

}
}
}
