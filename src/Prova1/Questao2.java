package Prova1;
import java.util.Scanner;
public class Questao2 {
public static void main(String[] args) {
Scanner loja = new Scanner (System.in); 
System.out.print("Insira a identificação do setor: \nA) Moda Alternativa; \nC) Moda Casual; \nE) Moda Esportiva. \nR:");
char setor = loja.nextLine().charAt(0);
char primeiraLetra = Character.toUpperCase(setor);

if (primeiraLetra == 'A'){
    System.out.println("Moda Alternativa");
}
else if (primeiraLetra == 'C'){
    System.out.println("Moda Casual");
}
else if (primeiraLetra == 'E'){
    System.out.println("Moda Esportiva");
}
else {
    System.out.println("Entrada Inválida");
}
}
}
