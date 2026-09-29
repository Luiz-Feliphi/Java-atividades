package Lista3;

public class num7 {
    private static int contarRepetidos(int[][] matriz1, int[][] matriz2) {

        int contador = 0;

        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[0].length; j++) {

                for (int k = 0; k < matriz2.length; k++) {
                    for (int l = 0; l < matriz2[0].length; l++) {

                        if (matriz1[i][j] == matriz2[k][l]) {
                            contador++;
                        }
                    }
                }
            }
        }

        return contador;
    }

    public static void main(String[] args) {

        int[][] matriz1 = {
                {1, 2},
                {3, 4}
        };

        int[][] matriz2 = {
                {2, 4},
                {5, 6}
        };

        int repetidos = contarRepetidos(matriz1, matriz2);

        System.out.println("Quantidade de elementos repetidos: " + repetidos);
    }
}
