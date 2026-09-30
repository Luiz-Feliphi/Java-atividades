package Treinos;

import java.util.Scanner;

public class ListaSubstrings {
    public static void main(String[] args) {
        //Faça um programa que receba uma palavra e retorna todas as substrings dessa palavra
        Scanner leia = new Scanner(System.in);
        System.out.print("Insira uma palavra: ");
        String palavra = leia.nextLine();
        for (int i = palavra.length(); i>=0 ; --i) {
            System.out.printf(palavra.substring(0,i)+"\n");
            for (int j = 0; j < palavra.length(); j++) {
                System.out.printf(palavra.substring(0,j)+"\n");
            }
        }
//        for (int i = 0; i < palavra.length() ; i++) {
//            System.out.printf(palavra.substring(i,0)+"\n");
//        }
    }
}
