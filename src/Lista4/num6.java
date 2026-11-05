package Lista4;

import java.util.HashSet;
import java.util.Scanner;

public class num6 {

//    6) Dado um conjunto de números inteiros com até 8 dígitos, verifique se são felizes ou infelizes.
//    Número feliz: ao somar repetidamente os quadrados dos dígitos, o resultado final é 1.
//    Exemplo: 19 -> 1²+9² = 82 -> 8²+2² = 68 -> 6²+8² = 100 -> 1²+0²+0² = 1 (feliz)
//    Se o processo cair num ciclo que não inclui o 1, o número é infeliz.

//    COMO DETECTAR O CICLO:
//    Guardo num HashSet todos os números que já apareceram na sequência. Se o número da
//    vez já está no conjunto, é porque entramos num ciclo sem passar pelo 1 -> infeliz.

    // Soma dos quadrados dos dígitos: 82 -> 8*8 + 2*2 = 68
    private static int somaQuadrados(int numero) {

        int soma = 0;

        while (numero > 0) {
            int digito = numero % 10;
            soma += digito * digito;
            numero /= 10;
        }

        return soma;
    }

    private static boolean ehFeliz(int numero) {

        HashSet<Integer> jaVistos = new HashSet<>();

        // continua até chegar em 1 (feliz) ou repetir um número (ciclo = infeliz)
        while (numero != 1 && !jaVistos.contains(numero)) {
            jaVistos.add(numero);
            numero = somaQuadrados(numero);
        }

        return numero == 1;
    }

    // Mostra o passo a passo da sequência (igual ao exemplo do 19)
    private static void mostrarSequencia(int numero) {

        HashSet<Integer> jaVistos = new HashSet<>();

        System.out.print(numero);

        while (numero != 1 && !jaVistos.contains(numero)) {
            jaVistos.add(numero);
            numero = somaQuadrados(numero);
            System.out.print(" -> " + numero);
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos numeros deseja verificar? ");
        int quantidade = sc.nextInt();

        for (int i = 1; i <= quantidade; i++) {

            int numero;

            do {
                System.out.print("Numero " + i + " (ate 8 digitos): ");
                numero = sc.nextInt();
            } while (numero < 1 || numero > 99999999); // natural com no máximo 8 dígitos

            mostrarSequencia(numero);

            if (ehFeliz(numero)) {
                System.out.println(numero + " e FELIZ\n");
            } else {
                System.out.println(numero + " e INFELIZ\n");
            }
        }
    }
}
