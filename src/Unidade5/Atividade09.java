package Unidade5;

import java.util.Scanner;

public class Atividade09 {
    public static void main(String[] args) {
        Scanner escola = new Scanner(System.in);

        String nomeAlunos18Anos = "";

        System.out.print("Insira quantos alunos a sala tem: ");
        int valorN = escola.nextInt();

        System.out.print("Nome do aluno 1: ");
        String nome1 = escola.next();
 
        System.out.print("Idade do aluno 1: ");
        int idade1 = escola.nextInt();

        int qntAlunos = 0;
        String nomeAlunos = nome1;

        for (int i = 2; i <= valorN; i++) {
            System.out.printf("Nome do aluno %d: ", i);
            String nomeAluno = escola.next();

            System.out.printf("Idade do aluno %d: ", i);
            int idadeAluno = escola.nextInt();

            nomeAluno += nomeAlunos + "";

            if (idadeAluno == 18){
                nomeAlunos18Anos += nomeAluno + "";
            }

            else if (idadeAluno >= 20){
                qntAlunos++;
            }
        }
      System.out.println("Os nomes dos alunos com 18 são: " + nomeAlunos18Anos);
      System.out.printf("A quantidade de alunos com mais de 20 anos é de: %d", qntAlunos);

    }
}
