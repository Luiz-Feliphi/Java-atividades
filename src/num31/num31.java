package Lista5.num31;

import java.util.ArrayList;

public class num31 {
    // 31) Crie uma classe Projeto que agregue objetos como Funcionario, Tarefa, Cliente.

    // AGREGAÇÃO: Funcionario, Tarefa e Cliente são criados fora e ligados ao Projeto.
    // A Tarefa guarda uma referência ao Funcionario responsável.

    public static void main(String[] args) {

        Cliente cliente = new Cliente("Padaria Boa Massa", "contato@boamassa.com");
        Funcionario dev = new Funcionario("Luiz", "Desenvolvedor");
        Funcionario analista = new Funcionario("Maria", "Analista");

        Tarefa t1 = new Tarefa("Levantar requisitos", analista);
        Tarefa t2 = new Tarefa("Programar tela de login", dev);

        Projeto projeto = new Projeto("Sistema da Padaria", cliente);
        projeto.adicionarFuncionario(dev);
        projeto.adicionarFuncionario(analista);
        projeto.adicionarTarefa(t1);
        projeto.adicionarTarefa(t2);

        t1.concluir();

        projeto.mostrar();

        projeto = null; // o projeto acaba, mas cliente e funcionarios continuam
        System.out.println("\nProjeto encerrado. " + dev.getNome() + " e " + cliente.getNome()
                + " continuam existindo.");
    }
}

class Cliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }
}

class Funcionario {

    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }
}

class Tarefa {

    private String descricao;
    private Funcionario responsavel;
    private boolean concluida;

    public Tarefa(String descricao, Funcionario responsavel) {
        this.descricao = descricao;
        this.responsavel = responsavel;
        this.concluida = false;
    }

    public void concluir() {
        this.concluida = true;
    }

    public String resumo() {
        return (concluida ? "[x] " : "[ ] ") + descricao + " - " + responsavel.getNome();
    }
}

class Projeto {

    private String nome;
    private Cliente cliente;
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();
    private ArrayList<Tarefa> tarefas = new ArrayList<>();

    public Projeto(String nome, Cliente cliente) {
        this.nome = nome;
        this.cliente = cliente;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionarios.add(funcionario);
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
    }

    public void mostrar() {

        System.out.println("Projeto: " + nome);
        System.out.println("Cliente: " + cliente.getNome() + " <" + cliente.getEmail() + ">");

        System.out.println("Equipe:");
        for (Funcionario f : funcionarios) {
            System.out.println("  - " + f.getNome() + " (" + f.getCargo() + ")");
        }

        System.out.println("Tarefas:");
        for (Tarefa t : tarefas) {
            System.out.println("  " + t.resumo());
        }
    }
}
