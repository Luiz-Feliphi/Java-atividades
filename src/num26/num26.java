package Lista5.num26;

import java.util.ArrayList;

public class num26 {
    // 26) Crie uma classe Empresa que contenha uma composição de objetos como
    //     Departamento, Funcionario, Projeto.

    // COMPOSIÇÃO: a Empresa cria os departamentos, funcionários e projetos.
    // O Funcionario guarda o NOME do departamento onde trabalha.

    public static void main(String[] args) {

        Empresa empresa = new Empresa("TechGoias");

        empresa.criarDepartamento("Desenvolvimento");
        empresa.criarDepartamento("Suporte");

        empresa.contratarFuncionario("Luiz", 5000.0, "Desenvolvimento");
        empresa.contratarFuncionario("Maria", 3500.0, "Suporte");

        empresa.criarProjeto("Sistema de Estoque", 20000.0);

        empresa.mostrar();
    }
}

class Departamento {

    private String nome;

    public Departamento(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
}

class Funcionario {

    private String nome;
    private double salario;
    private String departamento;

    public Funcionario(String nome, double salario, String departamento) {
        this.nome = nome;
        this.salario = salario;
        this.departamento = departamento;
    }

    public String descricao() {
        return String.format("%s | R$ %.2f | %s", nome, salario, departamento);
    }
}

class Projeto {

    private String nome;
    private double orcamento;

    public Projeto(String nome, double orcamento) {
        this.nome = nome;
        this.orcamento = orcamento;
    }

    public String descricao() {
        return String.format("%s | orcamento R$ %.2f", nome, orcamento);
    }
}

class Empresa {

    private String nome;
    private ArrayList<Departamento> departamentos = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Projeto> projetos = new ArrayList<>();

    public Empresa(String nome) {
        this.nome = nome;
    }

    public void criarDepartamento(String nome) {
        departamentos.add(new Departamento(nome));
    }

    public void contratarFuncionario(String nome, double salario, String departamento) {
        funcionarios.add(new Funcionario(nome, salario, departamento));
    }

    public void criarProjeto(String nome, double orcamento) {
        projetos.add(new Projeto(nome, orcamento));
    }

    public void mostrar() {

        System.out.println("Empresa: " + nome);

        System.out.println("Departamentos:");
        for (Departamento d : departamentos) {
            System.out.println("  - " + d.getNome());
        }

        System.out.println("Funcionarios:");
        for (Funcionario f : funcionarios) {
            System.out.println("  - " + f.descricao());
        }

        System.out.println("Projetos:");
        for (Projeto p : projetos) {
            System.out.println("  - " + p.descricao());
        }
    }
}
