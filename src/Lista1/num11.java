package Lista1;

import java.util.Scanner;

public class num11 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.println("Total de Numeros ");
        int total = leia.nextInt();
        int num,valores = 0;
        for (int i = 1; i <=total; i++) {
            System.out.print("Numero ");
            num = leia.nextInt();
            valores += num;
            System.out.println();
        }
        System.out.printf("Media = "+valores/total+"\n");
    }
}
