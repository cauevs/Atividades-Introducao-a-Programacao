package Unidade4;
import java.util.Scanner;
public class Atividade26 {
public static void main (String [] args){
Scanner escolha = new Scanner (System.in);
System.out.print("Insira a sua escolha: \nT : para área de um triangulo de base b e altura h \nQ : para calcular a área de um quadrado de lado l \nR : para calcular a área de umt retângulo de base b e altura h \nC : para calcular a área de um círculo de raio r \nR:");
String opcao = escolha.nextLine();
char primeiraLetra = opcao.charAt(0);
primeiraLetra = Character.toLowerCase(primeiraLetra);

switch (primeiraLetra) {
    case 't':
        System.out.print("Insira a base e altura do Triangulo: ");
        float base1 = escolha.nextFloat();
        float altura1 = escolha.nextFloat();
        float areaTriangulo = (base1 * altura1 / 2);
        System.out.println("A área do triangulo é: " + areaTriangulo);
        break;
    case 'q':
        System.out.print("Insira o lado: ");
        float lado1 = escolha.nextFloat();
        float areaQuadrado = (lado1 * lado1);
        System.out.println("A área do quadrado é: " + areaQuadrado);
        break;
    case 'r':
        System.out.print("Insira a base e altura do retângulo: ");
        float base2 = escolha.nextFloat();
        float altura2 = escolha.nextFloat();
        float areaRetangulo = (base2 * altura2);
        System.out.println("A área do retângulo é: " + areaRetangulo);
        break;
    case 'c':
        System.out.print("Insira o raio: ");
        float raio = escolha.nextFloat();
        float areaCirculo = (float) (Math.PI * Math.pow(raio, 2));
        System.out.println("A área do circulo é: " + areaCirculo);
        break;

    default:
        System.out.println("Opção Inválida");
        break;
}
}
}
