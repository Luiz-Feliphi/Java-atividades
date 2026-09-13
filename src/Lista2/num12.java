package Lista2;

import java.util.Scanner;

public class num12 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Valor investido: ");
        double valorInicial = leia.nextDouble();
        System.out.print("Taxa (%): ");
        double taxa = leia.nextDouble();
        taxa = taxa / 100;
        double valorAtual = valorInicial;
        int anos = 0;
        while (valorAtual < valorInicial * 2) {
            valorAtual += valorAtual * taxa;
            anos++;
        }
        System.out.println("Tempo necessário: " + anos + " anos");
    }
}