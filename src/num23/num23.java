package Lista5.num23;

import java.util.ArrayList;

public class num23 {
    // 23) Implemente uma classe Universidade que contém uma lista de Departamento,
    //     onde cada departamento tem uma lista de Professor.

    // Universidade -> lista de Departamento -> lista de Professor.
    // A Universidade cria os seus departamentos (criarDepartamento), então eles fazem
    // parte dela (composição). Cada Departamento guarda os seus professores.

    public static void main(String[] args) {

        Universidade uni = new Universidade("IF Goiano");

        Departamento computacao = uni.criarDepartamento("Computacao");
        Departamento matematica = uni.criarDepartamento("Matematica");

        computacao.contratar(new Professor("Cristiane", "Doutora"));
        computacao.contratar(new Professor("Carlos", "Mestre"));
        matematica.contratar(new Professor("Ana", "Doutora"));

        uni.listar();
    }
}

class Professor {

    private String nome;
    private String titulacao;

    public Professor(String nome, String titulacao) {
        this.nome = nome;
        this.titulacao = titulacao;
    }

    public String getNome() {
        return nome;
    }

    public String getTitulacao() {
        return titulacao;
    }
}

class Departamento {

    private String nome;
    private ArrayList<Professor> professores = new ArrayList<>();

    public Departamento(String nome) {
        this.nome = nome;
    }

    public void contratar(Professor professor) {
        professores.add(professor);
    }

    public String getNome() {
        return nome;
    }

    public int quantidadeProfessores() {
        return professores.size();
    }

    public void listarProfessores() {
        for (Professor p : professores) {
            System.out.println("    - " + p.getNome() + " (" + p.getTitulacao() + ")");
        }
    }
}

class Universidade {

    private String nome;
    private ArrayList<Departamento> departamentos = new ArrayList<>();

    public Universidade(String nome) {
        this.nome = nome;
    }

    // o departamento é criado dentro da universidade
    public Departamento criarDepartamento(String nomeDepartamento) {
        Departamento d = new Departamento(nomeDepartamento);
        departamentos.add(d);
        return d;
    }

    public void listar() {

        System.out.println("Universidade: " + nome);

        for (Departamento d : departamentos) {
            System.out.println("  Departamento de " + d.getNome()
                    + " (" + d.quantidadeProfessores() + " professor(es))");
            d.listarProfessores();
        }
    }
}
