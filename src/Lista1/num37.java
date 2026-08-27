package Lista1;

public class num37 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3};
        int[] vetor2 = {5, 1, 9, 2, 3, 7};
        boolean contido = true;
        for (int i = 0; i < vetor1.length; i++) {
            boolean encontrado = false;
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                contido = false;
            }
        }
        System.out.println(contido);
    }
}
