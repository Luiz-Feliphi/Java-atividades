package Lista2;

import java.util.Scanner;

public class num1 {
    Scanner leia = new Scanner(System.in);
    public void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        System.out.print("Digite um numero por inteiro exemplar 1234: ");
        String numTexto = leia.next();
        boolean erro=false;
        do{
            try {
                int numero = Integer.parseInt(numTexto);
                int Result = SeparaNumero(numTexto);
                System.out.println(Result);
            } catch (NumberFormatException e) {
                System.out.println("Apenas Numeros!");
                erro=true;
            }
        }while (erro);
    }
    private static int SeparaNumero(String NumTexto){
        int Result =0;
        for (int i =0; i< NumTexto.length() ; i++) {
            int NumOlhado = NumTexto.charAt(i) - '0';
            Result += NumOlhado;
        }
        return Result;
    }
}
