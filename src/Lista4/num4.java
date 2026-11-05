package Lista4;

import java.util.Locale;
import java.util.Scanner;

public class num4 {

//    4) Gerenciar gastos pessoais com matriz: cada linha é um mês do ano e cada coluna
//    é uma semana do mês. O programa fica em loop até o usuário escolher sair.
//
//    Observação: no enunciado o número 2 aparece repetido no menu, então numerei de 1 a 5.
//    Usei duas matrizes do mesmo tamanho: uma para despesas e outra para receitas.
//    Valor 0 na matriz significa "sem registro" naquela semana.

    static final int MESES = 12;
    static final int SEMANAS = 5;
    static final String[] NOMES_MESES = {
            "Janeiro", "Fevereiro", "Marco", "Abril", "Maio", "Junho",
            "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"
    };

    // Lê o mês e devolve o índice da linha (0 a 11)
    private static int lerMes(Scanner sc) {

        int mes;

        do {
            System.out.print("Mes (1-12): ");
            mes = sc.nextInt();
        } while (mes < 1 || mes > MESES);

        return mes - 1;
    }

    // Lê a semana e devolve o índice da coluna (0 a 4)
    private static int lerSemana(Scanner sc) {

        int semana;

        do {
            System.out.print("Semana (1-" + SEMANAS + "): ");
            semana = sc.nextInt();
        } while (semana < 1 || semana > SEMANAS);

        return semana - 1;
    }

    // Os métodos abaixo servem para despesas e receitas: o parâmetro "nome" só muda o texto
    private static void cadastrar(double[][] matriz, String nome, Scanner sc) {

        int mes = lerMes(sc);
        int semana = lerSemana(sc);

        if (matriz[mes][semana] != 0) {
            System.out.println("Ja existe " + nome + " nessa semana. Use a opcao alterar.");
            return;
        }

        System.out.print("Valor da " + nome + ": ");
        double valor = sc.nextDouble();

        if (valor <= 0) {
            System.out.println("Valor invalido.");
            return;
        }

        matriz[mes][semana] = valor;
        System.out.println("Cadastrado com sucesso.");
    }

    private static void alterar(double[][] matriz, String nome, Scanner sc) {

        int mes = lerMes(sc);
        int semana = lerSemana(sc);

        if (matriz[mes][semana] == 0) {
            System.out.println("Nao ha " + nome + " cadastrada nessa semana.");
            return;
        }

        System.out.println("Valor atual: " + matriz[mes][semana]);
        System.out.print("Novo valor: ");
        double valor = sc.nextDouble();

        if (valor <= 0) {
            System.out.println("Valor invalido.");
            return;
        }

        matriz[mes][semana] = valor;
        System.out.println("Alterado com sucesso.");
    }

    private static void excluir(double[][] matriz, String nome, Scanner sc) {

        int mes = lerMes(sc);
        int semana = lerSemana(sc);

        if (matriz[mes][semana] == 0) {
            System.out.println("Nao ha " + nome + " cadastrada nessa semana.");
            return;
        }

        matriz[mes][semana] = 0; // voltar para 0 = sem registro
        System.out.println("Excluido com sucesso.");
    }

    // Submenu de cadastrar/alterar/excluir (usado tanto para despesas quanto para receitas)
    private static void submenu(String titulo, String nome, double[][] matriz, Scanner sc) {

        int opcao;

        do {

            System.out.println("\n--- " + titulo + " ---");
            System.out.println("1 - Cadastrar");
            System.out.println("2 - Alterar");
            System.out.println("3 - Excluir");
            System.out.println("0 - Voltar");

            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    cadastrar(matriz, nome, sc);
                    break;

                case 2:
                    alterar(matriz, nome, sc);
                    break;

                case 3:
                    excluir(matriz, nome, sc);
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 0);
    }

    // Soma uma linha da matriz (todas as semanas de um mês)
    private static double totalMes(double[][] matriz, int mes) {

        double soma = 0;

        for (int j = 0; j < SEMANAS; j++) {
            soma += matriz[mes][j];
        }

        return soma;
    }

    // Soma a matriz inteira (o ano todo)
    private static double totalAno(double[][] matriz) {

        double soma = 0;

        for (int i = 0; i < MESES; i++) {
            soma += totalMes(matriz, i);
        }

        return soma;
    }

    private static void verEstatisticas(double[][] despesas, double[][] receitas) {

        double totalDespesas = totalAno(despesas);
        double totalReceitas = totalAno(receitas);
        double saldo = totalReceitas - totalDespesas;

        System.out.println("\n--- ESTATISTICAS ---");
        System.out.printf("Total de receitas: R$ %.2f%n", totalReceitas);
        System.out.printf("Total de despesas: R$ %.2f%n", totalDespesas);
        System.out.printf("Saldo do ano: R$ %.2f%n", saldo);
        System.out.printf("Media mensal de despesas: R$ %.2f%n", totalDespesas / MESES);

        if (totalDespesas == 0) {
            System.out.println("Nenhuma despesa cadastrada ainda.");
            return;
        }

        // procura o mês com mais gastos e a semana mais cara
        int mesMaior = 0;
        int semanaMaiorMes = 0;
        int semanaMaiorSemana = 0;
        double maiorSemana = 0;
        int mesesNoVermelho = 0;

        for (int i = 0; i < MESES; i++) {

            if (totalMes(despesas, i) > totalMes(despesas, mesMaior)) {
                mesMaior = i;
            }

            if (totalMes(despesas, i) > totalMes(receitas, i)) {
                mesesNoVermelho++; // gastou mais do que ganhou naquele mês
            }

            for (int j = 0; j < SEMANAS; j++) {
                if (despesas[i][j] > maiorSemana) {
                    maiorSemana = despesas[i][j];
                    semanaMaiorMes = i;
                    semanaMaiorSemana = j;
                }
            }
        }

        System.out.printf("Mes com mais gastos: %s (R$ %.2f)%n",
                NOMES_MESES[mesMaior], totalMes(despesas, mesMaior));
        System.out.printf("Semana mais cara: semana %d de %s (R$ %.2f)%n",
                semanaMaiorSemana + 1, NOMES_MESES[semanaMaiorMes], maiorSemana);
        System.out.println("Meses em que gastou mais do que ganhou: " + mesesNoVermelho);
    }

    private static void listarMeses(double[][] despesas, double[][] receitas) {

        System.out.println("\n--- LISTA DE MESES ---");

        for (int i = 0; i < MESES; i++) {

            System.out.println(NOMES_MESES[i] + ":");

            System.out.print("  Despesas por semana: ");
            for (int j = 0; j < SEMANAS; j++) {
                System.out.printf("%.2f  ", despesas[i][j]);
            }
            System.out.printf("| total: %.2f%n", totalMes(despesas, i));

            System.out.print("  Receitas por semana: ");
            for (int j = 0; j < SEMANAS; j++) {
                System.out.printf("%.2f  ", receitas[i][j]);
            }
            System.out.printf("| total: %.2f%n", totalMes(receitas, i));
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.forLanguageTag("pt-BR")); // para digitar valores com virgula (ex: 10,50)

        double[][] despesas = new double[MESES][SEMANAS];
        double[][] receitas = new double[MESES][SEMANAS];

        int opcao;

        do {

            System.out.println("\nGASTOS PESSOAIS");
            System.out.println("1 - Cadastrar/alterar/excluir despesas");
            System.out.println("2 - Cadastrar/alterar/excluir receitas");
            System.out.println("3 - Ver estatisticas");
            System.out.println("4 - Listar meses");
            System.out.println("5 - Sair");

            System.out.print("Opcao: ");
            opcao = sc.nextInt();

            switch (opcao) {

                case 1:
                    submenu("DESPESAS", "despesa", despesas, sc);
                    break;

                case 2:
                    submenu("RECEITAS", "receita", receitas, sc);
                    break;

                case 3:
                    verEstatisticas(despesas, receitas);
                    break;

                case 4:
                    listarMeses(despesas, receitas);
                    break;

                case 5:
                    System.out.println("Encerrando...");
                    break;

                default:
                    System.out.println("Opcao invalida.");
            }

        } while (opcao != 5);
    }
}
