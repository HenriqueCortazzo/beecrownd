package beecrowndExercises;

import java.util.Scanner;

public class bee1041 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float x, y;
        x = sc.nextFloat();
        y = sc.nextFloat();

        if (x == y && y == 0) {
            System.out.println("Origem");
        } else if (x > 0 && y > 0) {
            System.out.println("Q1");
        } else if (x < 0 && y > 0) {
            System.out.println("Q2");
        } else if (x < 0 && y < 0) {
            System.out.println("Q3");
        } else if (x > 0 && y < 0) {
            System.out.println("Q4   ");
        }
    }
}
