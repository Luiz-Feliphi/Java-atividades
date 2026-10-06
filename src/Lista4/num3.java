package Lista4;

import java.util.Scanner;

public class num3 {
    public static void main(String[] args) {
//        3) Jorge é um fanático por miojos, ele adora! e, como era de se esperar, ele levou vários pacotes
//        quando foi acampar com seus colegas. Como Jorge só gosta de miojos feitos com o tempo exato, ele
//        se desesperou ao perceber que havia esquecido seu relógio. Por sorte, no caminho, ele conseguiu
//        comprar duas ampulhetas de durações diferentes. Por exemplo, se o miojo precisa de 3 minutos para
//        ficar pronto, e Jorge tiver uma ampulheta de 5 minutos e outra de 7, uma possível forma de cozinhar o
//        miojo é: Jorge começa virando as duas ampulhetas ao mesmo tempo. Quando a areia da ampulheta
//        de 5 minutos se esgotar, Jorge torna a virá-la. Jorge começa a preparar o miojo quando a areia da
//        ampulheta de 7 minutos acabar. Jorge tira o miojo do fogo quando a ampulheta de 5 minutos acabar
//        novamente. Dessa forma, o miojo ficará 3 minutos no fogo (do minuto 7 ao minuto 10). Assim, apesar
//        do miojo levar apenas três minutos para ser cozido, ele precisa de 10 minutos para ficar pronto. Faça
//        um programa que, dado o tempo de preparo do miojo, e os tempos das duas ampulhetas (ambos
//                maiores que o tempo do miojo), determina o tempo mínimo necessário para o miojo ficar pronto. Você
//        pode supor que sempre é possível cozinhar o miojo no tempo correto. Assim, apesar do miojo levar
//        apenas três minutos para ser cozido, ele precisa de 10 minutos para ficar pronto. Faça um programa
//        que, dado o tempo de preparo do miojo, e os tempos das duas ampulhetas (ambos maiores que o
//                tempo do miojo), determina o tempo mínimo necessário para o miojo ficar pronto. Você pode supor
//        que sempre é possível cozinhar o miojo no tempo correto.
//        Entrada: A entrada contém um único caso de teste, composto por uma única linha, que contém três
//        inteiros representando o tempo necessário para o preparo do miojo, o tempo da primeira e o tempo da
//        segunda ampulheta respectivamente.
//                Saída: Seu programa deve produzir uma única linha contendo o tempo mínimo para o preparo do
//            miojo.
//                    Restrições 0 <=T<=10000 T <=40000

//        Aqui está o passo a passo de como fazer:
//        1. Minuto 0: Inicie as duas ampulhetas (a de 5 minutos e a de 7 minutos) ao mesmo tempo e coloque a água para ferver.
//        2. Minuto 5: A ampulhetas de 5 minutos vai esvaziar. Gire ela imediatamente para começar a contar mais 5 minutos (ela terminará no minuto 10).
//        3. Minuto 7: A ampulheta de 7 minutos vai esvaziar. Esse é o momento exato de colocar o miojo na água para cozinhar.
//        4. Minuto 10: A ampulheta de 5 minutos (que você girou no minuto 5) vai esvaziar novamente. Desligue o fogo e tire o miojo.

        Scanner leia = new Scanner(System.in);
        System.out.println("Tempo do miojo | Primeira Ampulheta | Segunda Ampulheta");
        int tempoMiojo = leia.nextInt();
        int priAmpulheta = leia.nextInt();
        int segunAmpulheta = leia.nextInt();
        int i,j;
        while(true){
            i++;
            j++;
            if(i > priAmpulheta)
                i-=1;   
            if(j > segunAmpulheta)
                j-=1;
            if((i-j) ==tempoMiojo){

            }



        }
        int result = (i*2)-j;
        System.out.print("Tempo minimo para o preparo do miojo: "+result+"\n"); //exemplo saida 10 minutos para ficar tudo pronto
    }
}
