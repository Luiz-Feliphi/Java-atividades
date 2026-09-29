package Lista3;

public class num4 {
    public static void main(String[] args) {

        int N = 4;

        int[][] matriz = criarMatrizIdentidade(N);

        imprimirMatriz(matriz);
    }
    private static int[][] criarMatrizIdentidade(int N) {

        int[][] identidade = new int[N][N];

        for (int i = 0; i < N; i++) {
            identidade[i][i] = 1;
        }

        return identidade;
    }

    private static void imprimirMatriz(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}

