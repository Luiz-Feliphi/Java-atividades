package Lista2;

import java.util.Scanner;

public class num19 {

    private static int CalcularAlveolos(int n) {
        return n * (n + 1) / 2;
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite a profundidade da colmeia (N): ");
        int n = leia.nextInt();
        int resultado = CalcularAlveolos(n);
        System.out.println("Quantidade mínima de alvéolos preenchidos manualmente: " + resultado);
        leia.close();
    }
}