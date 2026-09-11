package Treinos;

import java.util.Scanner;

public class ConverteMes {
    public static void main(String[] args) {
        int mes;
        Scanner leia = new Scanner(System.in);
        String[] meses={"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        System.out.println("Informe o numero do mês que você quer");
        mes = leia.nextInt();
        System.out.println(meses[mes-1]);
    }
}
