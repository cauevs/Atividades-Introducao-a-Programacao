import java.util.Scanner;
import java.lang.Math;

public class aa {

    private aa() {
        Scanner teclado = new Scanner(System.in);
        System.out.print(
                "Escolha a operação matématica: \n1 - Soma \n2 - Subtração \n3 - Multiplicação \n4 - Divisão \n5 - Potência \n6 - Raiz Quadrada \nR:");
        int escolha = teclado.nextInt();
        switch (escolha) {
            case 1:
                System.out.println("Resultado da soma: " + lesoma(teclado));
                break;
            case 2:
                System.out.println("Resultado da subtração: " + lesubtracao(teclado));
                break;
            case 3:
                System.out.println("Resultado da multiplicação: " + lemultiplicacao(teclado));
                break;
            case 4:
                System.out.println("Resultado da divisão: " + ledivisao(teclado));
                break;
            case 5:
                System.out.println("Resultado da potência: " + lepotencia(teclado));
                break;
            case 6:
                System.out.println("Resultado da Raiz Quadrada: " + leraiz(teclado));
                break;
            default:
                System.out.println("Escolha Inválida");
                break;
        }

    }

    private float lesoma(Scanner tec) {
        System.out.print("Insira o primeiro número: ");
        float numero1 = tec.nextFloat();
        System.out.print("Insira o segundo número: ");
        float numero2 = tec.nextFloat();
        float soma = numero1 + numero2;
        return soma;
    }

    private float lesubtracao(Scanner tec) {
        System.out.print("Insira o primeiro número: ");
        float numero1 = tec.nextFloat();
        System.out.print("Insira o segundo número: ");
        float numero2 = tec.nextFloat();
        float subtracao = numero1 - numero2;
        return subtracao;
    }

    private float lemultiplicacao(Scanner tec) {
        System.out.print("Insira o primeiro número: ");
        float numero1 = tec.nextFloat();
        System.out.print("Insira o segundo número: ");
        float numero2 = tec.nextFloat();
        float multiplicação = numero1 * numero2;
        return multiplicação;
    }

    private float ledivisao(Scanner tec) {
        System.out.print("Insira o primeiro número: ");
        float numero1 = tec.nextFloat();
        System.out.print("Insira o segundo número: ");
        float numero2 = tec.nextFloat();
        float divisao = numero1 / numero2;
        return divisao;
    }

    private float lepotencia(Scanner tec) {
        System.out.print("Insira o primeiro número: ");
        float numero1 = tec.nextFloat();
        System.out.print("Insira o segundo número: ");
        float numero2 = tec.nextFloat();
        return (float) Math.pow(numero1, numero2);
    }

    private float leraiz(Scanner tec) {
        System.out.print("Insira o número: ");
        float numero1 = tec.nextFloat();
        return (float) Math.sqrt(numero1);
    }

    public static void main(String[] args) {
        new aa();
    }
}