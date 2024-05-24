import java.util.Scanner;
public class TesteTabuada {
public static void main(String[] args) {
//int inicio = 0;
//System.out.println(inicio++);
//System.out.println(inicio++);
//System.out.println(inicio++);
//System.out.println(inicio++);
//System.out.println(inicio++);
//System.out.println(inicio);
// teste de um código nada pratico e que demoraria muito para atingir o objetivo

Scanner tabuada = new Scanner (System.in);
System.out.print("Insira o número na qual deseja a tabuada: ");
int numero = tabuada.nextInt();
for (int i = 0; i <= 10; i++) {
    System.out.printf("%d x %d = %d%n", numero, i, (numero * i));
}

}
} 
