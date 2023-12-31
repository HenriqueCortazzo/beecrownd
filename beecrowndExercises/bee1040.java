package beecrowndExercises;

import java.util.Scanner;

public class bee1040 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, n3, n4, media;

        n1 = sc.nextDouble();
        n2 = sc.nextDouble();
        n3 = sc.nextDouble();
        n4 = sc.nextDouble();

        int peso1, peso2, peso3, peso4, pesoTotal;

        peso1 = 2;
        peso2 = 3;
        peso3 = 4;
        peso4 = 1;
        pesoTotal = peso1 + peso2 + peso3 + peso4;

        media = ((n1 * peso1) + (n2 * peso2) + (n3 * peso3) + (n4 * peso4)) / pesoTotal;

        System.out.printf("Media: %.1f", media);
    }
}
