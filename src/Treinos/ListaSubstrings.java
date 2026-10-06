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