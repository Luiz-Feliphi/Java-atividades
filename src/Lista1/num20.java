package Lista1;

public class num20 {
    public static void main(String[] args) {

        int[] num = {15, 8, 32, 4, 19, 27};

        int menor = num[0];
        int maior = num[0];
        for (int i = 1; i < num.length; i++) {

            if (num[i] < menor) {
                menor = num[i];
            }

            if (num[i] > maior) {
                maior = num[i];
            }
        }
        System.out.println("Menor: " + menor);
        System.out.println("Maior: " + maior);
    }
}
