package Lista4;

import java.util.Scanner;

public class num7 {

//    7) Balões na maratona. O teto do salão é formado por segmentos de reta (visto de lado).
//    - Balão que toca um segmento HORIZONTAL fica preso nele.
//    - Balão que toca um segmento INCLINADO desliza até o ponto mais alto do segmento e escapa,
//      podendo sair do salão ou tocar em outros segmentos.
//    - Não há pontos em comum entre os segmentos.
//    Entrada: N e C; N linhas com X1 Y1 X2 Y2; C linhas com o X onde o balão é solto (X, 0).
//    Saída: se escapar, imprime só o X por onde escapou; se ficar preso, imprime "X Y".

//    COMO PENSAR NO PROBLEMA:
//    Simulo o balão subindo. Em cada passo:
//      1. Procuro, entre os segmentos que "cobrem" o x atual, o mais BAIXO que esteja
//         ACIMA da altura atual do balão (é o primeiro que ele vai tocar).
//      2. Se não existir nenhum, o balão escapa pelo x atual.
//      3. Se for horizontal, o balão fica preso em (x, y do segmento).
//      4. Se for inclinado, o balão vai para a extremidade mais alta do segmento
//         (novo x e novo y) e repete o processo.
//    Como o balão sempre sobe (cada novo ponto é mais alto), o loop sempre termina.

    static final double ERRO = 1e-9; // tolerância para comparar números decimais

    // Altura do segmento i na posição x (interpolação linear entre os dois extremos)
    private static double alturaNoX(int[][] seg, int i, int x) {

        int x1 = seg[i][0];
        int y1 = seg[i][1];
        int x2 = seg[i][2];
        int y2 = seg[i][3];

        if (x1 == x2) {
            return Math.min(y1, y2); // segmento vertical: o balão toca na parte de baixo
        }

        return y1 + (double) (y2 - y1) * (x - x1) / (x2 - x1);
    }

    // O segmento cobre o x se x estiver entre os dois extremos (inclusive)
    private static boolean cobre(int[][] seg, int i, int x) {

        int menorX = Math.min(seg[i][0], seg[i][2]);
        int maiorX = Math.max(seg[i][0], seg[i][2]);

        return x >= menorX && x <= maiorX;
    }

    // Simula um balão solto em (x, 0) e imprime o resultado
    private static void soltarBalao(int[][] seg, int n, int x) {

        double yAtual = 0;

        while (true) {

            int escolhido = -1;
            double menorAltura = Double.MAX_VALUE;

            // procura o primeiro segmento que o balão toca
            for (int i = 0; i < n; i++) {

                if (cobre(seg, i, x)) {

                    double altura = alturaNoX(seg, i, x);

                    if (altura > yAtual + ERRO && altura < menorAltura) {
                        menorAltura = altura;
                        escolhido = i;
                    }
                }
            }

            // nenhum segmento acima: escapou
            if (escolhido == -1) {
                System.out.println(x);
                return;
            }

            // horizontal: fica preso
            if (seg[escolhido][1] == seg[escolhido][3]) {
                System.out.println(x + " " + seg[escolhido][1]);
                return;
            }

            // inclinado: desliza até a extremidade mais alta e continua subindo dali
            if (seg[escolhido][1] > seg[escolhido][3]) {
                x = seg[escolhido][0];
                yAtual = seg[escolhido][1];
            } else {
                x = seg[escolhido][2];
                yAtual = seg[escolhido][3];
            }
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt(); // quantidade de segmentos
        int c = sc.nextInt(); // quantidade de consultas

        // cada linha: x1, y1, x2, y2
        int[][] seg = new int[n][4];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 4; j++) {
                seg[i][j] = sc.nextInt();
            }
        }

        for (int k = 0; k < c; k++) {
            int x = sc.nextInt();
            soltarBalao(seg, n, x);
        }
    }
}
