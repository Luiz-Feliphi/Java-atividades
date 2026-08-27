package Lista1;

public class num32 {
    public static void main(String[] args) {
        String texto = "abc";
        int rotacao = 3;
        String resultado = "";
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            letra = (char) (letra + rotacao);
            resultado += letra;
        }
        System.out.println(resultado);
    }
}
