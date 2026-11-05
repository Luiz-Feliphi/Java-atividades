package Lista5.num13;

public class num13 {
    // 13) Implemente uma classe Pessoa com atributos privados para idade, nome etc.,
    //     e métodos públicos para acessá-los.

    // Encapsulamento: os atributos são private, então ninguém de fora faz pessoa.idade = -5.
    // O acesso é feito por métodos públicos: getters (ler) e setters (alterar).
    // Assim o setter pode validar o valor antes de guardar.

    public static void main(String[] args) {

        Pessoa p = new Pessoa("Luiz", 20, "luiz@email.com");

        System.out.println("Nome: " + p.getNome());
        System.out.println("Idade: " + p.getIdade());
        System.out.println("Email: " + p.getEmail());

        p.setIdade(21);
        System.out.println("Idade depois de alterar: " + p.getIdade());

        p.setIdade(-5); // valor inválido, o setter recusa
        System.out.println("Idade depois do valor invalido: " + p.getIdade());

        // p.idade = 30;   // ERRO DE COMPILAÇÃO: idade é private em Pessoa
    }
}

class Pessoa {

    private String nome;
    private int idade;
    private String email;

    // Construtor: recebe os valores iniciais
    public Pessoa(String nome, int idade, String email) {
        this.nome = nome;
        setIdade(idade); // reaproveita a validação do setter
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 150) {
            this.idade = idade;
        } else {
            System.out.println("Idade invalida: " + idade);
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
