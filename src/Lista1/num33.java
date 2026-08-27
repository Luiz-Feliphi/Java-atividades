package Lista1;

import java.util.Scanner;

public class num33 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Linhas: ");
        int linhas = leia.nextInt();
        int numero = 1;
        for (int i = 1; i <= linhas; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(numero + " ");
                numero++;
            }
            System.out.println();
        }
    }
}
