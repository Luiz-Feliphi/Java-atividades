package Lista1;

public class num36 {
    public static void main(String[] args) {
        int[] vetor = {8, 5, 2, 9, 1};
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        for (int n : vetor) {
            System.out.print(n + " ");
        }
    }
}
