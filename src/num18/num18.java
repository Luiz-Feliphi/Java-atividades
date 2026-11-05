package Lista5.num18;

import Lista5.num18.outro.ContaPoupanca;

public class num18 {
    // 18) Crie métodos na classe ContaBancaria com diferentes níveis de visibilidade e
    //     observe como eles são acessíveis a partir de outras classes.

    // Esta classe está no MESMO pacote de ContaBancaria (Lista5.num18).
    // A classe ContaPoupanca está em OUTRO pacote (Lista5.num18.outro) e é subclasse.

    public static void main(String[] args) {

        ContaBancaria conta = new ContaBancaria("Maria", "123-4");

        System.out.println("=== Classe do MESMO pacote ===");

        // public: acessível
        conta.depositar(1000);
        System.out.println("Saldo: " + conta.getSaldo());
        System.out.println("Numero: " + conta.numero);

        // protected: acessível porque estamos no mesmo pacote
        conta.registrarOperacao("chamada direta do main");
        System.out.println("Titular: " + conta.titular);

        // padrão (package-private): acessível porque estamos no mesmo pacote
        System.out.println("Agencia: " + conta.agencia);
        System.out.println("Taxa de 100: " + conta.calcularTaxa(100));

        // private: NÃO acessível fora da classe
        // conta.valorValido(50);   // ERRO: valorValido(double) has private access
        // conta.saldo = 999999;    // ERRO: saldo has private access

        System.out.println("\n=== Subclasse em OUTRO pacote ===");
        ContaPoupanca poupanca = new ContaPoupanca("Joao", "555-0");
        poupanca.depositar(500);
        poupanca.mostrarAcessos();
    }
}
