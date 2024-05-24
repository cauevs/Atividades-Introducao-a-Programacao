package Unidade4;
import java.util.Scanner;
public class Atividade11 {
public static void main (String [] args){
Scanner irmaos = new Scanner (System.in);
System.out.print("Insira o ano de nascimento do primeiro filho: ");
int irmao1 = irmaos.nextInt();
System.out.print("Insira o ano de nascimento do segundo filho: ");
int irmao2 = irmaos.nextInt();
System.out.print("Insira o ano de nascimento do terceiro filho: ");
int irmao3 = irmaos.nextInt();
if (irmao1 == (irmao2) ^ irmao1 == (irmao3)){
    System.out.println("Os irmãos são gêmeos");
} else if (irmao1 == (irmao2) && irmao1 == (irmao3)){
    System.out.println("Os irmãos são trigêmeos");
} else if (irmao2 == (irmao1) ^ irmao2 == (irmao3)){
    System.out.println("Os irmãos são gêmeos");
    } else {
    System.out.println("São apenas irmãos");
}
}
}
