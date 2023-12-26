package beecrowndExercises;

import java.util.Scanner;

public class bee1035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, c, d, soma1, soma2;
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        d = sc.nextInt();
        soma1 = c + d;
        soma2 = a + b;
        if (a > 0 && c > 0 && d > 0 && a % 2 == 0 && soma1 > soma2 && b > c && d > a) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }
    }
}
