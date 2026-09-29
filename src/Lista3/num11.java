package Lista3;

public class num11 {

    public static int histograma(int[][] matriz) {

        int[] frequencia = new int[64];

        // Conta as ocorrências
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                int valor = matriz[i][j];

                if (valor >= 0 && valor <= 63) {
                    frequencia[valor]++;
                }
            }
        }

        // Imprime o histograma
        System.out.println("Histograma:");

        for (int i = 0; i < frequencia.length; i++) {
            if (frequencia[i] > 0) {
                System.out.println(i + " -> " + frequencia[i] + " vez(es)");
            }
        }

        // Encontra o valor mais frequente
        int maiorValor = 0;
        int maiorFrequencia = frequencia[0];

        for (int i = 1; i < frequencia.length; i++) {

            if (frequencia[i] > maiorFrequencia) {
                maiorFrequencia = frequencia[i];
                maiorValor = i;
            }
        }

        return maiorValor;
    }

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 2},
                {4, 2, 5, 3},
                {1, 2, 4, 2}
        };

        int maisFrequente = histograma(matriz);

        System.out.println("\nValor que mais apareceu: " + maisFrequente);
    }
}