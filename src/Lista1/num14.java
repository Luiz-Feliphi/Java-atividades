package Lista1;

public class num14 {
    public static void main(String[] args) {
        for (int numero = 2; numero <= 1000; numero++) {
            boolean ePrimo = true;
            for (int i = 2; i < numero; i++) {
                if (numero % i == 0) {
                    ePrimo = false;
                    break;
                }
            }
            if (ePrimo) {
                System.out.println(numero);
            }
        }
    }
}
