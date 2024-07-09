package Prova1;
import java.util.Scanner;
public class Questao1 {
public static void main(String [] args){
Scanner biblioteca = new Scanner (System.in);
System.out.print("Insira o valor da primeira multa: ");
float multa1 = biblioteca.nextFloat();
System.out.print("Insira o valor da segunda multa: ");
float multa2 = biblioteca.nextFloat();
System.out.print("Insira o valor da terceira multa: ");
float multa3 = biblioteca.nextFloat();
System.out.print("Escolha a opção: \na) Multa mais alta; \nb) Multa mais baixa; \nc) Multa em ordem crescente; \nd) Média das multas. \nR:");
String opcao = biblioteca.next();
char primeiraLetra = opcao.charAt(0);
char primeiraLetra1 = Character.toLowerCase(primeiraLetra);

float multaMenor = 0, multaMedia = 0, multaMaior = 0;
if (multa1 <= multa2 && multa1 <= multa3){
    multaMenor = multa1;
    if (multa2  <= multa3){
        multaMedia = multa2;
        multaMenor = multa3;
    } else {
        multaMedia = multa3;
        multaMenor = multa2;
    }
} else {
    if ((multa2 <= multa1) && (multa2 <= multa3)) {
        multaMenor = multa2;
        if (multa1 <= multa3) {
            multaMedia = multa1;
            multaMaior = multa3; 
        } else {
            multaMedia = multa3;
            multaMaior = multa1;
        }
    }  else {
        multaMenor = multa3; 
        if (multa1 <= multa2) {
            multaMedia = multa1;
            multaMaior = multa2;
        } else {
            multaMedia = multa2;
            multaMaior = multa1;
        } } }

switch (primeiraLetra1) {
    case 'a':
        System.out.println(multaMaior);
        break;
    case 'b':
        System.out.println(multaMenor);
        break;
    case 'c':
        System.out.println(multaMaior);
        System.out.println(multaMedia);
        System.out.println(multaMenor);
        break;
    case 'd':
    float media = (multa1 + multa2 + multa3) / 3;
        System.out.println(media);
        break;
    default:
    System.out.println("Opção Inválida");
        break;
        
}}}
