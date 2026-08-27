package Lista1;

public class num4 {
    public static void main(String[] args) {
        int numInit = 1;
        int numResult = 1;
        for (int i = 2; i <=10 ; i++) {
            numResult = numInit * i;
            System.out.println(numInit+"X"+i+"="+ numResult);
            numInit = numResult;
        }
    }
}
