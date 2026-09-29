package Lista3;

public class num5 {
    //a
    private static int dobrarNumero(int num) {
        num = num * 2;

        System.out.println("Dentro do metodo: " + num);
        return num;
    }

    public static void main(String[] args) {

        int num = 10;

        num = dobrarNumero(num);

        System.out.println("Valor retornado: " + num);
    }

}
