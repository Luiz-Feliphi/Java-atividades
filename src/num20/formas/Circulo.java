package Lista5.num20.formas;

public class Circulo extends Forma {

    private double raio; // private: só o Circulo mexe

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    @Override
    public String toString() {
        // nome e cabecalho() são protected: a filha enxerga
        return cabecalho() + " (raio " + raio + ")";
        // return "id " + id;   // ERRO: id has private access in Forma
    }
}
