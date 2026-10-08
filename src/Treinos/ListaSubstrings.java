package Treinos;

import java.util.Scanner;

public class ListaSubstrings {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        String palavra = read.next();
        for (int i = palavra.length(); i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                String pal = palavra.substring(j, i);
                if (pal!="")
                    System.out.println(pal);
            }
        }
    }
}
import java.util.Scanner;

public class Miojo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        long t = read.nextLong();
        long a = read.nextLong();
        long b = read.nextLong();

        long melhor = Long.MAX_VALUE;
        for (long p = 0; p <= b; p++) {
            long tempoA = p * a;
            // caso 1: o evento de A vem depois do de B
            if (tempoA >= t && (tempoA - t) % b == 0) {
                melhor = Math.min(melhor, tempoA);
            }
            // caso 2: o evento de B vem depois do de A
            if ((tempoA + t) % b == 0) {
                melhor = Math.min(melhor, tempoA + t);
            }
        }
        System.out.println(melhor);
    }
}