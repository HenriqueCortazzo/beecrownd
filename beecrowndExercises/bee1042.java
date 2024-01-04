package beecrowndExercises;

import java.util.Scanner;

public class bee1042 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c;
        int menor = 100;
        int maior = 0;
        int mediano = 0;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int[] vetor = {a, b, c};
        int[] vetorResultante = new int[3];

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] < menor) {
                menor = vetor[i];
                vetorResultante[0] = menor;
            }
            
        }
        for (int s : vetorResultante) {
            System.out.println(s);
        }
    }
}
