import java.util.Scanner;
public class Vetores {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        float salarios[] = new float[15];
        salarios[0] = (float) 1000.0; // Usar o (float) desse jeito fica mais higienico do que o "F" no final. 
        salarios[1] = (float) 1450.0;
        salarios[2] = (float) 10952.52;
        salarios[3] = (float) 90.7;
        salarios[8] = (float) 45000.90;

        for (int i = 0; i < salarios.length; i++) {
            System.out.println(salarios[i]);
        }
//Agora vamos declarar um novo vetor para ler e depois escrever o que foi lido

        int numeros [] = new int[10];

        for (int i = 0; i < numeros.length; i++){
            System.out.printf("Insira o número %d: ", i);
            numeros[i] = teclado.nextInt();
        }

        for (int i = 0; i < numeros.length; i++){ 
            System.out.println(numeros[i]);
    }
}
}
