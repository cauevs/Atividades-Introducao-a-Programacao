package Unidade3;

import java.util.Scanner;

public class Atividade12 {
public static void main(String [] args){
Scanner empresa = new Scanner (System.in);
System.out.print("Informe o nome do Funcionário: ");
String nome = empresa.nextLine();
System.out.print("Informe o número de horas trabalhadas: ");
double horasTrabalhadas = empresa.nextDouble();
System.out.print("Informe o número de dependentes: ");
int dependentes = empresa.nextInt();
int valorHoras = 10;
int valorDependentes = 60;
double descontos = 0.425;
double salarioBruto = (horasTrabalhadas * valorHoras) + (dependentes * valorDependentes);
double salarioLiquido = ((horasTrabalhadas * valorHoras) + (dependentes * valorDependentes)) * (descontos);
        System.out.println(nome);
        System.out.println(salarioBruto);
        System.out.println(salarioLiquido);


}
}
