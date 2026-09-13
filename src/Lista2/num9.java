package Lista2;

import java.util.Scanner;

public class num9 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um texto: ");
        String texto = leia.nextLine();
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra >= 'a' && letra <= 'z') {
                letra = (char) (letra - 32);
            }
            resultado += letra;
        }
        System.out.println(resultado);
    }
}