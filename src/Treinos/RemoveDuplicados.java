package Treinos;

public class RemoveDuplicados {
    public static void main(String[] args) {
        int v[] = {1,2,3,3,2,1,1,4,1,2,5};
        int repetidos=0;
        for (int i = 0; i < v.length-repetidos; i++) {
            for (int j = i+1; j < v.length-repetidos; j++) {
                if (v[i] == v[j]) {
                    for (int k = j; k < v.length-repetidos-1; k++) {
                        v[k]=v[k+1];
                    }
                    j--;
                    repetidos++;
                }
            }
        }
        for (int i = 0; i < v.length-repetidos; i++) {
            System.out.print(v[i]+" , ");
        }
    }
}
