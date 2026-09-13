package Lista2;

import java.util.Scanner;

public class num18 {

    private static String Compactar(String bitmap) {
        String compactado = "";

        char atual = bitmap.charAt(0);
        int contador = 1;

        for (int i = 1; i < bitmap.length(); i++) {
            if (bitmap.charAt(i) == atual) {
                contador++;
            } else {
                if (atual == '0') {
                    compactado += "B" + contador;
                } else {
                    compactado += "P" + contador;
                }
                atual = bitmap.charAt(i);
                contador = 1;
            }
        }
        if (atual == '0') {
            compactado += "B" + contador;
        } else {
            compactado += "P" + contador;
        }
        compactado += "B0";
        return compactado;
    }
    private static String Descompactar(String codigo) {
        String bitmap = "";

        for (int i = 0; i < codigo.length(); i += 2) {
            char tipo = codigo.charAt(i);
            int quantidade = Character.getNumericValue(codigo.charAt(i + 1));
            if (quantidade == 0) {
                break;
            }
            if (tipo == 'B') {
                for (int j = 0; j < quantidade; j++) {
                    bitmap += "0";
                }
            } else {
                for (int j = 0; j < quantidade; j++) {
                    bitmap += "1";
                }
            }
        }
        return bitmap;
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        int opcao;
        do {
            System.out.println("\n1 - Compactar");
            System.out.println("2 - Descompactar");
            System.out.println("3 - Sair");
            System.out.print("Opção: ");
            opcao = leia.nextInt();
            leia.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Digite o bitmap (0 e 1): ");
                    String bitmap = leia.nextLine();
                    System.out.println("Resultado: " + Compactar(bitmap));
                    break;
                case 2:
                    System.out.print("Digite o código compactado: ");
                    String codigo = leia.nextLine();
                    System.out.println("Resultado: " + Descompactar(codigo));
                    break;
                case 3:
                    System.out.println("Programa encerrado.");
                    break;
                default: System.out.println("Opção inválida.");
            }
        } while (opcao != 3);
        leia.close();
    }
}