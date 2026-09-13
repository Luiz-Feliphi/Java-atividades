package Lista2;

import java.util.Scanner;

public class num6 {
    //6. Implemente um programa que encontre o segundo maior número de uma lista.
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Tamanho da Lista: ");
        int ListSize = leia.nextInt();
        int[] ListNumbers = new int[ListSize];
        int maior=0;
        int segundomaior=0;

        for (int i = 0; i < ListSize; i++) {
            //fazer duas verificações
            System.out.println("Qual o numero de agora");
            ListNumbers[i] = leia.nextInt();
            if(ListNumbers[i]>maior){
                segundomaior = maior;
                maior = ListNumbers[i];
            }
        }
        System.out.println("Maior numero é "+maior+"\nO Segundo Maior numero é: "+segundomaior);


    }
}
