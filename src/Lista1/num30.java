package Lista1;

public class num30 {
    public static void main(String[] args) {
        double numero = 25;
        double chute = numero / 2.0;
        for (int i = 0; i < 10; i++) {
            chute = (chute + numero / chute) / 2;
        }
        System.out.println("Raiz aproximada = " + chute);
    }
}
