package Lista5.num24;

import java.util.ArrayList;

public class num24 {
    // 24) Crie uma classe Curso que contém uma composição de objetos como Disciplina,
    //     Professor, Aluno.

    // COMPOSIÇÃO: quem cria Disciplina, Professor e Aluno é o próprio Curso, pelos
    // métodos adicionarDisciplina, contratarProfessor e matricularAluno. Quem está
    // fora só informa os dados e nunca recebe o objeto pronto para mexer.

    public static void main(String[] args) {

        Curso curso = new Curso("Sistemas de Informacao");

        curso.adicionarDisciplina("Programacao Orientada a Objetos", 60);
        curso.adicionarDisciplina("Banco de Dados", 60);

        curso.contratarProfessor("Cristiane", "Doutora");
        curso.contratarProfessor("Carlos", "Mestre");

        curso.matricularAluno("Luizfeliphi", "2026001");
        curso.matricularAluno("Maria", "2026002");

        curso.mostrar();
    }
}

class Disciplina {

    private String nome;
    private int cargaHoraria;

    public Disciplina(String nome, int cargaHoraria) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
    }

    public String descricao() {
        return nome + " (" + cargaHoraria + "h)";
    }
}

class Professor {

    private String nome;
    private String titulacao;

    public Professor(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public String descricao() {
        return nome + " - " + titulacao;
    }
}

class Aluno {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String descricao() {
        return nome + " - matricula " + matricula;
    }
}

class Curso {

    private String nome;
    private ArrayList<Disciplina> disciplinas = new ArrayList<>();
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();

    public Curso(String nome) {
        this.nome = nome;
    }

    // os objetos são criados DENTRO do Curso
    public void adicionarDisciplina(String nome, int cargaHoraria) {
        disciplinas.add(new Disciplina(nome, cargaHoraria));
    }

    public void contratarProfessor(String nome, String titulacao) {
        professores.add(new Professor(nome, titulacao));
    }

    public void matricularAluno(String nome, String matricula) {
        alunos.add(new Aluno(nome, matricula));
    }

    public void mostrar() {

        System.out.println("Curso: " + nome);

        System.out.println("Disciplinas:");
        for (Disciplina d : disciplinas) {
            System.out.println("  - " + d.descricao());
        }

        System.out.println("Professores:");
        for (Professor p : professores) {
            System.out.println("  - " + p.descricao());
        }

        System.out.println("Alunos:");
        for (Aluno a : alunos) {
            System.out.println("  - " + a.descricao());
        }
    }
}
