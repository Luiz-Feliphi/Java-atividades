package Lista4;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
//        3) Jorge é um fanático por miojos... (enunciado completo na prova)
//        Entrada: três inteiros: tempo do miojo (T), ampulheta 1 (A) e ampulheta 2 (B).
//        Saída: o tempo mínimo para o miojo ficar pronto.
//        Restrições: 0 <= T <= 10000, e as ampulhetas são sempre maiores que T (até 40000).

//        COMO PENSAR NO PROBLEMA:
//        Jorge sempre vira a ampulheta no instante em que ela acaba. Então a ampulheta A
//        "apita" nos minutos A, 2A, 3A, ... e a B nos minutos B, 2B, 3B, ...
//        O miojo só pode ser colocado e retirado quando alguma ampulheta apita, e ele
//        precisa ficar exatamente T minutos na água. Ou seja, procuramos dois apitos
//        (um de cada ampulheta) cuja diferença seja T:
//
//              | i*A - j*B | = T        (i e j são quantas vezes cada uma já acabou)
//
//        O miojo fica pronto no apito mais tardio, que é max(i*A, j*B). Queremos o menor.
//        Exemplo da prova: T=3, A=5, B=7 -> i=2 e j=1 -> 10 - 7 = 3 -> pronto no minuto 10.
//
//        Para cada i testamos as duas possibilidades:
//          1) j*B = i*A + T  -> o miojo sai no apito da B, tempo = i*A + T
//          2) j*B = i*A - T  -> o miojo sai no apito da A, tempo = i*A
//        O resto de (i*A) por B se repete depois de B voltas, então basta testar i de 1 até B.

        Scanner leia = new Scanner(System.in);
        System.out.println("Tempo do miojo | Primeira Ampulheta | Segunda Ampulheta");
        int tempoMiojo = leia.nextInt();
        int priAmpulheta = leia.nextInt();
        int segunAmpulheta = leia.nextInt();

        // long porque i*A pode passar do limite de int (40000 * 40000)
        long menorTempo = Long.MAX_VALUE;

        if (tempoMiojo == 0) {
            menorTempo = 0; // miojo que não precisa cozinhar já está pronto
        } else {
            for (long i = 1; i <= segunAmpulheta; i++) {

                long apitoA = i * priAmpulheta;

                // caso 1: o miojo sai quando a segunda ampulheta apitar
                long alvo1 = apitoA + tempoMiojo;
                if (alvo1 % segunAmpulheta == 0 && alvo1 < menorTempo) {
                    menorTempo = alvo1;
                }

                // caso 2: o miojo sai quando a primeira ampulheta apitar
                long alvo2 = apitoA - tempoMiojo;
                if (alvo2 > 0 && alvo2 % segunAmpulheta == 0 && apitoA < menorTempo) {
                    menorTempo = apitoA;
                }
            }
        }

        System.out.print("Tempo minimo para o preparo do miojo: " + menorTempo + "\n"); //exemplo saida 10 minutos para ficar tudo pronto
    }
}
