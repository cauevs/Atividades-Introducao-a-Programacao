package Exemplos;

public class ExemploMetodo {

    private ExemploMetodo() { // Construtor
        mostraMenu("Principal");
        System.out.println(soma(2, 6));
        System.out.println(soma(10, 20));
    }

    private int soma(int n1, int n2){
        return n1 + n2;
    }

    private void mostraMenu(String titulo) {
        System.out.println("\tMENU " + titulo);
        System.out.println("Opção 1: Whatever");
        System.out.println("Opção 2: Random");
        System.out.println("Opção 3: ZAPATO!");
        System.out.println("Informe a opção: ");
    }

    public static void main(String[] args) {
        new ExemploMetodo();
    }
}
