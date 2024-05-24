import java.util.Scanner;
public class TesteTabuada2 {
public static void main(String [] args){
Scanner tabuada = new Scanner (System.in);
System.out.print("Insira o número da tabuada: "); 
int numeroTabuada = tabuada.nextInt();
System.out.print("Insira onde a tabuada começa: ");
int numeroInicio = tabuada.nextInt();
System.out.print("Insira onde a tabuada termina: ");
int numeroFim = tabuada.nextInt();

for (int i = numeroInicio; i <= numeroFim; i++){ // Nesse exemplo iremos escolher onde a tabuada irá iniciar e terminar.
System.out.printf("%d x %d = %d%n", numeroTabuada, i, (numeroTabuada * i));
}



}
}
