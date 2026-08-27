package Lista1;

import java.util.*;

public class num18 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int RandomNumb = (int) (Math.random()*50);
        double tolerancia = 10.0;
        int NumEsco=0;
        //System.out.print(RandomNumb);
        while (NumEsco != RandomNumb){
            System.out.print("Adivinhe o numero: ");
            NumEsco = leia.nextInt();
            double diferen = Math.abs(RandomNumb - NumEsco);
            if (diferen <= tolerancia) {
                System.out.println("O número está próximo!");
            } else {
                System.out.println("O número está longe.");
            }
        }
        System.out.println("ISSO MESMO SAFADO! O numero correto é "+RandomNumb);
    }
}
