package Lista1;

import java.util.Arrays;

public class num34 {
    public static void main(String[] args) {

        String palavra1 = "amor";
        String palavra2 = "roma";
        char[] p1 = palavra1.toCharArray();
        char[] p2 = palavra2.toCharArray();
        Arrays.sort(p1);
        Arrays.sort(p2);
        boolean anagrama = Arrays.equals(p1, p2);
        if (anagrama) {
            System.out.println("É anagrama");
        } else {
            System.out.println("Não é anagrama");
        }
    }
}
