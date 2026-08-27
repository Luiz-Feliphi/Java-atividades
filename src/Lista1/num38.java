package Lista1;

public class num38 {
    public static void main(String[] args) {
        int[] vetor1 = {1, 2, 3, 4};
        int[] vetor2 = {3, 4, 5, 6};
        for (int i = 0; i < vetor1.length; i++) {
            for (int j = 0; j < vetor2.length; j++) {
                if (vetor1[i] == vetor2[j]) {
                    System.out.println(vetor1[i]);
                }
            }
        }
    }
}
