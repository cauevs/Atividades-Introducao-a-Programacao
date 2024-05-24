package Exemplos;
public class ExemploDoWhile {
public static void main(String[] args) {

    int contador = 10;
    do {
        System.out.println(contador++); // o comando do while executa pelo menos uma vez, ao contrário do while 
    } while (contador <= 5);
    System.out.println("Fim do While!");


    contador = 10;
    while (contador <= 5) {
        System.out.println(contador++);
    }
    System.out.println("Fim While");

}
}
