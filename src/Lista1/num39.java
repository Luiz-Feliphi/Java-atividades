package Lista1;

public class num39 {
    public static void main(String[] args) {
        int[] vetor = {7, 1, 5, 4, 2};
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }
        double mediana;
        if (vetor.length % 2 == 0) {
            mediana = (vetor[vetor.length / 2] + vetor[vetor.length / 2 - 1]) / 2.0;
        } else {
            mediana = vetor[vetor.length / 2];
        }
        System.out.println("Mediana = " + mediana);
    }
}
