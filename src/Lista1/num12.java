package Lista1;

import java.util.Scanner;

public class num12 {
    public static void main(String[] args) {
        //Calcule o fatorial de um número informado pelo usuário.
        Scanner leia = new Scanner(System.in);
        System.out.print("Fatorial de :");
        int NumFatorial = leia.nextInt();
        int Facto=1;
        for (int i = NumFatorial; i >= 0 ; i--) {
            if (i==0)break;
            Facto *= i;
        }
        System.out.print("Fatorial de !"+NumFatorial+" é "+Facto+"\n");
    }
}
