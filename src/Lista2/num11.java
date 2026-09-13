package Lista2;

import java.util.Scanner;

public class num11 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = leia.nextInt();
        int soma = 0;
        for (int i = 1; i < numero; i++) {

            if (numero % i == 0) {
                soma += i;
            }
        }
        if (soma == numero) {
            System.out.println("É perfeito.");
        } else {
            System.out.println("Não é perfeito.");
        }
    }
}