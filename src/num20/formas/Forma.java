package Lista5.num20.formas;

public abstract class Forma {

    private static int contador = 0;   // private: controle interno da classe
    private final int id;              // private: ninguém de fora altera o id
    protected String nome;             // protected: as filhas usam, quem está fora não

    protected Forma(String nome) {     // construtor protected: só as filhas chamam
        this.nome = nome;
        contador++;
        this.id = contador;
    }

    public int getId() {               // public: leitura permitida
        return id;
    }

    // protected: ajuda as filhas a montarem o texto
    protected String cabecalho() {
        return "[" + id + "] " + nome;
    }

    // public e abstract: a "interface" que todo mundo pode usar
    public abstract double calcularArea();

    public abstract double calcularPerimetro();
}
