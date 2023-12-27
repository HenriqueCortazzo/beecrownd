package beecrowndExercises;

import java.util.Scanner;

public class bee1037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double valorRecebido = sc.nextDouble();

        for (int i = 0; i < 101; i++) {
            if (valorRecebido >= 0 && valorRecebido <= 25) {
                System.out.println("Intervalo [0,25]");
                break;
            } else if (valorRecebido > 25 && valorRecebido <= 50) {
                System.out.println("Intervalo (25,50]");
                break;
            } else if (valorRecebido > 50 && valorRecebido <= 75) {
                System.out.println("Intervalo (50,75]");
                break;
            } else if (valorRecebido > 75 && valorRecebido <= 100) {
                System.out.println("Intervalo (75,100]");
                break;
            } else {
                System.out.println("Fora de intervalo");
                break;
            }
        }
    }
}
