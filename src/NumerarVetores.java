public class NumerarVetores {
    public static void main(String[] args) {
        int numerosAleatorios[] = new int[50];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            numerosAleatorios[i] = (int) (Math.random() * 100);
            System.out.printf("Vetor %d: %d%n", i, numerosAleatorios[i]);
        }
        int maiorNumero = Integer.MIN_VALUE;
        for (int i = 0; i < numerosAleatorios.length; i++){
            if (numerosAleatorios[i] > maiorNumero ) {
                maiorNumero = numerosAleatorios[i];
            }
        }
        System.out.printf("Maior número do vetor: %d", maiorNumero);
    }
}
