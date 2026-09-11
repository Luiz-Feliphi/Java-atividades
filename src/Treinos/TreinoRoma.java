package Treinos;

import java.util.Scanner;

public class TreinoRoma {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Insira a palavra");
        String PalavraAnagrama = leia.next();
        int ResultFactorText = FactorText(PalavraAnagrama);
        // abc
        System.out.println(ResultFactorText);
    }

    public static int FactorText(String palavra) {
        int result = 1;
        for (int i = 1; i <= palavra.length() ; i++) {
            result *=i;
        }
        return result;
    }
}
