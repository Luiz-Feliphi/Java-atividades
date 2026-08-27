package Lista1;

import java.util.Scanner;
import java.util.Random;

public class num19 {
    public class Main {
        public static void main(String[] args) {
            Random random = new Random();
            int[] contagem = new int[6];
            for (int i = 0; i < 100; i++) {
                int resultado = random.nextInt(6) + 1;
                contagem[resultado - 1]++;
            }
            System.out.println("Resultado dos 100 lançamentos:");
            for (int i = 0; i < contagem.length; i++) {
                System.out.println("Face " + (i + 1) + ": " + contagem[i] + " vezes");
            }
        }
    }
}
