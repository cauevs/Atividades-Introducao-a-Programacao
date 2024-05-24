package Exemplos;
public class ExemplosMath {
public static void main(String[] args) {

// Ao usar o "Math." você pode escolher algumas operações que o próprio java oferece (exemplo potência):
// O java é uma linguagem fortemente tipada o que signfica que respeita hierarquias, o double é mais forte que uma String e um int logo
// O double não pode estar dentro de uma int, pois é a int é a mais fraca, mas o contrário é possível, pois o Double é mais forte que o int
int numero = 9;
int resposta = (int) Math.pow(numero, 2); // o comando "Math.pow" necessita de um Double pra funcionar
//para o resultado que queremos é int, então precisamos adicionar um (int) pra transformar o resultado final de double pra int.
System.out.println(resposta);

// Exemplo (raiz)

double raiz = Math.sqrt(numero);
System.out.println(raiz);

System.out.println(Math.PI); // O PI já está no java, logo não precisamos especifica-lo

}
}