package Lista3;

public class num8 {

    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] somaLinhas = somaLinhas(matriz);
        System.out.println("Soma das linhas:");
        for (int valor : somaLinhas) {
            System.out.print(valor + " ");
        }

        int[] somaColunas = somaColunas(matriz);
        System.out.println("\n\nSoma das colunas:");
        for (int valor : somaColunas) {
            System.out.print(valor + " ");
        }

        double[] mediaLinhas = mediaLinhas(matriz);
        System.out.println("\n\nMedia das linhas:");
        for (double valor : mediaLinhas) {
            System.out.print(valor + " ");
        }

        double[] mediaColunas = mediaColunas(matriz);
        System.out.println("\n\nMedia das colunas:");
        for (double valor : mediaColunas) {
            System.out.print(valor + " ");
        }

        double[] desviosLinhas = desvioPadraoLinhas(matriz);
        System.out.println("\n\nDesvio padrao das linhas:");
        for (double valor : desviosLinhas) {
            System.out.printf("%.2f ", valor);
        }

        double[] desviosColunas = desvioPadraoColunas(matriz);
        System.out.println("\n\nDesvio padrao das colunas:");
        for (double valor : desviosColunas) {
            System.out.printf("%.2f ", valor);
        }
    }
    //a
    private static int[] somaLinhas(int[][] matriz) {

        int[] soma = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                soma[i] += matriz[i][j];
            }
        }

        return soma;
    }
    //b
    private static int[] somaColunas(int[][] matriz) {

        int[] soma = new int[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {
            for (int i = 0; i < matriz.length; i++) {
                soma[j] += matriz[i][j];
            }
        }

        return soma;
    }
    //c
    private static double[] mediaLinhas(int[][] matriz) {

        int[] soma = somaLinhas(matriz);
        double[] media = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            media[i] = (double) soma[i] / matriz[0].length;
        }

        return media;
    }
    //d
    private static double[] mediaColunas(int[][] matriz) {

        int[] soma = somaColunas(matriz);
        double[] media = new double[matriz[0].length];

        for (int i = 0; i < matriz[0].length; i++) {
            media[i] = (double) soma[i] / matriz.length;
        }

        return media;
    }
    //e
    private static double[] desvioPadraoLinhas(int[][] matriz) {

        double[] medias = mediaLinhas(matriz);
        double[] desvios = new double[matriz.length];

        for (int i = 0; i < matriz.length; i++) {

            double soma = 0;

            for (int j = 0; j < matriz[0].length; j++) {
                soma += Math.pow(matriz[i][j] - medias[i], 2);
            }

            desvios[i] = Math.sqrt(soma / matriz[0].length);
        }

        return desvios;
    }
    //f
    private static double[] desvioPadraoColunas(int[][] matriz) {

        double[] medias = mediaColunas(matriz);
        double[] desvios = new double[matriz[0].length];

        for (int j = 0; j < matriz[0].length; j++) {

            double soma = 0;

            for (int i = 0; i < matriz.length; i++) {
                soma += Math.pow(matriz[i][j] - medias[j], 2);
            }

            desvios[j] = Math.sqrt(soma / matriz.length);
        }

        return desvios;
    }
}
