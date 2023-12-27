package beecrowndExercises;

import java.util.Scanner;

public class bee1036 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, bhaskara1, bhaskara2, delta;

        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        delta = (Math.pow(b, 2) - (4 * a * c));
        if ( a == 0 ||delta < 0) {
            System.out.println("Impossivel calcular");
        } else if (delta == 0) {
            bhaskara1 = (-b + Math.sqrt(delta)) / (2 * a);
            System.out.println(bhaskara1);
        } else {
            bhaskara1 = (-b + Math.sqrt(delta)) / (2 * a);
            bhaskara2 = (-b - Math.sqrt(delta)) / (2 * a);
            double r1 = bhaskara1;
            double r2 = bhaskara2;
            System.out.printf("R1 = %.5f\nR2 = %.5f\n",r1,r2);
        }
    }
}
