package Exemplos;
import java.text.DecimalFormat;

public class ExemploFormat {
public static void main(String [] args) {
    double valor = 10.123456789;

    //O format armazena a mensagem e o valor, e depois pode ser puxada automaticamente:

    String formato1 = String.format("O valor é: %f", valor);
    System.out.println(formato1);


    //Você pode armazenar os espaços com o número de espaços antes do "f" também:

    String formato2 = String.format("O valor é %15f", valor);
    System.out.println(formato2);


    //Se você botar um ponto com um número, ele arredonda o número para o tanto de casas decimais:

    String formato3 = String.format("O valor é %.3f", valor);
    System.out.println(formato3);


    //Se você botar um zero antes do "f" ele vai adiconar o número de 0 antes do valor:

    String formato4 = String.format("O valor é %015.3f", valor);
    System.out.println(formato4);


    // Objeto para Formato decimal (Pattern):

    DecimalFormat decimal = new DecimalFormat("0.00");
    double valor2 = 0.2;
    System.out.println(decimal.format(valor2));
    

}
}
