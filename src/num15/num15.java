package Lista5.num15;

public class num15 {
    // 15) Crie uma classe Carro com atributos privados para marca, modelo,
    //     e métodos públicos para acessá-los.

    public static void main(String[] args) {

        Carro carro = new Carro("Fiat", "Uno", 2010);

        System.out.println("Marca: " + carro.getMarca());
        System.out.println("Modelo: " + carro.getModelo());
        System.out.println("Ano: " + carro.getAno());

        carro.setModelo("Palio");
        System.out.println("Modelo alterado para: " + carro.getModelo());
    }
}

class Carro {

    private String marca;
    private String modelo;
    private int ano;

    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
}
