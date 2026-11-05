package Lista5.num29;

import java.util.ArrayList;

public class num29 {
    // 29) Crie uma classe Equipe que agregue objetos como Jogador, Técnico, Treinador.

    // AGREGAÇÃO: jogadores, técnico e treinador existem sozinhos (um jogador pode
    // trocar de equipe) e são apenas ligados à Equipe.
    // Técnico = comanda o time e define a tática; Treinador = prepara os atletas
    // (parte física/treinos).

    public static void main(String[] args) {

        Jogador j1 = new Jogador("Pedro", "Atacante", 9);
        Jogador j2 = new Jogador("Lucas", "Goleiro", 1);
        Tecnico tecnico = new Tecnico("Abel", "4-4-2");
        Treinador treinador = new Treinador("Marcos", "Preparacao fisica");

        Equipe equipe = new Equipe("Urutai FC");
        equipe.adicionarJogador(j1);
        equipe.adicionarJogador(j2);
        equipe.setTecnico(tecnico);
        equipe.setTreinador(treinador);

        equipe.mostrar();

        // o jogador pode sair da equipe e continuar existindo
        equipe.removerJogador(j1);
        System.out.println("\nDepois que " + j1.getNome() + " saiu:");
        equipe.mostrar();
        System.out.println(j1.getNome() + " continua existindo e pode jogar em outra equipe.");
    }
}

class Jogador {

    private String nome;
    private String posicao;
    private int camisa;

    public Jogador(String nome, String posicao, int camisa) {
        this.nome = nome;
        this.posicao = posicao;
        this.camisa = camisa;
    }

    public String getNome() {
        return nome;
    }

    public String descricao() {
        return "#" + camisa + " " + nome + " (" + posicao + ")";
    }
}

class Tecnico {

    private String nome;
    private String esquemaTatico;

    public Tecnico(String nome, String esquemaTatico) {
        this.nome = nome;
        this.esquemaTatico = esquemaTatico;
    }

    public String descricao() {
        return nome + " - esquema " + esquemaTatico;
    }
}

class Treinador {

    private String nome;
    private String especialidade;

    public Treinador(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public String descricao() {
        return nome + " - " + especialidade;
    }
}

class Equipe {

    private String nome;
    private ArrayList<Jogador> jogadores = new ArrayList<>();
    private Tecnico tecnico;
    private Treinador treinador;

    public Equipe(String nome) {
        this.nome = nome;
    }

    public void adicionarJogador(Jogador jogador) {
        jogadores.add(jogador);
    }

    public void removerJogador(Jogador jogador) {
        jogadores.remove(jogador); // só tira da lista, o objeto Jogador não é destruído
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public void setTreinador(Treinador treinador) {
        this.treinador = treinador;
    }

    public void mostrar() {

        System.out.println("Equipe: " + nome);

        if (tecnico != null) {
            System.out.println("  Tecnico: " + tecnico.descricao());
        }

        if (treinador != null) {
            System.out.println("  Treinador: " + treinador.descricao());
        }

        for (Jogador j : jogadores) {
            System.out.println("  Jogador: " + j.descricao());
        }
    }
}
