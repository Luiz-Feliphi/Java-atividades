package Lista1;

import java.util.Scanner;

public class num31 {
    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);
        double saldo = 1000;
        while (saldo > 0) {
            System.out.println("Saldo atual: R$ " + saldo);
            System.out.print("Valor do saque: ");
            double saque = leia.nextDouble();

            if (saque <= saldo) {
                saldo -= saque;
            } else {
                System.out.println("Saldo insuficiente.");
            }
        }
        System.out.println("Saldo zerado.");
    }
}
