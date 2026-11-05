package Lista5.num27;

import java.util.ArrayList;

public class num27 {
    // 27) Crie uma classe Escola que agregue objetos como Professor, Aluno, Turma.

    // AGREGAÇÃO = relação "tem um" FRACA. Os objetos são criados FORA da Escola e só
    // são passados para ela (adicionarProfessor, adicionarAluno...). Eles existem
    // independentemente: se a Escola acabar, os professores e alunos continuam vivos
    // (podem ir para outra escola).
    // Diferença para a composição: na composição o todo CRIA as partes (new dentro
    // dele); na agregação o todo RECEBE partes que já existem.

    public static void main(String[] args) {

        // objetos criados fora da escola
        Professor prof = new Professor("Cristiane", "Programacao");
        Aluno aluno1 = new Aluno("Luizfeliphi", "2026001");
        Aluno aluno2 = new Aluno("Maria", "2026002");
        Turma turma = new Turma("2o periodo SI", 2026);

        Escola escola = new Escola("IF Goiano");
        escola.adicionarProfessor(prof);
        escola.adicionarAluno(aluno1);
        escola.adicionarAluno(aluno2);
        escola.adicionarTurma(turma);

        escola.mostrar();

        // A escola deixa de existir...
        escola = null;

        // ...mas os objetos agregados continuam existindo
        System.out.println("\nEscola fechou, mas " + aluno1.getNome() + " e "
                + prof.getNome() + " continuam existindo.");
    }
}

class Professor {

    private String nome;
    private String materia;

    public Professor(String nome, String materia) {
        this.nome = nome;
        this.materia = materia;
    }

    public String getNome() {
        return nome;
    }

    public String getMateria() {
        return materia;
    }
}

class Aluno {

    private String nome;
    private String matricula;

    public Aluno(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public String getMatricula() {
        return matricula;
    }
}

class Turma {

    private String nome;
    private int ano;

    public Turma(String nome, int ano) {
        this.nome = nome;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }

    public int getAno() {
        return ano;
    }
}

class Escola {

    private String nome;
    private ArrayList<Professor> professores = new ArrayList<>();
    private ArrayList<Aluno> alunos = new ArrayList<>();
    private ArrayList<Turma> turmas = new ArrayList<>();

    public Escola(String nome) {
        this.nome = nome;
    }

    // recebem objetos prontos (agregação)
    public void adicionarProfessor(Professor p) {
        professores.add(p);
    }

    public void adicionarAluno(Aluno a) {
        alunos.add(a);
    }

    public void adicionarTurma(Turma t) {
        turmas.add(t);
    }

    public void mostrar() {

        System.out.println("Escola: " + nome);

        for (Professor p : professores) {
            System.out.println("  Professor: " + p.getNome() + " (" + p.getMateria() + ")");
        }

        for (Aluno a : alunos) {
            System.out.println("  Aluno: " + a.getNome() + " - " + a.getMatricula());
        }

        for (Turma t : turmas) {
            System.out.println("  Turma: " + t.getNome() + " (" + t.getAno() + ")");
        }
    }
}
