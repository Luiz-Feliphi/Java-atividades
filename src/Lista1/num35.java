package Lista1;

import java.util.Scanner;

public class num35 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Depósito mensal: ");
        double deposito = leia.nextDouble();
        System.out.print("Taxa anual (%): ");
        double taxa = leia.nextDouble();
        System.out.print("Tempo em anos: ");
        int anos = leia.nextInt();
        double montante = 0;
        for (int i = 1; i <= anos * 12; i++) {
            montante += deposito;
            montante *= (1 + taxa / 100 / 12);
        }
        System.out.println("Montante: R$ " + montante);
    }
}
