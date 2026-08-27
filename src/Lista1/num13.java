package Lista1;

import java.util.Scanner;

public class num13 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int numero;
        boolean eprimo = true;
        do {
            System.out.println("Numero primo maior que 1: ");
            numero = leia.nextInt();
        }while (numero<=1);
        for (int i = 2; i < numero ; i++) {
            if (numero%i==0){
                eprimo=false;
                break;
            }
        }
        if (eprimo)
            System.out.println("Numero primo");
        else
            System.out.println("Numero não primo");
    }
}
