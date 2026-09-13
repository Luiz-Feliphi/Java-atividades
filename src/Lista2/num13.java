package Lista2;

import java.util.Scanner;

public class num13 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = leia.nextLine();
        String[] palavras = frase.split(" ");
        for (String palavra : palavras) {
            char primeira = Character.toLowerCase(palavra.charAt(0));
            if (primeira == 'a' || primeira == 'e' || primeira == 'i' || primeira == 'o' || primeira == 'u') {
                System.out.println(palavra);
            }
        }
    }
}