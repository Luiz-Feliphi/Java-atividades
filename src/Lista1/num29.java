package Lista1;

import java.util.Scanner;

public class num29 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Ordem da matriz: ");
        int n = leia.nextInt();
        int[][] matriz = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (i == j) {
                    matriz[i][j] = 1;
                } else {
                    matriz[i][j] = 0;
                }
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }
}
