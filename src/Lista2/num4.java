package Lista2;

import java.util.Scanner;

public class num4 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Valor da sua sequencia: ");
        double SequenciaNum = leia.nextDouble();
        double ResultSequenciaNum = CalculoDeSequencia(SequenciaNum);
        System.out.println("Resultado da sequencia dos 40 primeiros numeros: "+ResultSequenciaNum);
    }

    private static double CalculoDeSequencia(double A) {
        double denominador=3;
        /*  ^^
            ||
            havia antes colocado como int a variavel, e o resultado dava infinito por algum caralho de motivo, mas parece que com double
            ele funciona pra mim isso não faz sentido sendo que ele é uma variavel int e sua unica função é se dobra de valor pra formula.
        */
        double soma=0;
        for (int i = 1; i <= 40; i++) {
            double ResultSequencia = (7*A)/denominador;
            soma += ResultSequencia;
            denominador *=2;//<= por algum motivo posicionar ele na parte de baixo faz diferença
        }
        //sobre duvidas pergunta cristiane
        return soma;
    }
}
