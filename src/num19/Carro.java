package Lista5.num19;

public class Carro {

    // ATRIBUTOS com cada visibilidade
    private String chassi;          // private: só a classe Carro
    protected String modelo;        // protected: pacote + subclasses
    int ano;                        // padrão: só o pacote
    public String marca;            // public: todo mundo

    public Carro(String marca, String modelo, int ano, String chassi) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.chassi = chassi;
    }

    // MÉTODOS com cada visibilidade
    private String codigoSecreto() {
        return "SEC-" + chassi.substring(chassi.length() - 4);
    }

    String descricaoInterna() {
        return marca + " " + modelo + " " + ano;
    }

    protected void ligarMotor() {
        System.out.println("Motor do " + modelo + " ligado.");
    }

    public void buzinar() {
        System.out.println("Biiii! (" + codigoSecreto() + ")"); // private usado aqui dentro
    }

    public String getChassi() { // forma pública de ler um atributo private
        return chassi;
    }
}
