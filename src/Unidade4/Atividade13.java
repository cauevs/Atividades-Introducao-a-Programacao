package Unidade4;
import java.util.Scanner;
public class Atividade13 {
public static void main(String [] args){
Scanner truco = new Scanner (System.in);
System.out.print("Infome as cartas: ");
int carta1 = truco.nextInt();
int carta2 = truco.nextInt();
int carta3 = truco.nextInt();

int qtCartasBoas = 0;

if (carta1 == 1 || carta1 == 2 || carta1 == 3){
    qtCartasBoas++; }

if (carta2 == 1 || carta2 == 2 || carta2 == 3){
    qtCartasBoas++; }

if (carta3 == 1 || carta3 == 2 || carta3 == 3){
    qtCartasBoas++; } 
    
    if (qtCartasBoas == 1) {
        System.out.println("Truco!");
    }
    else{
        if (qtCartasBoas == 2){
            System.out.println("Seis!!"); }
            else if (qtCartasBoas == 3) {
                System.out.println("Nove!");
            }
        }
    
}
}
