package Lista5.num16;

public class num16 {
    // 16) Crie uma classe base Animal com métodos e atributos básicos como comer(),
    //     dormir(), nome etc., e crie subclasses como Cachorro, Gato que herdem
    //     desses métodos.

    // HERANÇA: "class Cachorro extends Animal" => Cachorro já nasce com tudo que Animal
    // tem (nome, idade, comer(), dormir()) e ainda pode ter métodos próprios.

    public static void main(String[] args) {

        Cachorro rex = new Cachorro("Rex", 3);
        Gato mia = new Gato("Mia", 2);

        // métodos herdados de Animal
        rex.comer();
        rex.dormir();
        mia.comer();
        mia.dormir();

        // métodos específicos de cada subclasse
        rex.abanarRabo();
        mia.arranhar();

        // Polimorfismo: um vetor de Animal guarda qualquer subclasse,
        // e cada um responde emitirSom() do seu jeito (sobrescrita)
        System.out.println("\n--- Todos os animais ---");
        Animal[] animais = {rex, mia, new Animal("Bicho", 1)};

        for (Animal a : animais) {
            a.emitirSom();
        }
    }
}

class Animal {

    // protected: as subclasses enxergam, mas quem está fora da família não
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void comer() {
        System.out.println(nome + " esta comendo.");
    }

    public void dormir() {
        System.out.println(nome + " esta dormindo.");
    }

    public void emitirSom() {
        System.out.println(nome + " faz um som qualquer.");
    }

    public String getNome() {
        return nome;
    }
}

class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade); // chama o construtor de Animal
    }

    @Override
    public void emitirSom() { // sobrescreve o método da classe pai
        System.out.println(nome + " diz: Au au!");
    }

    public void abanarRabo() {
        System.out.println(nome + " esta abanando o rabo.");
    }
}

class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome + " diz: Miau!");
    }

    public void arranhar() {
        System.out.println(nome + " esta arranhando o sofa.");
    }
}
