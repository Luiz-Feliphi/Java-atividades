package Lista5.num25;

import java.util.ArrayList;

public class num25 {
    // 25) Implemente uma classe Loja que contenha uma composição de objetos como
    //     Produto, Cliente, Funcionario.

    // COMPOSIÇÃO: a Loja cadastra (cria) os produtos, clientes e funcionários.

    public static void main(String[] args) {

        Loja loja = new Loja("Loja do Luiz");

        loja.cadastrarProduto("Teclado", 120.0, 10);
        loja.cadastrarProduto("Mouse", 60.0, 5);

        loja.cadastrarCliente("Maria", "maria@email.com");
        loja.contratarFuncionario("Joao", "Vendedor");

        loja.mostrar();

        System.out.println();
        loja.vender("Teclado", 2);
        loja.vender("Mouse", 10); // estoque insuficiente

        System.out.println();
        loja.mostrar();
    }
}

class Produto {

    private String nome;
    private double preco;
    private int estoque;

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getEstoque() {
        return estoque;
    }

    public void retirarDoEstoque(int quantidade) {
        estoque -= quantidade;
    }
}

class Cliente {

    private String nome;
    private String email;

    public Cliente(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public String descricao() {
        return nome + " <" + email + ">";
    }
}

class Funcionario {

    private String nome;
    private String cargo;

    public Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    public String descricao() {
        return nome + " - " + cargo;
    }
}

class Loja {

    private String nome;
    private ArrayList<Produto> produtos = new ArrayList<>();
    private ArrayList<Cliente> clientes = new ArrayList<>();
    private ArrayList<Funcionario> funcionarios = new ArrayList<>();

    public Loja(String nome) {
        this.nome = nome;
    }

    public void cadastrarProduto(String nome, double preco, int estoque) {
        produtos.add(new Produto(nome, preco, estoque));
    }

    public void cadastrarCliente(String nome, String email) {
        clientes.add(new Cliente(nome, email));
    }

    public void contratarFuncionario(String nome, String cargo) {
        funcionarios.add(new Funcionario(nome, cargo));
    }

    public void vender(String nomeProduto, int quantidade) {

        for (Produto p : produtos) {

            if (p.getNome().equalsIgnoreCase(nomeProduto)) {

                if (quantidade > p.getEstoque()) {
                    System.out.println("Estoque insuficiente de " + p.getNome()
                            + " (restam " + p.getEstoque() + ")");
                    return;
                }

                p.retirarDoEstoque(quantidade);
                System.out.printf("Venda: %d x %s = R$ %.2f%n",
                        quantidade, p.getNome(), quantidade * p.getPreco());
                return;
            }
        }

        System.out.println("Produto nao encontrado: " + nomeProduto);
    }

    public void mostrar() {

        System.out.println("=== " + nome + " ===");

        System.out.println("Produtos:");
        for (Produto p : produtos) {
            System.out.printf("  - %s | R$ %.2f | estoque: %d%n",
                    p.getNome(), p.getPreco(), p.getEstoque());
        }

        System.out.println("Clientes:");
        for (Cliente c : clientes) {
            System.out.println("  - " + c.descricao());
        }

        System.out.println("Funcionarios:");
        for (Funcionario f : funcionarios) {
            System.out.println("  - " + f.descricao());
        }
    }
}
