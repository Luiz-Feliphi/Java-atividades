package Lista1;

import java.util.Scanner;

public class num7 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("limite da sequencia quadrada ");
        int limite = leia.nextInt();
        for (int i = 1; i <= limite ; i++) {
            System.out.println(i * i);
        }
    }
}
