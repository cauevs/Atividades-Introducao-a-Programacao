package Unidade4;
import java.util.Scanner;
public class Atividade08 {
public static void main(String [] args){
Scanner vogais = new Scanner (System.in);
System.out.print("Insira a letra: ");
String letra = vogais.nextLine(); // ou dá pra usar um "char letra = vogais.nextLine().charAt(0)" que funciona do mesmo jeito
char primeiraLetra = letra.charAt(0);
primeiraLetra = Character.toLowerCase(primeiraLetra); // uso essa função para que o programa faça a primeira letra ser minuscula, mesmo que tenha sido digitada maiscula
    if (primeiraLetra == 'a' || primeiraLetra == 'e' || primeiraLetra == 'i' || primeiraLetra == 'o' || primeiraLetra =='u') { // as duas barras || significam "ou"
        System.out.println("A letra é uma vogal");
        }   

        else {
            System.out.println("A letra não é uma vogal");
        }


}
}  
