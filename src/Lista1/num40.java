package Lista1;

public class num40 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 2, 3, 4, 4, 5};
        for (int i = 0; i < vetor.length; i++) {
            boolean duplicado = false;
            for (int j = 0; j < i; j++) {
                if (vetor[i] == vetor[j]) {
                    duplicado = true;
                    break;
                }
            }
            if (!duplicado) {
                System.out.print(vetor[i] + " ");
            }
        }
    }
}
