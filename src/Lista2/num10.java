package Lista2;

import java.util.Scanner;

public class num10 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite o valor do saque: ");
        int valor = leia.nextInt();
        int cem = valor / 100;
        valor %= 100;
        int cinquenta = valor / 50;
        valor %= 50;
        int vinte = valor / 20;
        valor %= 20;
        int dez = valor / 10;
        valor %= 10;
        int cinco = valor / 5;
        valor %= 5;
        int dois = valor / 2;
        valor %= 2;
        int um = valor;
        System.out.println("100 = " + cem);
        System.out.println("50 = " + cinquenta);
        System.out.println("20 = " + vinte);
        System.out.println("10 = " + dez);
        System.out.println("5 = " + cinco);
        System.out.println("2 = " + dois);
        System.out.println("1 = " + um);
    }
}