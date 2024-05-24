package Unidade4;
import java.util.Scanner;
public class Atividade14 {
public static void main(String [] args){
Scanner data = new Scanner (System.in);
System.out.print("Insira o dia: ");
int dia = data.nextInt();
System.out.print("Insira o mês: ");
int mes = data.nextInt();
System.out.print("Insira o ano: ");
int ano = data.nextInt();
if ((dia > 0) && (dia < 32) && (mes > 0)  && (mes < 13) && (ano > 0)){
    if ((mes == 1) || (mes == 3)) {
        System.out.println("Data válida!");
    }
    else if ((mes != 2) && (dia < 31)){
        System.out.println("Data válida!");
    }
    else if ((mes == 2) && (dia < 29)){
        System.out.println("Data válida!");
    } }
    if ((dia == 29) && (ano % 4 == 0) && !(ano % 100 == 0 && ano % 400 != 0)){
        System.out.println("Data válida"); 
    }  
 
    else {
    System.out.println("Data não válida!");
} 
}
}