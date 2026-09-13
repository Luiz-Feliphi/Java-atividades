package Lista2;

import java.util.Scanner;

public class num15 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] produto = new String[100];
        int[] quantidade = new int[100];
        int totalProdutos = 0;
        int opcao;
        do {
            System.out.println("\n1-Adicionar");
            System.out.println("2-Remover");
            System.out.println("3-Consultar");
            System.out.println("4-Sair");
            System.out.print("Opção: ");
            opcao = leia.nextInt();
            leia.nextLine();
            switch (opcao) {
                case 1:
                    System.out.print("Nome do produto: ");
                    produto[totalProdutos] = leia.nextLine();
                    System.out.print("Quantidade: ");
                    quantidade[totalProdutos] = leia.nextInt();
                    totalProdutos++;
                    break;
                case 2:
                    System.out.print("Produto a remover: ");
                    String remover = leia.nextLine();
                    for (int i = 0; i < totalProdutos; i++) {
                        if (produto[i].equalsIgnoreCase(remover)) {
                            for (int j = i; j < totalProdutos - 1; j++) {
                                produto[j] = produto[j + 1];
                                quantidade[j] = quantidade[j + 1];
                            }
                            totalProdutos--;
                            System.out.println("Removido.");
                            break;
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nEstoque:");
                    for (int i = 0; i < totalProdutos; i++) {
                        System.out.println(produto[i] + " - " + quantidade[i]);
                    }
                    break;
                case 4:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        leia.close();
    }
}