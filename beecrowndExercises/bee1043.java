package beecrowndExercises;

import java.util.Scanner;

public class bee1043 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a, b, c, perimetro, area;
        a = scanner.nextDouble();
        b = scanner.nextDouble();
        c = scanner.nextDouble();

        if (a < b + c && b < a + c && c < a + b) {
            perimetro = a + b + c;
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            area = ((a + b) * c) / 2;
            System.out.printf("Area = %.1f\n", area);
        }
    }
}
