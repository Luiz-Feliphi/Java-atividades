package Treinos;

import java.util.Scanner;

public class ListaSubstrings {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        String palavra = read.next();
        for (int i = palavra.length(); i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                String pal = palavra.substring(j, i);
                System.out.println(pal);
            }
        }
    }
}
