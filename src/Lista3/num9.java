package Lista3;

import java.util.Random;

public class num9 {

    // (a) Gera a matriz de coocorrência
    private static int[][] matrizCoocorrencia(int N) {

        int[][] matriz = new int[11][11];
        Random random = new Random();

        for (int i = 0; i < N; i++) {

            int num1 = random.nextInt(11); // 0 a 10
            int num2 = random.nextInt(11); // 0 a 10

            matriz[num1][num2]++;
        }

        return matriz;
    }

    // (b) Encontra a posição do maior elemento
    private static void encontrarMaior(int[][] matriz) {

        int maior = matriz[0][0];
        int linha = 0;
        int coluna = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    linha = i;
                    coluna = j;
                }
            }
        }

        System.out.println("\nMaior elemento encontrado:");
        System.out.println("Valor = " + maior);
        System.out.println("Linha = " + linha);
        System.out.println("Coluna = " + coluna);
    }

    // (c) Determina os números com maior correlação
    private static void maiorCorrelacao(int[][] matriz) {

        int maior = matriz[0][0];
        int numero1 = 0;
        int numero2 = 0;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] > maior) {
                    maior = matriz[i][j];
                    numero1 = i;
                    numero2 = j;
                }
            }
        }

        System.out.println("\nNumeros com maior correlacao:");
        System.out.println(numero1 + " e " + numero2);
        System.out.println("Frequencia = " + maior);
    }

    // Imprime a matriz
    private static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }

            System.out.println();
        }
    }

    public static void main(String[] args) {

        int N = 1000;

        int[][] coocorrencia = matrizCoocorrencia(N);

        System.out.println("Matriz de Coocorrencia:");
        imprimirMatriz(coocorrencia);

        encontrarMaior(coocorrencia);

        maiorCorrelacao(coocorrencia);
    }
}