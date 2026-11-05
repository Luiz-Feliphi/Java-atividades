package Lista5.num14;

public class num14 {
    // 14) Implemente uma classe Livro com atributos privados para título, autor,
    //     e métodos públicos para acessá-los.

    public static void main(String[] args) {

        Livro livro = new Livro("Dom Casmurro", "Machado de Assis", 1899);

        System.out.println("Titulo: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor());
        System.out.println("Ano: " + livro.getAno());

        livro.setTitulo("Memorias Postumas de Bras Cubas");
        livro.setAno(1881);
        System.out.println("Depois de alterar: " + livro.getTitulo() + " (" + livro.getAno() + ")");

        livro.setAno(-10); // inválido
    }
}

class Livro {

    // atributos privados: só a própria classe enxerga
    private String titulo;
    private String autor;
    private int ano;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (ano > 0) {
            this.ano = ano;
        } else {
            System.out.println("Ano invalido: " + ano);
        }
    }
}
