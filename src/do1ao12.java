package Lista5;

public class do1ao12 {

    // LISTA 5 - Questões teóricas (1 a 12)
    // As respostas estão nos comentários e o main imprime um resumo do gabarito.

    // ------------------------------------------------------------------
    // 1) O operador ponto é usado para:
    //    RESPOSTA: D) acessar atributos e métodos públicos de um objeto.
    //    Ex.: pessoa.getNome();  ou  carro.marca
    //    (A é o operador =, C é o new, B não existe: comportamentos são definidos na classe)
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 2) Classes conceituais
    //
    // a) Biblioteca: "os exemplares de livros são emprestados aos usuários.
    //    É possível ainda fazer uma reserva, se um livro não estiver disponível"
    //    Classes conceituais (os substantivos importantes do cenário):
    //      - Biblioteca
    //      - Livro      (a obra: título, autor...)
    //      - Exemplar   (cada cópia física de um livro)
    //      - Usuario
    //      - Emprestimo
    //      - Reserva
    //
    // b) Posto de gasolina: "os carros são abastecidos de gasolina, álcool ou diesel
    //    nas bombas apropriadas"
    //    Classes conceituais: Posto, Carro, Bomba, Combustivel, Abastecimento
    //    Atributos da classe Abastecimento (mínimo 3):
    //      - dataHora           (quando o abastecimento aconteceu)
    //      - combustivel        (gasolina, álcool ou diesel)
    //      - quantidadeLitros
    //      - precoPorLitro
    //      - valorTotal         (litros x preço)
    //      - bomba              (em qual bomba foi abastecido)
    //      - carro              (qual carro foi abastecido)
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 3) Atributos da classe Partida ("Campeonato de Futebol") - mínimo 5:
    //      - dataHora           (data e horário do jogo)
    //      - estadio            (local da partida)
    //      - timeMandante       (time da casa)
    //      - timeVisitante
    //      - golsMandante
    //      - golsVisitante
    //      - rodada             (número da rodada do campeonato)
    //      - arbitro
    //      - publico            (quantidade de torcedores)
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 4) O que são ATRIBUTOS de uma classe? E o que são MÉTODOS?
    //
    //    ATRIBUTOS: são as variáveis declaradas dentro da classe. Representam as
    //    características e o estado do objeto (dados). Ex.: nome, idade, saldo.
    //    Cada objeto criado tem a sua própria cópia dos valores dos atributos.
    //
    //    MÉTODOS: são os blocos de código declarados dentro da classe. Representam o
    //    comportamento do objeto (o que ele faz) e normalmente usam ou alteram os
    //    atributos. Ex.: depositar(), sacar(), getNome().
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 5) Qual das seguintes afirmações é verdadeira em Java?
    //    RESPOSTA: A) Se não for especificado um construtor para a classe, um
    //    construtor padrão é utilizado.
    //    O compilador cria um construtor sem parâmetros automaticamente.
    //    (B e D estão erradas: objeto é uma instância de uma classe, não é uma classe.
    //     C está errada: uma classe pode ter só atributos, sem nenhum método.)
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 6) Um método de uma classe,
    //    RESPOSTA: E) pode ser público, protected ou private.
    //    (E também pode ser sem modificador, o "package-private", visível no pacote.)
    //    Obs.: no PDF o número aparece como "6. 7." (erro de digitação da lista).
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 7) "Marque a alternativa correta. A razão deste erro é:"
    //    ATENÇÃO: o trecho de código que mostra o erro não veio no PDF (provavelmente
    //    era uma imagem), então a resposta abaixo é a mais provável pelas alternativas.
    //    RESPOSTA: D) não podem ser usados objetos de diferentes tipos em comandos de
    //    atribuição.
    //    Ex.: Pessoa p = new Carro();  // erro: Carro não é uma Pessoa
    //    (A, B e C são falsas: classes diferentes podem ter variáveis e métodos com os
    //     mesmos nomes e podem implementar a mesma interface.)
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 8) Dados e funções comuns a todos os objetos de um mesmo tipo são definidos em:
    //    RESPOSTA: B) uma classe.
    //    A classe é o molde: define os atributos (dados) e os métodos (funções) que
    //    todos os objetos daquele tipo terão.
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 9) O modificador de visibilidade ____________ faz com que atributos e métodos
    //    possam ser vistos somente dentro da classe onde eles foram definidos.
    //    RESPOSTA: private
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 10) Prover acesso a um objeto somente através dos seus métodos, mantendo
    //     privados os detalhes de implementação, é chamado de:
    //     RESPOSTA: A) encapsulamento.
    //     (herança = reaproveitar uma classe, polimorfismo = mesmo método com
    //      comportamentos diferentes, modularidade = dividir o sistema em partes.)
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 11) Qual é a diferença entre private e protected?
    //     RESPOSTA: A) membros privados não podem ser acessados pelas subclasses,
    //     mas os membros protected podem.
    //     (B está errada porque private NÃO é acessível na subclasse.)
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // 12) Sobre o construtor default de uma classe em Java:
    //     RESPOSTA: C) uma classe tem um construtor default se ela não define
    //     nenhum outro construtor.
    //     Assim que você escreve qualquer construtor, o compilador deixa de criar o
    //     padrão (A e B estão erradas). Construtores não são herdados (D está errada)
    //     e o conceito existe em Java (E está errada).
    // ------------------------------------------------------------------

    public static void main(String[] args) {

        System.out.println("=== GABARITO DA LISTA 5 (questoes 1 a 12) ===");
        System.out.println("1  - D (operador ponto acessa atributos e metodos publicos)");
        System.out.println("2a - Biblioteca, Livro, Exemplar, Usuario, Emprestimo, Reserva");
        System.out.println("2b - Abastecimento: dataHora, combustivel, quantidadeLitros, precoPorLitro, valorTotal");
        System.out.println("3  - Partida: dataHora, estadio, timeMandante, timeVisitante, golsMandante, golsVisitante, rodada");
        System.out.println("4  - Atributos = dados/estado do objeto | Metodos = comportamentos/acoes");
        System.out.println("5  - A (construtor padrao)");
        System.out.println("6  - E (public, protected ou private)");
        System.out.println("7  - D (tipos diferentes em atribuicao) - codigo do erro nao veio no PDF");
        System.out.println("8  - B (classe)");
        System.out.println("9  - private");
        System.out.println("10 - A (encapsulamento)");
        System.out.println("11 - A (private nao e visto nas subclasses, protected e)");
        System.out.println("12 - C (default so existe se nao houver outro construtor)");
    }
}
