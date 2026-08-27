package Lista1;

public class num23 {
    public static void main(String[] args) {
        String texto = "banana";
        for (int i = 0; i < texto.length(); i++) {
            char atual = texto.charAt(i);
            int contador = 0;

            for (int j = 0; j < texto.length(); j++) {
                if (atual == texto.charAt(j)) {
                    contador++;
                }
            }
            boolean jaMostrado = false;
            for (int k = 0; k < i; k++) {

                if (atual == texto.charAt(k)) {
                    jaMostrado = true;
                    break;
                }
            }
            if (!jaMostrado) {
                System.out.println(atual + " = " + contador);
            }
        }
    }
}
