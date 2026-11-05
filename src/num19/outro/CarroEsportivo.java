package Lista5.num19.outro;

import Lista5.num19.Carro;

public class CarroEsportivo extends Carro {

    public CarroEsportivo(String marca, String modelo, int ano, String chassi) {
        super(marca, modelo, ano, chassi);
    }

    public void acelerar() {
        ligarMotor(); // protected: a subclasse pode usar
        System.out.println(modelo + " acelerando!"); // protected
    }

    public void mostrarAcessos() {

        System.out.println("Marca (public): " + marca);
        System.out.println("Modelo (protected, herdado): " + this.modelo);

        // padrão (sem modificador): NÃO acessível, pacote diferente
        // System.out.println(ano);              // ERRO: ano is not public; cannot be accessed from outside package
        // System.out.println(descricaoInterna()); // ERRO: cannot find symbol (metodo padrao nao e herdado em outro pacote)

        // private: NÃO acessível
        // System.out.println(chassi);           // ERRO: chassi has private access
        // codigoSecreto();                      // ERRO: cannot find symbol (private nao e herdado)

        // protected por referência de outro Carro: NÃO acessível
        Carro outro = new Carro("VW", "Gol", 2015, "9BW0000000000");
        // System.out.println(outro.modelo);     // ERRO: modelo has protected access
        // outro.ligarMotor();                   // ERRO: ligarMotor() has protected access
        outro.buzinar(); // public: ok
    }
}
