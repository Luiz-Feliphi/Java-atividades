package Lista1;

public class num24 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 2, 1};
        boolean simetrico = true;
        for (int i = 0; i < vetor.length / 2; i++) {

            if (vetor[i] != vetor[vetor.length - 1 - i]) {
                simetrico = false;
                break;
            }
        }
        if (simetrico) {
            System.out.println("Vetor simétrico");
        } else {
            System.out.println("Vetor não simétrico");
        }
    }
}
