package Lista5.num22;

import java.util.ArrayList;

public class num22 {
    // 22) Crie uma classe Casa que contenha uma composição de objetos como Quarto,
    //     Sala, Cozinha, representando as partes de uma casa.

    // COMPOSIÇÃO = relação "é parte de" FORTE. As partes nascem junto com o todo
    // (são criadas DENTRO do construtor da Casa) e não existem sem ele. Se a Casa
    // deixa de existir, os quartos, a sala e a cozinha também deixam.

    public static void main(String[] args) {

        Casa casa = new Casa("Rua das Flores, 100", 3);
        casa.mostrar();
    }
}

class Quarto {

    private double area;
    private int camas;

    public Quarto(double area, int camas) {
        this.area = area;
        this.camas = camas;
    }

    public String descricao() {
        return "Quarto de " + area + " m2 com " + camas + " cama(s)";
    }
}

class Sala {

    private double area;
    private boolean temTv;

    public Sala(double area, boolean temTv) {
        this.area = area;
        this.temTv = temTv;
    }

    public String descricao() {
        return "Sala de " + area + " m2" + (temTv ? " com TV" : " sem TV");
    }
}

class Cozinha {

    private double area;
    private int fogoes;

    public Cozinha(double area, int fogoes) {
        this.area = area;
        this.fogoes = fogoes;
    }

    public String descricao() {
        return "Cozinha de " + area + " m2 com " + fogoes + " fogao(oes)";
    }
}

class Casa {

    private String endereco;
    private ArrayList<Quarto> quartos = new ArrayList<>();
    private Sala sala;
    private Cozinha cozinha;

    public Casa(String endereco, int quantidadeQuartos) {
        this.endereco = endereco;

        // as partes são criadas AQUI DENTRO (isso é o que caracteriza a composição)
        this.sala = new Sala(20, true);
        this.cozinha = new Cozinha(12, 4);

        for (int i = 0; i < quantidadeQuartos; i++) {
            this.quartos.add(new Quarto(10, 1));
        }
    }

    public void mostrar() {

        System.out.println("Casa em " + endereco);

        for (int i = 0; i < quartos.size(); i++) {
            System.out.println("  " + (i + 1) + ") " + quartos.get(i).descricao());
        }

        System.out.println("  - " + sala.descricao());
        System.out.println("  - " + cozinha.descricao());
    }
}
