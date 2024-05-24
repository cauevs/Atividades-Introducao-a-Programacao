package Unidade6;
import java.util.Scanner;
public class Atividade03 {

private Atividade03() {
    Scanner teclado = new Scanner(System.in);
    double vetor[] = new double[12];
    leVetor(teclado, vetor);
    ajustarVetor(vetor);
    imprimirVetor(vetor);
}

private void leVetor(Scanner tec, double vetor[]){
    System.out.println("*** LEITURA DO VETOR ***");
    for (int i = 0; i < vetor.length; i++){
        System.out.printf("Insira o valor %d: ", i + 1);
        vetor[i] = tec.nextDouble();
    }
}
private void ajustarVetor(double vetor[]){
    for (int i = 0; i < vetor.length; i++){
        if ((i + 1) % 2 == 0){
            vetor[i] += vetor[i] * 0.02;
        }
        else {
            vetor[i] += vetor[i] * 0.05;
        }
    }
}
private void imprimirVetor(double vetor[]){
    System.out.println("*** VALORES ATUALIZADOS ***");
    for (int i = 0; i < vetor.length; i++){
    System.out.printf("Posição: %d | Valor: %.2f%n", i + 1, vetor[i]);
    }
}
public static void main(String [] args){
new Atividade03();
}
}