package Prova2;
import java.util.Scanner;
public class Questao {

    private Questao(){
        Scanner teclado = new Scanner(System.in);
        System.out.print("**** INFORMAÇÕES ****\n");
        System.out.print("Insira o tamanho da mochila: ");
        int valorMochila = teclado.nextInt();
        System.out.print("Insira a capacidade máxima da mochila: ");
        int pesoMochila = teclado.nextInt();
        int posFim = 0;
        int vetor1[] = new int[valorMochila];
        int vetor2[] = new int[pesoMochila];
        String vetor1Diferente[] = new String[valorMochila];
        
        int opcao;
        System.out.println("\033[H\033[2J");
		do {
			System.out.println("***** MENU *****");
			System.out.println("  1 - Incluir Item");
			System.out.println("  2 - Imprimir Mochila");
			System.out.println("  3 - Valor do mais pesado");
			System.out.println("  4 - Ordenar Mochila");
            System.out.println("  5 - Sair do sistema");
			System.out.print(" Opção: ");
			opcao = teclado.nextInt();
			switch (opcao) {
			case 1:
				incluir(vetor1, vetor2, posFim, teclado, pesoMochila, vetor1Diferente);
				break;
            case 2:
                imprimirMochila(vetor1, vetor2, vetor1Diferente);
                break;
            case 3:
                valorMaisPesado(vetor2);
                break;
			case 5:
				System.out.println("\n**** FIM ****\n");
				break;

			default:
				System.out.println("\n**** Opção Inválida ****\n");
				break;
			}
		} while (opcao != 5);
    }

    private void valorMaisPesado(int vet2[]){
        int maior = 0;
        for (int i = 0; i < vet2.length; i++) {
            if (vet2[i] > maior) {
                maior = vet2[i];    
            }
        }
        System.out.println("Maior Valor da Mochila: " + maior);
    }

    private void incluir(int vet1[], int vet2[], int posFim, Scanner teclado, int pesoMochila, String vetor1Diferente[]) {
        for (int i = 0; i < vet1.length; i++){
            String item[] = new String [vet1.length];
            int peso[] = new int [vet2.length];
            if (posFim < vet2.length) {
                System.out.print("Insira o Item: ");
                vetor1Diferente[i] = item[i] = teclado.next();
                System.out.print("Insira o peso do Item: ");
                vet2[i] = peso[i] = teclado.nextInt();
                posFim=+peso[i];
                
            } else {
                System.out.println("Item não incluído - Não há espaço");
                break;
            } 
        }
	}

    private void imprimirMochila(int vet1[], int vet2[], String vetDiferente[]) {
		System.out.println("****Valores****\n");
		for (int i = vet1.length - 1; i >= 0; i--) {
			System.out.print("Produto: " + vetDiferente[i] + " | Peso: " + vet2[i] + "\n");
		}
	}
public static void main(String [] args){
    new Questao();
}
}
