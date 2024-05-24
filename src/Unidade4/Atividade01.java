package Unidade4;
import java.util.Scanner;
public class Atividade01 {
public static void main(String[] args) {
    Scanner empresa = new Scanner (System.in);
    System.out.print("Escreva o número de horas trabalhadas: ");
    int horasTrabalhadas = empresa.nextInt();
    System.out.print("Escreva o valor pago por hora trabalhada: ");
    float valorHora = empresa.nextFloat();
    float salarioTotal = (horasTrabalhadas * valorHora);
    if (horasTrabalhadas > 160) {
        float horasExtras = (horasTrabalhadas - 160) * (valorHora / 2);
        salarioTotal = (salarioTotal + horasExtras);
        System.out.println("O salário total é de: " + salarioTotal);
}
}
}