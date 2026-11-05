package Lista5.num19;

import Lista5.num19.outro.CarroEsportivo;

public class num19 {
    // 19) Defina métodos e atributos na classe Carro como private, protected e public
    //     e observe seu acesso a partir de outras classes.

    public static void main(String[] args) {

        Carro carro = new Carro("Fiat", "Uno", 2010, "9BD1234567890");

        System.out.println("=== main no MESMO pacote de Carro ===");

        // public
        System.out.println("Marca: " + carro.marca);
        carro.buzinar();

        // protected e padrão: acessíveis porque é o mesmo pacote
        System.out.println("Modelo: " + carro.modelo);
        System.out.println("Ano: " + carro.ano);
        carro.ligarMotor();
        System.out.println(carro.descricaoInterna());

        // private: não acessível
        // System.out.println(carro.chassi);   // ERRO: chassi has private access
        // carro.codigoSecreto();              // ERRO: codigoSecreto() has private access
        System.out.println("Chassi (pelo getter public): " + carro.getChassi());

        System.out.println("\n=== Subclasse em OUTRO pacote ===");
        CarroEsportivo esportivo = new CarroEsportivo("Ferrari", "F8", 2022, "ZFF1111111111");
        esportivo.acelerar();
        esportivo.mostrarAcessos();
    }
}
