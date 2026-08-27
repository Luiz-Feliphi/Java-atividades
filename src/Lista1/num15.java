package Lista1;

import java.util.Scanner;

public class num15 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Insira a palavra para inverter");
        String palavraINV = leia.nextLine();
        String inversor = "";
        for (int i = palavraINV.length() - 1; i >= 0; i--) {
            inversor = String.valueOf(palavraINV.charAt(i));
            System.out.print(inversor);
        }
        System.out.println();
    }
}
