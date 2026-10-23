package Conta;

public class Pessoa {
    private String nome;
    private String corpoCabelo;
    private String biotipo;
    private int idade;

    public Pessoa(){

    }
    public Pessoa(String nome, String corpoCabelo, String biotipo, int idade) {
        this.biotipo = biotipo;
        this.idade = idade;
        this.corpoCabelo = corpoCabelo;
        this.nome = nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(String tipo) {
        return this.nome;
    }

    public void setCorpoCabelo(String corpoCabelo) {
        this.corpoCabelo = corpoCabelo;
    }

    public String getCorpoCabelo(String corpoCabelo) {
        return this.corpoCabelo;
    }

    public void setBiotipo(String biotipo) {
        this.biotipo = biotipo;
    }

    public String getBiotipo(String biotipo) {
        return this.biotipo;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade(int idade) {
        return this.idade;
    }
}