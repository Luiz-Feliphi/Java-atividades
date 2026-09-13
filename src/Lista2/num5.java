package Lista2;

public class num5 {
    public static void main(String[] args) {
        double denominador = 1.0;
        boolean somar = true;
        double piAtual = 0.0;
        double piAnterior;
        double diferenca;
        do {
            piAnterior = piAtual; // guarda o valor anterior
            if (somar) {
                piAtual += (4.0 / denominador);
            } else {
                piAtual -= (4.0 / denominador);
            }
            somar = !somar;
            denominador += 2.0;
            diferenca = Math.abs(piAtual - piAnterior);
            System.out.println("Pi aproximado: " + piAtual);
            System.out.println("Diferença: " + diferenca);

        } while (diferenca > 0.00000000005);

        System.out.println("\nResultado final: " + piAtual);
    }
}