package Lista5.num21;

import java.util.Locale;
import java.util.Scanner;

public class num21 {
    // 21) Crie uma classe ContaBancaria com métodos para depositar, sacar e verificar
    //     saldo, utilizando encapsulamento para proteger o saldo.

    // O saldo é private: o único jeito de mudar é por depositar() e sacar(), que têm
    // as regras (valor positivo, não sacar mais do que tem). Ninguém consegue
    // "furar" a conta fazendo conta.saldo = 1000000.

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.forLanguageTag("pt-BR")); // para digitar valores com virgula (ex: 10,50)

        ContaBancaria conta = new ContaBancaria("Luiz");

        int opcao;

        do {

            System.out.println("\nCONTA DE " + conta.getTitular());
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Verificar saldo");
            System.out.println("0 - Sair");

            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.print("Valor do deposito: ");
                    conta.depositar(sc.nextDouble());
                    break;

                case 2:
                    System.out.print("Valor do saque: ");
                    conta.sacar(sc.nextDouble());
                    break;

                case 3:
                    System.out.printf("Saldo atual: R$ %.2f%n", conta.verificarSaldo());
                    break;

                case 0:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);

        // conta.saldo = 1000000;   // ERRO: saldo has private access in ContaBancaria
    }
}

class ContaBancaria {

    private String titular;
    private double saldo; // protegido pelo encapsulamento

    public ContaBancaria(String titular) {
        this.titular = titular;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void depositar(double valor) {

        if (valor <= 0) {
            System.out.println("Deposito invalido: o valor deve ser positivo.");
            return;
        }

        saldo += valor;
        System.out.println("Deposito realizado.");
    }

    public boolean sacar(double valor) {

        if (valor <= 0) {
            System.out.println("Saque invalido: o valor deve ser positivo.");
            return false;
        }

        if (valor > saldo) {
            System.out.println("Saldo insuficiente.");
            return false;
        }

        saldo -= valor;
        System.out.println("Saque realizado.");
        return true;
    }

    public double verificarSaldo() {
        return saldo;
    }
}
