package Conta;

public class conta {
    private int Numero;
    private double Saldo;
    private double Limite;
    private String Nome;

    public void setNumero(int Numero){
        this.Numero = Numero;
    }
    public int getNumero(int Numero){
        return this.Numero;
    }
    public void setSaldo(double Saldo){
        this.Saldo = Saldo;
    }
    public double getSaldo(double Saldo){
        return this.Saldo;
    }
    public void Limite(double Limite){
        this.Limite = Limite;
    }
    public double getLimite(double Limite){
        return this.Limite;
    }
    public void Nome(String Nome){
        this.Nome = Nome;
    }
    public String getNome(String Nome){
        return this.Nome;
    }
    public conta() {
    }
    public conta(int numero, double saldo, double limite, String nome){
        this.Limite = limite;
        this.Nome = nome;
        this.Saldo = saldo;
        this.Numero = numero;
    }
    public boolean sa (double valor){
        if(valor <= (Saldo +Limite)) {
            Saldo -= valor;
            return true;
        }
        return false;
    }
    public void depos (double valor){
        Saldo = Saldo +valor;
    }
    public void transfer (conta destino, double valor){
        if (sa(valor)) {
            destino.depos(valor);
        }
    }
    public void mostrar() {
        System.out.println("Numero: "+this.Numero);
        System.out.println("Nome: "+this.Nome);
        System.out.println("Saldo: "+this.Saldo);
        System.out.println("Limite: "+this.Limite);
    }
}
