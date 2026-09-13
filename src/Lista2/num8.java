package Lista2;

import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um número binário: ");
        String binario = leia.nextLine();
        int decimal = 0;
        int potencia = 0;
        for (int i = binario.length() - 1; i >= 0; i--) {
            if (binario.charAt(i) == '1') {
                decimal += (int) Math.pow(2, potencia);
            }
            potencia++;
        }
        System.out.println("Decimal: " + decimal);
    }
}