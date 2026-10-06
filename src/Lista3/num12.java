package Lista3;

import java.util.Scanner;

public class num12 {

    private static void imprimirTabuleiro(char[][] tabuleiro) {

        System.out.println();

        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                System.out.print(tabuleiro[i][j]);

                if (j < 2) {
                    System.out.print(" | ");
                }
            }

            System.out.println();

            if (i < 2) {
                System.out.println("--+---+--");
            }
        }

        System.out.println();
    }

    private static boolean verificarVencedor(char[][] t, char jogador) {

        for (int i = 0; i < 3; i++) {

            if (t[i][0] == jogador && t[i][1] == jogador && t[i][2] == jogador) {
                return true;
            }

            if (t[0][i] == jogador && t[1][i] == jogador && t[2][i] == jogador) {
                return true;
            }
        }

        if (t[0][0] == jogador && t[1][1] == jogador && t[2][2] == jogador) {
            return true;
        }

        if (t[0][2] == jogador && t[1][1] == jogador && t[2][0] == jogador) {
            return true;
        }

        return false;
    }

    private static boolean tabuleiroCheio(char[][] tabuleiro) {

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tabuleiro[i][j] == '-') {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        char[][] tabuleiro = {
                {'-', '-', '-'},
                {'-', '-', '-'},
                {'-', '-', '-'}
        };

        char jogador = 'X';

        while (true) {
            imprimirTabuleiro(tabuleiro);

            System.out.println("Jogador " + jogador);
            System.out.print("Linha (0 a 2): ");
            int linha = sc.nextInt();

            System.out.print("Coluna (0 a 2): ");
            int coluna = sc.nextInt();

            if (linha < 0 || linha > 2 || coluna < 0 || coluna > 2) {
                System.out.println("Posicao invalida!");
                continue;
            }

            if (tabuleiro[linha][coluna] != '-') {
                System.out.println("Posicao ocupada!");
                continue;
            }

            tabuleiro[linha][coluna] = jogador;

            if (verificarVencedor(tabuleiro, jogador)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Jogador " + jogador + " venceu!");
                break;
            }

            if (tabuleiroCheio(tabuleiro)) {
                imprimirTabuleiro(tabuleiro);
                System.out.println("Empate!");
                break;
            }

            if (jogador == 'X') {
                jogador = 'O';
            } else {
                jogador = 'X';
            }
        }

        sc.close();
    }
}