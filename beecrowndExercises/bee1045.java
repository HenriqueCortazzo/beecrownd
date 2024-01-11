package beecrowndExercises;

import java.util.Scanner;

public class bee1045 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, maior = 0;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();
        double[] vetor = {a, b, c};
        for (double v : vetor) {
            if (v > maior) maior = v;
        }
        a = maior;
    }
}
