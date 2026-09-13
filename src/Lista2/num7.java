package Lista2;

import java.util.Scanner;

public class num7 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Quantos nomes deseja inserir? ");
        int quantidade = leia.nextInt();
        leia.nextLine();
        String[] nomes = new String[quantidade];
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Nome "+(i+1)+": ");
            nomes[i] = leia.nextLine();
        }

        ordenarNomes(nomes);

        System.out.println("\nNomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }
    }
    private static void ordenarNomes(String[] nomes) {
        for (int i = 0; i < nomes.length - 1; i++) {
            for (int j = i + 1; j < nomes.length; j++) {

                if (nomes[i].compareToIgnoreCase(nomes[j]) > 0) {

                    String auxiliar = nomes[i];
                    nomes[i] = nomes[j];
                    nomes[j] = auxiliar;

                }
            }
        }
    }
}