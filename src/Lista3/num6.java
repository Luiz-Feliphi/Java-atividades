package Lista3;

public class num6 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[] diagonal = extrairDiagonal(matriz);

        System.out.print("Diagonal principal: ");

        for (int valor : diagonal) {
            System.out.print(valor + " ");
        }
    }
    private static int[] extrairDiagonal(int[][] matriz) {

        int[] diagonal = new int[matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            diagonal[i] = matriz[i][i];
        }

        return diagonal;
    }
}
