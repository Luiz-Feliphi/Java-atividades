package Lista1;

import java.util.Scanner;

public class num17 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String opcao;
        do {
            System.out.print("Digite  "+"SAIR"+" para fechar o laço: ");
            opcao = leia.next();
        }while (!opcao.equals("SAIR"));
    }
}
