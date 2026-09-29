package Lista3;

public class num3 {
    public static void main(String[] args) {

        String texto = "Programacao Java";
        String subtexto = "Java";

        int posicao = encontrarSubstring(texto, subtexto);

        if (posicao != -1) {
            System.out.println("Substring encontrada na posicao: " + posicao);
        } else {
            System.out.println("Substring nao encontrada.");
        }
    }
    private static int encontrarSubstring(String texto, String subtexto) {
            return texto.indexOf(subtexto);
    }
}
