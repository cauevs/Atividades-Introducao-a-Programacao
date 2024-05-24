package Unidade4;
import java.util.Scanner;
public class Atividade10 {
public static void main(String [] args){
Scanner filhos = new Scanner (System.in);
System.out.print("Insira a idade de Zezinho: ");
int zezinho = filhos.nextInt();
System.out.print("Insira a idade de Marquinhos: ");
int marquinhos = filhos.nextInt();
System.out.print("Insira a idade de Luluzinha: ");
int luluzinha = filhos.nextInt();

    if (zezinho > (marquinhos) && zezinho > (luluzinha)) { // os dois && significam "E"
        System.out.println("Zezinho é o mais velho dos irmãos");
    }
    else if (marquinhos > (zezinho) && marquinhos > (luluzinha)) {
        System.out.println("Marquinhos é o mais velho dos irmãos");
    }
    else if (luluzinha > (zezinho) && luluzinha > (marquinhos)) {
        System.out.println("Luluzinha é a mais velha dos irmãos");
    }
}
}
