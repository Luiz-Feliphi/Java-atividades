package Lista1;

import java.util.Scanner;

public class num8 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Qual a tabuada desejada: ");
        int TabuadaUser = leia.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(i+"X"+TabuadaUser+" = "+(TabuadaUser*i));
        }
    }
}
