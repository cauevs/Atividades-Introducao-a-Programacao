package Unidade4;
import java.util.Scanner;
public class Atividade06 {
public static void main(String [] args){
Scanner caracter = new Scanner (System.in);
System.out.print("Escreva seu gênero com um caracter, exemplo: (M, F, I)\nR:");
char genero = caracter.nextLine().charAt(0);

if (genero == 'M' ) {
    System.out.println("Masculino"); }
else if (genero == 'F') {
    System.out.println("Feminino"); }
else if (genero == 'I'){
    System.out.println("Não Informado"); }
else {
    System.out.println("Entrada Incorreta"); }
}
}
