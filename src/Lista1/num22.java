package Lista1;

public class num22 {
    public static void main(String[] args) {
        int numero = 12321;
        int original = numero;
        int invertido = 0;
        while (numero > 0) {

            int digito = numero % 10;
            invertido = invertido * 10 + digito;
            numero /= 10;
        }
        if (original == invertido) {
            System.out.println("É palíndromo");
        } else {
            System.out.println("Não é palíndromo");
        }
    }
}
