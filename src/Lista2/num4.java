package Lista2;

public class num4 {
    public static void main(String[] args) {
       // double piAproximado = 0.0;
        double denominador = 1.0;
        boolean somar = true;
        boolean fim = true;
        double piAtual =0.0;
        double piAnterior=0.0;
        System.out.println("Calculando Pi infinitamente. Pressione Ctrl+C para parar.");
        while (fim) {
            if (somar) {
                piAtual += (4.0 / denominador);
                //piAproximado = piAtual;
            } else {
                piAtual -= (4.0 / denominador);
                piAnterior = piAtual;

            }
            somar = !somar;
            denominador += 2.0;
            System.out.println("Pi aproximado: " + piAtual);
            if (piAtual-piAnterior == 0.05){
                fim=!fim;
                System.out.print(piAtual-piAnterior);
            }

        }
    }
}
