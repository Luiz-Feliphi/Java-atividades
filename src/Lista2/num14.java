package Lista2;

import java.util.Scanner;

public class num14 {

    private static void gerarAnagrama(String inicio, String restante) {
        if (restante.length() == 0) {
            System.out.println(inicio);
            return;
        }
        for (int i = 0; i < restante.length(); i++) {
            char letra = restante.charAt(i);
            String novoInicio = inicio + letra;
            String novoRestante = restante.substring(0, i) + restante.substring(i + 1);
            gerarAnagrama(novoInicio, novoRestante);
        }
    }

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite uma palavra: ");
        String palavra = leia.nextLine();
        gerarAnagrama("", palavra);
    }
}