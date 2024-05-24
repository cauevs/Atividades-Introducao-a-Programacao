package Unidade2;
//Salário
import java.util.Scanner;
public class Atividade07 {
public static void main(String [] agrs){
Scanner empresa = new Scanner (System.in);
System.out.print("Insira o número de funcionário: ");
int numeroFuncionario = empresa.nextInt();
System.out.print("Insira o número de horas trabalhadas: ");
int horasTrabalhadas = empresa.nextInt();
System.out.print("Insira o valor a receber por hora trabalhada: ");
double valorHoras = empresa.nextDouble();
double salario = (valorHoras * horasTrabalhadas);
System.out.println("NUMBER = " + numeroFuncionario);
System.out.println("SALARY = U$ " + salario);

}
}
