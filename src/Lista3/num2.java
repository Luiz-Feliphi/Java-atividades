package Lista3;

public class num2 {
    public static void main(String[] args) {

        int[][] A = {
                {1, 2},
                {3, 4}
        };

        int[][] B = {
                {5, 6},
                {7, 8}
        };

        System.out.println("Soma:");
        imprimir(somar(A, B));

        System.out.println("\nMultiplicacao:");
        imprimir(multiplicar(A, B));

        System.out.println("\nTransposta de A:");
        imprimir(transpor(A));

        System.out.println("\nA eh identidade? " + ehIdentidade(A));
    }
    // (a) Multiplica duas matrizes se for possível
    private static int[][] multiplicar(int[][] A, int[][] B) {

        if (A[0].length != B.length) {
            return null;
        }

        int[][] resultado = new int[A.length][B[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    resultado[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return resultado;
    }

    // (b) Soma duas matrizes se for possível
    private static int[][] somar(int[][] A, int[][] B) {

        if (A.length != B.length || A[0].length != B[0].length) {
            return null;
        }

        int[][] soma = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[0].length; j++) {
                soma[i][j] = A[i][j] + B[i][j];
            }
        }

        return soma;
    }

    // (c) Verifica se uma matriz é identidade
    private static boolean ehIdentidade(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (i == j && matriz[i][j] != 1) {
                    return false;
                }

                if (i != j && matriz[i][j] != 0) {
                    return false;
                }
            }
        }

        return true;
    }

    // (d) Transpõe uma matriz
    private static int[][] transpor(int[][] matriz) {

        int[][] transposta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
    }

    // (e) Imprime uma matriz
    private static void imprimir(int[][] matriz) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
