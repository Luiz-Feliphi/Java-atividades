package Lista2;

import java.util.Scanner;

public class num20 {
    private static boolean Calcular(boolean p, boolean q, char operador) {
        switch (operador) {
            case '&':
                return p && q;
            case '|':
                return p || q;
            case '>':
                return !p || q;
            default:
                return false;
        }
    }
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.println("Exemplos:");
        System.out.println("p&q");
        System.out.println("p|q");
        System.out.println("p>q");
        System.out.print("Digite a expressão: ");
        String expressao = leia.nextLine();
        char operador = expressao.charAt(1);
        boolean tautologia = true;
        System.out.println();
        System.out.println("P\tQ\tResultado");
        for (int i = 0; i < 4; i++) {
            boolean p = (i / 2) == 0;
            boolean q = (i % 2) == 0;
            boolean resultado = Calcular(p, q, operador);
            System.out.println(p + "\t" + q + "\t" + resultado);
            if (!resultado) {
                tautologia = false;
            }
        }
        if (tautologia) {
            System.out.println();
            System.out.println("A expressão é uma tautologia.");
        } else {
            System.out.println();
            System.out.println("A expressão não é uma tautologia.");
        }
        leia.close();
    }
}