package Lista2;

import java.util.Scanner;

public class num16 {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        String[] unidades = {
                "", "um", "dois", "tres", "quatro",
                "cinco", "seis", "sete", "oito", "nove"
        };

        String[] especiais = {
                "dez", "onze", "doze", "treze", "quatorze",
                "quinze", "dezesseis", "dezessete",
                "dezoito", "dezenove"
        };

        String[] dezenas = {
                "", "", "vinte", "trinta", "quarenta",
                "cinquenta", "sessenta", "setenta",
                "oitenta", "noventa"
        };

        String[] centenas = {
                "", "cento", "duzentos", "trezentos",
                "quatrocentos", "quinhentos",
                "seiscentos", "setecentos",
                "oitocentos", "novecentos"
        };
        System.out.print("Digite um número entre 1 e 9999: ");
        int numero = leia.nextInt();
        if (numero == 100) {
            System.out.println("cem");
            return;
        }
        int milhar = numero / 1000;
        int centena = (numero % 1000) / 100;
        int dezena = (numero % 100) / 10;
        int unidade = numero % 10;
        String resultado = "";
        if (milhar > 0) {
            resultado += unidades[milhar] + " mil ";
        }
        if (centena > 0) {
            resultado += centenas[centena] + " ";
        }
        if (dezena == 1) {
            resultado += especiais[unidade];
        } else {
            if (dezena > 1) {
                resultado += dezenas[dezena] + " ";
            }
            if (unidade > 0) {
                resultado += unidades[unidade];
            }
        }
        System.out.println(resultado);
    }
}