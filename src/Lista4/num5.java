package Lista4;

import java.util.Scanner;

public class num5 {

//    5) Crie uma nova linguagem de programação! Defina 10 comandos. Esta linguagem deverá possuir
//    apenas os comandos definidos e expressões lógicas com parênteses. Leia um programa nesta
//    linguagem (o usuário digita tudo em uma linha) e informe se está correto sintaticamente.
//    Saída: quantidade de caracteres digitados, quantidade de comandos corretos, se os parênteses
//    foram todos fechados e se os operadores possuem o número correto de operandos.

//    A LINGUAGEM (chamei de "MiojoLang"):
//    - 10 comandos: inicio, fim, ler, mostrar, se, senao, enquanto, repetir, parar, continuar
//    - Operandos das expressões: verdadeiro, falso
//    - Conectivos lógicos: e, ou (binários, precisam de 2 operandos) e nao (unário, precisa de 1)
//    - Parênteses: ( e )
//    Exemplo de programa correto:
//      inicio se ( verdadeiro e ( nao falso ) ) mostrar fim

    static final String[] COMANDOS = {
            "inicio", "fim", "ler", "mostrar", "se",
            "senao", "enquanto", "repetir", "parar", "continuar"
    };
    static final String[] OPERANDOS = {"verdadeiro", "falso"};

    // Verifica se a palavra existe dentro de um vetor
    private static boolean contem(String[] vetor, String palavra) {

        for (String item : vetor) {
            if (item.equals(palavra)) {
                return true;
            }
        }

        return false;
    }

    private static boolean ehConectivoBinario(String t) {
        return t.equals("e") || t.equals("ou");
    }

    // Um "valor" termina em verdadeiro, falso ou ")"
    private static boolean terminaValor(String t) {
        return contem(OPERANDOS, t) || t.equals(")");
    }

    // Um "valor" começa com verdadeiro, falso, "(" ou "nao"
    private static boolean comecaValor(String t) {
        return contem(OPERANDOS, t) || t.equals("(") || t.equals("nao");
    }

    // Verifica se todas as palavras fazem parte da linguagem
    private static boolean palavrasValidas(String[] tokens) {

        boolean tudoCerto = true;

        for (String t : tokens) {

            boolean valida = contem(COMANDOS, t)
                    || contem(OPERANDOS, t)
                    || ehConectivoBinario(t)
                    || t.equals("nao")
                    || t.equals("(")
                    || t.equals(")");

            if (!valida) {
                System.out.println("Palavra invalida: " + t);
                tudoCerto = false;
            }
        }

        return tudoCerto;
    }

    private static int contarComandos(String[] tokens) {

        int total = 0;

        for (String t : tokens) {
            if (contem(COMANDOS, t)) {
                total++;
            }
        }

        return total;
    }

    // Parênteses: nunca pode fechar sem ter aberto, e no final tudo deve estar fechado
    private static boolean parentesesOk(String[] tokens) {

        int abertos = 0;

        for (String t : tokens) {

            if (t.equals("(")) {
                abertos++;
            } else if (t.equals(")")) {

                if (abertos == 0) {
                    return false; // fechou um parêntese que nunca foi aberto
                }
                abertos--;
            }
        }

        return abertos == 0;
    }

    // Operadores:
    //  - e / ou: precisa de um valor ANTES (verdadeiro, falso ou ")") e outro DEPOIS
    //  - nao: não pode ter valor antes dele, e precisa de um valor DEPOIS
    private static boolean operadoresOk(String[] tokens) {

        for (int i = 0; i < tokens.length; i++) {

            String t = tokens[i];
            boolean temAntes = i > 0;
            boolean temDepois = i < tokens.length - 1;

            if (ehConectivoBinario(t)) {

                if (!temAntes || !terminaValor(tokens[i - 1])) {
                    return false; // falta o operando da esquerda
                }
                if (!temDepois || !comecaValor(tokens[i + 1])) {
                    return false; // falta o operando da direita
                }

            } else if (t.equals("nao")) {

                if (temAntes && terminaValor(tokens[i - 1])) {
                    return false; // "verdadeiro nao" não faz sentido
                }
                if (!temDepois || !comecaValor(tokens[i + 1])) {
                    return false; // falta o operando
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=== MiojoLang ===");
        System.out.println("Comandos: inicio fim ler mostrar se senao enquanto repetir parar continuar");
        System.out.println("Expressoes: verdadeiro falso e ou nao ( )");
        System.out.println("Digite o programa em uma unica linha:");

        String linha = sc.nextLine();

        // coloca espaço em volta dos parênteses para separá-los das palavras: "(verdadeiro" -> "( verdadeiro"
        String preparada = linha.toLowerCase().replace("(", " ( ").replace(")", " ) ").trim();

        String[] tokens;
        if (preparada.isEmpty()) {
            tokens = new String[0];
        } else {
            tokens = preparada.split("\\s+");
        }

        boolean palavrasOk = palavrasValidas(tokens);
        boolean parenteses = parentesesOk(tokens);
        boolean operadores = operadoresOk(tokens);

        System.out.println("\n--- RESULTADO ---");
        System.out.println("Caracteres digitados: " + linha.length());
        System.out.println("Comandos corretos: " + contarComandos(tokens));
        System.out.println("Parenteses todos fechados: " + (parenteses ? "SIM" : "NAO"));
        System.out.println("Operadores com operandos corretos: " + (operadores ? "SIM" : "NAO"));

        if (palavrasOk && parenteses && operadores && tokens.length > 0) {
            System.out.println("Programa SINTATICAMENTE CORRETO!");
        } else {
            System.out.println("Programa com ERRO de sintaxe.");
        }
    }
}
