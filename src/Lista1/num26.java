package Lista1;

import java.util.Scanner;

public class num26 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Linhas: ");
        int linhas = leia.nextInt();

        for (int i = 1; i <= linhas; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
