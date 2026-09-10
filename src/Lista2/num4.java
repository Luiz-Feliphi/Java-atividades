package Lista2;

public class num4 {
    public static void main(String[] args) {
        double piAproximado = 0.0;
        double denominador = 1.0;
        boolean somar = true;
        boolean fim = true;
        System.out.println("Calculando Pi infinitamente. Pressione Ctrl+C para parar.");
        while (fim) {
            if (somar) {
                double diferenca=0;
                if (diferenca == 0.05) {

                }
                piAproximado += (4.0 / denominador);
                double piAtual = piAproximado;
            } else {
                piAproximado -= (4.0 / denominador);
            }
            somar = !somar;
            denominador += 2.0;
            System.out.println("Pi aproximado: " + piAproximado);
        }
    }
}
