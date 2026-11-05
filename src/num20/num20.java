package Lista5.num20;

import Lista5.num20.formas.Circulo;
import Lista5.num20.formas.Forma;
import Lista5.num20.formas.Retangulo;

public class num20 {
    // 20) Utilize modificadores de visibilidade na hierarquia de classes de formas
    //     geométricas para controlar o acesso a métodos e atributos.

    // As formas estão no pacote Lista5.num20.formas e esta classe está FORA dele.
    // Por isso ela só enxerga o que é public.

    public static void main(String[] args) {

        Forma c = new Circulo(3);
        Forma r = new Retangulo(2, 5);

        Forma[] formas = {c, r};

        for (Forma f : formas) {
            System.out.println(f); // toString() é public
            System.out.printf("  Area: %.2f | Perimetro: %.2f | id: %d%n",
                    f.calcularArea(), f.calcularPerimetro(), f.getId());
        }

        // Tudo abaixo está bloqueado pelos modificadores:
        // System.out.println(c.nome);          // ERRO: nome has protected access in Forma
        // System.out.println(c.cabecalho());   // ERRO: cabecalho() has protected access in Forma
        // c.id = 50;                           // ERRO: id has private access in Forma
        // Forma x = new Circulo(1); x.raio = 9; // ERRO: cannot find symbol (o tipo Forma nao tem raio)
        // Circulo cc = (Circulo) c; cc.raio = 2; // ERRO: raio has private access in Circulo
        // Forma y = new Forma("x");            // ERRO: Forma é abstract (e o construtor é protected)
    }
}
