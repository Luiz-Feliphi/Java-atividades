package Conta;

public class Carro {
    private String tipo;
    private String cor;
    private String placa;
    private int numPortas;
    private Pessoa dono;


    public Carro() {

    }
    public Carro(String tipo, String cor, String placa, int numPortas) {
        this.tipo = tipo;
        this.cor = cor;
        this.placa = placa;
        this.numPortas = numPortas;
    }
    public void setDono(Pessoa dono){
        this.dono = dono;
    }
    public Pessoa getDono(Pessoa dono){
        return this.dono;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo(String tipo) {
        return this.tipo;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }
    public String getCor(String cor) {
        return this.cor;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public String getPlaca(String placa) {
        return this.placa;
    }

}
