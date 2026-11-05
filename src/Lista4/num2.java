package Lista4;

public class num2 {

    // 2) Sobre métodos
    // Esta atividade é teórica, então as respostas estão nos comentários e cada uma
    // tem um pequeno código de exemplo logo abaixo, que é executado no main.

    // ------------------------------------------------------------------
    // a) O que é um método em Java? Descreva sua estrutura básica e seus componentes.
    //
    // Um método é um bloco de código com um nome, que executa uma tarefa específica
    // e pode ser chamado (executado) várias vezes, em vários lugares do programa.
    // Serve para organizar o código, evitar repetição e facilitar a manutenção.
    //
    // Estrutura básica:
    //
    //   modificador  tipoDeRetorno  nomeDoMetodo(tipo parametro1, tipo parametro2) {
    //       // corpo do método (instruções)
    //       return valor; // só se o tipo de retorno não for void
    //   }
    //
    // Componentes:
    //  - Modificador de acesso: public, private, protected (quem pode usar o método).
    //  - static (opcional): o método pertence à classe e não precisa de objeto para ser chamado.
    //  - Tipo de retorno: o que o método devolve (int, double, String, int[]...).
    //                     Se não devolve nada, usa-se void.
    //  - Nome: identifica o método (por convenção começa com letra minúscula, camelCase).
    //  - Parâmetros: valores recebidos para o método trabalhar (podem não existir).
    //  - Corpo: as instruções entre { }.
    //  - return: encerra o método e devolve o valor ao ponto onde foi chamado.
    // ------------------------------------------------------------------

    // ------------------------------------------------------------------
    // b) Dê 2 exemplos de métodos em Java
    // ------------------------------------------------------------------

    // Exemplo 1: método COM retorno e COM parâmetros
    private static int somar(int a, int b) {
        return a + b;
    }

    // Exemplo 2: método SEM retorno (void) e COM parâmetro
    private static void saudacao(String nome) {
        System.out.println("Ola, " + nome + "!");
    }

    // ------------------------------------------------------------------
    // c) Explique como um método é chamado em Java. O que acontece na memória
    //    quando um método é chamado? Mostre exemplos
    //
    // Um método é chamado escrevendo o seu nome seguido dos argumentos entre parênteses:
    //     int resultado = somar(3, 4);     // método static, chamado dentro da própria classe
    //     objeto.metodo();                 // método de instância, chamado a partir de um objeto
    //
    // O que acontece na memória:
    //  1. A JVM cria um "quadro" (stack frame) no topo da PILHA (Stack) para essa chamada.
    //  2. Os argumentos são COPIADOS para os parâmetros, e as variáveis locais do método
    //     também ficam nesse quadro.
    //  3. O método executa. Se chamar outro método, um novo quadro é empilhado em cima.
    //  4. Ao chegar no return (ou no fim do método) o quadro é removido da pilha, as
    //     variáveis locais deixam de existir e a execução volta para onde parou.
    //
    // Objetos e arrays ficam na HEAP (outra região da memória). Na pilha fica só a
    // REFERÊNCIA (o "endereço") para eles.
    //
    // Exemplo (fatorial), a pilha cresce a cada chamada e depois desempilha:
    //   fatorial(3)  ->  empilha fatorial(3)
    //                    chama fatorial(2) -> empilha
    //                    chama fatorial(1) -> empilha  (retorna 1 e desempilha)
    //                    fatorial(2) devolve 2*1 = 2   (desempilha)
    //                    fatorial(3) devolve 3*2 = 6   (desempilha)
    // ------------------------------------------------------------------
    private static int fatorial(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fatorial(n - 1); // nova chamada = novo quadro na pilha
    }

    // ------------------------------------------------------------------
    // d) Como um array pode ser passado como parâmetro para um método?
    //    O que acontece se você modificar o array dentro do método?
    //
    // Basta declarar o parâmetro com o tipo do array (int[] vetor) e passar o nome do
    // array na chamada: dobrarValores(numeros);
    //
    // Em Java tudo é passado por VALOR, mas no caso de arrays o valor copiado é a
    // REFERÊNCIA. Ou seja, o parâmetro e o array original apontam para o MESMO array
    // na heap. Por isso, se o método alterar um elemento (vetor[i] = ...), a alteração
    // aparece no array original, fora do método.
    //
    // Atenção: se o método fizer vetor = new int[5], só a cópia da referência passa a
    // apontar para outro array. O array original continua intacto.
    // ------------------------------------------------------------------
    private static void dobrarValores(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = vetor[i] * 2; // altera o array original
        }
    }

    private static void trocarReferencia(int[] vetor) {
        vetor = new int[]{99, 99, 99}; // só a cópia da referência muda, o original não é afetado
    }

    // ------------------------------------------------------------------
    // e) Como um método pode retornar um valor? Discuta a importância de utilizar
    //    o tipo de retorno adequado para um método.
    //
    // O método declara o tipo de retorno antes do nome e usa a palavra return seguida
    // de um valor compatível com esse tipo. Quem chamou pode guardar o valor numa
    // variável ou usá-lo direto numa expressão.
    //
    // Importância do tipo adequado:
    //  - O compilador verifica se o que é devolvido combina com o tipo declarado,
    //    evitando erros.
    //  - Evita perda de informação: se a média de notas retornar int, o 7.5 vira 7.
    //    O correto é double.
    //  - Deixa claro o que o método faz: boolean para perguntas (sim/não), void quando
    //    só executa uma ação, int[] para devolver vários valores, etc.
    //  - Facilita o reaproveitamento: o resultado pode ser usado em outras partes.
    // ------------------------------------------------------------------
    private static double media(int[] vetor) {
        int soma = 0;
        for (int valor : vetor) {
            soma += valor;
        }
        return (double) soma / vetor.length; // double para não perder a parte decimal
    }

    private static boolean ehPar(int numero) {
        return numero % 2 == 0; // boolean porque a resposta é verdadeiro/falso
    }

    // ------------------------------------------------------------------
    // f) O que acontece se você tiver um parâmetro com o mesmo nome que uma variável
    //    de classe dentro de um método? Como você pode resolver isso?
    //
    // O parâmetro "esconde" (faz shadowing) da variável de classe: dentro do método, o
    // nome passa a se referir ao PARÂMETRO (variável local), e a variável de classe fica
    // inacessível pelo nome simples.
    //
    // Como resolver:
    //  - Variável de instância (não static): usar this.nome -> this.idade = idade;
    //  - Variável static: usar o nome da classe -> num2.contador
    //  - Ou, simplesmente, dar nomes diferentes ao parâmetro e à variável.
    // ------------------------------------------------------------------
    static int contador = 10; // variável de classe (static)
    int idade = 20;           // variável de instância

    private static void testarShadowing(int contador) {
        System.out.println("Parametro (local): " + contador);
        System.out.println("Variavel de classe: " + num2.contador); // acessa a de classe
    }

    private void mudarIdade(int idade) {
        // idade = idade;     // ERRADO: atribui o parâmetro a ele mesmo, nada muda no objeto
        this.idade = idade;   // CERTO: this.idade é a variável do objeto
    }

    // ------------------------------------------------------------------
    // g) Java não permite que métodos retornem múltiplos valores diretamente.
    //    Como você pode contornar essa limitação? Dê dois exemplos.
    //
    // Exemplo 1: retornar um ARRAY com os valores (todos do mesmo tipo).
    // Exemplo 2: retornar um OBJETO de uma classe que agrupa os valores (tipos
    //            diferentes se quiser). Também daria para usar List ou Map.
    // ------------------------------------------------------------------

    // Exemplo 1: array {menor, maior}
    private static int[] menorEMaior(int[] vetor) {
        int menor = vetor[0];
        int maior = vetor[0];

        for (int valor : vetor) {
            if (valor < menor) {
                menor = valor;
            }
            if (valor > maior) {
                maior = valor;
            }
        }

        return new int[]{menor, maior};
    }

    // Exemplo 2: classe auxiliar que guarda os dois resultados
    private static class Resultado {
        int soma;
        double media;
    }

    private static Resultado somaEMedia(int[] vetor) {
        Resultado r = new Resultado();

        for (int valor : vetor) {
            r.soma += valor;
        }
        r.media = (double) r.soma / vetor.length;

        return r;
    }

    public static void main(String[] args) {

        System.out.println("=== b) Exemplos de metodos ===");
        System.out.println("somar(3, 4) = " + somar(3, 4));
        saudacao("Luizfeliphi");

        System.out.println("\n=== c) Chamada e pilha de memoria ===");
        System.out.println("fatorial(3) = " + fatorial(3));

        System.out.println("\n=== d) Array como parametro ===");
        int[] numeros = {1, 2, 3};
        dobrarValores(numeros);
        System.out.println("Depois de dobrarValores: " + java.util.Arrays.toString(numeros));
        trocarReferencia(numeros);
        System.out.println("Depois de trocarReferencia: " + java.util.Arrays.toString(numeros));

        System.out.println("\n=== e) Tipo de retorno ===");
        System.out.println("media = " + media(numeros));
        System.out.println("4 e par? " + ehPar(4));

        System.out.println("\n=== f) Parametro com mesmo nome da variavel de classe ===");
        testarShadowing(5);
        num2 objeto = new num2();
        objeto.mudarIdade(30);
        System.out.println("Idade do objeto: " + objeto.idade);

        System.out.println("\n=== g) Retornando multiplos valores ===");
        int[] mm = menorEMaior(numeros);
        System.out.println("Menor: " + mm[0] + " | Maior: " + mm[1]);
        Resultado r = somaEMedia(numeros);
        System.out.println("Soma: " + r.soma + " | Media: " + r.media);
    }
}
