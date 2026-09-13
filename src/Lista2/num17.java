package Lista2;

import java.util.Scanner;

public class num17 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        System.out.print("Digite A: ");
        double a = leia.nextDouble();

        System.out.print("Digite B: ");
        double b = leia.nextDouble();
        double resultado = Math.pow(a, 3) + 3 * Math.pow(a, 2) * b + 3 * a * Math.pow(b, 2) + Math.pow(b, 3);
        System.out.println();
        System.out.println("(a+b)^3 = a^3 + 3a^2b + 3ab^2 + b^3");
        System.out.println("Resultado = " + resultado);
    }
}