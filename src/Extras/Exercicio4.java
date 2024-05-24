package Extras;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Exercicio4 {
public static void main (String [] args){
Scanner planetas = new Scanner (System.in);
System.out.print("Insira o peso em newtons: ");
double peso = planetas.nextDouble();

double pesoMercurio = (peso * 0.3649337410);
double pesoVenus = (peso * 0.9041794087);
double pesoMarte = (peso * 0.3812436289);
double pesoLua = (peso * 0.1651376146);
double pesoTerra = (peso * 1);
double pesoJupiter = (peso * 2.6513761467);
double pesoSaturno = (peso * 1.1386340468);
double pesoUrano = (peso * 1.0693170234);
double pesoNetuno = (peso * 1.3506625891);
double pesoPlutao = (peso * 0.2252803261);

DecimalFormat decimal = new DecimalFormat("0.00");
System.out.println("Peso em Mercúrio: " + decimal.format(pesoMercurio));
System.out.println("Peso em Vênus: " + decimal.format(pesoVenus));
System.out.println("Peso em Marte: " + decimal.format(pesoMarte));
System.out.println("Peso na Lua: " + decimal.format(pesoLua));
System.out.println("Peso na Terra: " + decimal.format(pesoTerra));
System.out.println("Peso em Júpiter: " + decimal.format(pesoJupiter));
System.out.println("Peso em Saturno: " + decimal.format(pesoSaturno));
System.out.println("Peso em Urano: " + decimal.format(pesoUrano));
System.out.println("Peso em Netuno: " + decimal.format(pesoNetuno));
System.out.println("Peso em Plutão: " + decimal.format(pesoPlutao));
}
}
