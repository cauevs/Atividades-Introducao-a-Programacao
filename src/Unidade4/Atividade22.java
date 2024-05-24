package Unidade4;
import java.util.Scanner;
public class Atividade22 {
public static void main(String [] args){
Scanner escolha = new Scanner (System.in);
System.out.print("Escolha o seu curso, as opções são: \n1.Ciência da Computação \n2.Licenciatura da Computação \n3.Sistemas de Informação \nSeu curso é: ");
int curso = escolha.nextInt();

switch (curso) {
    case 1:
    System.out.println("Sua titulação será: Bacharel em Ciência da Computação");
        break;
    case 2: 
    System.out.println("Sua titulação será: Licenciado em Computação");
        break;
    case 3: 
    System.out.println("Sua titulação será: Bacharel em Sistemas de Informação");
        break;
    default:
    System.out.println("Este curso não existe :C");
        break;
}
}
}
