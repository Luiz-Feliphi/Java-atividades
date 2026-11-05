package Lista4;

import java.util.Scanner;

public class num1 {
    private static void preencherMatriz(int[][] matriz, Scanner sc) {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }
    private static void imprimirMatriz(int[][] matriz) {

        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.print(valor + "\t");
            }
            System.out.println();
        }
    }
    private static void imprimirZigZag(int[][] matriz) {

        // Zig-zag da figura: percorre as diagonais (onde i + j = soma) alternando o sentido.
        // soma par  -> sobe (de baixo para cima)
        // soma impar -> desce (de cima para baixo)
        System.out.println("\nMatriz em Zig-Zag:");

        int N = matriz.length;
        int M = matriz[0].length;

        for (int soma = 0; soma <= N + M - 2; soma++) {

            if (soma % 2 == 0) {

                // sobe: a linha vai diminuindo
                for (int i = Math.min(soma, N - 1); i >= 0 && soma - i < M; i--) {
                    System.out.print(matriz[i][soma - i] + " ");
                }

            } else {

                // desce: a linha vai aumentando
                for (int i = Math.max(0, soma - (M - 1)); i < N && i <= soma; i++) {
                    System.out.print(matriz[i][soma - i] + " ");
                }
            }
        }

        System.out.println();
    }
    private static int maiorElemento(int[][] matriz) {

        int maior = matriz[0][0];

        for (int[] linha : matriz) {
            for (int valor : linha) {

                if (valor > maior) {
                    maior = valor;
                }
            }
        }

        return maior;
    }
    private static void buscarElemento(int[][] matriz, int procurado) {

        boolean encontrou = false;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {

                if (matriz[i][j] == procurado) {

                    System.out.println("Encontrado em [" + i + "][" + j + "]");

                    encontrou = true;
                }
            }
        }

        if (!encontrou) {
            System.out.println("Elemento nao encontrado.");
        }
    }
    private static void imprimirDiagonais(int[][] matriz) {

        int N = matriz.length;
        int M = matriz[0].length;
        int menor = Math.min(N, M);

        System.out.print("Diagonal principal: ");

        for (int i = 0; i < menor; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        System.out.println();

        // diagonal secundaria: começa no canto superior direito e vai para baixo/esquerda
        System.out.print("Diagonal secundaria: ");

        for (int i = 0; i < menor; i++) {
            System.out.print(matriz[i][M - 1 - i] + " ");
        }

        System.out.println();
    }
    private static void somarColunas(int[][] matriz) {

        for (int j = 0; j < matriz[0].length; j++) {

            int soma = 0;

            for (int i = 0; i < matriz.length; i++) {
                soma += matriz[i][j];
            }

            System.out.println("Coluna " + j + ": " + soma);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Numero de linhas: ");
        int N = sc.nextInt();

        System.out.print("Numero de colunas: ");
        int M = sc.nextInt();

        int[][] matriz = new int[N][M];

        preencherMatriz(matriz, sc);

        imprimirZigZag(matriz);

        int opcao;

        do {

            System.out.println("\nMENU");
            System.out.println("1 - Exibir maior");
            System.out.println("2 - Buscar elemento");
            System.out.println("3 - Imprimir diagonais");
            System.out.println("4 - Somar colunas");
            System.out.println("5 - Imprimir matriz");
            System.out.println("0 - Sair");

            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println(
                            "Maior elemento: " +
                                    maiorElemento(matriz));
                    break;

                case 2:

                    System.out.print("Elemento a buscar: ");
                    int elemento = sc.nextInt();

                    buscarElemento(matriz, elemento);
                    break;

                case 3:
                    imprimirDiagonais(matriz);
                    break;

                case 4:
                    somarColunas(matriz);
                    break;

                case 5:
                    imprimirMatriz(matriz);
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
    }
}