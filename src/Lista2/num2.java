package Lista2;

import java.util.Scanner;

public class num2 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Numero que deseja saber a sequencia");
        int sequencia = leia.nextInt();
        int ResultSequencia = CalculoSequencia(sequencia);
        System.out.println("Resultado final: "+ResultSequencia);
    }
    private static int CalculoSequencia(int NumRecebi) {
       int somar=0;
        for (int i = 0; i <= NumRecebi ; i++) {
            somar +=i;
        }
        return somar;
    }
}
