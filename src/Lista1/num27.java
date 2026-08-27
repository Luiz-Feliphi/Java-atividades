package Lista1;

import java.util.Scanner;

public class num27 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Linhas: ");
        int linhas = leia.nextInt();
        for (int i = linhas; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
