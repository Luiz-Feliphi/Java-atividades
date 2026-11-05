package Lista5.num18;

public class ContaBancaria {

    // Os 4 níveis de visibilidade do Java, do mais fechado para o mais aberto:
    //   private   -> só dentro da própria classe
    //   (padrão)  -> sem modificador: classes do MESMO pacote
    //   protected -> classes do mesmo pacote + SUBCLASSES (mesmo em outro pacote)
    //   public    -> qualquer classe

    private double saldo;           // private
    protected String titular;       // protected
    String agencia = "0001";        // padrão (package-private)
    public String numero;           // public

    public ContaBancaria(String titular, String numero) {
        this.titular = titular;
        this.numero = numero;
    }

    // MÉTODO private: só é usado aqui dentro (detalhe interno)
    private boolean valorValido(double valor) {
        return valor > 0;
    }

    // MÉTODO padrão: só classes do mesmo pacote (Lista5.num18) chamam
    double calcularTaxa(double valor) {
        return valor * 0.01;
    }

    // MÉTODO protected: esta classe, o pacote e as subclasses
    protected void registrarOperacao(String texto) {
        System.out.println("[LOG conta " + numero + "] " + texto);
    }

    // MÉTODOS public: a "porta de entrada" da conta para qualquer classe
    public void depositar(double valor) {
        if (valorValido(valor)) { // usa o private internamente
            saldo += valor;
            registrarOperacao("Deposito de " + valor);
        } else {
            System.out.println("Valor invalido.");
        }
    }

    public boolean sacar(double valor) {
        double total = valor + calcularTaxa(valor);

        if (valorValido(valor) && total <= saldo) {
            saldo -= total;
            registrarOperacao("Saque de " + valor + " (taxa " + calcularTaxa(valor) + ")");
            return true;
        }

        System.out.println("Saque nao realizado.");
        return false;
    }

    public double getSaldo() {
        return saldo;
    }
}
