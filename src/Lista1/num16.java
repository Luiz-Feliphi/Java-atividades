package Lista1;

import java.util.Scanner;

public class num16 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        char vocais[] = {'A','a','O','o','E','e','I','i','U','u'};
        System.out.println("Palavra: ");
        String palavra = leia.nextLine();
        int vogalQtn =0;
        for (int i = 0; i <= palavra.length(); i++) {
            for (int j = 0; j <= vocais.length; j++) {
                if (palavra.charAt(i) == vocais[j]) vogalQtn++;
            }
        }
        System.out.println("Quantidade de vogais: "+vogalQtn);
    }
}
