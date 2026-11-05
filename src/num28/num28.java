package Lista5.num28;

import java.time.LocalDate;
import java.util.ArrayList;

public class num28 {
    // 28) Implemente uma classe Biblioteca que agregue objetos como Livro, Leitor,
    //     Emprestimo.

    // AGREGAÇÃO: Livro, Leitor e Emprestimo são criados fora e adicionados à Biblioteca.
    // O Emprestimo liga um Livro a um Leitor (guarda as referências aos dois objetos).

    public static void main(String[] args) {

        Livro livro1 = new Livro("Dom Casmurro", "Machado de Assis");
        Livro livro2 = new Livro("O Cortico", "Aluisio Azevedo");
        Leitor leitor = new Leitor("Luizfeliphi", 1001);

        // o empréstimo também é criado fora e depois entregue à biblioteca
        Emprestimo emprestimo = new Emprestimo(livro1, leitor, LocalDate.now());

        Biblioteca biblioteca = new Biblioteca("Biblioteca do IF Goiano");
        biblioteca.adicionarLivro(livro1);
        biblioteca.adicionarLivro(livro2);
        biblioteca.adicionarLeitor(leitor);
        biblioteca.registrarEmprestimo(emprestimo);

        biblioteca.mostrar();

        biblioteca = null; // a biblioteca some...
        System.out.println("\nO livro \"" + livro2.getTitulo() + "\" continua existindo.");
    }
}

class Livro {

    private String titulo;
    private String autor;

    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
}

class Leitor {

    private String nome;
    private int codigo;

    public Leitor(String nome, int codigo) {
        this.nome = nome;
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigo() {
        return codigo;
    }
}

class Emprestimo {

    private Livro livro;
    private Leitor leitor;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucao;

    public Emprestimo(Livro livro, Leitor leitor, LocalDate dataEmprestimo) {
        this.livro = livro;
        this.leitor = leitor;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataEmprestimo.plusDays(7); // prazo de 7 dias
    }

    public String descricao() {
        return leitor.getNome() + " pegou \"" + livro.getTitulo() + "\" em "
                + dataEmprestimo + " (devolver ate " + dataDevolucao + ")";
    }
}

class Biblioteca {

    private String nome;
    private ArrayList<Livro> livros = new ArrayList<>();
    private ArrayList<Leitor> leitores = new ArrayList<>();
    private ArrayList<Emprestimo> emprestimos = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public void adicionarLeitor(Leitor leitor) {
        leitores.add(leitor);
    }

    public void registrarEmprestimo(Emprestimo emprestimo) {
        emprestimos.add(emprestimo);
    }

    public void mostrar() {

        System.out.println(nome);

        System.out.println("Livros:");
        for (Livro l : livros) {
            System.out.println("  - " + l.getTitulo() + " (" + l.getAutor() + ")");
        }

        System.out.println("Leitores:");
        for (Leitor l : leitores) {
            System.out.println("  - " + l.getNome() + " [" + l.getCodigo() + "]");
        }

        System.out.println("Emprestimos:");
        for (Emprestimo e : emprestimos) {
            System.out.println("  - " + e.descricao());
        }
    }
}
