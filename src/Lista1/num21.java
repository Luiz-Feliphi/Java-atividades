package Lista1;

public class num21 {
    public static void main(String[] args) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 3; i <= 20; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
