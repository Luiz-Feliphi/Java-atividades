package Lista5.num18.outro;

import Lista5.num18.ContaBancaria;

// Subclasse em OUTRO pacote: só enxerga public e protected (por herança)
public class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String titular, String numero) {
        super(titular, numero);
    }

    public void mostrarAcessos() {

        // public: ok
        System.out.println("Numero (public): " + numero);
        System.out.println("Saldo (public, via getter): " + getSaldo());

        // protected: ok, porque a subclasse herda
        System.out.println("Titular (protected): " + this.titular);
        registrarOperacao("chamado de dentro da subclasse");

        // padrão (package-private): NÃO acessível, a subclasse está em outro pacote
        // System.out.println(agencia);        // ERRO: agencia is not public; cannot be accessed from outside package
        // double t = calcularTaxa(100);       // ERRO: cannot find symbol (metodo padrao nao e herdado em outro pacote)

        // private: NÃO acessível nem para a subclasse
        // saldo = 10;                         // ERRO: saldo has private access
        // boolean v = valorValido(5);         // ERRO: cannot find symbol (private nao e herdado)

        // protected por uma referência de OUTRO objeto do tipo da superclasse: NÃO pode
        ContaBancaria outra = new ContaBancaria("Ana", "999-9");
        // outra.registrarOperacao("x");       // ERRO: registrarOperacao has protected access
        // System.out.println(outra.titular);  // ERRO: titular has protected access
        System.out.println("Titular de outra conta (so pelo public): " + outra.numero);
    }
}
