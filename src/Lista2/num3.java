package Lista2;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Quero saber a sequencia do ");
        double Nnumero=leia.nextInt();
        double ResultCalculoNumero= CalculoNSequencia(Nnumero);
        System.out.print("Resultado final "+ResultCalculoNumero);
    }

    private static double CalculoNSequencia(double nnumero) {
        double soma =0;
        for (int i = 1; i <= nnumero; i++) {
            soma += 1.0 / (i * 2);
        }
        return soma;
    }
}
