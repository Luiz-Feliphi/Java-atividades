package Lista3;

public class num10 {

    public static void main(String[] args) {

        String[] pessoas = {
                "Joao",
                "Teresa",
                "Raimundo",
                "Maria",
                "Joaquim",
                "Lili"
        };

        int[][] amor = {
                {0,1,0,0,0,0}, // Joao ama Teresa
                {0,0,1,0,0,0}, // Teresa ama Raimundo
                {0,0,0,1,0,0}, // Raimundo ama Maria
                {0,0,0,0,1,0}, // Maria ama Joaquim
                {0,0,0,0,0,1}, // Joaquim ama Lili
                {0,0,0,0,0,0}  // Lili nao ama ninguem
        };

        System.out.println("Relacoes de amor:");

        for(int i = 0; i < amor.length; i++) {
            for(int j = 0; j < amor[i].length; j++) {

                if(amor[i][j] == 1) {
                    System.out.println(
                            pessoas[i] + " ama " + pessoas[j]
                    );
                }
            }
        }
    }
}