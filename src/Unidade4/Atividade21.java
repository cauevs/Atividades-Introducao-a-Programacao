package Unidade4;

import java.util.Scanner;

public class Atividade21 {
    public static void main(String[] args) {
        Scanner dados = new Scanner(System.in);
        System.out.print("Insira a sua altura em metros: ");
        float altura = dados.nextFloat();
        System.out.print("Insira o seu peso em quilogramas: ");
        float peso = dados.nextFloat();
        float imc = peso / (altura * altura);
        String classificacao = " ";
        if (imc >= 40.0) {
            classificacao = "Obesidade Grau III (Mórbida)";
        } else if (imc >= 35) {
            classificacao = "Obesidade Grau II (Severa)";
        } else if (imc >= 30) {
            classificacao = "Obesidade Grau I";
        } else if (imc >= 25) {
            classificacao = "Sobrepeso";
        } else if (imc >= 18.5) {
            classificacao = "Saudável";
        } else {
            classificacao = "Magreza";
        }
        System.out.printf("O IMC da pessoa é %.2f e a classificação é %s", imc, classificacao);
    }
}
