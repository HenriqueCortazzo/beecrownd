package beecrowndExercises;

import java.util.Scanner;

public class bee1044 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        if (b%a==0 || a%b==0)
            System.out.println("Sao Multiplos");
        else
            System.out.println("Nao sao Multiplos");

    }
}
