package Lista5.num20.formas;

public class Retangulo extends Forma {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super("Retangulo");
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }

    @Override
    public String toString() {
        return cabecalho() + " (" + base + " x " + altura + ")";
    }
}
