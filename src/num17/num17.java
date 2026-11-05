package Lista5.num17;

public class num17 {
    // 17) Implemente uma hierarquia de classes para representar formas geométricas,
    //     como Forma, Círculo, Retângulo, onde cada classe filha estende a classe pai
    //     e implementa métodos para cálculo de área e perímetro.

    // Forma é abstract: não faz sentido criar "uma forma qualquer", então ela só
    // declara QUE toda forma precisa calcular área e perímetro. Cada filha diz COMO.

    public static void main(String[] args) {

        Forma[] formas = {
                new Circulo(5),
                new Retangulo(4, 6)
        };

        for (Forma f : formas) {
            System.out.println(f.getNome());
            System.out.printf("  Area: %.2f%n", f.calcularArea());
            System.out.printf("  Perimetro: %.2f%n", f.calcularPerimetro());
        }

        // Forma f = new Forma("x");  // ERRO: classe abstrata não pode ser instanciada
    }
}

abstract class Forma {

    private String nome;

    public Forma(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    // métodos abstratos: sem corpo, as filhas são obrigadas a implementar
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}

class Circulo extends Forma {

    private double raio;

    public Circulo(double raio) {
        super("Circulo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * raio * raio; // pi * r²
    }

    @Override
    public double calcularPerimetro() {
        return 2 * Math.PI * raio; // 2 * pi * r
    }
}

class Retangulo extends Forma {

    private double base;
    private double altura;

    public Retangulo(double base, double altura) {
        super("Retangulo");
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2 * (base + altura);
    }
}
